package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        answer = Count(number);

        return answer;
    }

    //3,6,9 숫자 세기
    private static int Count(int number){
        int cnt = 0;

        for(int i=1; i<=number; i++){
            int c = i;
            while(c!=0){
                int r = c%10;
                if(r == 3 || r ==6 || r == 9){
                    cnt++;
                }
                c = c/10;
            }
            /*int n = i%10;      //일의 자리 숫자
            if(n==3|| n==6|| n==9){
                cnt++;
            }

            if(i>=10){           //십의 자리 숫자
                int k = i/10;
                if(k==3 || k==6 || k==9){
                    cnt++;
                }
            }*/


        }
        return cnt;
    }

}
