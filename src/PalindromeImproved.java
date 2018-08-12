public class PalindromeImproved {
    public boolean isPalindrome(String s) {
        int st = 0;
        int f = s.length() - 1;
        while(st <= f) {
            while(st <= f && !Character.isLetterOrDigit(s.charAt(st))) {
                st++;
            }
            while(st <= f && !Character.isLetterOrDigit(s.charAt(f))) {
                f--;
            }
            if(st <= f && Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(f)))
                return false;
            st++;
            f--;
        }
        return true;
    }
}
