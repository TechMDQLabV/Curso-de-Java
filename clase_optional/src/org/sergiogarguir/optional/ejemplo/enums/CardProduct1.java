package org.sergiogarguir.optional.ejemplo.enums;

public enum CardProduct1 {
    VISAEXCLU("VISAEXCLU", "37"),
    YOYMASTREN("YOYMASTREN", "61"),
    YOYBANEALT("YOYBANEALT", "74");


    private final String description;
    private final String code;

    private CardProduct1(String description, String code)
    {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }
    public String getCode() {
        return this.code;
    }
}
