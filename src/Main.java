import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Sistema de Biblioteca ===");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Listar Livros");
            System.out.println("4. Adicionar Usuário");
            System.out.println("5. Remover Usuário");
            System.out.println("6. Listar Usuários");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ISBN do livro: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Digite a editora do livro: ");
                    String editora = scanner.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int anoPublicacao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o gênero do livro: ");
                    String genero = scanner.nextLine();
                    Livro livro = new Livro(titulo, autor, isbn, editora, anoPublicacao, genero);
                    biblioteca.adicionarLivro(livro);
                    break;
                case 2:
                    System.out.print("Digite o título do livro a ser removido: ");
                    titulo = scanner.nextLine();
                    livro = biblioteca.buscarLivro(titulo);
                    if (livro != null) {
                        biblioteca.removerLivro(livro);
                    }
                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                case 4:
                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF do usuário: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite o endereço do usuário: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Digite o telefone do usuário: ");
                    String telefone = scanner.nextLine();
                    Usuario usuario = new Usuario(nome, cpf, endereco, telefone);
                    biblioteca.adicionarUsuario(usuario);
                    break;
                case 5:
                    System.out.print("Digite o CPF do usuário a ser removido: ");
                    cpf = scanner.nextLine();
                    usuario = biblioteca.buscarUsuario(cpf);
                    if (usuario != null) {
                        biblioteca.removerUsuario(usuario);
                    }
                    break;
                case 6:
                    biblioteca.listarUsuarios();
                    break;
                case 7:
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 7);

        scanner.close();
    }
}
