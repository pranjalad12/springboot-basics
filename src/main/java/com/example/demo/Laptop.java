package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int lid;
    private String brand;
    public int getLid(){
        return lid;
    }
    public void setLid(int lid) {
        this.lid = lid;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String toString() {
        return "Laptop: " + this.lid + " " + this.brand;
    }
    public void compile(){
        System.out.println("Hello this is laptop");
    }

}
