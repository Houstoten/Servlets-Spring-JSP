package com.entities;

public class Pizza {
    private String name;
    private int count;

    public Pizza() {
        this.name = "Carbonara";
        this.count = 1;
    }

    public Pizza(String name, String count) {
        this.name = name;
        if(name.equals(""))
            this.name = "Carbonara";
        try {
            this.count = Integer.parseInt(count);
        }catch (Exception ex){System.out.println("Shit happens."); this.count = 1;}
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
