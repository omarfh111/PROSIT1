import java.util.Scanner;
class ZooManagment {
    public static void main(String[] args) {
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

        Animal lion=new Animal("omar","lion",2,true);
        Zoo Belvidaire=new Zoo("esprit","ariana",3);
        Belvidaire.animals[0]=lion;
        Belvidaire.displayZoo();
        System.out.println(Belvidaire);
        System.out.println(lion);
    }
}
 