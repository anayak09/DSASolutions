import java.util.Arrays;

public class IsIsomorphicString {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        for(int i=0; i<s.length(); i++) {
            sFreq[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++) {
            tFreq[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(sFreq, tFreq);
    }
}
