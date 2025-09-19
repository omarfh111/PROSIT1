import java.util.Arrays;

public class Zoo {
    public Animal[] animals=new Animal[25];
    String name;
    String city;
    int nbrCages;
    public Zoo(String name,String city,int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        animals = new Animal[nbrCages];
    }
    public void displayZoo() {
        System.out.println("Nom du Zoo : " + name);
        System.out.println("Ville      : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
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

