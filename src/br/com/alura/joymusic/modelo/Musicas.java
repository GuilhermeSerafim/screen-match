package br.com.alura.joymusic.modelo;

import br.com.alura.joymusic.calculos.Classificavel;

public class Musicas extends Audio implements Classificavel {
    private String estiloMusical;
    private String artista;

    @Override
    public int getRecomendavel() {
        return getTotalDeCurtidas();
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
}
