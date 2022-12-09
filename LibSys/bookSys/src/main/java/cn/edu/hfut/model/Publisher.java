package cn.edu.hfut.model;

public class Publisher {
    private Long publisherId;

    private String publisherName;

    private String publisherPhone;

    private String publisherLocation;

    private String publisherIntroduction;

    public Publisher(Long publisherId, String publisherName, String publisherPhone, String publisherLocation, String publisherIntroduction) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.publisherPhone = publisherPhone;
        this.publisherLocation = publisherLocation;
        this.publisherIntroduction = publisherIntroduction;
    }

    public Publisher() {
        super();
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName == null ? null : publisherName.trim();
    }

    public String getPublisherPhone() {
        return publisherPhone;
    }

    public void setPublisherPhone(String publisherPhone) {
        this.publisherPhone = publisherPhone == null ? null : publisherPhone.trim();
    }

    public String getPublisherLocation() {
        return publisherLocation;
    }

    public void setPublisherLocation(String publisherLocation) {
        this.publisherLocation = publisherLocation == null ? null : publisherLocation.trim();
    }

    public String getPublisherIntroduction() {
        return publisherIntroduction;
    }

    public void setPublisherIntroduction(String publisherIntroduction) {
        this.publisherIntroduction = publisherIntroduction == null ? null : publisherIntroduction.trim();
    }
}