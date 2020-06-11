package DynamicProgramming;

import java.util.Arrays;

//https://leetcode.com/problems/counting-bits/discuss/79539/Three-Line-Java-Solution
public class CountingBits {

    public static int[] countBits(int num) {
        int[] bits = new int[num + 1];
        for(int i = 1; i <= num; i++){
            bits[i] = bits[i/2];
            if(i%2 == 1) bits[i]++;
        }
        return bits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(7)));
    }
}
