class Solution {
    public String countAndSay(int n) {
        StringBuilder res = new StringBuilder("1");
        for(int k=0;k<n-1;k++){
            StringBuilder sb = new StringBuilder();
            int count=1;
            for(int j=1;j<res.length();j++){
                if(res.charAt(j)==res.charAt(j-1))
                    count++;
                else{
                    sb.append(count);
                    sb.append(res.charAt(j-1));
                    count=1;
                }    
            }
            sb.append(count).append(res.charAt(res.length()-1));
            res=sb;
        }
        return res.toString();
    }
}
