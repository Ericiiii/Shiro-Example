package com.mayday.model;

public class UserModel {

    private String username;
    private String password;

    private String Salt;

    private String CredentialsSalt;

    private int locked;

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public String getCredentialsSalt() {
        return CredentialsSalt;
    }

    public void setCredentialsSalt(String credentialsSalt) {
        CredentialsSalt = credentialsSalt;
    }

    public String getSalt() {
        return Salt;
    }

    public void setSalt(String salt) {
        Salt = salt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserModel() {
    }

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserModel(String username, String password, String salt, String credentialsSalt) {
        this.username = username;
        this.password = password;
        Salt = salt;
        CredentialsSalt = credentialsSalt;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Salt='" + Salt + '\'' +
                ", CredentialsSalt='" + CredentialsSalt + '\'' +
                '}';
    }
}
