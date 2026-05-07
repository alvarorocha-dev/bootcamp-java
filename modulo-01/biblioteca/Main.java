package biblioteca;

import biblioteca.model.Livro;

public class Main {

    public static void main(String[] args) {        

        //Criando objetos a partir da classe Livro
        Livro livro1 = new Livro("Clean Code", "Robert C. Martin", 2008, true);
        Livro livro2 = new Livro("O Programador Pragmático", "Andrew Hunt", 1999, true);
    

    //Testando os métodos
    livro1.exibirDetalhes();
    System.out.println();

    livro1.emprestar();
    livro1.emprestar(); //tenta emprestar novamente o mesmo livro - deve bloquear

    System.out.println();
    livro1.devolver();

    System.out.println();
    livro2.exibirDetalhes();    
    }    
}
