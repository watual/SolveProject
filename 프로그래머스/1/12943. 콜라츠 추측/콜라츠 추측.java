class Solution {
    public int solution(int num) {
        int answer = 0;
        long tempNum = num;
        if(tempNum==1){
            answer = 0;
        }else{
            while(tempNum!=1){
                answer++;
                if(tempNum%2 == 0){
                    tempNum /= 2;
                }else{
                    tempNum = tempNum*3+1;
                }
                if(answer>500){
                    answer = -1;
                    break;
                }
            }
        }
        return answer;
    }
}