package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private IFeline Feline;

    public Lion(String sex, IFeline Feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.feline = feline;
    }

    Feline feline = new Feline();

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood(String хищник) throws Exception {
        return feline.getFood("Хищник");
    }




}
