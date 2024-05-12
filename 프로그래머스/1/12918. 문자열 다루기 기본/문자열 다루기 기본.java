import java.util.regex.Pattern;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(Pattern.matches("^[\\d]*$",s) && ((s.length()==6)||(s.length()==4))){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}