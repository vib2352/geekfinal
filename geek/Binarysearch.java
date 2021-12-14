package geek;

public class Binarysearch {
	 public static int binarySearch(int[] arr, int target){
	        int start = 0, end = arr.length-1, mid=0;
	        while(start <= end){
	            mid = start+(end-start)/2;
	            if(arr[mid] == target){
	                return mid;
	            }
	            else if(target < arr[mid]){
	                end = mid - 1;
	            }
	            else{
	                start = mid + 1;
	            }
	        }
	        return -1;
	    }
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Size of array");
	        int n = sc.nextInt();
	        int arr[] = new int[n];

	        System.out.println("Enter the Elements of array");
	        for(int i = 0; i < n; i++ ){
	            arr[i]=sc.nextInt();
	        }
	        Arrays.sort(arr);
	        System.out.println("Enter Target");
	        int target = sc.nextInt();
	        System.out.println(binarySearch(arr, target));
	    }
	}

}
