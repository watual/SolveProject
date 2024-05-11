class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int harshadNum = 0;
        int i = x;
        while(i>0) {
            harshadNum += i%10;
            i/=10;
        }
        if(x%harshadNum == 0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}