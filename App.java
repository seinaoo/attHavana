package main;

import modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Dono> donos = new ArrayList<>();

        System.out.println("Cadastro de Donos e Animais:");

        // Cadastro de donos e seus animais
        for (int i = 0; i < 2; i++) { // Exemplo com 2 donos
            System.out.println("Cadastro do Dono " + (i + 1) + ":");
            System.out.print("Nome do Dono: ");
            String nomeDono = scanner.nextLine();
            System.out.print("Telefone do Dono: ");
            String telefoneDono = scanner.nextLine();
            Dono dono = new Dono(nomeDono, telefoneDono);

            // Cadastro de 3 animais para cada dono
            for (int j = 0; j < 3; j++) {
                System.out.println("Cadastro do Animal " + (j + 1) + " para " + nomeDono + ":");
                System.out.print("Tipo de Animal (1-Cachorro, 2-Gato, 3-Pássaro): ");
                int tipoAnimal = scanner.nextInt();
                scanner.nextLine(); // Consumir quebra de linha
                System.out.print("Nome: ");
                String nomeAnimal = scanner.nextLine();
                System.out.print("Idade: ");
                int idadeAnimal = scanner.nextInt();
                scanner.nextLine(); // Consumir quebra de linha

                Animal animal;
                if (tipoAnimal == 1) {
                    animal = new Cachorro(nomeAnimal, idadeAnimal);
                } else if (tipoAnimal == 2) {
                    animal = new Gato(nomeAnimal, idadeAnimal);
                } else {
                    animal = new Passaro(nomeAnimal, idadeAnimal);
                }

                dono.adicionarAnimal(animal);
            }

            donos.add(dono);
        }

        // Exibir informações dos donos e seus animais
        System.out.println("\nInformações Cadastradas:");
        for (Dono dono : donos) {
            System.out.println("Dono: " + dono.getNome() + ", Telefone: " + dono.getTelefone());
            dono.listarAnimais();
            System.out.println("----------------------------");
        }

        scanner.close();
    }
}
