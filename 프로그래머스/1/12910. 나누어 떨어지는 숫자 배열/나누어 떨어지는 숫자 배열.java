import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        answer = Arrays.stream(arr).sorted().filter(value -> {
                    return value%divisor==0;
                }).boxed().mapToInt(i->i).toArray();
        if(answer.length == 0){
            answer = new int[]{-1};
        }
        return answer;
    }
}