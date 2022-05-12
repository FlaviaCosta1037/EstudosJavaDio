import CalculadoraSimples.Calculadora;
import CalculadoraSimples.Emprestimo;
import Utils.Horario;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class aplicacao {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Aplicação Bom dia, Boa tarde, Boa noite
        Horario.qualHorario();

        //Calculadora
        /*double n[] = new double[2]; //Criado um vetor para receber 2 valores
        for(int i = 0; i < n.length; i++){ //Laço for para percorrer o vetor e armazenar os valores
            System.out.println("Informe um número: ");
            n[i] = in.nextDouble();
        }
        //Chamada dos métodos e impressão dos resultados.
        System.out.println("Resultado da soma: " + Calculadora.somar(n[0],n[1]));
        System.out.println("Resultado da subtração: " + Calculadora.subtrair(n[0],n[1]));
        System.out.println("Resultado da multiplicação: " + Calculadora.multiplicar(n[0],n[1]));
        System.out.println("Resultado da divisão: " + Calculadora.dividir(n[0],n[1]));*/

        //Empréstimo

        System.out.println("Informe o valor solicitado: ");
        double valorEmprestimo = in.nextDouble();
        Emprestimo.aVista(valorEmprestimo);
        Emprestimo.duasParcelas(valorEmprestimo);
        Emprestimo.tresParcelas(valorEmprestimo);
        Emprestimo.quatroParcelas(valorEmprestimo);

    }
}
