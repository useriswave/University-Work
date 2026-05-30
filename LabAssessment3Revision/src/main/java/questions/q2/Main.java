package questions.q2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File csv = new File("src/main/java/questions/q2/lol.csv");
        CsvUtil.imGoingToCrashOut(csv);
    }
}
