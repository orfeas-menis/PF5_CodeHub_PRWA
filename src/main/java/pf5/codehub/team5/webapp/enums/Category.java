package pf5.codehub.team5.webapp.enums;

public enum Category {
    PAINT("Painting"),
    PLUMP("Plumping"),
    ELECTR("Electrical"),
    INSULATION("Insulation"),
    CHAMBRANLE("Chambranle");


    private String categoryName;

    Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
