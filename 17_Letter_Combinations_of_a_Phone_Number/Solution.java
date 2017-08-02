import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	private static final String[] numeros = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public static List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<String>();
        if(digits.length()>0){
            if(digits.length()==1) res=new ArrayList<>(Arrays.asList(numeros[Integer.parseInt(digits)].split("")));
            else{
        	    String[] letts=numeros[Integer.parseInt(digits.substring(0,1))].split("");
        	    List<String> oths=letterCombinations(digits.substring(1));
        	    for(String lett : letts){
        		    for(String oth : oths) res.add(lett+oth);
        	    }
            }
        }
        return res;
    }

    public static void main(String[] args) {
    	System.out.println(letterCombinations(args[0]));
    }
}