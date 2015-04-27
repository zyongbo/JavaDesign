package javadesign;

import java.util.ArrayList;

public class FindPrimeNumber {

	//find the prime number between integer 2 and end integer
	public static ArrayList<Integer> findPrime(int end) {
		//save 0-end in the array, false is prime
		//true is to be remove from the array
		boolean[] status = new boolean[end+1];
		status[0] = true; //exclude integer 0
		status[1] = true; //exclude integer 1
		ArrayList<Integer> primeList = new ArrayList<>();
		for(int i=2; i<=end; i++) {
			if(!status[i]) {
				primeList.add(i);
				for(int j=i+1; j<=end; j++) {
					if(j%i==0)
						status[j] = true; //to be removed
				}
			}
		}
		return primeList; //return an arrayList in case it will be used later
	}
	
	public static void main(String[] args) {
		System.out.println(findPrime(100));
		
	}
}
