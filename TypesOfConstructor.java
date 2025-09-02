public class TypesOfConstructor {
    static class Car {
     String manufacturer; //Attribute - property
     String model; //Attribute
     int year;//Attribute 
     

    //Constructor - To Initialize the Object 

     // 1.Default Constructor  - Invisible not see 
    //  public Car(){
    //     this.manufacturer = null;
    //     this.model = null;
    //     this.year = 0;
    //  }

    //2.Explicit Default Constructor
    public Car(){
        this.manufacturer = "Toyota";
        this.model = "Carolla";
        this.year = 2021;
    }

    //3. Parametrized Constructor
     public Car(String manufacturer, String model, int year){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
     }

     //4.Copy Constructor
     public Car(Car other){
        this.manufacturer = other.manufacturer;
        this.model = other.model;
        this.year = other.year;
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
        Car car1 = new Car(); //Default
        car1.displayInfo();
        Car car2 = new Car("Honda","Civic",2021); //Parametrized
        car2.displayInfo();
        Car car3 = car2;  // Just point reference - no new object created - Shallow Copy
        car3.displayInfo();
        Car car4 = new Car(car2); //Copy - Deep Copy - Copy everything
        car4.displayInfo();


    }
}

    


