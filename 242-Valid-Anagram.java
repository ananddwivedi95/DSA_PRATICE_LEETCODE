class Solution {
    public boolean isAnagram(String s1, String s2) {
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
        {
            return true;
        }
        return false;
    }
}