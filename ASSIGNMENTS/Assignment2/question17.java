package ASSIGNMENTS.Assignment2;

import java.util.*;
public class question17 
{
	static boolean prime(int p){
		for(int i=2;i<p;i++){
			if(p%i==0){
				return false;
			}
		}
		return true;
	}
	static int digitSum(int m){
		int sum=0;
		while(m>0){
			sum+=m%10;
			m/=10;
		}
		return sum;
	}
	static int pfSum(int N){
		int psum=0;
		for(int i=2;i<=N;i++){
			while(N%i==0 && prime(i)==true){
				if(i > 9){
					psum+=digitSum(i);
				}
				else
					psum+=i;
				N/=i;
			}
		}
		return psum;
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a=N;
		int m=N;
		int d=digitSum(m);
		int f=pfSum(N);
		if(d==f && a>2){
			System.out.print(1);
		}
		else{
			System.out.print(0);
		}
        sc.close();
    }
}