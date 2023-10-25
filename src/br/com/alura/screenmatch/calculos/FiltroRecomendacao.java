package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    //Aqui usamos uma variavel de referencia para podermos usar o metodo filtra para as classes que usam a implementação da interface
    public void filtra(Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("Está em alta");
        } else if(classificavel.getClassificacao() == 3) {
            System.out.println("Bem classificado");
        } else {
            System.out.println("Razoável");
        }
    }
}
