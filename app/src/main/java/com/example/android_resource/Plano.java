package com.example.android_resource;

import java.util.ArrayList;

public class Plano {
    private String texto;
    private ArrayList<Tarefas> tarefas;



    Plano(String texto, ArrayList<Tarefas> tarefas) {
        this.texto = texto;
        this.tarefas = tarefas;

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(){
        this.texto = null;
    }


    public ArrayList<Tarefas> gettarefas(){
        return tarefas;
    }
}
