//Classe é o modelo
public class Filme {
    //O que um filme tem? - Variaveis
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;
    //O que um filme faz? - Métodos
    //Quando uma função está dentro de uma classe, nomeamos como metodo (comportamento daquela classe)

    //void - apenas faz, não retorna nada
    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome); //Filme@e9e54c2
        System.out.println("Ano de lancaçamento: " + anoDeLancamento); //1970
    }
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //Retorna uma operação
    double pegaMedia() {
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }

    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
