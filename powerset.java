import java.util.*;


public class powerset{
    static List<Integer> l=new ArrayList<>();
    public static void main(String[] args){
        int[] set = {1,2,3};
        power(set,0);
    }

    public static void power(int[] ar,int n){
        //goal
        if(n==ar.length){
            System.out.println(l);
            return;
        }
        //choice
        
    
            l.add(ar[n]);
            power(ar,n+1);

            l.remove((Integer)ar[n]);
            power(ar,n+1);
        //backtrack
        }
    }

