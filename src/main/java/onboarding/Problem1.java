package onboarding;

import java.util.List;

class Problem1 {
    private static List<Integer> page;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
<<<<<<< HEAD
        int answer = -1;
        //1.페이지 랜덤
        int pobiPage = (int)(Math.random()*397)+2;  //(random()*(최대-최소+1)) + 최소
        int crongPage = (int)(Math.random()*397)+2;

        if(pobiPage > crongPage) return 1;
        else if (pobiPage < crongPage) {
            return 2;
        } else if (pobiPage == crongPage) {
            return 0;
=======
        int answer = Integer.MAX_VALUE;

        try {
            if(Errorcheck(pobi) || Errorcheck(crong)){
                return -1;
            }
            //4. 가장 큰 수가 본인의 점수
            int pobimax = Math.max(Single(pobi), Double(pobi));
            int crongmax =Math.max(Single(crong), Double(crong));

            answer = Win(pobimax, crongmax);

        }catch (Exception e){
            return -1;
>>>>>>> a7aa7265139635d4f03aa3eabfe965bdf83a0947
        }

        return answer;
    }

<<<<<<< HEAD
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
=======
    //점수 비교 후 숫자 출력
    private static int Win(int pobi, int crong){
        if(pobi > crong) {
            return 1;
        }
        else if (pobi < crong) {
            return 2;
        } else {
            return 0;
        }
    }

    //4. 가장 큰 수가 본인의 점수
    /*private static int Biggest (int score){
        return Math.max(Single(score), Double(score));
    }*/

    //2. 왼쪽 페이지에서 더하거나 곱한 수 중 가장 큰 수 반환
    private static int Single(List<Integer> page){
        int result = 0;
        int bpage = page.get(0);
        result = Math.max(bpage%100 + (bpage%100)/10 + bpage%10, bpage%100 * (bpage%100)/10 * bpage%10);

        return result;
    }
    //3. 오른쪽 페이지에서 더하거나 곱한 수 중 가장 큰 수 반환
    private  static int Double(List<Integer> page){
        int result = 0;
        int bpage = page.get(1);
        result = Math.max(bpage%100 + (bpage%100)/10 + bpage%10, bpage%100 * (bpage%100)/10 * bpage%10);
        return result;
    }

    //오류 체크
    private static boolean Errorcheck(List<Integer> page){
        int leftpage = page.get(0);
        int rightpage = page.get(1);

        if (leftpage < 0 || rightpage > 400) {
            return true;
        }
        if (leftpage +1 != rightpage){
            return true;
        }
        return false;
    }
}
>>>>>>> a7aa7265139635d4f03aa3eabfe965bdf83a0947
