package org.yup.capstone2;

public enum DrinkFlavor {
    PINEAPPLEMANGO ("Pineapple Mango"),
    ORANGE ("Orange"),
    RASPBERRY ("Raspberry"),
    LEMONWATER ("Lemon Water");

    private final String displayName;

    DrinkFlavor(String displayName){
        this.displayName = displayName;
    }
    public String getDisplayName() {
        return displayName;
    }
}
