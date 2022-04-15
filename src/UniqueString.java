import java.util.*;

public class UniqueString {

    // str: abcd
    protected static boolean isUnique(String str){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            } else{
                return false;
            }
        }
        return true;
    }

    private static String sort(String str){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return Arrays.toString(charArr);
    }
    protected static boolean isPermutation(String str1, String str2){
        /*
        str1: ab
        str2: ndsvabidaj
         */
        if(str1.length() != str2.length()){
            return false;
        }
        str1 = sort(str1);
        str2 = sort(str2);

        return str1.equals(str2);

    }

    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if (trueLength < str.length) str[trueLength] = '\0';
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
        System.out.println(str);
    }

    public static int findLastCharacter(char[] str) {
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                return i;
            }
        }
        return -1;
    }

    public static boolean palindromicPermutation(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        boolean foundOdd = false;
        for(int num : map.values()){
            if(num % 2 == 1){
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        // 1.1
        String str = "abcd";
        System.out.println("The string "+str+" is:"+isUnique(str));

        // 1.2
        String permutationStr1 = "ab";
        String permutationStr2 = "ba";
        System.out.println(permutationStr1+" and "+ permutationStr2+" are palindrome?: " + isPermutation(permutationStr1, permutationStr2));

        // 1.3
        String strToReplaceSpace = "Mr John Smith    ";
        char[] arr = strToReplaceSpace.toCharArray();
        int trueLength = findLastCharacter(arr) + 1;
        replaceSpaces(arr, trueLength);

        // 1.4
        String pali = "Tact Coa";
        System.out.println(palindromicPermutation(pali));

    }
}
