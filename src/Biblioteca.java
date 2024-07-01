import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> listaLivros;
    private List<Usuario> listaUsuarios;

    public Biblioteca() {
        this.listaLivros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livro == null) {
            System.out.println("O livro não pode ser nulo.");
            return;
        }
        if (this.listaLivros.contains(livro)) {
            System.out.println("O livro já está na biblioteca.");
        } else {
            this.listaLivros.add(livro);
            System.out.println("Livro adicionado com sucesso.");
        }
    }

    public void removerLivro(Livro livro) {
        if (livro == null) {
            System.out.println("O livro não pode ser nulo.");
            return;
        }
        if (this.listaLivros.remove(livro)) {
            System.out.println("Livro removido com sucesso.");
        } else {
            System.out.println("O livro não foi encontrado na biblioteca.");
        }
    }

    public Livro buscarLivro(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            System.out.println("O título não pode ser nulo ou vazio.");
            return null;
        }
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        System.out.println("Livro não encontrado.");
        return null;
    }

    public void listarLivros() {
        if (listaLivros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Lista de livros na biblioteca:");
            for (Livro livro : listaLivros) {
                System.out.println(livro);
                System.out.println("\n");
            }
        }
    }

    public void adicionarUsuario(Usuario usuario) {
        if (usuario == null) {
            System.out.println("O usuário não pode ser nulo.");
            return;
        }
        if (this.listaUsuarios.contains(usuario)) {
            System.out.println("O usuário já está cadastrado.");
        } else {
            this.listaUsuarios.add(usuario);
            System.out.println("Usuário adicionado com sucesso.");
        }
    }

    public void removerUsuario(Usuario usuario) {
        if (usuario == null) {
            System.out.println("O usuário não pode ser nulo.");
            return;
        }
        if (this.listaUsuarios.remove(usuario)) {
            System.out.println("Usuário removido com sucesso.");
        } else {
            System.out.println("O usuário não foi encontrado.");
        }
    }

    public Usuario buscarUsuario(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            System.out.println("O CPF não pode ser nulo ou vazio.");
            return null;
        }
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCpf().equalsIgnoreCase(cpf)) {
                return usuario;
            }
        }
        System.out.println("Usuário não encontrado.");
        return null;
    }

    public void listarUsuarios() {
        if (listaUsuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Lista de usuários cadastrados:");
            for (Usuario usuario : listaUsuarios) {
                System.out.println(usuario);
                System.out.println("\n");
            }
        }
    }
}
