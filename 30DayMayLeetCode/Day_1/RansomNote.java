package Day_1;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (char c : ransomNote.toCharArray()) {
            if (magazine.indexOf(c) >= 0)
                magazine = magazine.replaceFirst(Character.toString(c), "");
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct("a", "b"));
        System.out.println(rn.canConstruct("aa", "ab"));
        System.out.println(rn.canConstruct("aa", "aab"));
    }
}