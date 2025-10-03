package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals = new Animal[25];
    private String name;
    private String city;
    private final int nbrCages;
    private int animalCount;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Erreur : le nom du zoo ne doit pas être vide !");
        } else {
            this.name = name;
        }
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public Zoo(String name,String city,int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = 25;
        this.animalCount = 0;
        animals = new Animal[nbrCages];
    }
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
        } else {
            for (int i = 0; i < animalCount; i++) {
                System.out.println((i+1) + ". " + animals[i].name +
                        " (" + animals[i].family + ", âge: " + animals[i].age +
                        ", mammifère: " + animals[i].isMammal + ")");
            }
        }
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false; // non trouvé
        }

        // Décaler les éléments du tableau
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    public void displayZoo() {
        System.out.println("Nom du Zoo : " + name);
        System.out.println("Ville      : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }
    public boolean addAnimal(Animal animal){
        if (searchAnimal(animal) != -1) {
            System.out.println("cet animal existe deja !");
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
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
    }
    @Override
    public String toString() {
        return "Zoo{" +
                //"animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}

