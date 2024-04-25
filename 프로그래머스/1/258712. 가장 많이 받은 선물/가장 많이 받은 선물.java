import java.util.Arrays;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        String[] friendsName = new String[2];
        int compare = 0;                                //1:1주고받기
        int[] presentCnt = new int[friends.length];    //주고받은 선물 index
        int[] presentTake = new int[friends.length];   //받을 선물 수
        //선물 지수 생성
        for (int i = 0; i < gifts.length; i++) {
            friendsName = gifts[i].split(" ");
            presentCnt[Arrays.asList(friends).indexOf(friendsName[0])]++;
            presentCnt[Arrays.asList(friends).indexOf(friendsName[1])]--;
        }

        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {

                compare = 0;
                for (int k = 0; k < gifts.length; k++) {
                    friendsName = gifts[k].split(" ");
                    if ( (friends[i].equals(friendsName[0]) || friends[i].equals(friendsName[1]))
                        && (friends[j].equals(friendsName[0]) || friends[j].equals(friendsName[1]))) {   //friends 내용물 확인
                        friendsName = gifts[k].split(" ");
                        if (friendsName[0].equals(friends[i])) {
                            compare++;
                        } else {
                            compare--;
                        }
                    }
                }

                if (compare > 0) {  //a가 b보다 선물 많이하면
                    presentTake[i]++;
//                    System.out.println(STR."\{friends[i]}\{presentCnt[i]}가 \{friends[j]}\{presentCnt[j]}에게 선물을 받습니다.    :\{friends[i]}=\{presentTake[i]}");
                } else if (compare < 0) {   //b가 a보다 선물 많이하면
                    presentTake[j]++;
//                    System.out.println(STR."\{friends[i]}\{presentCnt[i]}가 \{friends[j]}\{presentCnt[j]}에게 선물을 줬습니다.    :\{friends[j]}=\{presentTake[j]}");
                } else {    //a,b가 동점이거나 없으면
                    //friends[i]랑 friends[j] 중에 presentCnt 높은 사람이 받기
                    if (presentCnt[i] > presentCnt[j]) {
                        presentTake[i]++;
//                        System.out.println(STR."\{friends[i]}\{presentCnt[i]}가 \{friends[j]}\{presentCnt[j]}에게 선물을 받습니다.    :\{friends[i]}=\{presentTake[i]}");
                    } else if (presentCnt[i] < presentCnt[j]) {
                        presentTake[j]++;
//                        System.out.println(STR."\{friends[i]}\{presentCnt[i]}가 \{friends[j]}\{presentCnt[j]}에게 선물을 줬습니다.    :\{friends[j]}=\{presentTake[j]}");
                    } else {
//                        System.out.println(STR."\{friends[i]}\{presentCnt[i]}와 \{friends[j]}\{presentCnt[j]} 둘 다 선물을 못 받습니다.");
                    }
                }
            }
            if (answer < presentTake[i]) {
                answer = presentTake[i];
            }
        }
//        for (int i = 0; i < presentTake.length; i++) {
//            System.out.println(STR."선물index : \{presentCnt[i]} / 값 : \{presentTake[i]}");
//        }
//        System.out.println(answer);
        return answer;
    }
}