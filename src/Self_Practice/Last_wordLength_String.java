package Self_Practice;

public class Last_wordLength_String {
    public static void main(String[] args) {
        String s = " Ram aam khata hai ";
        int lastIndex = LastIndex(s);
        System.out.println("Length of last word: " + lastIndex);
    }

    public static int LastIndex(String s) {
        String s1 = s.trim();
        int count = 0;
        int n = s1.length();
        for (int i = n - 1; i >= 0; i--) {
            if (s1.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}