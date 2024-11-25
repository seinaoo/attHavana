package main;

import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();

        // Criar 3 instâncias de cada classe
        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro do Cachorro " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nomeCachorro = scanner.nextLine();
            System.out.print("Idade: ");
            int idadeCachorro = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha
            animais.add(new Cachorro(nomeCachorro, idadeCachorro));

            System.out.println("Cadastro do Gato " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nomeGato = scanner.nextLine();
            System.out.print("Idade: ");
            int idadeGato = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha
            animais.add(new Gato(nomeGato, idadeGato));

            System.out.println("Cadastro do Pássaro " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nomePassaro = scanner.nextLine();
            System.out.print("Idade: ");
            int idadePassaro = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha
            animais.add(new Passaro(nomePassaro, idadePassaro));
        }

        // Exibir informações dos animais cadastrados
        System.out.println("\nInformações dos Animais Cadastrados:");
        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            animal.emitirSom();
            System.out.println("----------------------------");
        }

        scanner.close();
    }
}
