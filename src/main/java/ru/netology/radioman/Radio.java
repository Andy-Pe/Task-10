package ru.netology.radioman;

public class Radio {

    private int amountRadioStation = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation = minRadioStation;


    public Radio(int minRadioStation, int maxRadioStation) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentRadioStation = minRadioStation;

    }

    public Radio(int size) {
        this.amountRadioStation = minRadioStation + size;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getMinRadioStation() {

        return minRadioStation;
    }

    public int getMaxRadioStation() {

        return maxRadioStation;
    }

    public int getAmountRadioStation() {

        return amountRadioStation;
    }

    public int setQuantityRadioStation() {
        return amountRadioStation;
    }

    public void setNextRadioStation(int nextCurrentRadioStation) {
        if (currentRadioStation == maxRadioStation) {
            nextCurrentRadioStation = minRadioStation;
        }
        currentRadioStation = nextCurrentRadioStation;
    }

    public void setPrevRadioStation(int prevCurrentRadioStation) {
        if (currentRadioStation == minRadioStation) {
            prevCurrentRadioStation = maxRadioStation;
        }
        currentRadioStation = prevCurrentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }

        currentRadioStation = newCurrentRadioStation;
    }


    public void increaseRadioStation() {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = currentRadioStation + 1;

        }
    }

    public void reduceRadioStation() {
        if (currentRadioStation <= maxRadioStation) {
            currentRadioStation = currentRadioStation - 1;

        }
    }
}

