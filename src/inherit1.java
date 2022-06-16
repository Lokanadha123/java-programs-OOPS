//single inherit
class bike {
    void speed() {
        System.out.println("latest bike");
    }
}
    class honda extends bike {
        void milage() {
            System.out.println("honda speed");
        }
    }

    public class inherit1 {
        public static void main(String[] args) {
            honda bike2=new honda();
            bike2.milage();
            bike2.speed();

        }
    }
