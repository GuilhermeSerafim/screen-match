package br.com.alura.joymusic.modelo;

import br.com.alura.joymusic.calculos.Classificavel;

public class Podcast extends Audio implements Classificavel {
    private String entrevistado;
    private String tema;

    //Uso dados diferentes para recomendar ou não no Podcast e Musica
    // Podcast - Reproduções | Musicas - Curtidas
    //Mas são avaliados da mesma forma - Polimorfismo
    @Override
    public int getRecomendavel() {
        return getTotalDeReproducoes();
    }

    public String getEntrevistado() {
        return entrevistado;
    }

    public void setEntrevistado(String entrevistado) {
        this.entrevistado = entrevistado;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
