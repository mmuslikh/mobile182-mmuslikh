package id.codemerindu.amalankuu;

public class Surah {
    private Long id;
    private Long no;
    private String nameIndo;
    private String nameArabic;
    private String nameTranslate;

    private String meanIndo;
    private Long ayahNumber;
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getNameIndo() {
        return nameIndo;
    }

    public void setNameIndo(String nameIndo) {
        this.nameIndo = nameIndo;
    }

    public String getNameArabic() {
        return nameArabic;
    }

    public void setNameArabic(String nameArabic) {
        this.nameArabic = nameArabic;
    }

    public String getNameTranslate() {
        return nameTranslate;
    }

    public void setNameTranslate(String nameTranslate) {
        this.nameTranslate = nameTranslate;
    }

    public String getMeanIndo() {
        return nameIndo;
    }

    public void setMeanIndo(String meanIndo) {
        this.nameIndo = meanIndo;
    }

    public Long getAyahNumber() {
        return ayahNumber;
    }

    public void setAyahNumber(Long ayahNumber) {
        this.ayahNumber = ayahNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
