package lab1;

public class Q1 {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        System.out.println(dashes(n));
        pattern2(n);
        System.out.println(dashes(n));
        pattern3(n);
        System.out.println(dashes(n));
        pattern4(n);
        System.out.println(dashes(n));
        pattern5(n);
    }

    public static void pattern1(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == (n/2) || j == (n/2)) {
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(' ');
            }

            for(int j = 0; j < n; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j == i || i+j==n-1) {
                    System.out.print('0' + " ");
                }
                else {
                    System.out.print(' ' + " ");
                }
            }
            System.out.println();
        }
    }

    public static String dashes(int n) {
        String dashes = "";
        for(int i = 0; i < n*5; i++) {
            dashes += "-";
        }
        return dashes;
    }
}


