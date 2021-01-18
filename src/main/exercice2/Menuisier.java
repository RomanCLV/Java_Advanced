package main.exercice2;

public class Menuisier extends Personne {

    public Menuisier(String name) {
        super(name);
    }

    @Override
    public String Print() {
        return super.Print() + " Je suis menuisier.";
    }
}
