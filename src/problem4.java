public class problem4 {
    public static void main(String args[])
    {
        String roman = "III";
        int num = 0;
        for(int i = 0; i < roman.length(); i++)
        {
            if(roman.charAt(i) == 'I')
            {
                num += 1;
            }
            else if(roman.charAt(i) == 'V')
            {
                num += 5;
            }
            else if(roman.charAt(i) == 'X')
            {
                num += 10;
            }
            else if(roman.charAt(i) == 'L')
            {
                num += 50;
            }
            else if(roman.charAt(i) == 'C')
            {
                num += 100;
            }
            else if(roman.charAt(i) == 'D')
            {
                num += 500;
            }
            else if(roman.charAt(i) == 'M')
            {
                num += 1000;
            }
        }
        System.out.print(num);
    }
}
