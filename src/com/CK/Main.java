package com.CK;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    List<Integer> shuffleNums;
    int[] originalNums;

    public Solution(int[] nums) {
        shuffleNums = new ArrayList<>();
        for (int num : nums) {
            shuffleNums.add(num);
        }
        originalNums = nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return originalNums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Collections.shuffle(shuffleNums);
        int[] res = new int[shuffleNums.size()];
        for(int i = 0 ; i < shuffleNums.size(); i++){
            res[i] = shuffleNums.get(i);
        }
        return res;
    }
}

class Solution {
    private int[] array;
    private int[] original;

    Random rand = new Random();

    private int randRange(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private void swapAt(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public Solution(int[] nums) {
        array = nums;
        original = nums.clone();
    }

    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }

    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swapAt(i, randRange(i, array.length));
        }
        return array;
    }
}