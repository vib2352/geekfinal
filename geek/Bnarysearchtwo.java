package geek;

public class Bnarysearchtwo {
    public static int BinarySearch(int[] arr,int target, boolean FirstSearch){
        int start = 0,end = arr.length-1;
        int mid = 0, result = -1;
        
    
        while(start <= end){
            mid = start+(end-start)/2;
            if(arr[mid]==target){
                result = mid;
                if(FirstSearch == true){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
       
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the Elements for array");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        Arrays.sort(arr);
       
        int FirstIndex = BinarySearch(arr,target,true);
        if(FirstIndex == -1){
            System.out.println("count of " + target  +" is : 0");
        }
        else{
            int LastIndex = BinarySearch(arr,target,false);
            int count = LastIndex-FirstIndex+1;
            System.out.println("Count of "+ target + " is "+ count);
        }
    }

}

}
