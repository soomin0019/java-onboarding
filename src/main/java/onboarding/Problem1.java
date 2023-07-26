package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = -1;
        //1.페이지 랜덤
        int pobiPage = (int)(Math.random()*397)+2;  //(random()*(최대-최소+1)) + 최소
        int crongPage = (int)(Math.random()*397)+2;

        if(pobiPage > crongPage) return 1;
        else if (pobiPage < crongPage) {
            return 2;
        } else if (pobiPage == crongPage) {
            return 0;
        }

        return answer;
    }

    //1.각 자리 숫자를 더해 큰 수 구하기
    private static int Sum(int page){
        int result = 0;
        int page2 = 0;
        if(page%2==1){     //홀수일 경우 옆의 +1쪽과 비교
            page2 = page+1;
            result= Math.max(page/100 + (page/100)%10 + page%10, page2/100 + (page2/100)%10 + page2%10);
        }
        if(page%2==0){    //짝수일 경우 옆의 -1쪽과 비교
            page2= page-1;
            result= Math.max(page/100 + (page/100)%10 + page%10, page2/100 + (page2/100)%10 + page2%10);
        }
        return result;
    }
    //3.각 자리 숫자를 곱해 큰 수 구하기
    private  static int Mul(int page){
        int result = 0;
        int page2 = 0;
        if(page%2==1){
            page2 = page+1;
            result= Math.max(page/100 * (page/100)%10 * page%10, page2/100 * (page2/100)%10 * page2%10);
        }
        if(page%2==0){
            page2= page-1;
            result= Math.max(page/100 * (page/100)%10 * page%10, page2/100 * (page2/100)%10 * page2%10);
        }
        return result;
    }
    //4. 2,3번에서 큰 수 가져와 비교해서 큰수 각각 가지기
    /*private  static int Biggest(int spage,int mpage) {
        return Math.max(Sum(), Mul());
    }*/


}