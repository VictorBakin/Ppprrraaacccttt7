package com.company;

public class FurnitureShop {
    private Bed bed = new Bed(40.0f, 10.0f, 12.0f, 4.0f, "Черный",5);
    private Table table = new Table(10.0f, 3.0f, 4.0f, 4.0f, "Коричневый",0);
    private Chair chair = new Chair(15.0f, 4.0f, 5.0f, 4.0f, "Белый",2);

    public void shop(){
        bed.say();
        table.say();
        chair.say();
    }
}