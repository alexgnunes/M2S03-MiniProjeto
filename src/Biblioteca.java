import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> listaLivros;

    public Biblioteca() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livro == null) {
            System.out.println("O livro n�o pode ser nulo.");
            return;
        }
        if (this.listaLivros.contains(livro)) {
            System.out.println("O livro j� est� na biblioteca.");
        } else {
            this.listaLivros.add(livro);
            System.out.println("Livro adicionado com sucesso.");
        }
    }

    public void removerLivro(Livro livro) {
        if (livro == null) {
            System.out.println("O livro n�o pode ser nulo.");
            return;
        }
        if (this.listaLivros.remove(livro)) {
            System.out.println("Livro removido com sucesso.");
        } else {
            System.out.println("O livro n�o foi encontrado na biblioteca.");
        }
    }

    public Livro buscarLivro(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("O t�tulo n�o pode ser nulo ou vazio.");
            return null;
        }
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        System.out.println("Livro n�o encontrado.");
        return null;
    }

    public void listarLivros() {
        if (listaLivros.isEmpty()) {
            System.out.println("A biblioteca est� vazia.");
        } else {
            System.out.println("Lista de livros na biblioteca:");
            for (Livro livro : listaLivros) {
                System.out.println(livro);
                System.out.println("\n" );
            }
        }
    }
}
