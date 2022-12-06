package com.example.productbackend2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Products {
    @Id
    @GeneratedValue
    private int id;
    private int productcode;
    private String productname;
    private String mandate;
    private String expdate;
    private String brand;
    private String price;
    private String sellername;
    private String distributor;

    public Products() {
    }

    public Products(int id, int productcode, String productname, String mandate, String expdate, String brand, String price, String sellername, String distributor) {
        this.id = id;
        this.productcode = productcode;
        this.productname = productname;
        this.mandate = mandate;
        this.expdate = expdate;
        this.brand = brand;
        this.price = price;
        this.sellername = sellername;
        this.distributor = distributor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getMandate() {
        return mandate;
    }

    public void setMandate(String mandate) {
        this.mandate = mandate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }
}
