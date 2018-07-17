package com.fti.ine;
import Pet;

public class Fish extends Animal implements Pet{
    String name;
    public Fish(String name){
        super(0);
        this.name=name;
    }
    public Fish(){
        this(" ");
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name=name;
    }
    @Override
    public void play(){
        System.out.println("Ikan suka minum air");
    }
    @Override
    public void eat(){
        System.out.println(" Ikan pemakan buaya");
    }
    @Override
    public void walk(){
        System.out.println("Ikan tidak berjalan tetapi berenang");
    }
}
