package cn.edu.hfut.model;

public class Type {
    private Long typeId;

    private String typeClass;

    private String typeCategory;

    public Type(Long typeId, String typeClass, String typeCategory) {
        this.typeId = typeId;
        this.typeClass = typeClass;
        this.typeCategory = typeCategory;
    }

    public Type() {
        super();
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeClass() {
        return typeClass;
    }

    public void setTypeClass(String typeClass) {
        this.typeClass = typeClass == null ? null : typeClass.trim();
    }

    public String getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory == null ? null : typeCategory.trim();
    }
}