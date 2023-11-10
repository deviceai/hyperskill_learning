package mynumbers;

public class MyLiterals {
    public static void main(String[] args) {

        /**
         * // Since Java 6, it is also possible to use the hexadecimal form of floating-point literals.
         * It starts with the 0x prefix as well, but the exponential part is always required,
         * which starts with p (or P) instead of e . p implies that a power of 2 is used instead of a power of 10.
         * You are not very likely to use such a form, but just in case see how tricky it may look:
         */

        double hexDouble = 0xf.8p3;  // 15.5 x 2^3 = 124.0 Here 'f' is part of number f.8
        System.out.println(hexDouble);

        float hexFloat = 0x5.0p0f; // 5.0 in hexadecimal form. Here 'f' indicates float
        System.out.println(hexFloat);

        double num= 234.56_1;
        System.out.println();
    }
}
