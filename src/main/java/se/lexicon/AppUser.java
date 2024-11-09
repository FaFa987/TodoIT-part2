package se.lexicon;

import java.util.UUID;

public class AppUser {
    private String username;
    private String password;
    private AppRole role;

    public AppUser(String username, String password, AppRole role) {
        this.generatePassword();
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public AppUser(String username, String password) {
        this(username, password, null);
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public AppRole getRole() {
        return role;
    }

    public void setUsername(String username) {
        if(username == null || username.trim().isEmpty())
            throw new IllegalArgumentException("Username cannot be null or empty");
        this.username = username;
    }

    public void setPassword(String password) {
        if(password == null || password.trim().isEmpty())
            throw new IllegalArgumentException("Password cannot be null or empty");
        this.password = password;
    }
    public void setRole(AppRole role) {
        this.role = role;
    }

    public boolean equals(AppUser user) {
        return this.username.equals(user.getUsername());
    }
    public int hashCode() {
        return this.username.hashCode();
    }
    public String toString() {
        return this.username;
    }

    public void generatePassword() {
        this.password = UUID.randomUUID().toString();
    }
    public String userInfo(){
        return "Name is: " + this.username +" Password is: " + this.password + " ID is: " + this.role;
    }


}
