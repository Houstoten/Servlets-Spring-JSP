package com.entities;

public enum PizzaEnum {
    CARBONARA("Carbonara"), CEZARIO("Cezario"), CAPRICHOZA("Caprichoza"), MEATPIZZA("MeatPizza");
    private String name;

    PizzaEnum(String name) {
        this.name = name;
    }
}
