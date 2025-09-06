public class InterfacesEx {
    
  public static void main(String[] args) {
    Animal dog = new Dog();
    dog.makeSound(); // Outputs: Bark
    Animal cat = new Cat();
    cat.makeSound(); // Outputs: Meow
  }

}
interface Animal {
  void makeSound();
}

class Dog implements Animal {
  @Override
  public void makeSound() {
    System.out.println("Bark");
  }
}

class Cat implements Animal {
  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}

