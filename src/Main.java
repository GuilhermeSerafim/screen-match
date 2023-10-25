import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        //Tipo referencia
        //A parte da direita cria o objeto
        //A parte da esquerda só está guardando onde o objeto está
        //Instanciação de objetos
        Filme meuFilme = new Filme();
        //Passar os valores para o objeto
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(3000);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        //Comportamento da classe
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        //System.out.println(meuFilme.pegaMedia());
        //ou
        double media = meuFilme.pegaMedia();
        System.out.println(media);

        //Assim como a classe br.com.alura.screenmatch.modelos.Filme, a String também é uma classe e tem os seus metodos
        System.out.println(meuFilme.getNome().toUpperCase());
        System.out.println("*************");

        //Só de colocar o extends, já herdamos os atributos e metodos do titulo na serie
        Serie onePiece = new Serie();
        onePiece.setNome("Melhor anime de todos");
        onePiece.setAnoDeLancamento(2000);
        onePiece.exibeFichaTecnica();
        onePiece.setTemporadas(12);
        onePiece.setEpisodiosPorTemporada(100);
        onePiece.setMinutosPorEpisodio(30);
        System.out.println("Duração para maratonar One Piece: " + onePiece.getDuracaoEmMinutos());
        System.out.println("************");

        Filme outroFilme = new Filme();
        //Passar os valores para o objeto
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.exibeFichaTecnica();
        System.out.println("************");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(onePiece);
        System.out.println("Tempo a ser dedicado para ver tudo: " + calculadora.getTempoTotal() + " minutos");


    }
}