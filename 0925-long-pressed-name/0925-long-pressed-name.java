class Solution {
    public boolean isLongPressedName(String n, String t) {
        int i=1;
        int j=1;
        if(n.charAt(0)!=t.charAt(0)) return false;
        while(j<t.length())
        {
            if(i<n.length() && n.charAt(i)==t.charAt(j))
                {
                    i++;
                    j++;
                }
            else if((j>0 && t.charAt(j)==t.charAt(j-1))) j++;
            else return false;
        }
        return i==n.length();
    }
}