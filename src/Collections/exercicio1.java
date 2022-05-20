package Collections;

import java.util.*;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int[] temperaturas = new int[6];
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Informe a temperatura: ");
            int valor = in.nextInt();
            temperaturas[i] = valor;
        }
        List<Integer> listaTemperaturas = new ArrayList();
        listaTemperaturas.add(temperaturas[0]);
        listaTemperaturas.add(temperaturas[1]);
        listaTemperaturas.add(temperaturas[2]);
        listaTemperaturas.add(temperaturas[3]);
        listaTemperaturas.add(temperaturas[4]);
        listaTemperaturas.add(temperaturas[5]);

        for (int temperatura:listaTemperaturas) {
            System.out.println(temperatura);
        }

        Iterator<Integer> iterator = listaTemperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Integer next = iterator.next();
            soma += next;
        }
        System.out.println("Temperatura Média: " + soma/ listaTemperaturas.size() + " Graus");

        //Falta implementar os meses
    }
}
