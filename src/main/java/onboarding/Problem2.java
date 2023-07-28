package onboarding;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "";

        while(true){
            answer = DuplicateCheck(cryptogram);

            if(answer.equals(cryptogram)){
                break;
            }
            cryptogram = answer;
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
