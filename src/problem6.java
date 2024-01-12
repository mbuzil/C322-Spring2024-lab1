import java.util.Arrays;
import java.util.*;
import java.util.Collections;
public class problem6 {
    public static void main(String args[])
    {
        int list1[] = {1,2,4};
        int list2[] = {1,3,4};
        Arrays.sort(list1);
        Arrays.sort(list2);
        List<Integer> list3 = new ArrayList<Integer>();
        for(int i = 0; i < list1.length; i++)
        {
            list3.add(list1[i]);
        }
        for(int i = 0; i < list2.length; i++)
        {
            list3.add(list2[i]);
        }
        Collections.sort(list3);
        System.out.println(list3);
    }
}
