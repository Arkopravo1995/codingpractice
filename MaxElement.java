package codepractice;
import java.util.*;
public class MaxElement {
	public static void printarr(int a[] , int n) {
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void maxelement(int a[] , int n) {
		int maxelm = a[0] ;
		for(int i = 1 ; i <n ; i++) {
			if(a[i] > maxelm) {
				maxelm = a[i];
				
			}
			
		}
		System.out.println("max element is " + maxelm);
	}
	

	public static void main(String[] args) {
		Scanner inp =  new Scanner(System.in);
		int n = inp.nextInt(); // size of array.
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = inp.nextInt();
		}
		maxelement(a, n);
		printarr(a, n);

	}

}
