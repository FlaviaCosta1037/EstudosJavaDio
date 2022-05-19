package Collections;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(10.0);
        notas.add(6.0);
        notas.add(5.0);
        notas.add(4.0);
        notas.add(0.0);

        //Imprimir (DUAS FORMAS)
        System.out.println(notas); //Forma 1
        System.out.println(notas.toString()); //Forma 2

        //Exiba a posição da nota 5 (Método indexOf)
        System.out.println(notas.indexOf(5d)); //Resultado 4.0

        //Adicione a lista da nota 8 na posição 4
        notas.add(4,8d);
        System.out.println(notas);

        //Substitua a nota 5 pela nota 7
        notas.set(notas.indexOf(5d),7d);
        System.out.println(notas);

        //Confira se a nota 5.0 está na lista (Método contains)
        System.out.println(notas.contains(5d));

        //Exiba todas as notas na ordem que foram informadas
        //Somente imprimir a lista

        for (Double nota : notas) {
            System.out.println(nota);
        }

        //Exiba a terceira nota adicionada (Método Get)
        System.out.println(notas.get(2));

        //Exiba a menor nota (Método nativo) Collecions.min(notas)
        System.out.println(Collections.min(notas));

        //Exiba a maior nota (Método nativo) Collecions.max(notas)
        System.out.println(Collections.max(notas));

        //Exiba a soma dos valores (Metodo Iterator)
        Iterator<Double> iterator = notas.iterator(); //Var iterator do tipo Double dentro do metodo iterator
        Double soma = 0d; //Variável soma criada para armazenamento
        while (iterator.hasNext()){ //Enquanto houver proximo elemento, somar com o anterior e armazenar na variável soma abaixo;
            Double next = iterator.next(); //
            soma += next;
        }
        System.out.println(soma);

        //Exiba a media dos elementos (Método size)
        System.out.println(soma/notas.size());

        //Remova a nota zero (Método remove)
        notas.remove(0d); //tem que colocar o d após o zero, caso contrário remove o indice 0
        System.out.println(notas);

        //Remova as notas menores que 7.0 e exiba a lista

        Iterator<Double> iterator1= notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
            System.out.println(notas);

            //Apague todaa lista

            notas.clear();
            System.out.println(notas);

            //Confira se a lista está vazia
            System.out.println(notas.isEmpty());
        }
    }
}
