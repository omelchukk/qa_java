package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    @Test
    void eatMeatShouldReturnPredatorFood() throws Exception {
        Feline feline = new Feline();
        List<String> predatorFood = feline.eatMeat();
        MatcherAssert.assertThat("Это еда не для хищников", feline.eatMeat(), equalTo(predatorFood));

    }

    @Test
    void getFamilyShouldReturnFeline() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        MatcherAssert.assertThat("Этот зверь не относится к семейству кошачьих", feline.getFamily(), equalTo(expectedFamily));

    }

    @Test
    void getKittensShouldReturn1() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    void getKittensShouldReturnCorrectNumber() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    void getFoodShouldReturnPredatorFood() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(feline.getFood("Хищник"), expectedFood);
    }
}