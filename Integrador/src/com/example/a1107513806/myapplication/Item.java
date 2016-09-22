package com.example.a1107513806.myapplication;

import java.io.Serializable;

public class Item implements Serializable{
    private static final long serialVersionUID = 1L;
    public float precio;
    public String nombre;
    public Item(String nom, float prec){
        this.precio=prec;
        this.nombre= nom;
    }
}
