package br.com.alura.screenmatch.modelos;

//Classe é o modelo
public class Filme {
    //O que um filme tem? - Variaveis
    public String nome;
    public int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;
    //O que um filme faz? - Métodos
    //Quando uma função está dentro de uma classe, nomeamos como metodo (comportamento daquela classe)

    //void - apenas faz, não retorna nada
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome); //br.com.alura.screenmatch.modelos.Filme@e9e54c2
        System.out.println("Ano de lancaçamento: " + anoDeLancamento); //1970
    }
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //Retorna uma operação
    public double pegaMedia() {
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
