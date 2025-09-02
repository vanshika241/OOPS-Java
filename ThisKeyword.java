public class ThisKeyword {
    static class Car {
     String manufacturer; //Attribute - property
     String model; //Attribute
     int year;//Attribute 

      public Car(String manufacturer){ //Constructor Chaining 
        this(manufacturer, null, 0);
      }


     public Car(String manufacturer, String model, int year){
        this.manufacturer = manufacturer; // Helps to Remove ambiguits this.name - refer to class variables == name ( our initialize values)
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
