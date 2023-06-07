/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalproject;

/**
 *
 * @author mohand
 */

public class ModelBuyProducts {
    private String numberUser;
    private String idProduct;
    private double discount;

    public ModelBuyProducts(String numberUser, String idProduct, double discount) {
        this.numberUser = numberUser;
        this.idProduct = idProduct;
        this.discount = discount;
    }

    public String getNumberUser() {
        return numberUser;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public double getDiscount() {
        return discount;
    }

    public void setNumberUser(String numberUser) {
        this.numberUser = numberUser;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
