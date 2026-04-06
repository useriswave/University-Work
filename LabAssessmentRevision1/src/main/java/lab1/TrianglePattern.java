package lab1;

public class TrianglePattern {
    public static void main(String[] args) {
        int n = 5;

        String spaces = "";
        triangle(n, spaces);

    }
    public static void triangle(int n, String spaces) {
        String effectSpace = " ";
        if(!spaces.isEmpty()) {
            for(int i = 0; i < spaces.length(); i++) {
                effectSpace += " ";
            }
        }
        for(int i = 0; i <n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(' ' + spaces);
            }
            for(int j = 0; j <= i; j++) {
                System.out.print(i + spaces + effectSpace);
            }
            System.out.println();
        }
    }
}
