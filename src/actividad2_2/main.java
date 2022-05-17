package actividad2_2;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar1= {0,2,1,4,6};
		int []ar2= {1,2,0,6,4};
		
		//Función para llenar el array aleatorio 
		//int []ar1=AppClass.llenarArrayAleatorio(0, 20, 10);  
		//int []ar2=AppClass.llenarArrayAleatorio(0, 20, 10);
		
		System.out.println("  Arrays ");
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		System.out.println("  Arrays ordenado ");
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		
		
		System.out.println("¿Los Arrays son iguales?");
		System.out.println(AppClass.arrayResultItera(ar1, ar2));
		System.out.println(AppClass.arrayResultRecu(ar1, ar2, 0));

	}

	
}
