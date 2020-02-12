package com.model;

import com.entities.Pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Model {
    private static Model instanceModel = new Model();
    private List<Pizza> pizzas;
    private Model(){
        pizzas = new ArrayList<Pizza>();
    }
    public static Model getInstance() {
        return instanceModel;
    }
    public void add(Pizza pizza){
        pizzas.add(pizza);
    }
    public Pizza getLast(){
        return pizzas.get(pizzas.size()-1);
    }
    public Map<String, Integer> listout(){
        HashMap<String, Integer> hmap = new HashMap<>();
        for(Pizza pizza:  pizzas){
            hmap.put(pizza.getName(),pizza.getCount());
        }
        return hmap;
    }
}
