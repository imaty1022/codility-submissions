package com.codility.exercises.ex9.BinaryGap;

public class MainTest {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        assert sol.solution(1041) == 5 : "Test failed for 1041";
        assert sol.solution(32) == 0 : "Test failed for 32";
        assert sol.solution(9) == 2 : "Test failed for 9";
        assert sol.solution(529) == 4 : "Test failed for 529";
        assert sol.solution(20) == 1 : "Test failed for 20";
        assert sol.solution(15) == 0 : "Test failed for 15";
        
        System.out.println("All tests passed!");
    }
}