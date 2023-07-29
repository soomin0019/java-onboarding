package onboarding;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static String solution(String word) {
        Map<Character, Character> m = Dectionary();     //청개구리 사전 불러오기
        String answer = "";
        answer = Translate(m, word);                    //있는 메소드 가져와서 대입
        return answer;
    }

    //청개구리 사전
    private static Map<Character, Character> Dectionary(){
        HashMap<Character,Character>dec = new HashMap<>();

        for(int i=0; i<'Z'-'A'; i++){
            dec.put((char)('A'+i), (char)('Z'-i));      //(번호, 짜피 넣은 거 반대로 나가니까 z부터 거꾸로)
            dec.put((char)('a'+i), (char)('z'-i));      //소문자 고려
        }
        return dec;
    }

    //사전 번역
    private static String Translate (Map<Character, Character> d, String word){
        /*char[] w = toCharArray();        //이건 왜 안될까 -> 반환형이 달라서 그런가 */
        char[] w = tocharArray(word);       //단어를 배열로
        StringBuilder s = new StringBuilder();  //배열을 다시 단어로 바꿔줌

        for(int i=0; i<word.length();i++){      
            char a = w[i];                  
            if(a ==' ') {               //빈칸 고려 만들어지는 단어에도 빈칸 있도록
                s.append(" ");
            }else {
                s.append(d.get(a));     //받아서 계속 이어붙이기
            }
        }
        return s.toString();        //단어로 다시 만들어주는 함수, 단어로 나오기 때문에 String으로 받았던 것
    }

    private static char[] tocharArray (String word){
        return word.toCharArray();
    }
}
