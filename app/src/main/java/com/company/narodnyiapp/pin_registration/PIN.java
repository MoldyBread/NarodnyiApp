package com.company.narodnyiapp.pin_registration;

public class PIN {
    private String PIN;

    public PIN() {
        PIN = Integer.valueOf((int)(Math.random() * 9999)).toString();
    }

    public String getPIN() {
        return PIN;
    }

    @Override
    public String toString() {
        while (PIN.length() < 4) {
            PIN = PIN + '0';
        }
        return PIN;
    }

}
