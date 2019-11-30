package br.com.angelim.overtime.domain.credential.entity;

public class Credential {

    private String username;
    private String password;

    private Credential() {

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Credential withUsername(String username) {
        this.username = username;
        return this;
    }

    public Credential withPassword(String password) {
        this.password = password;
        return this;
    }

    public static Credential create() {
        return new Credential();
    }

}
