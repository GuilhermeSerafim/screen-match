package br.com.alura.joymusic.modelo;

public class Audio {
    private String titulo;
    private int duracaoEmMinutos;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
//    private int classificacao; Acho que não precisa tbm

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }
//Acho que tambem nao precisa
//    public void setTotalDeReproducoes(int totalDeReproducoes) {
//        this.totalDeReproducoes = totalDeReproducoes;
//    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }
//Acho que não precisa
//    public void setCurtidas(int curtidas) {
//        this.curtidas = curtidas;
//    }


    public void curtir(boolean curtida) {
        if (curtida == true) {
            totalDeCurtidas++;
        }
    }

    public void reproduzir(boolean reproduziu) {
        if (reproduziu == true) {
            totalDeReproducoes++;
        }
    }

    public void exibaFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Duração: " + duracaoEmMinutos + "min");
        System.out.println("Reproduções: " + totalDeReproducoes);
        System.out.println("Curtidas: " + totalDeCurtidas);
    }
}
