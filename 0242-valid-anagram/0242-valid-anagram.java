class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int [] hash= new int[256];
       
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)]++;
            hash[t.charAt(i)]--;
        }
        for(int c:hash)
        {
    if(c!=0)
            return false;
        }
        return true;
    }
}