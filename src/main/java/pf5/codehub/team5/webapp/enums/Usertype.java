package pf5.codehub.team5.webapp.enums;

public enum Usertype {
    ADMIN("Admin"),
    OWNER("Owner");

    private String fullName;

    Usertype(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
