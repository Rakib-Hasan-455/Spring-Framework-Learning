package com.example.formvalidation.Entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {

    @NotBlank(message = "Username can't be empty!")
    @Size(min = 3, max = 15, message = "Username must be within 3 - 12 characters!")
    private String username;
    @Pattern(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", message = "Email is not valid!")
    private String email;

    @AssertTrue(message = "You must agree terms and conditions!")
    private boolean agreed;

    public LoginData(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public LoginData() {
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
