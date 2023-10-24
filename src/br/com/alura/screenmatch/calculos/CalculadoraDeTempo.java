package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    //Aqui ele pega as durações dos filmes, soma todos e guarda na variavel tempoTotal
    //Logo, vamos ter uma lista e saberemos quanto tempo vai levar para terminar todos os filmes
    //Colocamos um get e não um set, por causa que queremos pegar o atributo da duracao em minutos, para manipularmos
    //Ele na calculadora, não inserir essa duração lá...
//    public void inclui(Filme filme) {
//        tempoTotal += filme.getDuracaoEmMinutos();
//
//    }
//    public void inclui(Serie serie) {
//        tempoTotal += serie.getDuracaoEmMinutos();
//
//    }

    //Ou seja, todo mundo que for filho de Titulo vai passar
    //Quando eu tenho varias formas de se referir a aquele elemento, no nosso caso:
    //Olha ali um Titulo, ou olha ali um Filme - É o conceito de polimorfismo
    //Tanto pela especialização, quanto pela generalização
    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos(); //Se é serie vai utilizar o calculo de Serie, se for filme, Filme
    }
}
