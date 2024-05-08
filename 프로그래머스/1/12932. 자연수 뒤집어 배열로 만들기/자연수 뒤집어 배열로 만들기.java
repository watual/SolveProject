class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        for(int i=0;n>0;i++){
            answer[i] = Long.valueOf(n % 10).intValue();
            n /= 10;
        }
        return answer;
    }
}