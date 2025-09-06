public class Ques1 {


    //Question - Which constructor called first - Parent , child - > Parent 
    //Constructor not inherited we have to use super keyword to access that
   public static class Parent {
       String name;
        public Parent(String name ){
          this.name = name;
          System.out.println("Parent constructor called, name = " + name);

        }
        
    }

    static class Child extends Parent{
       String sonName;
       int age ;
       
        public Child(String name , int age){
            super("Virendra");
          this.sonName = name;
          this.age = age;
          System.out.println("Child constructor called, sonName = " + sonName + ", age = " + age);

        }
    }
    public static void main(String[] args) {
        Parent father = new Parent("Virendra");
        Child son = new Child("Shivam", 22);


    }
}
