package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructionRadioTest {
    @Test
    public void shouldSetCountRadioStation() {
        Radio service = new Radio(10);
        service.setCurrentRadioStation(9);

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}