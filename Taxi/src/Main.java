import  Drivers.drivers;
import  Maps.maps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Drivers
        drivers driver1 =new drivers("Sinan Kaya","34 TYC26","%87");
        drivers driver2 =new drivers("Osman Şentürk","34 TYC 26","%79");
        drivers driver3 =new drivers("Seyit Şenses","34 TYC 34","%92");
        drivers driver4 =new drivers("Melahat AK","34 TYC 24","%95");
        Scanner scan =new Scanner(System.in);
        maps maps =new maps();

        //Body
        maps.towns();
        //Select driver
        System.out.println("Select driver");
        driver1.show();
        driver2.show();
        driver3.show();
        driver4.show();
        int cdrv = scan.nextInt();
        switch (cdrv){
            case 1 :
                System.out.println("Sinan Kaya has been going the road");
                break;
            case 2 :
                System.out.println("Osman Şentürk has been going the road");
                break;
            case 3:
                System.out.println("Seyit Şenses has been going the road");
                break;
            case 4:
                System.out.println("Melahat AK has been going the road");
                break;
        }
        maps.calculate();
    }
}