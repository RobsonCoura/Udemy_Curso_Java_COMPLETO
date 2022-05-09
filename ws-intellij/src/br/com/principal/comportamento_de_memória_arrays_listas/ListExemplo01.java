package br.com.principal.comportamento_de_memória_arrays_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExemplo01 {
    public static void main(String[] args) {

        //Criando a lista
        List<String> list = new ArrayList<>();

        //Add itens na lista
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //Add elemento na posição 2 na lista
        list.add(2, "Marco");

        //Tamanho da lista
        System.out.println(list.size());

        //Laço de repetição dos itens da lista
        for (String x : list)
        {
            System.out.println(x);
        }

        //Remover itens na lista ou na posição
        list.remove(2);

        //Remover todo mundo que comece com a letra M
        // definindo uma função lambida se chama predicado vai retornar true ou false
        list.removeIf( x -> x.charAt(0) == 'M');

        System.out.println("-----------------------");
        //Encontrar a posição de um elemento
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        //Quando o Index não encontra o elemento ele retorna -1
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("-------------------------");

        //Devolver uma nova lista filtrando todos nomes começando com a letra 'A'
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result)
        {
            System.out.println(x);
        }
        System.out.println("-------------------------");
        //Encontrar o primeiro elemento que comece com a letra 'A'
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
