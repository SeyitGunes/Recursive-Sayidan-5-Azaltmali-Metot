

import java.util.Scanner;

public class Main {

    static int cikarekle(int x, int tempX, boolean stop) {
        System.out.println(x);
        if (x < 0 || x == 0 || !stop) {
            stop = false;
            if (x != tempX) {
                return cikarekle(x + 5, tempX, stop);
            } else
                return 0;
        } else {
            return cikarekle(x - 5, tempX, stop);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, tempX;
        System.out.print("Bir Sayı Giriniz: ");
        x = inp.nextInt();
        cikarekle(x, tempX = x, true);
    }
}