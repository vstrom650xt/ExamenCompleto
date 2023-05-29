package com.example.examencompleto;

import java.io.Serializable;

public class Oficio implements Serializable {
    private String nom;
    private int edad;

    public Oficio(String nom, int edad) {
        this.nom = nom;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public int getEdad() {
        return edad;
    }


    @Override
    public String toString() {
        return nom + " " + edad;
    }
}
