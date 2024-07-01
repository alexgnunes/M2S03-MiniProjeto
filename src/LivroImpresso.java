public class LivroImpresso extends Livro implements Emprestimo {
    private int numeroPaginas;
    private String tipoCapa;
    private boolean emprestado;

    public LivroImpresso(String titulo, String autor, String isbn, String editora, Integer anoPublicacao, String genero,
                         int numeroPaginas, String tipoCapa) {
        super(titulo, autor, isbn, editora, anoPublicacao, genero);
        this.numeroPaginas = numeroPaginas;
        this.tipoCapa = tipoCapa;
        this.emprestado = false;
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
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("O livro não está emprestado.");
        }
    }

    @Override
    public boolean verificarStatusEmprestimo() {
        return emprestado;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        double multaPorDia = 0.5;
        return diasAtraso * multaPorDia;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Número de Páginas: " + numeroPaginas + "\n" +
                "Tipo de Capa: " + tipoCapa + "\n" +
                "Emprestado: " + (emprestado ? "Sim" : "Não");
    }
}
