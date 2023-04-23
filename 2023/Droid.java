import java.util.Scanner;

public class Droid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int score = 50*p - 10*c;
        if (p > c) {
            score += 500;
        }
        System.out.println(score);
    }
}
