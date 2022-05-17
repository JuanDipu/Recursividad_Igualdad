package actividad2_2;

import java.util.Random;

public class AppClass {
	
	  public static int[] llenarArrayAleatorio(int desde, int hasta, int tam) {
	        int[] numeros = new int[tam];
	        Random rnd = new Random();
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;
	        }
	        return numeros;
	    }
	
	public static boolean arrayResultItera(int[]array1,int [] array2) {
		
		
		for(int a=0;a<array1.length;a++) {
			if(array1[a]!= array2[a]) {
				return false;
				
			}
			
		}
		return true;
	
		
		
		
	}
	
	public static boolean arrayResultRecu(int[]array1,int [] array2,int ind) {
		if(ind == array1.length) {
			return true;
		}else if(array1[ind] != array2[ind]) {
			return false;
		}else {
		return	arrayResultRecu(array1, array2, ind+1);
		}
	}

}
