class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int index = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[index]){
                index = i;
            }
        }
        int check = 0;
        for(int i=0;i<arr.length;i++){
            if(index == i){
                check = 1;
                continue;
            }
            answer[i-check] = arr[i];
        }
        if(answer.length == 0){
            answer = new int[]{-1};
        }
        return answer;
    }
}