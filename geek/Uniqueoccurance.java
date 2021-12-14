package geek;

public class Uniqueoccurance {
	public boolean Uniqueoccurance(int[] arr) {
        int min = arr[0], max = min;
        boolean res = true;
        
		
        for (int i : arr) {
            if (i < min)
                min = i;
            else if (i > max)
                max = i;
        }
        
		
        int[] counter = new int[max - min + 1];
        max = 0;
        
		
        for (int i : arr) {
            int idx = i - min;
            counter[idx]++;
            
            if (counter[idx] > max)
                max = counter[idx];
        }
        
        boolean[] checker = new boolean[max + 1];
        
		
        for (int i : counter) {
            if (i != 0 && checker[i]) {
                res = false;
                break;
            }
            checker[i] = true;
        }
        
        return res;
    }
	
	 public static void main(String args[]) {
	    	int nums[]= {1,1,1,2,2};
	  
	    	Uniqueoccurance ob=new Uniqueoccurance();
	    	System.out.print(ob.Uniqueoccurance(nums));
	    }
}
}
