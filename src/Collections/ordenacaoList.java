package Collections;

/*Dadas as seguintes informações sobre os meus gatos, crie uma lista
e ordene esta lista exibindo (nome - idade - cor)
Ex:
    Gato 1 = nome: bartô, Idade: 4, cor: preto
    Gato 2 = nome: sirilo, Idade: 3, cor: marrom
    Gato 3 = nome: mimi, Idade: 3, cor: branco
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ordenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Mimi",4,"preto"));
            add(new Gato("Sirilo",3,"marrom"));
            add(new Gato("Mimi",3,"amarelo"));

        }};
        System.out.println(meusGatos);

        System.out.println("Ordem de inserção\n ");
        System.out.println(meusGatos);

        //Usar a Classe Collections e usar o método shuffle
        System.out.println("Ordem aleatória\n ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural\n");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem por idade\n");
        Collections.sort(meusGatos, new ComparatorIdade());//Pode usar tanto esse
        meusGatos.sort(new ComparatorIdade()); //Quanto esse
        System.out.println(meusGatos);

        System.out.println("Ordem por cor\n");
        Collections.sort(meusGatos, new ComparatorCor());//Pode usar tanto esse
        System.out.println(meusGatos);

        System.out.println("Ordem por nome/cor/idade\n");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());//Pode usar tanto esse
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {

        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}
class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}
class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}
class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

