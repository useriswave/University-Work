package questions.q2;

public class MdaUtil {

    private MdaUtil () {}

    public static <T extends Number> double[] averageOf2D(T[][] arr) {
        double[] list = new double[arr.length];

        for (int i = 0; i < arr.length; ++i) {
            double sum = 0;

            for (int j = 0; j < arr[i].length; ++j) {
                sum += (double) arr[i][j];
            }

            list[i] = sum / arr[i].length;
        }

        return list;
    }
}
