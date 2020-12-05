package pf5.codehub.team5.webapp.enums;

public enum Status {
    PENDIND("Pending"),
    INPROGRESS("In Progress"),
    COMPLETED("Completed");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
