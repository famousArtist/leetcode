package easy.strings;

public class Pollindrome {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.replaceAll("[^A-Za-z0-9]", ""));

        if (sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase())){
            return true;
        }
        return false;
    }
}
