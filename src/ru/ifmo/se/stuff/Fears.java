package ru.ifmo.se.stuff;

public enum Fears {
    FLYING ("летать"),
    TRAVELING ("путешествовать"),
    DRIVE ("ездить на машине");
    private final String fearing;

    Fears (String fearing) {
        this.fearing = fearing;
    }
    public String getFearing() {
        return fearing;
    }
}
