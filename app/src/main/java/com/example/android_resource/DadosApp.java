package com.example.android_resource;

import java.util.ArrayList;
import java.util.List;



public class DadosApp extends MainActivity {


    private List<Tarefas> listaPassos;
    private List<Plano> listaPlano;

    private int posicao;
    private int PassosFeitos = 0;

    int posicaoPlano = getPlanoEfetuar();


    // singleton
    public DadosApp() {


        for (int i = 0; i < 10; i++){

            uniaoTarefasPlano(i);


                if(i == 0 && i == posicaoPlano) {

                    listaPlano = new ArrayList<>();
                    listaPlano.add(new Plano("Receita de bolo",
                            (ArrayList<Tarefas>) listaPassos));

                } else {

                    if(i == 1 && i == posicaoPlano){

                        listaPlano = new ArrayList<>();
                        listaPlano.add(new Plano("Preparação de terreno de trigo",
                                (ArrayList<Tarefas>) listaPassos));

                            }
                        }
                    }

        posicao = 1;
    }

    private void uniaoTarefasPlano(int a){


        if(posicaoPlano == 0 && a == 0){



            listaPassos = new ArrayList<>();

            listaPassos.add(new Tarefas("1. Passo --> Preparação de ingredientes",
                    false));
            listaPassos.add(new Tarefas("2. Passo --> Mistura de ingredientes",
                    false));

            listaPassos.add(new Tarefas("3. Passo --> Coloque o bolo no forno",
                    false));
            listaPassos.add(new Tarefas("4. Passo --> Finalizar o bolo",
                    false));
        }else {
            if(posicaoPlano == 1 && a == 1){


                listaPassos = new ArrayList<>();

                listaPassos.add(new Tarefas("1. Passo --> Compra de terreno",
                        false));

                listaPassos.add(new Tarefas("2. Passo --> Preparação de terreno",
                        false));

                listaPassos.add(new Tarefas("3. Passo --> Plantar trigo",
                        false));

                listaPassos.add(new Tarefas("4. Passo --> Obter colheita",
                        false));
            }
        }



    }


    public String getTextoPassoReceita() {

        return listaPassos.get(posicao - 1).getTexto();
    }

    public void avancar() {
        if (posicao < listaPassos.size()){
            posicao++;
        }
    }

    public void retroceder() {
        if (posicao > 1)
            posicao--;
    }

    public int getPosicao()  {
        return posicao;
    }

    public int getSizeListaPassos()  {
        return listaPassos.size();
    }

    public void marcarFeito() {
        listaPassos.get(posicao - 1).setFeito(true);
    }

    public int getPassosFeitos()  {
        return PassosFeitos;
    }

}
