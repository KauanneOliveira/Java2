/*Escreva o código fonte de um programa Java leia o conteúdo do arquivo
“entrada.txt” em formato de bytes. O programa deve analisar cada byte lido do
arquivo, e gravar os bytes com valores maiores que 128 no arquivo “maior.txt”
e os bytes com valores menores ou iguais a 128 no arquivo “menor.txt”.*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MaiorMenor {

	public static void main(String[] args) {
		
		FileInputStream leitura = null;        
        FileOutputStream maior = null;
        FileOutputStream menor = null;

        try {
			        	
        	leitura = new FileInputStream("entrada.txt"); 
        	maior = new FileOutputStream("maior.txt");
        	menor = new FileOutputStream("menor.txt");
        	
        	int c;

	        while ( (c = leitura.read() ) != -1) {
	            if( c > 128 ) {
	            	System.out.println("maior: " + c);
	            	maior.write(c);
	            }
	            else {
	            	System.out.println("menor: " + c);
	            	menor.write(c);
	            }
	        }
	        
		} 
        catch (IOException e) {
			e.printStackTrace();
		}
        finally {
        	try {
				leitura.close();
				maior.close();
				menor.close();
			} 
        	catch (IOException e) {				
				e.printStackTrace();
			}        	
        }        	
	}
}