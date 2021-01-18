package main.exercice2;

public class Plombier extends Personne {

    public Plombier(String name) {
        super(name);
    }

    @Override
    public String Print() {
        return super.Print() + " Je suis plombier.";
    }
}