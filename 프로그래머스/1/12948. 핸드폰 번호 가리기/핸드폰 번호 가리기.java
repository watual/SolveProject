class Solution {
    public String solution(String phone_number) {
        String answer = phone_number.replaceAll("[0-9]","*").substring(0,phone_number.length()-4)+phone_number.substring(phone_number.length()-4);
        return answer;
    }
}