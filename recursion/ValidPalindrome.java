class ValidPalindrome{
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return checkPalindrome(s, 0, s.length() - 1);
    }

    private static boolean checkPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return checkPalindrome(s, left + 1, right - 1);
    }
    
   public static void main(String...arg){
	String s = "A man, a plan, a canal: Panama";
	System.out.println(isPalindrome(s));
   }
}