class Solution {
    public boolean isPalindrome(int x) {
        String numStr = String.valueOf(x);
        int len=numStr.length();
        int n=numStr.length()/2;
        for(int i=0;i<n;i++){
            if(numStr.charAt(i)!=numStr.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}