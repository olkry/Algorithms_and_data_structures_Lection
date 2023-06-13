public class Task003 {

    public static void main(String[] args) {
        double chans = findSum(6);
        System.out.println(chans+"%");
    }

    public static double findSum(int sum) {
        int count = 0;
        int successResult = 0;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                for (int k = 1; k < 6; k++) {
                    if (i + j + k == sum) {
                        successResult++;
                    }
                    count++;
                }
            }
        }
        System.out.println(count);
        return ((double) successResult / ((double) count));
    }
}
