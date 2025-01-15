class Solution {
    public int minimizeXor(int num1, int num2) {
        int x = 0;
        int bitCount2 = Integer.bitCount(num2);

        for (int i = 31; i >= 0 && bitCount2 > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                x |= (1 << i);
                bitCount2--;
            }
        }
        
        for (int i = 0; i < 32 && bitCount2 > 0; i++) {
            if ((x & (1 << i)) == 0) {
                x |= (1 << i);
                bitCount2--;
            }
        }

        return x;
    }
}