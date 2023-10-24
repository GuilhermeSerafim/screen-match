package br.com.alura.screenmatch.modelos;

public class Titulo {
    //O que um filme tem? - Variaveis
    //Normalmente todos os atributos de uma classe são privados
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    //O que um filme faz? - Métodos
    //Quando uma função está dentro de uma classe, nomeamos como metodo (comportamento daquela classe)
    //void - apenas faz, não retorna nada
    public void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancaçamento: " + anoDeLancamento);
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


    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //Nos setters podemos colocar validações
    public void setAnoDeLancamento(int anoDeLancamento) {
        //Validação simples (para entender o conceito)
        if (anoDeLancamento > 1800 && anoDeLancamento < 2023) {
            this.anoDeLancamento = anoDeLancamento;
        } else {
            this.anoDeLancamento = 7;
        }
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //O this é usado aqui para pegar o contexto da variavel local
    public void setNome(String nome) {
        this.nome = nome;
    }
    //Para facilitar o entendimento
//    public void setNome(String n) {
//        nome = n;
//    } nome = variavel local | n = parametro a ser passado e inserido na variavel local
}
