public class interval {
    public static void main(String[] args){
        int[][] intervals = {
                {0,30},
                {35,10},
                {45,10}
        };
        int interval = findInterval(intervals, 60);
        System.out.println(interval);
    }

    private static int findInterval(int[][] intervals, int duration){
        if(intervals.length == 0) {
            return 0;
        }

        int currStartTime = 0;
        int prevEndTime;

        for(int i = 0; i < intervals.length; i++){
            currStartTime = intervals[i][0];
            if(i+1 < intervals.length) {
                prevEndTime = intervals[i + 1][0] + intervals[i + 1][1];
                int diff = currStartTime - prevEndTime;
                if(diff >= duration) {
                    return prevEndTime;
                }
            }
        }

        return currStartTime > (12*60)? -1 : (currStartTime + intervals[intervals.length-1][1]);
    }
}
