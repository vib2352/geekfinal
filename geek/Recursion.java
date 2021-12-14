package geek;

public class Recursion {
	static int Find(char[] chArr,int n, char target,int i,boolean flag){
        if(!flag){// finding last occurrence
            if(i == n) 
                return -1;
            int occurrance = Find(chArr, n , target, i+1, true );
            if(occurrance == -1 && chArr[i]==target) 
                return i;
            else 
                return occurrance;
        }
        else{ //finding first occurrence
            if(i == n) 
                return -1;
            if(chArr[i]==target) 
                return i;
            return Find(chArr, n , target, i+1, false);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chArr = str.toCharArray();
        int n = chArr.length;
        char target = sc.next().charAt(0);
        int i = 0;
        int FirstOccurrance = Find(chArr, n, target, i,true);
        int LastOccurrance = Find(chArr, n, target, i,false);
        System.out.println(FirstOccurrance +" "+LastOccurrance);
    }
}

}
