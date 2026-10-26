class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0){
            return 0;
        }
        long n=0;
        int sign=1;
        int i=0;
        if(s.charAt(0)=='-'){
            sign=-1;
            i++;
        }else if(s.charAt(0)=='+'){
            i++;
        }
        for(int j=i;j<s.length();j++){
if(s.charAt(j)>='0'&&s.charAt(j)<='9'){
    n=n*10+(s.charAt(j)-'0');

if(sign==1&&n>2147483647L){
    return 2147483647;
}if(sign==-1&&n>2147483647L){
    return -2147483648;
}
}else{
    break;
}
}
                 return (int)(n*sign);

       }
        }