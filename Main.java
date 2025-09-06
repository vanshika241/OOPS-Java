import AccessModifiers.PublicEx;

public class Main {
    public static void main(String[] args) {
        PublicEx.Base obj = new PublicEx.Base(30);
        System.out.println(obj.age);
        obj.display();
    }
}
