package me.PauMAVA.MatrixCipher.util;

public class NumericTools {

    public static class CircularRange {

        private int minBound;
        private int maxBound;

        public CircularRange(int minBound, int maxBound) {
            this.minBound = minBound;
            this.maxBound = maxBound;
        }

        public int add(int num1, int num2) {
            if (num1 < minBound || num1 > maxBound) {
                return num1;
            }
            for (int i = 0; i < Math.abs(num2); i++) {
                num1 = num2 < 0 ? num1 - 1 : num1 + 1;
                if (num1 < minBound) {
                    num1 = maxBound;
                } else if (num1 > maxBound) {
                    num1 = minBound;
                }
            }
            return num1;
        }
    }


}
