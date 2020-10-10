package com.company;

public class Main {

    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop();
        furnitureShop.shop();
        Glass glass = new Glass (1.0f, "круглая", "прозрачный");
        Plate plate = new Plate(0.5f, "круга", "белый");
        Cup cup = new Cup(0.2f, "цилиндрическая", "прозрачный");

        glass.say();
        plate.say();
        cup.say();
    }
}