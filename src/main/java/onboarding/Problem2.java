package onboarding;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";

        while(true){                                //중복 없을 때까지 반복
            answer = DuplicateCheck(cryptogram);    //단어 중복 한 번 제거후 저장

            if(answer.equals(cryptogram)){          //제거 전과 같으면 변화가 없을 것이므로 반환
                break;
            }
            cryptogram = answer;                    //다르면 저장후 똑같이 반복
        }
        
        return answer;
    }

    //중복 체크하는 구간
    private static String DuplicateCheck(String word){

        char[] cword = new char[word.length()];

        if(word.length() == 0){     //공백이 들어왔을 경우
            return "";
        }
        Deque<Character> stack = new ArrayDeque<>();    //Stack 만들기

        for(int i=1; i<=word.length();i++){  //중복 계산 구간
            cword[i] = word.charAt(i);

            if(cword[i] == cword[i-1]){
                stack.removeLast();
                stack.removeLast();
            } else {
                stack.addLast(cword[i]);
            }
        }

        String result = "";
        while (!stack.isEmpty()){
            result += stack.removeFirst();
        }
        return result;
    }


}
