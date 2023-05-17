/*Escreva o código fonte de um programa Java que crie 10 números aleatórios
entre 1 e 100, ordene os valores de forma crescente, e grave os valores pares no
arquivo “pares.txt” e os número impares no arquivo “impares.txt”.*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GravacaoParesImpares {

	public static void main(String[] args) {
		
		Random random = new Random();		
		ArrayList<Integer> lista = new ArrayList<Integer>();
        FileOutputStream pares = null;
        FileOutputStream impares = null;
       
        for( int a = 0; a < 10; a++ )
			lista.add( random.nextInt(100) );

        try {
        	
			pares = new FileOutputStream("pares.txt");
        	impares = new FileOutputStream("impares.txt");        	        	

	        for( Integer c: lista ) {
	            if( c % 2 == 0 ) {
	            	System.out.println("par: " + c);
	            	pares.write(c);
	            }
	            else {
	            	System.out.println("impar: " + c);
	            	impares.write(c);
	            }
	        }
	        
		} 
        catch (IOException e) {
			e.printStackTrace();
		}
        finally {
        	try {				
				pares.close();
				impares.close();
			} 
        	catch (IOException e) {				
				e.printStackTrace();
			}        	
        }        	

	}

}