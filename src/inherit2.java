//multilevel inheritance
class twowheeler {
    void latest() {
        System.out.println("latest bike");
    }
}
 class bikes extends twowheeler {
    void milage() {
        System.out.println("exclusive bikes");
    }
}
class pulsar extends bikes {
    void pickup() {
        System.out.println("pulsar pickup");
    }
}
public class inherit2 {
    public static void main(String[] args) {
        pulsar bike2=new pulsar();
        bike2.pickup();
        bike2.latest();
        bike2.milage();
    }
}

