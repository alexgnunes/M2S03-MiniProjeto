public class LivroImpresso extends Livro {

    int numeroPaginas;
    String tipoCapa;

    public LivroImpresso(String titulo, String autor, String isbn, String editora, Integer anoPublicacao, String genero,
                         int numeroPaginas, String tipoCapa) {
        super(titulo, autor, isbn, editora, anoPublicacao, genero);
        this.numeroPaginas = numeroPaginas;
        this.tipoCapa = tipoCapa;
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(String tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Nu?mero de Pa?ginas: " + numeroPaginas + "\n" +
                "Tipo de Capa: " + tipoCapa;
    }
}
