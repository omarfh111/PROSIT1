package tn.esprit.gestionzoo.entities;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age); // contrôle via setter
        this.isMammal = isMammal;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Erreur : l'âge ne peut pas être négatif !");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
