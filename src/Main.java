import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        //Tipo referencia
        //A parte da direita cria o objeto
        //A parte da esquerda só está guardando onde o objeto está
        //Instanciação de objetos
        Filme meuFilme = new Filme();
        //Passar os valores para o objeto
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
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
        System.out.println(meuFilme.nome.toUpperCase());
    }
}