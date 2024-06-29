public class LivroEletronico extends Livro {
    private String formatoArquivo;
    private double tamanhoArquivo;
    private String plataformaLeitura;

    public LivroEletronico(String titulo, String autor, String isbn, String editora, Integer anoPublicacao, String genero,
                           String formatoArquivo, double tamanhoArquivo, String plataformaLeitura) {
        super(titulo, autor, isbn, editora, anoPublicacao, genero);
        this.formatoArquivo = formatoArquivo;
        this.tamanhoArquivo = tamanhoArquivo;
        this.plataformaLeitura = plataformaLeitura;
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
    public String toString() {
        return super.toString() + "\n" +
                "Formato do Arquivo: " + formatoArquivo + "\n" +
                "Tamanho do Arquivo: " + tamanhoArquivo + " MB\n" +
                "Plataforma de Leitura: " + plataformaLeitura;
    }
}
