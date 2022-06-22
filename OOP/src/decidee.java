import java.util.Scanner;

public class decidee {
   public static void main(String[] args) {
       info inf1 =new info();
       String yes ="yes";

       Scanner scan =new Scanner(System.in);
       int esoldier;
       esoldier=187;

       if(inf1.getDecide().equals(yes)){
           System.out.println("How many pilot invite for war?");
           int soldier= scan.nextInt();
           inf1.setSoldier1(soldier);
           if (esoldier> inf1.getSoldier1()){
               System.out.println("Switzerland has a lot of pilot, we need some pilots."+"\nHow many pilot invite for support");
               int supsoldier= scan.nextInt();
               inf1.setSoldier2(supsoldier);

               if ((inf1.getSoldier1()+ inf1.getSoldier2())>esoldier){
                   System.out.println("We won the war!! Thanks Captain "+inf1.getName());
               }
               else{
                   System.out.println("We lost the war!! Get the fuck out "+inf1.getName());

               }
           }
           else{
               System.out.println("We won the war!! Thanks Captain "+inf1.getName());

           }


       }
        else{
           System.out.println("You're a coward "+inf1.getName());

       }
    }
}
