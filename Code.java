package misc;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;



public class main_misc2 {
	
	
	
	
	
	public static void main(String[] args) {
	//(a+b)%k = ((a % k)+(b % k)) % k    || ||
	
		
		System.out.println(ways_to_represent(75));
		
		/*double n = 0.75;
		for(int i = 0;i < 75;i++){
			n = n - 0.01;
			System.out.println(n);
		}*/
		
	}	
	
	private static long ways_to_represent(int n) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(5);
		numbers.add(10);
		numbers.add(25);
		
		
		return f(n,numbers,0,new long[n+1]);
		
	}
	

	
	private static long f(int n,ArrayList<Integer> numbers,int k,long[] memo){
		
		if(k == n){
			return 1;
		}
		if(memo[k] != 0) {
			return memo[k];
		}
		
		long total = 0;
		
		for(int i = 0;i < numbers.size();i++){
			
			int x = k+numbers.get(i);
			if(x <= n){
				total += f(n,numbers,x,memo);
			}
		}
		memo[k] = total;
		return total;
		
		
	}
	
	} 
	
