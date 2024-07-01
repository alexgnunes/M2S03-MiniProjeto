public interface Emprestimo {
    void emprestar();
    void devolver();
    boolean verificarStatusEmprestimo();
    double calcularMulta(int diasAtraso);
}