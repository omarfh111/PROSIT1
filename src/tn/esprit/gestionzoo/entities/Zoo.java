package tn.esprit.gestionzoo.entities;

public class Zoo {
    Animal[] animals;   // tableau d’animaux
    String name;
    String city;
    int nbrCages; // constant : max 25
    int animalCount;

    // ---- Getters et Setters ----
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Erreur : le nom du zoo ne doit pas être vide !");
            this.name = "Inconnu";
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            System.out.println("Erreur : la ville ne doit pas être vide !");
            this.city = "Inconnue";
        } else {
            this.city = city;
        }
    }

    public int getNbrCages() {
        return nbrCages;
    }
    public void setNbrCages(int nbrCages) {
        if (nbrCages >25 ) {
            System.out.println("Erreur : le nombre des cage doit etre inferieur a 25 !");
        }else {
            this.nbrCages = nbrCages;
        }
    }

    public int getAnimalCount() {
        return animalCount;
    }

    // ---- Constructeur ----
    public Zoo(String name, String city, int nbrCages) {
        setName(name);
        setCity(city);

        if (nbrCages > 25 || nbrCages <= 0) {
            System.out.println("Erreur : un zoo ne peut contenir que 1 à 25 cages !");
            this.nbrCages = 25;
        } else {
            this.nbrCages = nbrCages;
        }

        this.animalCount = 0;
        this.animals = new Animal[this.nbrCages];
    }

    // ---- Afficher les infos du zoo ----
    public void displayZoo() {
        System.out.println("Nom du Zoo : " + name);
        System.out.println("Ville      : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
        System.out.println("Nombre d’animaux actuels : " + animalCount);
    }

    // ---- Afficher les animaux ----
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            for (int i = 0; i < animalCount; i++) {
                System.out.println((i+1) + ". " + animals[i].toString());
            }
        }
    }

    // ---- Ajouter un animal ----
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà !");
            return false;
        }
        if (isZooFull()) {
            System.out.println("Zoo plein !");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    // ---- Rechercher un animal ----
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    // ---- Supprimer un animal ----
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false; // non trouvé
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    // ---- Vérifier si zoo plein ----
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // ---- Comparer deux zoos ----
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount >= z2.animalCount) ? z1 : z2;
    }

    // ---- toString ----
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                '}';
    }
}
