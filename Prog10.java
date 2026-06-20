import java.util.*;

public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i +1 < n && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(s.charAt(i)).append(count);
        }
        
        System.out.print(result);
        sc.close();
    }
}
