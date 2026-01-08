package ru.courses.other;
public enum Spiciness {

    VERY_SPICY("очень острый"),
    SPICY("острый"),
    NOT_SPICY("не острый");

    private String description;

    public String getDescription() {
        return description;
    }

    Spiciness(String description) {
        this.description = description;
    }
}