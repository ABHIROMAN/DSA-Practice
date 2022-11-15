package GFG30days.Day8;

public class maxmNumberOf1Row {

    public static int maxOnes(int Mat[][], int N, int M) {

        int r = 0;
        int max = 0;

        for(int i = 0; i<Mat.length; i++) {

            int count = BinarySearch(Mat, i);

            if(count > max) {

                max = count;
                r = i;
            }
        }
        return r;
    }

    public static int BinarySearch(int Mat[][], int r) {

        int ri = Mat[0].length - 1;
        int l = 0;
        int fill = Mat[0].length;

        while(l <= ri) {

            int mid = (l + ri)/2;

            if(Mat[r][mid] == 1) {

                fill = mid;
                ri = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        int count = Mat[0].length - fill;
        return count;
    }
    
}
