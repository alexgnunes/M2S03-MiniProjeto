public class LivroEletronico extends Livro implements Emprestimo {
    private String formatoArquivo;
    private double tamanhoArquivo;
    private String plataformaLeitura;
    private boolean emprestado;

    public LivroEletronico(String titulo, String autor, String isbn, String editora, Integer anoPublicacao, String genero,
                           String formatoArquivo, double tamanhoArquivo, String plataformaLeitura) {
        super(titulo, autor, isbn, editora, anoPublicacao, genero);
        this.formatoArquivo = formatoArquivo;
        this.tamanhoArquivo = tamanhoArquivo;
        this.plataformaLeitura = plataformaLeitura;
        this.emprestado = false;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getPlataformaLeitura() {
        return plataformaLeitura;
    }

    public void setPlataformaLeitura(String plataformaLeitura) {
        this.plataformaLeitura = plataformaLeitura;
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
        double multaPorDia = 1.0;
        return diasAtraso * multaPorDia;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Formato do Arquivo: " + formatoArquivo + "\n" +
                "Tamanho do Arquivo: " + tamanhoArquivo + " MB\n" +
                "Plataforma de Leitura: " + plataformaLeitura + "\n" +
                "Emprestado: " + (emprestado ? "Sim" : "Não");
    }
}
