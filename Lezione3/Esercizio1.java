import java.util.Scanner;
import java.util.Vector;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        String domanda = "Inserisci un numero n: ";
        System.out.println(domanda);
        int n = tastiera.nextInt();

        findFactors(n);
    }

    static class coppia {
        int primo;
        int secondo;

        public coppia(int primo, int secondo) {
            this.primo = primo;
            this.secondo = secondo;
        }
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static void sumOfSquares(int n,Vector<coppia> vp) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            // If i*i is square check if there
            // exists another integer such that
            // h is a perfect square and i*i + h = n
            int h = n - i * i, h1 = (int) Math.sqrt(h);

            // If h is perfect square
            if (h1 * h1 == h) {
                // Store in the sorted way
                int a = Math.max(h1, i),
                        b = Math.min(h1, i);

                // If there is already a pair
                // check if pairs are equal or not
                if (vp.size() == 1 &&
                        a != vp.get(0).primo)
                    vp.add(new coppia(a, b));

                // Insert the first pair
                if (vp.size() == 0)
                    vp.add(new coppia(a, b));

                // If two pairs are found
                if (vp.size() == 2)
                    return;
            }
        }
    }

    static void findFactors(int n) {
        // Get pairs where a^2 + b^2 = n
        Vector<coppia> vp = new Vector<>();
        sumOfSquares(n, vp);

        // Number cannot be represented
        // as sum of squares in two ways
        if (vp.size() != 2)
            System.out.print("Factors Not Possible");

        // Assign a, b, c, d
        int a, b, c, d;

        a = vp.get(0).primo;
        b = vp.get(0).secondo;

        c = vp.get(1).primo;
        d = vp.get(1).secondo;

        // Swap if a < c because
        // if a - c < 0,
        // GCD cant be computed.
        if (a < c) {
            int t = a;
            a = c;
            c = t;
            t = b;
            b = d;
            d = t;
        }

        // Compute the values of k, h, l, m
        // using the formula mentioned
        // in the approach
        int k, h, l, m;
        k = gcd(a - c, d - b);
        h = gcd(a + c, d + b);
        l = (a - c) / k;
        m = (d - b) / k;

        // Print the values of a, b, c, d
        // and k, l, m, h
        System.out.print("a = " + a +
                "\t\t(A) a - c = " +
                (a - c) +
                "\t\tk = gcd[A, C] = " +
                k + "\n");

        System.out.print("b = " + b +
                "\t\t(B) a + c = " +
                (a + c) +
                "\t\th = gcd[B, D] = " +
                h + "\n");

        System.out.print("c = " + c +
                "\t\t(C) d - b = " +
                (d - b) +
                "\t\tl = A/k = " +
                l + "\n");

        System.out.print("d = " + d +
                "\t\t(D) d + b = " +
                (d + b) +
                "\t\tm = c/k = " +
                m + "\n");

        // Printing the factors
        if (k % 2 == 0 && h % 2 == 0) {
            k = k / 2;
            h = h / 2;
            System.out.print("Factors are: " +
                    ((k) * (k) + (h) * (h)) +
                    " " + (l * l + m * m) + "\n");
        } else {
            l = l / 2;
            m = m / 2;
            System.out.print("Factors are: " +
                    ((l) * (l) + (m) * (m)) +
                    " " + (k * k + h * h) + "\n");
        }
    }

}