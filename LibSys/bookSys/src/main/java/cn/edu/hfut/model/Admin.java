package cn.edu.hfut.model;

public class Admin {
    private Long adminId;

    private String adminName;

    private String adminPassword;

    private String adminStatue;

    public Admin(Long adminId, String adminName, String adminPassword, String adminStatue) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminStatue = adminStatue;
    }

    public Admin() {
        super();
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminStatue() {
        return adminStatue;
    }

    public void setAdminStatue(String adminStatue) {
        this.adminStatue = adminStatue == null ? null : adminStatue.trim();
    }
}