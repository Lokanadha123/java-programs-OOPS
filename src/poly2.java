//hierarchial inheritance
//overriding polymorphism
//parent class
class india{
    void country() {
        System.out.println("india is my country");
    }
}
//child 1
class AP {
    void country() {
        System.out.println("AP is in india");
    }
}
//child2
class TN{
    void country() {
        System.out.println("TN is in india");
    }
}
public class poly2 {
    public static void main(String[] args) {
        TN state1=new TN();
        state1.country();
        AP state2=new AP();
        state2.country();
    }
}
