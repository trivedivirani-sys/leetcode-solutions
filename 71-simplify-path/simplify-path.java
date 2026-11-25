class Solution {
    public String simplifyPath(String path) {
        path=path.replaceAll("/+","/");
        String []arr=path.split("/");
        Stack<String> st=new Stack<>();
        for(String s:arr){
            if(s.equals("")||s.equals(".")){
                continue;
            }else if(s.equals("..")){
                if(!st.isEmpty())
                    st.pop();
                }else{
                    st.push(s);
                }
            }StringBuilder sb=new StringBuilder();
            for(String str:st){
                sb.append("/").append(str);
            }
        return sb.length()==0?"/":sb.toString();
    }
}
    