//hierarchial inheritance
class teacher{
    void specialisation() {
        System.out.println("MATHS & STATISTICS");
    }
}
class student1 extends teacher {
    void maths() {
        System.out.println("to learn maths");
    }
}
class student2 extends teacher {
    void statistics() {
        System.out.println("to learn statistics");
    }
}
public class inherit3 {
    public static void main(String[] args) {
        student2 s2=new student2();
        s2.specialisation();
        s2.statistics();
        student1 s1=new student1();
        s1.maths();
        s1.specialisation();
    }
}
