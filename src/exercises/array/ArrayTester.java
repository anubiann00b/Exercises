package exercises.array;

import java.util.Arrays;
import java.util.Random;

/**
 * Tester for the Array exercise.
 * 
 * @author Shreyas
 */
public class ArrayTester {
    
    public final long seed;
    public Array array;
    public int[] arr;
    
    public ArrayTester(int arrLen, int maxNum) {
        seed = System.nanoTime();
        Random r = new Random(seed);
        
        arr = new int[arrLen];
        for (int i=0;i<arr.length;i++)
            arr[i] = r.nextInt(maxNum);
        
        array = new Array(arr);
    }
    
    public void runTests() {
        int expected;
        int actual;
        
        System.out.println("Testing array with seed " + seed + ".");
        System.out.println(array);
        
        expected = getSum(arr);
        actual = array.getSum();
        System.out.println("\nTESTING SUM");
        System.out.println(expected == actual ? "PASSED, " + expected + "." : "FAILED, EXPECTED " + expected + ", ACTUAL " + actual + ".");
        
        expected = getMean(arr);
        actual = array.getMean();
        System.out.println("\nTESTING MEAN");
        System.out.println(expected == actual ? "PASSED, " + expected + "." : "FAILED, EXPECTED " + expected + ", ACTUAL " + actual + ".");
        
        expected = getMax(arr);
        actual = array.getMax();
        System.out.println("\nTESTING MAX");
        System.out.println(expected == actual ? "PASSED, " + expected + "." : "FAILED, EXPECTED " + expected + ", ACTUAL " + actual + ".");
        
        int[] expectedArr = getSorted(arr);
        int[] actualArr = array.getSorted();
        System.out.println("\nTESTING SORTING");
        if (Arrays.equals(expectedArr, actualArr)) {
            System.out.println("PASSED\n" + Arrays.toString(actualArr));
        }
        System.out.println("FAILED");
        System.out.println("EXPECTED: " + Arrays.toString(expectedArr));
        System.out.println("ACTUAL: " + Arrays.toString(actualArr));
        
    }
    
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i=0;i<arr.length;i++)
            sum += arr[i];
        return sum;
    }
    
    public int getMean(int[] arr) {
        int sum = 0;
        for (int i=0;i<arr.length;i++)
            sum += arr[i];
        return sum/arr.length;
    }
    
    public int getMax(int[] arr) {
        int max = 0;
        for (int i=0;i<arr.length;i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public int[] getSorted(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}