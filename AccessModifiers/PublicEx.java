package AccessModifiers;

public class PublicEx {

      public static  class Base {
    
         public int age;
         
        public Base(int age){
            this.age = age;
        }
        public void display(){
            System.out.println("Age is "+  this.age);
        }
    }

    static class Child extends Base {
       String name;
       public Child(int age , String name){
        super(age);
        this.name = name;
       }
        
    }

    public static void main(String[] args) {
        Base p = new Base(20);
        System.out.println(p.age);
        p.display();
        Child c = new Child(3, "Baby");
        System.out.println(c.age);
    }
}



