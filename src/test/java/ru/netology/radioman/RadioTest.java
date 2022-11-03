package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSwitchToNextStation() {
        Radio service = new Radio();

        service.nextRadioStation(0);

        int expected = 0;
        int actual = service.currentRadioStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchToPrevStation() {
        Radio service = new Radio();

        service.prevRadioStation(9);

        int expected = 9;
        int actual = service.currentRadioStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio service = new Radio();

        service.increaseRadioStation();

        int expected = 1;
        int actual = service.currentRadioStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReduceRadioStation() {
        Radio service = new Radio();

        service.reduceRadioStation();

        int expected = -1;
        int actual = service.currentRadioStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStation() {
        Radio service = new Radio();

        service.setCurrentRadioStation(5);

        int expected = 5;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(10);

        int expected = 10;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio service = new Radio();

        service.increaseVolume();

        int expected = 1;
        int actual = service.currentVolume;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSetToMaxVolume() {
        Radio service = new Radio();

        service.setToMaxVolume();

        int expected = 10;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReduceVolume() {
        Radio service = new Radio();

        service.reduceVolume();

        int expected = 0;
        int actual = service.currentVolume;

        Assertions.assertEquals(expected, actual);

    }
}