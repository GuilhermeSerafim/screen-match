package br.com.alura.joymusic.modelo;

import br.com.alura.joymusic.calculos.Classificavel;

public class Musicas extends Audio implements Classificavel {
    private String estiloMusical;
    private String artista;

    @Override
    public int getRecomendavel() {
        return getTotalDeCurtidas();
    }
}
