class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        for (int i=0; i<ch.length/2; i++) {
            if (ch[i] != ch[ch.length-1-i]) {
                return false;
            }
        }

        return true;
    }
}
