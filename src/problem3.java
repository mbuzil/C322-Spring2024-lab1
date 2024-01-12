public class problem3 {
    public static void main(String args[])
    {
        String[] input = {"flower", "flow", "flight"};
        String output = "";
        int smallest = 100;
        boolean yes = false;
        for(int i = 0; i < input.length-1; i++)
        {
            if(input[i].length() < smallest)
                smallest = input[i].length();
        }
        for(int i = 0; i < smallest-1; i++)
        {
            for(int j = 0; j < input.length-1; j++)
            {
                for(int k = 0; k < input.length-1; k++)
                {
                    if(j!=k) {
                        if (input[j].charAt(i) == input[k].charAt(i)) {
                            output+=input[j].charAt(i);
                        }
                    }
                }
            }
        }
        System.out.print(output);
    }
}
