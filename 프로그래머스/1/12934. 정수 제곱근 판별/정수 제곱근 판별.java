class Solution {
    public long solution(long n) {
        long nSqrt = (long)Math.sqrt(n);
        long answer = 0;
        if(n == (nSqrt * nSqrt)){
            answer = (long)Math.pow(Math.sqrt(n)+1,2);
        }else{
            answer = -1;
        }
        return answer;
    }
}