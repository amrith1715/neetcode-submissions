class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
         int i = 0, j = 0;

        while (i < abbr.length() && j < word.length()) {
            char c = abbr.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (c != word.charAt(j))
                    return false;
                i++;
                j++;
            } else {
                if (c == '0')
                    return false;

                int num = 0;

                while (i < abbr.length() && abbr.charAt(i) >= '0' && abbr.charAt(i) <= '9') {
                    num = num * 10 + (abbr.charAt(i) - '0');
                    i++;
                }

                j += num;
            }
        }

        return i == abbr.length() && j == word.length();
        
    }
}