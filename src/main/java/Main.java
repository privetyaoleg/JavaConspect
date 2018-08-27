public class Main {

    public static void main(String[] args) {


        isNum(40);


    }

    public static boolean isNum(int num) {

        int x = num;

        for (int i = 0; i < 32; i++) {

            System.out.println(Integer.toBinaryString(num));

            if (num == 3) {
                return false;
            } else if (num == 1) {
                return true;
            } else {
                num = num >>> 1;
            }
        }
        return false;
    }
}