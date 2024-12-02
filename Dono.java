package modelo;

import java.util.ArrayList;

public class Dono {
    private String nome;
    private String telefone;
    private ArrayList<Animal> animais;

    public Dono(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.animais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void listarAnimais() {
        System.out.println("Animais de " + nome + ":");
        for (Animal animal : animais) {
            System.out.println("- Nome: " + animal.getNome() + ", Idade: " + animal.getIdade());
        }
    }
}
