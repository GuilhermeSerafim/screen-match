//Classe é o modelo
public class Filme {
    //O que um filme tem? - Variaveis
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //O que um filme faz? - Métodos
    //void - apenas faz, não retorna nada
    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome); //Filme@e9e54c2
        System.out.println("Ano de lancaçamento: " + anoDeLancamento); //1970
    }
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
