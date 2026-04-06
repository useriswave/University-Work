package mockassessments.one;

public class Q2 {
    public static void main(String[] args) {
        String[] words = {"Cat", "Dog", "Cat", "Apple", "Cat"};
        String key = "Cat";
        System.out.println(countWord(words, key));
    }

    public static int countWord(String[] arr, String key) {
        int count = 0;
        for(String w : arr) {
            if(w.equals(key))
                count++;
        }
        return count;
    }
}
