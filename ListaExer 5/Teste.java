import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {
    
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Kauanne");    
      
        u1.getLista().add( new Post("kakakkakakakakakkakakka", 9, 1, 2021, 1, 10, 20 ) );
        u1.getLista().add( new Post("ainnnn", 9, 4, 2021, 2, 40, 25 ) );
        u1.getLista().add( new Post("num acredito", 9, 2, 2021, 9, 20, 2 ) );
      
        for( Post p : u1.getLista() ){
            System.out.println( p );
        }
        System.out.println( " --------------------------------------------------------------------------- " );

        Collections.sort( u1.getLista()
        , Collections.reverseOrder());

        for( Post p : u1.getLista() ){
            System.out.println( p );
        }

        System.out.println("---------------------------------------------------------------------------------");
        
        Collections.sort(null);

        for( Post p : u1.getLista() ){
            System.out.println( p );
        }

    }
}
