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

public class Member {
    ArrayList<ModelBuyProducts> ArrayListBuyBroduct =  new ArrayList<>();
    ArrayList<ModelProducts> ArrayListBroduct = new ArrayList<>();
    ArrayList<ModelProducts> ArrayListServies = new ArrayList<>();
    ArrayList<ModelMember> arrayList = new ArrayList<>();

    public void addMember(String name, String number, String type) {
        arrayList.add(new ModelMember(name, number, TypeAccount.MASSEY.toString()));
        System.out.println("Success add Member");
    }

    // Get data user
    public void getDataMember(String number) {
        for (ModelMember data : arrayList) {
            if (data.getNumber().equals(number)) {
                System.out.println(data.getNumber());
                System.out.println(data.getName());
                System.out.println(data.getType());
            }
        }
    
    }

    // Delete data user
    public void deleteDataMember(String number) {
        for (ModelMember data : arrayList) {
            if (data.getNumber().equals(number)) {
                data.setType("");
                data.setNumber("");
                data.setName("");
                System.out.println("Delete Success");
            }
        }
    }

    // Update data user
    public void updateDataMember(String number, String name) {
        for (ModelMember data : arrayList) {
            if (data.getNumber().equals(number)) {
                data.setNumber(number);
                data.setName(name);
                System.out.println("Update Success");
            }
        }
    }

    // Search user
    public void searchMember( String number) {
        for (ModelMember data : arrayList) {
          
                if (data.getNumber().equals(number)) {
                    getDataMember(data.getNumber());
                }
            
        }
    }
    
    
    
// buy Product
    public void buyProducts(String number, String id_product  ,double discount ) {     
        for (ModelProducts data : ArrayListBroduct) {
            if (data.getId().equals(id_product)) {
                for (ModelMember memberData : arrayList) {
                    if (memberData.getNumber().equals(number)) {      
                            ArrayListBuyBroduct.add(new ModelBuyProducts(number, id_product, discount));
                        System.out.println("Success buy");
                    }
                }
            } else {
                System.out.println("The product is not available");
            }
        }
        if (ArrayListBroduct.size() == 0) {
            System.out.println("There are currently no products");
        }
    }
    
    
        public void addProduct(String id, String name, double price, String description) {
        ArrayListBroduct.add(new ModelProducts(id, name, price, description));
        System.out.println("Success added Product");
    }

    public void listProduct() {
        for (ModelProducts data : ArrayListBroduct) {
            System.out.println("id Product: " + data.getId());
            System.out.println("name Product: " + data.getName());
            System.out.println("price: " + data.getPrice());
            System.out.println("description Product: " + data.getDescription());
        }
    }
    
       public void BuyProduct(String id , String Number) {
           System.out.println(ArrayListBroduct.size());
            System.out.println(arrayList.size());
        for (ModelProducts data : ArrayListBroduct) {
            if(id.equals(data.getId())){
                for(ModelMember dataMember : arrayList){
                    if(dataMember.getNumber().equals(Number)){
                        String type = dataMember.getType();
                        int disCount = 0;
                        if(type.equals(TypeAccount.BRONZE)){
                            disCount = 30;
                        }else if(type.equals(TypeAccount.GOLDEN)){
                            disCount = 40;
                        }else if(type.equals(TypeAccount.MASSEY)){
                            disCount = 50;
                        }else if(type.equals(TypeAccount.SILVER)){
                            disCount = 60;
                        }
                          System.out.println("id Product: " + data.getId());
                          System.out.println("name Product: " + data.getName());
                          System.out.println("price: " + data.getPrice());
                          System.out.println("description Product: " + data.getDescription());
                          System.out.println("disCount :" +disCount + "%");
                          if(disCount == 0){
                               System.out.println("price After disCount : " +  data.getPrice());
 
                          }else{
                              System.out.println("price After disCount : " + data.getPrice() / disCount);

                          }
                          buyProducts(Number ,id, disCount);
                        
                    }
                }
                     
        
            }
        }
    }

    public void listProducts(String number) {
        
        
        for (ModelBuyProducts data : ArrayListBuyBroduct) {
            if (data.getNumberUser().equals(number)) {
                System.out.println("nameUser: " + data.getNumberUser());
                System.out.println("id Product: " + data.getIdProduct());
                for(ModelProducts dataProduct : ArrayListBroduct){
                    if(dataProduct.equals(data.getIdProduct())){
                               System.out.println("nameProduct: " + dataProduct.getName());
                                System.out.println("Description Product: " + dataProduct.getDescription());
                    }
                        
                }
            }
        }
        if (ArrayListBroduct.size() == 0) {
            System.out.println("There are currently no products");
        }
    }
}
