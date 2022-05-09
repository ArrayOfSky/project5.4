package com.gyf.Domain;

public class HotComsumption {
    private String kind;
    private int number;

    public HotComsumption() {
    }

    @Override
    public String toString() {
        return "HotComsumption{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                '}';
    }

    public HotComsumption(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
