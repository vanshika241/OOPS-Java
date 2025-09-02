public class PolyMorphism {

   static  class Data {
    
        int data1;
        int data2;
        int data3 ;

        //Compile Time polymorphism 
        //Method overloading - no need to see actual object
        public Data(int data1, int data2 , int data3){
            this.data1 = data1;
            this.data2 = data2;
            this.data3 = data3;
        }
        public void getData(int data1){
            System.out.println("The data is "+data1);
        }

        public void getData(int data1, int data2){
            System.out.println("The data is "+data1 + " "+ data2);
        }

        public void getData(int data1, int data2 , int data3){
           System.out.println("The data is "+data1 + " "+ data2+ " "+ data3);
        }


    }

     static class Parent {
        String name;
        public Parent(String name){
            this.name = name;
        }
        public void graduation(String education){
          System.out.println("Graduation is "+education);
        }
        
    }

    static class Child extends Parent {
       public Child(String name){
        super(name);
        this.name = name;
       }
       @Override
       public void graduation(String education){
          System.out.println("Graduation is "+education);
        }
        
    }
    public static void main(String[] args) {
       Data d = new Data(0, 0, 0);
        d.getData(10);
        d.getData(10,20);
        d.getData(10,20,20);

        Parent father = new Parent("Virendra");
        father.graduation("BSc");
        System.out.println(father.name);
        Child son = new Child("Shivam");
        System.out.println(son.name);
       son.graduation("B-Pharm");
    }
}
