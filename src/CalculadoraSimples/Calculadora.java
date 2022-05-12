package CalculadoraSimples;

public class Calculadora {
    private double soma;
    private double subtacao;
    private double multiplicacao;
    private double divisao;

    public Calculadora(double soma, double subtacao, double multiplicacao, double divisao) {
        this.soma = soma;
        this.subtacao = subtacao;
        this.multiplicacao = multiplicacao;
        this.divisao = divisao;
    }

    public double getSoma() {
        return this.soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public double getSubtacao() {
        return this.subtacao;
    }

    public void setSubtacao(double subtacao) {
        this.subtacao = subtacao;
    }

    public double getMultiplicacao() {
        return this.multiplicacao;
    }

    public void setMultiplicacao(double multiplicacao) {
        this.multiplicacao = multiplicacao;
    }

    public double getDivisao() {
        return this.divisao;
    }

    public void setDivisao(double divisao) {
        this.divisao = divisao;
    }
    public static double somar(double n1, double n2){
        return n1 + n2;
    }
    public static double subtrair(double n1, double n2){
        return n1 - n2;
    }
    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }
    public static double dividir(double n1, double n2){
        return n1 / n2;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "soma=" + soma +
                ", subtacao=" + subtacao +
                ", multiplicacao=" + multiplicacao +
                ", divisao=" + divisao +
                '}';
    }
}
