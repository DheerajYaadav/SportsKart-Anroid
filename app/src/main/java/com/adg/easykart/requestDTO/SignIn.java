package com.adg.easykart.requestDTO;

public class SignIn {
    private String message;

    private Boolean success;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SignIn(String message, Boolean success, String status) {
        this.message = message;
        this.success = success;
        this.status = status;
    }

    private String status;
}
