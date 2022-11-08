package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldSetQuantityRadioStation() {
        Radio service = new Radio(10);

        service.setQuantityRadioStation();

        Assertions.assertEquals(10, service.getAmountRadioStation());

    }

    @Test
    public void shouldSetMinAndMaxRadioStation() {
        Radio service = new Radio(0, 9);

        Assertions.assertEquals(9, service.getMaxRadioStation());
        Assertions.assertEquals(0, service.getMinRadioStation());

    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio service = new Radio(10);

        service.setNextRadioStation(0);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldSwitchToPrevStation() {
        Radio service = new Radio(10);

        service.setPrevRadioStation(9);

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchToWrongPrevStation() {
        Radio service = new Radio(0, 9);

        service.setPrevRadioStation(10);

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseRadioStation() {
        Radio service = new Radio(10);

        service.increaseRadioStation();

        int expected = 1;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReduceRadioStation() {
        Radio service = new Radio(10);

        service.reduceRadioStation();

        int expected = -1;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStation() {
        Radio service = new Radio(10);

        service.setCurrentRadioStation(9);

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationAboveMax() {
        Radio service = new Radio(10);

        service.setCurrentRadioStation(10);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationBelowMin() {
        Radio service = new Radio(10);

        service.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolume() {
        SoundVolume service = new SoundVolume(0, 100);

        service.setCurrentVolume(50);

        int expected = 50;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeAboveMax() {
        SoundVolume service = new SoundVolume(0, 100);

        service.setCurrentVolume(101);

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeBelowMin() {
        SoundVolume service = new SoundVolume(0, 100);

        service.setCurrentVolume(-1);

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        SoundVolume service = new SoundVolume(0, 100);

        service.increaseVolume();

        int expected = 1;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinAndMaxSoundVolume() {
        SoundVolume service = new SoundVolume(0, 100);

        Assertions.assertEquals(0, service.getMinVolume());
        Assertions.assertEquals(100, service.getMaxVolume());

    }
}

