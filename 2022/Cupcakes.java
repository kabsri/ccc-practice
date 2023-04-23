import java.util.Scanner;

public class Cupcakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int s = sc.nextInt();
        int cupcakes = 8*r + 3*s;
        System.out.println(cupcakes - 28);
        sc.close();
    }
}
