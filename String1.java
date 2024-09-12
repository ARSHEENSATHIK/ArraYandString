import java.util.HashSet;
import java.util.Set;

public class String1 {
    public static void main(String[] args) {
        String s="abcab";
        int start=0;
        int end=0;
        int maxLen=Math.min(s.length(), 0);
        Set<Character> seen= new HashSet<>();
        while(end < s.length()){
            char c=s.charAt(end);
            while(seen.contains(c)){
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(c);

            int wsize=end- start+1;
            maxLen=Math.max(maxLen, wsize);
            end++;
        }
        System.out.println(maxLen);
    }
}
