package easy;

public class almostIncreasingSequence {
    public static void main(String[] args) {
        ///Given a sequence of integers as an array, determine whether it is possible to obtain a strictly
        // increasing sequence by removing no more than one element from the array
        int[] arr = {1,2,3,6,7,8};
        System.out.println(solution(arr));
    }
    static boolean solution(int[] sequence) {
        int count = 0;
        for(int i =0 ; i < sequence.length-1 ; i++){
            if(sequence[i]  - sequence[i+1] >= 0){
                count++;
            }
            if(i-1 >= 0
                    && i+2 <= sequence.length - 1
                    && sequence[i] - sequence[i+2] >= 0
                    && sequence[i-1] - sequence[i+1] >= 0){

                return false;
            }
        }return count<=1;
    }

}
