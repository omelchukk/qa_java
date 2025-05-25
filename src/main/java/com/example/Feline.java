package com.example;

import java.util.List;

public class Feline extends Animal implements Predator, IFeline {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    @Override
    public List<String> getFood(String animalKind) throws Exception {
        return super.getFood(animalKind);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
