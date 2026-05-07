package biblioteca.model;

public class Livro {    

    //Atributos - características do objeto
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    //Construtor - como o objeto é criado
    public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true; //todo livro começa como disponível
    }

    //Métodos - comportamentos do objeto
    public void exibirDetalhes() {
        System.out.println("=== Detalhes do Livro ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public void emprestar() { //Método de empréstimo
        if (disponivel) { //verifica se disponivel é "true"
            disponivel = false; //caso seja verdade, troca o disponivel para "false"
            System.out.println("Livro '" + titulo + "' emprestado com sucesso."); //exibe a mensagem de empréstimo bem sucedido
        } else { //se for "false"
            System.out.println("Livro '" + titulo + "' já está emprestado."); //exibe a mensagem de "já emprestado"
        }
    }

    public void devolver() { //Método de devolução
        disponivel = true; //troca disponivel para "true"
        System.out.println("Livro '" + titulo + "' devolvido com sucesso."); //exibe a mensagem de devolução
    }

    //Getters - acesso controlado aos atributos privados
    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
