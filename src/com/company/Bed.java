package com.company;

public class Bed extends Furniture {

    public Bed(float weight, float length, float width, float height, String color, int numSeats){
        super(weight, length, width, height, color, numSeats);
    }

    @Override
    public void say() {
        System.out.println("кровать" + "\nС размерами: " + getWidth() + " x " + getLength() + " x " + getHeight() + "\nвесит " + getHeight() + " кг" + "\nцвет " + getColor() + "\nна него сядут " + getNumSeats() + " человек");
    }
}