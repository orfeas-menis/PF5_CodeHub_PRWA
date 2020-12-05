package pf5.codehub.team5.webapp.enums;

public enum PropertyType {
    MONO("Monokatoikia"),
    MEZO("Mezoneta"),
    POLY("Polykatoikia");

    private String fullName;

    PropertyType(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
