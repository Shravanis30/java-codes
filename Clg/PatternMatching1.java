public class PatternMatching1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("1");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("2");
                }
            }
            System.out.println();
        }
    }
}
