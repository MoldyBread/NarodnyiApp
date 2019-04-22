package com.company.narodnyiapp.pin_registration;

public class PIN {
    private int PIN;

    public PIN() {
        PIN = (int) (Math.random() * 9999);
    }

    public int getPIN() {
        return PIN;
    }

    @Override
    public String toString() {
        String p = Integer.valueOf(PIN).toString();
        while (p.length() < 4) {
            p = p + '0';
        }
        return p;
    }

}
