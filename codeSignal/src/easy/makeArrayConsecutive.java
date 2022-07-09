package easy;

public class makeArrayConsecutive {
    public static void main(String[] args) {
        ///Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an
        // non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to
        // largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional
        // statues to be able to accomplish that.
        int[] statues = {6, 2, 3, 8};
        System.out.println(solution(statues));
    }

    static int solution(int[] statues) {
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < statues.length ; i++ ){
            if(statues[i] > max){
                max = statues[i];
            }
            if(statues[i] < min){
                min = statues[i];
            }
        }
        count = max - min;
        return ((count - statues.length) + 1);
    }
}
