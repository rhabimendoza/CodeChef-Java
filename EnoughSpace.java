import java.util.Scanner;

class EnoughSpace{
	public static void main (String[] args) throws java.lang.Exception{
	    
	    // Start of Solution
	    Scanner in = new Scanner(System.in);
	    
	    int T = in.nextInt();
	    
	    for(int ctr = 0; ctr < T; ctr++){
	        int N = in.nextInt();
	        int X = in.nextInt();
	        int Y = in.nextInt();
	        
	        if(N < (X + (Y*2))){
	            System.out.println("NO");
	        }
	        else{
	            System.out.println("YES");
	        }
	    }
	    // End of Solution
	    
	}
}
