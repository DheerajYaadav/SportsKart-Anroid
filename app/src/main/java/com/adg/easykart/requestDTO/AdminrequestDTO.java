package com.adg.easykart.requestDTO;

public class AdminrequestDTO {

    private String adminName;

    private String password;

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AdminrequestDTO(String adminName, String password) {
        this.adminName = adminName;
        this.password = password;

    }
}
