public class problem2 {
    public static void main(String args[])
    {
        int x = 121;
        boolean palendrome = false;
        String s = String.valueOf(x);
        String y = "";
        if(x > 0) {
            for (int i = s.length() - 1; i >= 0; i--) {
                y += s.charAt(i);
            }
            System.out.print(y);
            int z = Integer.parseInt(y);
            if (x == z)
                palendrome = true;
        }
        System.out.println("\n"+palendrome);
    }
}
