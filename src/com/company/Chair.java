package com.company;

public class Chair extends Furniture {

    public Chair(float weight, float length, float width, float height, String color, int numSeats){
        super(weight, length, width, height, color, numSeats);
    }

    @Override
    public void say() {
        System.out.println("Стул" + "\nС размерами: " + getWidth() + " x " + getLength() + " x " + getHeight() + "\nВесит " + getHeight() + " кг" + "\nЦвет " + getColor() + "\nНа него сядут " + getNumSeats() + " человек");
    }
}