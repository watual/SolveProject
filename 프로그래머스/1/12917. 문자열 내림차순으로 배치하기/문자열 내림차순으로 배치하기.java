class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        char[] arrAnswer = new char[s.length()];
        for(int i=0;i<s.length();i++){
            int cnt = 0;
            for(int j=0;j<s.length();j++){
                if(arr[i]<arr[j]){
                    cnt++;
                }
            }
            for(int j=i;j<s.length();j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            arrAnswer[cnt-1] = arr[i];
        }
        String answer = String.valueOf(arrAnswer);
        return answer;
    }
}