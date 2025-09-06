// File: AccessModifiers/DefaultExample.java
package AccessModifiers;

class Parent {         // default class
    int age;           // default variable
    
    Parent(int age){   // default constructor
        this.age = age;
    }
    
    void display(){    // default method
        System.out.println("Age is " + age);
    }
}

public class DefaultEx {
    public static void main(String[] args) {
        Parent p = new Parent(25);
        System.out.println(p.age);  
        p.display();               
    }
}
