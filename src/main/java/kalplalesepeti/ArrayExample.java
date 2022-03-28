package kalplalesepeti;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= new  int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		/*//for loop
		for (int b=0; b<=2; b++) {
		System.out.println(a[b]); }
		*/
		
		//for each loop
		for( int i : a) {
		System.out.print(i);
	}
		
		
		String w[]=new String [2];
		
		w[0]="ismet";
		w[1]="poyraz";
		/*
		//for loop
		for (int t =0; t<=1; t++) {
		System.out.println(w[t]);}
		*/
		
		//for each loop
		for (String z: w ) {
			System.out.println(z);
		}
		
		
		
		
		
		
		
		
	
	}


}
