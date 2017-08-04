public class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        int counter=0;
        String cad="";
        boolean res=true;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')' || c=='}' || c==']'){
                counter++;
                if(cad.length()>0){
                    if(!(c-cad.charAt(0)>0 && c-cad.charAt(0)<3))break;
                    cad=cad.substring(1);
                }
                else {res=false;break;}
            }
            else cad=c+cad;
        }
        System.out.println(s.length()/2+" - "+counter);
        if(cad.length()>0 && s.length()/2 != counter)res=false;
        return res;
    }
}