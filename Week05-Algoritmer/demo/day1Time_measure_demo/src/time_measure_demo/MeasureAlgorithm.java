package time_measure_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**

 @author hau
 */
public class MeasureAlgorithm {

    public static void main( String[] args ) {
        int n = 20000;             // problem size
        //int target = n - 1;         // search target
        //int[] list = new int[ n ];
        List<Integer> lst = new ArrayList<>();
        List<Integer> lst2 = new LinkedList<>();
        Map<Integer,Integer> hashmap = new HashMap<>();
        // fill list
//        for ( int i = 0; i < list.length; i++ ) {
//            list[ i ] = i;
//        }
////        //linked
//        for (int i = 0; i <n; i++){
//            lst2.add(0,1);
//        }
        
        //Array
        for(int i =0; i< n;i++){
            lst.add(i,1);
        }
        long startTime = System.nanoTime();
        
        //---- code to measure start ---------------        
        //int result = Searching.linearSearch( list, target );
        //int result2 = Searching.binarySearch(list, target );
        
       // List<Integer> result3 = new ArrayList<>();
        //List<Integer> result4 = new LinkedList<>();
        
        //---- code to measure end -----------------           
        long executionTime = System.nanoTime() - startTime;

        //-- present result
        System.out.println( "Time elapsed (mili sec): " + executionTime / 1000 );
        System.out.println( "Value:" + lst.size() );
    }

}
