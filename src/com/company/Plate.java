package com.company;

public class Plate extends Dish {

    public Plate(float weight, String form, String color){
        setWeight(weight);
        setForm(form);
        setColor(color);
    }

    @Override
    public void say() {
        System.out.println("тарелка\nВес " + getWeight() + "\nформа " + getForm() + "\nцвет " + getColor());
        System.out.println(getPure()?"тарелка чистая":"тарелка грязная");
    }

    @Override
    public void wash() {
        setPure(true);
        System.out.println("тарелка чистая");
    }

    @Override
    public void dirty() {
        setPure(false);
        System.out.println("тарелка грязная");
    }
}