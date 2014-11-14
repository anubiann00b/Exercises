package exercises.array;

import java.util.Arrays;

/**
 * Your code for the Array exercises.
 * 
 * @author 
 */
public class Array {
    
    public static void main(String[] args) {
        ArrayTester tester = new ArrayTester(10, 10);
        tester.runTests();
    }
    
    private final int[] arr;
    
    public Array(int[] arr) {
        this.arr = arr;
    }
    
    public int getSum() {
        return 0;
    }
    
    public int getMean() {
        return 0;
    }
    
    public int getMax() {
        return 0;
    }
    
    public int[] getSorted() {
        return new int[0];
    }
    
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
