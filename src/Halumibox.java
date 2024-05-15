import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Halumibox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a-- > 0) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            List<Integer> d = new ArrayList<>();
            for (int i = 0; i < b; i++) {
                d.add(sc.nextInt());
            }
            int flag = 0;
            for (int i = 1; i < d.size(); i++) {
                if (d.get(i) < d.get(i - 1)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0 || c >= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
