package throwinginsidecatch;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println(divide(30, 0));
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int n1, int n2) {
        try {
            return n1/n2;
        } catch(ArithmeticException e) {
            throw new RuntimeException("ERROR: Cannot divide by zero.");
        }
    }
}