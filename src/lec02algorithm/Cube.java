package lec02algorithm;

public class Cube {
    public static void main(String[] args) {
        int n = 100005;
        long start = System.currentTimeMillis();
        solve(n);
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

    }

    static void solve(int n) {//O(n^3)
        for (int p = 1; p <= n; p++) {
            for (int q = p + 1; q <= n; q++) {
                int s = 0;
                for (int k = p; k <= q; k++) {
                    s += k;
                }
                if (s == n) {
                    System.out.println(String.format("%d %d", p, q));
                }
            }
        }
    }
}
