package tn.esprit.gestionzoo.entities;

public class Animal {
     String family;
     String name;
     int age;
     boolean isMammal;

    // Constructeur
    public Animal(String family, String name, int age, boolean isMammal) {
        setFamily(family);
        setName(name);
        setAge(age); // contrôle via setter
        setMammal(isMammal);
    }

    // Getter et Setter pour family
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        if (family == null || family.isEmpty()) {
            System.out.println("Erreur : la famille ne doit pas être vide !");
            this.family = "Inconnue";
        } else {
            this.family = family;
        }
    }

    // Getter et Setter pour name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Erreur : le nom de l’animal ne doit pas être vide !");
            this.name = "Inconnu";
        } else {
            this.name = name;
        }
    }

    // Getter et Setter pour age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Erreur : l'âge ne peut pas être négatif !");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Getter et Setter pour isMammal
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    // Pour un affichage plus lisible
    @Override
    public String toString() {
        return name + " (" + family + ", âge: " + age + ", mammifère: " + isMammal + ")";
    }
}
