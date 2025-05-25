package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline feline;


    @Test
    public void getKittensShouldReturnCorrectNumber() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedKittens = 1;

        MatcherAssert.assertThat("Некорректное количество котят", lion.getKittens(),equalTo(expectedKittens));
    }

    @Test
    @DisplayName("Неопределенный пол вызывает Exception")
    public void lionCheckTheException() {
        assertThrows(Exception.class, () -> new Lion("Undefined", feline));
    }

    @Test
    public void getFoodShouldReturnPredatorFood() throws Exception {
       Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        MatcherAssert.assertThat("Львы это не едят", lion.getFood("Хищник"), equalTo(expectedFood));
    }
}






