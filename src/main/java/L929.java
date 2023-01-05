import java.util.HashSet;

public class L929 {
    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String i : emails){
            set.add(convert(i));
        }
        return set.size();
    }

    public static String convert(String s){
        String[] sArr = s.split("@");
        String sClear = sArr[0].replaceAll("\\.","");
        if(sClear.contains("+")){
            return sClear.split("\\+")[0] +"@"+ sArr[1];
        }
        return sClear + "@" + sArr[1];
    }
    public static void main(String[] args) {
        String[] arr = new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        System.out.println(numUniqueEmails(arr));
    }
}
