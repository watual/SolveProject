import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        answer = countCombinations(number, 3);
        
        return answer;
    }
    
    public static int countCombinations(int[] array, int numToChoose) {
        AtomicInteger resultCount = new AtomicInteger(0);
        countCombinations(array, numToChoose, 0, new ArrayList<>(), resultCount);
        return resultCount.get();
    }
    public static void countCombinations(int[] array, int numToChoose, int startIndex, List<Integer> currentCombination, AtomicInteger resultCount) {
        if (currentCombination.size() == numToChoose) {
            int sum = 0;
            for (Integer element : currentCombination) {
                sum += element;
            }
            if(sum == 0){
                resultCount.incrementAndGet();
            }
            return;
        }

        for (int i = startIndex; i < array.length; i++) {
            currentCombination.add(array[i]);
            countCombinations(array, numToChoose, i + 1, currentCombination, resultCount);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}