public class FifthTask {
    public static void main(String[] args) {
        int[] array = {12, 43, 12, -65, 778 ,123 ,32 ,76};

        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        System.out.println(maxValue);
    }
}
