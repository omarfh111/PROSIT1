package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import java.util.Scanner;
class ZooManagment {
    //public static void main(String[] args) {
        /*int nbrCage = 20;
        String zooName = "my zoo";
        System.out.println(zooName+" comporte "+nbrCage+" cage");*/
        /*Scanner myObj = new Scanner(System.in);
        int nbrCage;
        String zooName;
        do {
            System.out.println("Enter nombre Cages: ");
            nbrCage = myObj.nextInt();
            myObj.nextLine();
            System.out.println("Enter nom de Zoo: ");
            zooName = myObj.nextLine();
            if (nbrCage <= 0) {
                System.out.println("Error: entrer un nombre positif");
            }
            if (zooName.isEmpty()) {
                System.out.println("Error: entrer un nom complet");
            }

        }while(nbrCage<0 || zooName.isEmpty());
        System.out.println(zooName + " comporte " + nbrCage + " cages");*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo("", "", 0);

        // --- Saisie du Zoo (les setters vérifient déjà les valeurs) ---
        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();
        zoo.setName(zooName);

        System.out.print("Entrez la ville du zoo : ");
        String zooCity = scanner.nextLine();
        zoo.setCity(zooCity);

        System.out.print("Entrez le nombre de cages (max 25) : ");
        if (scanner.hasNextInt()) {
            int nbCages = scanner.nextInt();
            zoo.setNbrCages(nbCages);
        } else {
            System.out.println("Entrée invalide, valeur par défaut maximal 25 appliquée !");
            scanner.next();
            zoo.setNbrCages(25);
        }

        // --- Menu principal ---
        int choix;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ajouter un animal");
            System.out.println("2. Afficher les animaux");
            System.out.println("3. Afficher le zoo");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // vider buffer

            switch (choix) {
                case 1:
                    // Création d’un animal avec setters
                    Animal animal = new Animal("", "", 0, false);

                    System.out.print("Entrez la famille de l’animal : ");
                    animal.setFamily(scanner.nextLine());

                    System.out.print("Entrez le nom de l’animal : ");
                    animal.setName(scanner.nextLine());

                    System.out.print("Entrez l’âge de l’animal : ");
                    if (scanner.hasNextInt()) {
                        animal.setAge(scanner.nextInt());
                    } else {
                        System.out.println("Entrée invalide, âge = 0");
                        scanner.next();
                        animal.setAge(0);
                    }

                    System.out.print("Est-ce un mammifère ? (true/false) : ");
                    if (scanner.hasNextBoolean()) {
                        animal.setMammal(scanner.nextBoolean());
                    } else {
                        System.out.println("Entrée invalide, valeur par défaut false");
                        scanner.next();
                        animal.setMammal(false);
                    }

                    zoo.addAnimal(animal);
                    System.out.println("Animal ajouté avec succès !");
                    break;

                case 2:
                    zoo.displayAnimals();
                    break;

                case 3:
                    zoo.displayZoo();
                    break;

                case 0:
                    System.out.println("Fermeture du programme...");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 0);

        scanner.close();
    }

}
 