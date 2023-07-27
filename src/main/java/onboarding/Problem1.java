package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        try {

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
    private static int Biggest (int score){
        return Math.max(Single(score), Double(score));
    }

    //2. 왼쪽 페이지에서 더하거나 곱한 수 중 가장 큰 수 반환
    private static int Single(int page){
        int result = 0;

        result = Math.max(page%100 + (page%100)/10 + page%10, page%100 * (page%100)/10 * page%10);

        return result;
    }
    //3. 오른쪽 페이지에서 더하거나 곱한 수 중 가장 큰 수 반환
    private  static int Double(int page){
        int result = 0;
        result = Math.max(page%100 + (page%100)/10 + page%10, page%100 * (page%100)/10 * page%10);
        return result;
    }
}
