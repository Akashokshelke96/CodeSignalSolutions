package easy;

public class shapeArea {
    public static void main(String[] args) {
        ///Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
        //A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting
        // polygon and appending 1-interesting polygons to its rim, side by side.
        System.out.println(shapeArea(3));
    }
    static int shapeArea(int n) {
        int ans = 0;
        if(n==1){
            return 1;
        }
        else{
            ans = (int)(Math.pow(n, 2) + Math.pow(n-1, 2));
        }
        return ans;
    }
}
