package InterfaceComparable;

import java.util.Collections;

public class Teste {
    
    public static void main(String[] args) {

//    	Usuario u1 = new Usuario();
//		u1.setNome("Kauanne");
//		
//		Post p2 = new Post("mensagem teste 1",10,4,2023,5,5,5);
//		Post p3 = new Post("mensagem teste 2",11,4,2023,8,8,8);
//		Post p1 = new Post("mensagem teste 3",11,4,2023,10,10,10);
//		
//		u1.getLista().add(p1);
//		u1.getLista().add(p2);
//		u1.getLista().add(p3);
    	
    	
        Usuario u1 = new Usuario("Kauanne");    
      
        u1.getLista().add( new Post("kakakkakakakakakkakakka", 9, 1, 2021, 1, 10, 20 ) );
        u1.getLista().add( new Post("ainnnn", 9, 4, 2021, 2, 40, 25 ) );
        u1.getLista().add( new Post("num acredito", 9, 2, 2021, 9, 20, 2 ) );
      
        for( Post p : u1.getLista() ){
            System.out.println( p );
        }
        
        System.out.println( " --------------------------------------------------------------------------- " );

        Collections.sort( u1.getLista(), Collections.reverseOrder()); //ordem decrescente

        for( Post p : u1.getLista() ){
            System.out.println( p );
        }

	        System.out.println("---------------------------------------------------------------------------------");
	        
	        Collections.sort(  u1.getLista() ); //ordem crescente
	
	        for( Post p : u1.getLista() ){
	            System.out.println( p );
	        }

    }
}