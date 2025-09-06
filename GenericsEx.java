// Generic class
class Box<T> {      // T is type parameter
    private T content;

    public void set(T content){
        this.content = content;
    }

    public T get(){
        return content;
    }
}

public class GenericsEx {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());
    }
}
//make it type safe 