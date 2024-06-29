import java.util.Objects;

public class Livro {

    String titulo;
    String autor;
    String isbn;
    String editora;
    Integer anoPublicacao;
    String genero;

    public Livro() {
    }

    public Livro(String titulo, String autor, String isbn, String editora, Integer anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(isbn, livro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        StringBuilder livro = new StringBuilder();
        livro.append("Livro: ").append(titulo)
                .append("\nAutor: ").append(autor)
                .append("\nISBN: ").append(isbn)
                .append("\nEditora: ").append(editora)
                .append("\nAno de Publicação: ").append(anoPublicacao)
                .append("\nGênero: ").append(genero);

        return livro.toString();
    }
}
