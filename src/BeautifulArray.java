import java.util.Scanner;

public class BeautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int s = sc.nextInt();
            long q = sc.nextLong(); // Change to long to accommodate large values

            long[] a = new long[n]; // Change to long to accommodate large values
            a[0] = (long)x * s; // Ensure multiplication is done as long to avoid overflow
            q -= (long)x * s; // Ensure multiplication is done as long to avoid overflow

            if (q < 0) {
                System.out.println("-1");
            } else {
                for (int i = 0; i < n; i++) {
                    long now = Math.min(x - 1, q);
                    a[i] += now;
                    q -= now;
                }
                if (q > 0) {
                    System.out.println("-1");
                } else {
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
