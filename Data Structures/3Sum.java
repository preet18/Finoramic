import java.lang.Math;
public class Solution {
    public int threeSumClosest(int[] A, int B) {
        int minDiff = Integer.MAX_VALUE;
        int sum = 0;
        int n = A.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                   
                    int diff = Math.abs(A[i]+A[j]+A[k]-B);
                    if(diff<minDiff){
                        minDiff = diff;
                        sum = A[i]+A[j]+A[k];
                    }
                }
            }
        }
        return sum;
    }
}
