package Hash;

public class Main {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedNumber("abcad"));
    }


    //Time Complexity of This Method is O(n^2)
    public static char findFirstNonRepeatedNumber(String str) {
        char[] chars = str.toCharArray();
        char first='N';
        //[a , b ,c, a,d]
        for (int c=0 ;c <chars.length;c++){
            int flag = 0;
            for (int i = 0; i < chars.length; i++) {
                if (i != c && chars[c] == chars[i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                first=chars[c];
                break;
            }
        }

        return first;
    }
}
