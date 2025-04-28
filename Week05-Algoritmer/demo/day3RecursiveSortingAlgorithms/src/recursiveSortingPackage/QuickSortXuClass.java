/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursiveSortingPackage;

/**
 *
 * @author Moonniuniu
 */
public class QuickSortXuClass
{

    // test
    public static void main(String[] args)
    {

    }

    // algorithm quicksort(A, lo, hi) is
    public void quicksort(int[] A, int lo, int hi)
    {
        //if lo < hi then
        if (lo < hi)
        {
            //p := partition(A, lo, hi)
            int p = partition(A, lo, hi);
            //quicksort(A, lo, p – 1)
            //quicksort(A, p + 1, hi)
        }
    }

    //algorithm partition(A, lo, hi) is
    private int partition(int[] A, int lo, int hi)
    {

        //pivot := A[hi]
        int pivot = A[hi];
        
        //i := lo - 1    
        int i = lo - 1;
        
        //for j := lo to hi - 1 do
        for(int j = lo; j <= hi-1; j++){
            
        }
        //if A[j] ≤ pivot then
        //i := i + 1
        //swap A[i] with A[j]
        //swap A[i+1] with A[hi]
        
        //return i + 1
        return i+1;
    }

}
