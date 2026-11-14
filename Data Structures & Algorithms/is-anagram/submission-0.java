class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> str = new HashMap<>();

        for (char c : s.toCharArray()) {
            str.put(c, str.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            str.put(c, str.getOrDefault(c, 0) - 1);
        }

        for (int values : str.values()) {
            if (values != 0) {
                return false;
            }
        }

        return true;
    }
}
