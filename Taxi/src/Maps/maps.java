package Maps;

import java.util.Scanner;

public class maps {
    int location=0;
    int destination=0;

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    Scanner scan = new Scanner(System.in);

public void towns(){
    System.out.println();
    System.out.println("Loading towns...");
    System.out.println();
    System.out.println("Select your location ");
    System.out.println();
    System.out.println("1- Beşiktaş"+
            "\n2- Bebek"+
            "\n3- Bayrampaşa"+
            "\n4- Ataşehir"+
            "\n5- Maltepe"+
            "\n6- Büyükçekmece"+
            "\n7- Küçükcekmece");
    int i = scan.nextInt();
    setLocation(i);


    System.out.println();
    System.out.println("Select your destination");
    System.out.println();
    System.out.println("1- Beşiktaş"+
            "\n2- Bebek"+
            "\n3- Bayrampaşa"+
            "\n4- Ataşehir"+
            "\n5- Maltepe"+
            "\n6- Büyükçekmece"+
            "\n7- Küçükcekmece");
    int a= scan.nextInt();
    setDestination(a);
    System.out.println();
    String _1 ="Beşiktaş";
    String _2="Bebek";
    String _3="Bayrampaşa";
    String _4="Ataşehir";
    String _5="Maltepe";
    String _6="Büyükçekmece";
    String _7="Küçükcekmece";


}
public void calculate(){
    double diesel =27.80;
    int randomNum = 1 + (int) (Math.random() * 50);
    System.out.println("Total cost: "+diesel*randomNum/5);



}
}
