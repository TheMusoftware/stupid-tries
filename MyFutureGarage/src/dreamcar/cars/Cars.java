package dreamcar.cars;

public class Cars {
    private String Brand;
    private  String Model;
    private int year;
    private String color;
    private String price;



    public Cars(String brand,String model,int year,String color,String price){
        this.Brand=brand;
        this.Model=model;
        this.year=year;
        this.color=color;
        this.price=price;

    }
    //Overloading
    public  Cars(){

    }
    public Cars(String brand){
        this.Brand=brand;
        this.Model="Any Model";
        this.color="Any color";
        this.price="Any price";



    }



    public  void showinfo(){
        System.out.println(this.Brand);
        System.out.println(this.Model);
        System.out.println(this.year);
        System.out.println(this.color);
        System.out.println(price);
    }


    //Getter and setter


    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

