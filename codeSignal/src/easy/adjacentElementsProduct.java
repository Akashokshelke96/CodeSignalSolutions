package easy;

public class adjacentElementsProduct {
    public static void main(String[] args) {
        ///Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

        int[] arr = {1,2,3,4,5,67};
        System.out.println(findMaxAdjacentProduct(arr));
    }
    static int findMaxAdjacentProduct(int[] inputArray) {

        int prod = 0;
        int max = Integer.MIN_VALUE;
        int a = 0;
        int b = 0;
        for(int i = 0 ; i < inputArray.length-1;i++){
            prod = inputArray[i] * inputArray[i+1];
            if(prod >= max){
                max = prod;
            }
        }

        return max;
    }
}
