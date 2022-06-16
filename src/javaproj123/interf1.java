package javaproj123;
interface cricket{
    void play();
}
interface movie{
    void watch();
}
class hobbies implements cricket,movie{
    public void play(){
        System.out.println("premium match" );
    }

    @Override
    public void watch() {
        System.out.println("premium movie");
    }
}

public class interf1 {
    public static void main(String[] args) {
        hobbies h1=new hobbies();
        h1.play();
        h1.watch();
    }
}
