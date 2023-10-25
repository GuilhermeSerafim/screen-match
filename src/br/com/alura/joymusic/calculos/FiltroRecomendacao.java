package br.com.alura.joymusic.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) { //Polimorfismo
        if(classificavel.getRecomendavel() >= 5) {
            System.out.println("Está em alta");
        } else if(classificavel.getRecomendavel() == 3) {
            System.out.println("Recomendável");
        } else {
            System.out.println("Razoável");
        }
    }
}
