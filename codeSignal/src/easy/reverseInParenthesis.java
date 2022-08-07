public class adjacentElementsProduct {
    public static void main(String[] args) {
        ///Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

        int[] arr = {1,2,3,4,5,67};
        System.out.println(solution("aabbc(aababa)");
    }


String solution(String inputString) {
    StringBuilder str = new StringBuilder(inputString);
    int start, end;
    while(str.indexOf("(") != -1){
        start = str.lastIndexOf("(");
        end = str.indexOf(")", start);
        str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
    }
    return str.toString();
}
