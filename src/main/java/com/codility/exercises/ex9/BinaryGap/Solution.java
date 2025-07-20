package com.codility.exercises.ex9.BinaryGap;

class Solution {
    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        
        int maxGap = 0;
        int currentGap = 0;
        boolean foundFirstOne = false;
        
        for (char bit : binary.toCharArray()) {
            if (bit == '1') {
                if (foundFirstOne) {
                    maxGap = Math.max(maxGap, currentGap);
                }
                foundFirstOne = true;
                currentGap = 0;
            } else if (foundFirstOne) {
                currentGap++;
            }
        }
        
        return maxGap;
    }
}