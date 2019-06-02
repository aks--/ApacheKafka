package com.anurag;

public class Restaurent {
    String name;
    String type;
    public Restaurent() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.name+":"+this.type;
    }
}
