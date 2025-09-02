public class ClassEx{
    static class Car {
     String manufacturer; //Attribute - property
     String model; //Attribute
     int year;//Attribute 

     //Constructor - To Initialize the Object 
     public Car(String manufacturer, String model, int year){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
     }

     public void startEngine(){ //Methods - behaviour 
        System.out.println("The " + year + " " + manufacturer +" " + model +" Engine has started");
     }
     public void displayInfo(){  //Methods - behaviour 
        System.out.println("Car Info "+ manufacturer +" "+model+ " "+year);
     }
    
     }
    public static void main(String[] args) {
        //Create Object 
        Car car1 = new Car("Toyota", "Carolla", 2021); //Object 
        Car car2 = new Car("Honda", "Civic", 2022); //Object
        car1.startEngine();
        car2.startEngine();

        car1.displayInfo();
        car2.displayInfo();

    }
}
