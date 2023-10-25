package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    //Aqui usamos uma variavel de referencia para podermos usar o metodo filtra para as classes que implementão da interface
    public void filtra(Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("☆☆☆☆☆");
        } else if(classificavel.getClassificacao() >= 2) {
            System.out.println("☆☆☆☆");
        } else {
            System.out.println("☆☆☆");
        }
    }
}
