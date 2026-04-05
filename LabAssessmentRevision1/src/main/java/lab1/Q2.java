package lab1;

public class Q2 {
    public static void main(String[] args) {
        String[] arr = {"Alan", "Larry", "Greg", "Harry"};
        String key = "Darryl";

        System.out.println(findMyString(arr, key));

    }

    public static int findMyString(String[] arr, String key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}
