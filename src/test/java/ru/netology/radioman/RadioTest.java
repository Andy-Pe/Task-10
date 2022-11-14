package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSwitchToNextStation() {
        Radio service = new Radio();
        service.setCurrentRadioStation(8);

        service.next();

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchToFirstRadioStation() {
        Radio service = new Radio();
        service.setCurrentRadioStation(9);

        service.next();

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToPrevRadioStation() {
        Radio service = new Radio();
        service.setCurrentRadioStation(1);

        service.prev();

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToLastRadioStation() {
        Radio service = new Radio();
        service.setCurrentRadioStation(0);

        service.prev();

        int expected = 9;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAboveMax() {
        Radio service = new Radio();
        service.setCurrentRadioStation(10);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBelowMin() {
        Radio service = new Radio();

        service.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = service.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(9);

        service.increaseVolume();

        int expected = 10;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToMaxVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(10);

        service.increaseVolume();

        int expected = 10;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio service = new Radio();

        service.setCurrentVolume(11);

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeBelowMin() {
        Radio service = new Radio();

        service.setCurrentVolume(-1);

        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}




