package hackerrank;
import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            boolean isBalanced=isBalanced(input);
            System.out.println(isBalanced);
		}
		
	}
    
    public static boolean isBalanced(String exp){
        Stack <Character> stack=new Stack<>();
        

        for (char ch : exp.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
               
                stack.push(ch);
            } else {
                
                if (stack.isEmpty()) {
                    return false; 
                }

   
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false; 
                }
            }
        }

        
        return stack.isEmpty();
        
    }
    
    
}



