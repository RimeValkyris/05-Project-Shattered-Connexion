package lbs;

/**
 * User class represents a library system user with login credentials
 */
public class User {
    private String username;
    private String password;
    private boolean isActive;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = true;
    }

    // Default constructor
    public User() {
        this.isActive = true;
    }

    // Getters and Setters
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    /**
     * Validate user credentials
     */
    public boolean validateCredentials(String inputUsername, String inputPassword) {
        return this.username != null && this.username.equals(inputUsername) &&
               this.password != null && this.password.equals(inputPassword) &&
               this.isActive;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}