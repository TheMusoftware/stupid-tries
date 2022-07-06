package Drivers;

public class drivers {
    private String name;
    private String license;
    private String pleasure;

    public drivers(String name, String license, String pleasure) {
        this.name = name;
        this.license = license;
        this.pleasure = pleasure;
    }
    public void show(){
        System.out.println(this.name+" "+this.license+" "+this.pleasure);
    }




}

