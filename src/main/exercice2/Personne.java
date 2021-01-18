package main.exercice2;

public class Personne {

    private final String name;

    public Personne(String name) {
        this.name = name;
    }

    public String Print() {
        return "Je suis " + name + ".";
    }
}
