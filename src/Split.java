import java.util.Arrays;

public class Split {

    public static void main(String[] args){
        int val = parseInt("3+4=9");
    }


    public static int parseInt(String abc){
        String[] str = abc.split("[+*/=-]");
        System.out.println(Arrays.toString(str));

        return 0;
    }

}
