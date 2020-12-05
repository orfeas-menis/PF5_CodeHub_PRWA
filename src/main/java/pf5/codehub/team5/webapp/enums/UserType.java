package pf5.codehub.team5.webapp.enums;

public enum UserType {
    ADMIN("Admin"),
    OWNER("Owner");

    private String fullName;

    UserType(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
