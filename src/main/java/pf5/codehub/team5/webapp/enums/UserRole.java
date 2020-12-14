package pf5.codehub.team5.webapp.enums;

public enum UserRole {
    ADMIN("Admin"),
    OWNER("Owner");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return role;
    }
}


