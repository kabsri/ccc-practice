import java.util.Scanner;

public class Fergusonball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int starPlayers = 0;
        for (int i=0; i<n; i++) {
            int points = sc.nextInt();
            int fouls = sc.nextInt();
            int stars = 5*points - 3*fouls;
            if (stars > 40) {
                starPlayers++;
            }
        }
        sc.close();
        System.out.print(starPlayers);
        if (starPlayers == n) {
            System.out.print("+");
        }
        System.out.print("\n");
    }
}
