import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long[] arr = new long[(int)Math.log10(n*10)];
        for (int i = 0; n>0 ; i++) {
            arr[i] = n%10;
            n /= 10;
        }
        Arrays.sort(arr);
        for (int i = arr.length; i > 0; i--) {
            answer *= 10;
            answer += arr[i-1];
        }
        
        return answer;
    }
}