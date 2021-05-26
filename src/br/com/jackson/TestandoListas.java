package br.com.jackson;

import java.util.ArrayList;
import java.util.Collections;


public class TestandoListas {

    /**
     * For dentro das ArraysList
     * Estudo Jackson
     */

    public static void main(String[] args) {

        String projeto1 = "Conhecendo mais de listas";
        String projeto2 = "Modelando a classe aula";
        String projeto3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> projetos = new ArrayList<>();
        projetos.add(projeto1);
        projetos.add(projeto2);
        projetos.add(projeto3);

        System.out.println(projetos);

        projetos.remove(0);

        System.out.println(projetos);

        for (String projeto: projetos) {
            System.out.println("Projeto: " + projeto);
        }


        projetos.forEach(projeto -> {
            System.out.println("percorrendo: ");
            System.out.println("percorrendo: " + projeto);
        });


        //ordenar.
        projetos.add("Aumentando o projeto");
        System.out.println(projetos);
        Collections.sort(projetos);
        System.out.println("Depois de Ordenado");
        System.out.println(projetos);
    }

}
