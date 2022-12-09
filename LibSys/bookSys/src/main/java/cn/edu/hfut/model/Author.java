package cn.edu.hfut.model;

public class Author {
    private Long authorId;

    private String authorName;

    private String authorSex;

    private String authorLocation;

    private String authorIntroduction;

    public Author(Long authorId, String authorName, String authorSex, String authorLocation, String authorIntroduction) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorSex = authorSex;
        this.authorLocation = authorLocation;
        this.authorIntroduction = authorIntroduction;
    }

    public Author() {
        super();
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getAuthorSex() {
        return authorSex;
    }

    public void setAuthorSex(String authorSex) {
        this.authorSex = authorSex == null ? null : authorSex.trim();
    }

    public String getAuthorLocation() {
        return authorLocation;
    }

    public void setAuthorLocation(String authorLocation) {
        this.authorLocation = authorLocation == null ? null : authorLocation.trim();
    }

    public String getAuthorIntroduction() {
        return authorIntroduction;
    }

    public void setAuthorIntroduction(String authorIntroduction) {
        this.authorIntroduction = authorIntroduction == null ? null : authorIntroduction.trim();
    }
}