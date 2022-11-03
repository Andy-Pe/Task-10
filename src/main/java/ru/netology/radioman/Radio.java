package ru.netology.radioman;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextRadioStation(int nextCurrentRadioStation) {
        if (currentRadioStation == 9) {
            nextCurrentRadioStation = 0;
        }
        currentRadioStation = nextCurrentRadioStation;
    }

    public void prevRadioStation(int prevCurrentRadioStation) {
        if (currentRadioStation == 0) {
            prevCurrentRadioStation = 9;
        }
        currentRadioStation = prevCurrentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }

        currentRadioStation = newCurrentRadioStation;
    }


    public void increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;

        }
    }

    public void reduceRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation - 1;

        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume <= 0) {
            return;
        }
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }
}

