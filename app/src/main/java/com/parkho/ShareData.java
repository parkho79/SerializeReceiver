package com.parkho;

import java.io.Serializable;

public class ShareData implements Serializable {

    private String name;
    private int number;
    private boolean isSerializable;

    public void setName(String a_name) {
        name = a_name;
    }

    public void setNumber(int a_number) {
        number = a_number;
    }

    public void setSerializable(boolean a_isSerializable) {
        isSerializable = a_isSerializable;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public boolean isSerializable() {
        return isSerializable;
    }

}