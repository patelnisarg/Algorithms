public class numberOfStairs {
    public static int solution(int n ){
        if(n == 0){
            return 0;
        }
        return countStairs(0,n);
    }

    public static int countStairs(int i, int n){
        if (i > n) {
            return 0;
        }
        if (i == n){
            return 1;
        }
        else{
            return countStairs(i+1, n) + countStairs(i+2, n);
        }
    }

    public static void main(String[] args){
        int n = 5;
        System.out.print(solution(n));
    }
}
