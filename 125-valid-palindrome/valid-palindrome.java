class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
      s=  s.toLowerCase();
      String original=s.replaceAll("[^a-z0-9]","");
      String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
            

        }
        return original.equals(reverse);
    }
}