import java.util.HashMap;

public class FuncionalidadeMap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> mapa = new HashMap<String,Integer>();
		
		//K - chave | V - valor
		
		// Retorno- V | Método- put(K key, V value) - método para incluir chave e valor
		
		mapa.put("kauanne", 1);
		mapa.put("messi", 2);
		mapa.put("menino Ney", 3);
		mapa.put(null, null);
		
		// Retorno- Set<K> | Método- keySet() - método retorna uma coleção do tipo Set com as chaves do Mapa
		
		for( String c: mapa.keySet() )
			System.out.println( c + " - " + mapa.get(c) );
		
		// Retorno- boolean	| Método- containsKey(Object key) - método retorna true se encontrar a chave no mapa
		
		System.out.println( mapa.containsKey("kauanne") );
		System.out.println( mapa.containsKey("cr7") );
		
		// Retorno- boolean	| Método- isEmpty() - retorna verdade se este mapa não contiver mapeamentos de valor-chave.
		
		System.out.println( mapa.isEmpty() );

		// Retorno- int	| Método- size() - retorna o número de mapeamentos de valor-chave neste mapa.
		
		System.out.println( mapa.size() );

		
		// Retorno- void | Método- clear() - método para limpar o mapa
		
		mapa.clear();
		
	}

}

/*saída
null - null
menino Ney - 3
kauanne - 1
messi - 2
true
false
false
4*/
