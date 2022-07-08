import java.util.Scanner;

public class ages extends countries {
    Scanner scan = new Scanner(System.in);
    public double child=0.6;
    public double young=0.9;
    public double elder=1;

    public double getScost() {
        return scost;
    }

    public void setScost(double scost) {
        this.scost = scost;
    }

    protected double scost;



    public void agedis(double age){
        double child=0.6;
        double young=0.9;
        double elder=1;

        if(age==1) age=child;
        if(age==2) age=young;
        if(age==3) age=elder;
        scost=age*cost;
        System.out.println(age+" "+getCost()+"" +scost+" "+firstcost);
    calculate();

    }

}
