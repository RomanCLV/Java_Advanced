package main.exercice2;

public class Main {
    public static void main(String[] argv) {
        Personne[] persons = new Personne[3];
        persons[0] = new Menuisier("Paul");
        persons[1] = new Plombier("Jean");
        persons[2] = new Menuisier("Adrien");
        for (Personne person : persons) {
            System.out.println(person.Print());
        }
    }
}
