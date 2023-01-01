package com.assienment.problem3;
import java.util.*;

public class Test implements Intr{

	@Override
	public int[] display(int p) {
		
		List<Integer> prime = new ArrayList<>() ;
		for(int i=2;i<=p;i++) {
			if(isPrime(i)) {
				prime.add(i) ;
			}
		}
		
		int[] result = prime.stream().mapToInt(Integer :: intValue).toArray() ;
		
//		prime.toArray(result)  ;
		
		return result;
	}
	
	public boolean isPrime(int n) {
		for(int i=2 ;i<n;i++) {
			if(n%i==0) {
				return false ;
			}
		}
		return true ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the number : ");
		int n = sc.nextInt() ;
		sc.close(); 
		Test t1 = new Test() ;
		int[] primeNumbers = t1.display(n) ;
		System.out.println(Arrays.toString(primeNumbers));
	}

}
