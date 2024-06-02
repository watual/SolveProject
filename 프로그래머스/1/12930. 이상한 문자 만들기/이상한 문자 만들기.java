class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        String[] strings = s.split(" ",-1);
        for (String string : strings) {
            char[] chars = string.toCharArray();
            for (int i1 = 0; i1 < string.length(); i1++) {
                if (i1 % 2 == 0) {
                    chars[i1] = Character.toUpperCase(chars[i1]);
                }
            }
            answer = answer.concat(new String(chars));
            if (answer.length() < s.length()) {
                answer = answer.concat(" ");
            }
        }
        
        return answer;
    }
}