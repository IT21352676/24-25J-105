package com.example.elementaryapp2.classes;

public class Letter {
    public String letter;
    public String sinhala;
    public int index;
    public boolean isLocked = false;

    public Letter(String letter, String sinhala, int index) {
        this.letter = letter;
        this.sinhala = sinhala;
        this.index = index;
    }

    public Letter(String letter, String sinhala, int index, int isLockedInt) {
        this.letter = letter;
        this.sinhala = sinhala;
        this.index = index;
        this.isLocked = isLockedInt == 0;
    }

    public Letter(String letter) {
        this.letter = letter;
    }
}
