class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxX = 0;
        int maxY = 0;
        for (int[] sizesX : sizes) {
            if (sizesX[0] > sizesX[1]){
                if(maxX<sizesX[0]){
                    maxX = sizesX[0];
                }
                if(maxY<sizesX[1]){
                    maxY = sizesX[1];
                }
            } else {
                if(maxX<sizesX[1]){
                    maxX = sizesX[1];
                }
                if(maxY<sizesX[0]){
                    maxY = sizesX[0];
                }
            }
        }
        answer = maxX * maxY;
        
        return answer;
    }
}