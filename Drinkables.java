//package org.example.hw;

//import java.math.BigDecimal;

/**
 * Класс напитков
 */
public class Drinkables extends Product {
    private Double volume;

    public Drinkables(String name, Double price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    
    public String toString() {
        return super.toString() + "объем = " + volume + " ";
    }

    public void setVolume(Double volume) {
         this.volume = volume;
    }
}
