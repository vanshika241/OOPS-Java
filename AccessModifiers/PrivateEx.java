package AccessModifiers;

public class PrivateEx {
    

    public static void main(String[] args) {
        Parent p = new Parent();
       // System.out.println(p.work); gives error 
        p.set("Eat");
        p.display();
        
    }
}

 class Parent{
        private String work;

        public void display(){
            System.out.println(work);
        }
        public void set(String work){
              this.work = work;
        }
    }
