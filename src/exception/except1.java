package exception;

public class except1 {
    public static void main(String[] args) {
        try{
            int divide=5/0;
            System.out.println("division");
        }
        catch( ArithmeticException e)
        {
            System.out.println("error occured");
        }
        finally{
            System.out.println("executed ");
        }
    }
}
