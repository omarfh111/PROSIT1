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
        Animal lion=new Animal("omar","lion",2,true);
        Zoo Belvidaire=new Zoo("esprit","ariana",3);
        Animal tiger = new Animal("aze", "Tigre", 4, true);
        Animal elephant = new Animal("bbb", "Éléphant", 10, true);
        Belvidaire.addAnimal(lion);
        Belvidaire.addAnimal(tiger);
        Belvidaire.addAnimal(elephant);
        Belvidaire.displayZoo();
        Belvidaire.displayAnimals();
        System.out.println("Index de tigre : " + Belvidaire.searchAnimal(tiger));
        System.out.println("Index de lion : " + Belvidaire.searchAnimal(lion));
        System.out.println("Suppression du tigre : " + Belvidaire.removeAnimal(tiger));
        Belvidaire.displayAnimals();
        Zoo zoo2 = new Zoo("Zoo", "Tunis", 25);
        zoo2.addAnimal(new Animal("zzzx", "Chien", 3, true));

        Zoo sup = Zoo.comparerZoo(Belvidaire, zoo2);
        System.out.println("Zoo avec le plus d’animaux : " + sup);
        //System.out.println(Belvidaire);
        //System.out.println(lion);
    }
}
 