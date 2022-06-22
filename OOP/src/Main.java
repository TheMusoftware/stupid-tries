import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        //Diğer classı dahil etme
        info inf0 = new info();
        decidee dec0= new decidee();

        //Scene
        System.out.println("Hey stop!"+"\nWhat's your name?");
        String name= scan.nextLine();
        inf0.setName(name);
        System.out.println("Ahh Sorry! Captain "+inf0.getName());
        System.out.println("Suddenly,a strike was started by Swiss planes."+"\nWill our planes strike them");
        String decide= scan.nextLine();
        inf0.setDecide(decide);
        //
        String yes="yes";
        int esoldier;
        esoldier=187;

        if(inf0.getDecide().equals(yes)){
            System.out.println("How many pilot invite for war?");
            int soldier= scan.nextInt();
            inf0.setSoldier1(soldier);
            if (esoldier> inf0.getSoldier1()){
                System.out.println("Switzerland has a lot of pilot, we need some pilots."+"\nHow many pilot invite for support");
                int supsoldier= scan.nextInt();
                inf0.setSoldier2(supsoldier);

                if ((inf0.getSoldier1()+ inf0.getSoldier2())>esoldier){
                    System.out.println("We won the war!! Thanks Captain "+inf0.getName());
                }
                else{
                    System.out.println("We lost the war!! Get the fuck out "+inf0.getName());

                }
            }
            else{
                System.out.println("We won the war!! Thanks Captain "+inf0.getName());

            }


        }
        else{
            System.out.println("You're a coward "+inf0.getName());

        }

    }
}