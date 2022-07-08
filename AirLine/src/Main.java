import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        countries countries = new countries();
        ages ages = new ages();
        //Start
        System.out.println("Choose your current location ");
        System.out.println("1- United States America"+
                        "\n2- United Kingdom"+
                        "\n3- Turkey"+
                        "\n4- Germany"+
                        "\n5- Italy "+
                        "\n6-Belgium"
                );
            byte current= scan.nextByte();

        System.out.println("Choose where you want to go ");
        System.out.println("1- United States America"+
                "\n2- United Kingdom"+
                "\n3- Turkey"+
                "\n4- Germany"+
                "\n5- Italy "+
                "\n6-Belgium"
        );
        byte want= scan.nextByte();

        countries.infokm(current,want);
        countries.calculate();
        //Age Discount
        System.out.println("What's your age: "+
                "\n1- 0~17"+
                "\n2- 18~25"+
                "\n3- 25 and older");
        int age=scan.nextInt();
        countries.agediss(age);
        //Come and Back discount
        System.out.println("Your ticket are :"+
                "\n1-One-way ticket"+
                "\n2-Round trip ticket"
        );
        int ticket = scan.nextInt();
        countries.comeback(ticket);
    }

}