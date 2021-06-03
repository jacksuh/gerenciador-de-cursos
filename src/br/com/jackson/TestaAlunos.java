package br.com.jackson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A ordem da impressão saiu meio estranha. Os alunos não foram
 * impressos na ordem em que foram adicionados. E é essa a primeira
 * que podemos perceber quando estamos utilizando um conjunto, um set, não temos
 * garantia da ordem em que os elementos vão ficar dentro desse conjunto, desse "
 * saco de objetos". Um conjunto (diferente de uma lista, que representa uma sequência
 * de objetos) é uma "sacola",
 * e lá dentro está cheio de objetos, e você não sabe em que ordem eles estão.
 *
 * Vantagens do HashSet
 * A primeira vantagem é que ele não aceita elementos repetidos. Podemos testar isso adicionando
 * duas Strings iguais e depois imprimi-las.
 */

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

        List<String> alunoEmLista = new ArrayList<>(alunos);
    }
}
