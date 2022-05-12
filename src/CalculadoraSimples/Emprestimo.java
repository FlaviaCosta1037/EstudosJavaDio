package CalculadoraSimples;

public class Emprestimo {
    private static double taxa;
    private double valor;

    public Emprestimo(double taxa, double valor) {
        this.taxa = taxa;
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public static void aVista(double valor){
        taxa = 5.0;
        valor -= ((valor / 100) * taxa) ;
        System.out.println("Pagamento À vista: R$ " + valor);
    }
    public static void duasParcelas(double valor){
        taxa = 5.0;
        valor += ((valor / 100) * taxa) ;
        System.out.println("Parcelado em duas vezes: " + valor);
    }
    public static void tresParcelas(double valor){
        taxa = 7.0;
        valor += ((valor / 100) * taxa) ;
        System.out.println("Parcelado em três vezes: " + valor);
    }
    public static void quatroParcelas(double valor){
        taxa = 8.0;
        valor += ((valor / 100) * taxa) ;
        System.out.println("Parcelado em 4 vezes: " + valor);
    }

    public static void obterValor(double valor){
        aVista(valor);
        duasParcelas(valor);
        tresParcelas(valor);
        quatroParcelas(valor);
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "valor=" + valor +
                '}';
    }
}
