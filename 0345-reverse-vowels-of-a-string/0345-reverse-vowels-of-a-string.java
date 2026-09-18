class Solution { 
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int i = 0, j = ch.length - 1;

        while (i < j) {
            while (i < j && !isVowel(ch[i])) i++;
            while (i < j && !isVowel(ch[j])) j--;

            if (i < j) { // swap vowels
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }

        return new String(ch);
    }

    public static boolean isVowel(char ch) {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
            ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}