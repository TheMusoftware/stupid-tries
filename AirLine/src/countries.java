public class countries {
    private int totalkm;
    public double cost;
    public double firstcost;
    protected double secondcost;

    public double getCost() {
        return cost;
    }

    public int getTotalkm() {
        return totalkm;
    }

    public void infokm(int a, int b){
        int USA=0;
        int UK=6826;
        int TR=8616;
        int DE=7882;
        int IT=8614;
        int BG=7549;
                // Current
        if(a==1) a=USA;
        if(a==2) a=UK;
        if(a==3) a=TR;
        if(a==4) a=DE;
        if(a==5) a=IT;
        if(a==6) a=BG;
               //Goal
        if(b==1) b=USA;
        if(b==2) b=UK;
        if(b==3) b=TR;
        if(b==4) b=DE;
        if(b==5) b=IT;
        if(b==6) b=BG;

       totalkm=a-b;
        //System.out.println(Math.abs(totalkm));

    }
    public void calculate(){
        double perkm=0.27;
       cost=perkm*getTotalkm();
      // System.out.println("Flight ticket cost "+Math.abs(cost)+"$");



    }
    public void agediss(double age) {
        double child = 0.6;
        double young = 0.9;
        double elder = 1;

        if (age == 1) age = child;
        if (age == 2) age = young;
        if (age == 3) age = elder;
        cost = age * cost;

        //.out.println((int) Math.abs(cost));


    }

    public void comeback(double a ){
        if(a==1) a=1;
        if (a==2) a=0.9;
        cost=cost*a;
        System.out.println("Your ticket price is "+(int)Math.abs(cost)+"$"+
                "\n"+
                "\nThanks for choosing us");

    }
}
