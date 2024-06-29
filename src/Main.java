public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "978-0439708180", "Bloomsbury", 1997, "Fantasia");
        LivroEletronico livroEletronico = new LivroEletronico("O Senhor dos Anéis", "J.R.R. Tolkien", "978-0261103573", "HarperCollins", 1954, "Fantasia",
                "PDF", 5.5, "Kindle");
        LivroImpresso livroImpresso = new LivroImpresso("1984", "George Orwell", "978-0451524935", "Signet Classics", 1949, "aventura",
                411, "padrao");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livroImpresso);
        biblioteca.adicionarLivro(livroEletronico);

        biblioteca.listarLivros();
    }
}
