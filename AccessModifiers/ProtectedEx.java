package AccessModifiers;

public class ProtectedEx {
    
}

class Parent {
    protected int rollno;
    public Parent(int rollno){
        this.rollno = rollno;
    }
    public void display(){
        System.out.println("Student Roll No is"+this.rollno);
    }
}