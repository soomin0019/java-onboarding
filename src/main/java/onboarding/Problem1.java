package onboarding;

import java.util.List;

class Problem1 {
    private static List<Integer> page;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
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
        }

        return answer;
    }

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
