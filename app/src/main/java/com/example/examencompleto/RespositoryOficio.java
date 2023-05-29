package com.example.examencompleto;

import java.util.ArrayList;
import java.util.List;

public class RespositoryOficio {

    private List<Oficio> listaoficios;
    private static RespositoryOficio instance;

    public RespositoryOficio() {

        listaoficios = new ArrayList<>();
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));
        listaoficios.add(new Oficio("jose", 23));


    }

    public static RespositoryOficio getInstance() {

        if (instance == null)
            instance = new RespositoryOficio();

        return instance;
    }


    public int size(){

        return listaoficios.size();
    }

    public List<Oficio> getAll(){return  new ArrayList<>(listaoficios);}

    public  Oficio getOficio(int i){
        return listaoficios.get(i);

    }
}
