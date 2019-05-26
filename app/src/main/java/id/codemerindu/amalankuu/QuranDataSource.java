package id.codemerindu.amalankuu;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import id.codemerindu.amalankuu.database.DatabaseHelper;

public class QuranDataSource {
    private final static String QURAN_TABLE = "AlQuran";


    private final static String QURAN_ID = "_id";
    private final static String QURAN_SURAH_ID = "surah_id";
    private final static String QURAN_VERSE_ID = "verse_id";
    private final static String QURAN_ARABIC = "arabic";
    private final static String QURAN_INDO = "indo";
    private final static String QURAN_TRANSLITERATION = "transliteration";
    private final static String QURAN_BOOKMARK = "bookmark";
    private final static String QURAN_NOTE = "note";

    private static Cursor quranCursor;
    private DatabaseHelper databaseHelper;

    public QuranDataSource(Context context) {

        databaseHelper = new DatabaseHelper(context);
    }

    public ArrayList<Quran> getEnglishQuranBySurah(long surah_id) {
        ArrayList<Quran> quranArrayList = new ArrayList<>();
        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        quranCursor = db.rawQuery("SELECT quran.arabic,quran.english from quran WHERE quran.surah_id = " + surah_id, null);
        quranCursor.moveToFirst();

        while (!quranCursor.isAfterLast()) {
            Quran quran = new Quran();
            quran.setQuranArabic(quranCursor.getString(quranCursor.getColumnIndex(QURAN_ARABIC)));
            quran.setQuranTranslate(quranCursor.getString(quranCursor.getColumnIndex(QURAN_INDO)));
            quranArrayList.add(quran);
            quranCursor.moveToNext();
        }

        quranCursor.close();
        db.close();
        return quranArrayList;
    }

}
