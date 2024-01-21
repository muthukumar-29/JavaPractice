import java.util.*;

class SumOfdigit {

    public static int sumDigit(int num) {
        int sum = 0, r;
        while (num > 0) {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Number:");
        int num = s.nextInt();
        int tot = 0, tot1 = 0, tot2 = 0;
        if (num > 10) {
            tot = sumDigit(num);
            System.out.print("sum:" + tot + "\n");
        }
        if (tot > 10) {
            tot1 = sumDigit(tot);
            System.out.println(tot1);
        }
        if (tot1 > 10) {
            tot2 = sumDigit(tot1);
            System.out.println(tot2);
        }
    }
}