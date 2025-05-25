package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundShouldReturnMeow(){
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";

        MatcherAssert.assertThat("Этот зверь не относится к семейству кошачьих", cat.getSound("Мяу"), equalTo(expectedSound));
    }

    @Test
    public void getFoodShouldReturnPredatorFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные, птицы, рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);

        MatcherAssert.assertThat("Коту дали не кошачью еду", cat.getFood(), equalTo(expectedFood));
    }
}