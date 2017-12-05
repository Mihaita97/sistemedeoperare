package matrix;

import java.util.Random;

public class matrice {
	static Random r=new Random();
	
	public static void main(String[] args) {
		int contornrimpare=0,contornrprime=0;
		int n= Integer.parseInt(args[0]);
		int m=Integer.parseInt(args[1]);
		int i,j;
		int [][]matrice=new int[n][m];
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				matrice[i][j]=r.nextInt(10);
			}
		}
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				System.out.print(" " +matrice[i][j]);
			}System.out.println();
		}
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(matrice[i][j]%2==1) {
					contornrimpare++;
				}
				if(nrprime(matrice[i][j]))
					contornrprime++;
			}
		}System.out.println("nr de elemente impare = "+contornrimpare);
		System.out.println("nr de elemente prime = "+contornrprime );
	}
	static boolean nrprime(int nr) {
		if (nr==1)
			return false;
		else if(nr==2)
			return true;
		else {
			int div=3;
			for(int i=div;i<nr/2;i=i+2) {
				if(nr%i==0)
					return false;
			
			}return true;
		}
	}
}