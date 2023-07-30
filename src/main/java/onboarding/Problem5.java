package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();

        int[] m = new int[]{50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        for(int i=0; i<m.length; i++){

            int charge = Caculate(money, m[i]);
            answer.add(charge);
            money -= charge * m[i];

        }
        return answer;
    }

    private static int Caculate(int money, int i){
        return money/i;
    }
}
