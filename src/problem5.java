public class problem5 {
    public static void main(String args[])
    {
        String s = "()[]{}";
        boolean output = true;
        for(int i = 0; i < s.length()-1; i+=2)
        {
            if(s.charAt(i) == '(' && s.charAt(i+1) != ')')
            {
                output = false;
            }
            else if(s.charAt(i) == '[' && s.charAt(i+1) != ']')
            {
                output = false;
            }
            else if(s.charAt(i) == '{' && s.charAt(i+1) != '}')
            {
                output = false;
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}')
            {
                output = false;
            }
        }
        System.out.print(output);
    }
}
