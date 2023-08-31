package com.journaldev.design.test;

import com.journaldev.design.decorator.BasicCar;
import com.journaldev.design.decorator.SportsCar;
import com.journaldev.design.decorator.Car;
import com.journaldev.design.decorator.LuxuryCar;
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportscar = new SportsCar(new BasicCar());
        sportscar.assemble();
        System.out.println("\n***");
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();

    }
}
