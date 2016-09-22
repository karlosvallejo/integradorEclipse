package com.example.a1107513806.myapplication;

import java.io.Serializable;
import java.util.ArrayList;

public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    int numeroCategoria;
    String nombreCategoria;
    ArrayList<Item> itemsLista;
    String[] itemsUno;

    float[] preciosUno;

    public Categoria(int numeroCat, String nombre, String[] itemsUno, float[] preciosUno){
        itemsLista= new ArrayList<>();
        this.itemsUno= new String[4];
        /*
        itemsUno[0]= "Camiseta";
        itemsUno[1]="Zapatos";
        itemsUno[2]="Pantalon";
        itemsUno[3]="Gafas";
        itemsDos= new String[4];
        itemsDos[0]= "Perro Caliente";
        itemsDos[1]="Café";
        itemsDos[2]="Pizza";
        itemsDos[3]="Empanadas";
        */
        this.numeroCategoria=numeroCat;
        this.nombreCategoria=nombre;
        this.itemsUno=itemsUno;
        this.preciosUno=preciosUno;

            for (int i = 0; i < 4; i++) {
             itemsLista.add(new Item(itemsUno[i],preciosUno[i]));
            }


    }

}
