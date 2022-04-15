public class interval {
    public static void main(String[] args){
        int[][] intervals = {
                {0,30},
                {35,10},
                {45,10}
        };
        int interval = findInterval(intervals, 60);
        System.out.println(interval);


        int[][] intervals1 = {
                {0,30},
        };
        int interval1 = findInterval(intervals1, 60);
        System.out.println(interval1);


        int[][] intervals2 = {
                {0,30},
        };
        int interval2 = findInterval(intervals2, 0);
        System.out.println(interval2);

        int[][] intervals3 = {
                {0,30},
        };
        int interval3 = findInterval(intervals3, 12*60);
        System.out.println(interval3);
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

        return (currStartTime + intervals[intervals.length-1][1] + duration) > (12*60)? -1 : currStartTime + intervals[intervals.length-1][1];
    }
}
