/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

import java.util.ArrayList;

/**
 *
 * @author mohand
 */
public class Services {
    ArrayList<ModelProducts> ArrayListServies = new ArrayList<>();

    public void addService(String id, String name, double price, String description) {
        ArrayListServies.add(new ModelProducts(id, name, price, description));
    }

    public void listServices() {
        for (ModelProducts data : ArrayListServies) {
            System.out.println("id Product: " + data.getId());
            System.out.println("name Product: " + data.getName());
            System.out.println("price: " + data.getPrice());
            System.out.println("description Product: " + data.getDescription());
        }
    }
}
