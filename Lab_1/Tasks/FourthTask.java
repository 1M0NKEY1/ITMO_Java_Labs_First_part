public class FourthTask {
    public static void main(String[] args) {
        long begin = new java.util.Date().getTime();

        long i = 0;
        while (i < 100000000) {
            i++;
        }

        long end = new java.util.Date().getTime();

//        Answer 2 if i - int
//        Answer 47 if i - long
        System.out.println(end - begin);
    }
}
