package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    //Aqui ele pega as durações dos filmes, soma todos e guarda na variavel tempoTotal
    //Logo, vamos ter uma calculadora, na qual saberemos quanto tempo vai levar para terminar todos os filmes e series
    //Colocamos um get e não um set, por causa que queremos pegar o atributo da duracao em minutos, para manipularmos
    //Ele na calculadora, não inserir essa duração lá...

    //Esse exemplo seria se caso usassemos de forma especifica
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
    //Olha ali um Titulo, ou olha ali um Filme (que são a mesma coisa) - É o polimorfismo
    //Tanto pela especialização, quanto pela generalização
    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de: " + titulo.getNome());
        //se fosse só titulo:
        // Adicionando duração em minutos de: br.com.alura.screenmatch.modelos.Filme@7ba4f24f
        //Adicionando duração em minutos de: br.com.alura.screenmatch.modelos.Filme@3b9a45b3
        //Adicionando duração em minutos de: br.com.alura.screenmatch.modelos.Serie@7699a589
        //Ele se referencia em que lugar aquele tituloe sta guardado, nomeação dele e o dominio reverso
        this.tempoTotal += titulo.getDuracaoEmMinutos(); //Se é serie vai utilizar o calculo de Serie, se for filme, Filme
    }
}
