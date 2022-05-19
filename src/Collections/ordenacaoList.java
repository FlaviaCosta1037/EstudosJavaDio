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
import java.util.List;

public class ordenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Bartô",4,"preto"));
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
