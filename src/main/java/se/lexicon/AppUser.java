package se.lexicon;

public class AppUser {
    private String username;
    private String password;
    private AppRole role;

    public AppUser(String username, String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
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
        this.username = username;
    }

    public void setPassword(String password) {
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


}
