class Solution {
    public boolean isPalindrome(int x) {
        String numStr = String.valueOf(x);
        int len=numStr.length();
        for(int i=0;i<len/2;i++){
            if(numStr.charAt(i)!=numStr.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}