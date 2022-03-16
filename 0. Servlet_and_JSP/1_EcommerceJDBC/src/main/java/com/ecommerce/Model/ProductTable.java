package com.ecommerce.Model;

import javax.servlet.http.Part;

public class ProductTable {
    private String pName;
    private String pCategory;
    private int pPrice;
    private String pImage;

    public ProductTable(){
    }

    public ProductTable(String pName, String pCategory, int pPrice, String pImage) {
        this.pName = pName;
        this.pCategory = pCategory;
        this.pPrice = pPrice;
        this.pImage = pImage;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public String getpImage() {
        return pImage;
    }

    public void setpImage(String pImage) {
        this.pImage = pImage;
    }
}
