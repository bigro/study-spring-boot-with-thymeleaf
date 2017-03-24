package com.example;

/**
 * Created by ooguro on 2017/03/22.
 */
public enum HardwareType {
    NONE(""),
    PS4("PS4"),
    PSVita("PSVita"),
    NintendoSwitch("NintendoSwitch"),
    WiiU("WiiU"),
    XboxOne("XboxOne");

    private final String value;

    HardwareType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
