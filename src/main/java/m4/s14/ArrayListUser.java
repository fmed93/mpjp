package m4.s14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class ArrayListUser {
	private static final Logger LOG = Logger.getLogger("collections");
	
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList</*Integer*/>(Arrays.asList(23, 12, 18, 5));
        LOG.info("" + al);
        
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(56);
        LOG.info(al2.toString());
        int size = al2.size();
        LOG.info("al2 size is: " + size);
        
        // ...
        
        Integer value = al2.get(0);
        LOG.info("Value in position 0 for al2: " + value);
    }
}
