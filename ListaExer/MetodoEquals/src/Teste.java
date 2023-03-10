
public class Teste {
	public static void main(String args[]) {
		
		Mobile m1 = new Mobile("Samsung", "J5 Prime");
		Mobile m2 = new Mobile("Apple ", "iPhone 14 Pro Max");
		Mobile m3 = new Mobile("Samsung", "J5 Prime");
		
		System.out.println(m1.equals(m2)); // false
		System.out.println(m1.equals(m3)); // true
		System.out.println( m1.toString() ); // [marca: Samsung, modelo: J5 Prime]
		System.out.println( m2.toString() ); // [marca: Apple , modelo: iPhone 14 Pro Max]
		System.out.println( m3.toString() ); // [marca: Samsung, modelo: J5 Prime]
		System.out.println();
		
		
		Aviao av1 = new Aviao("BELL", "Bell Boeing V-22 Osprey");
		Aviao av2 = new Aviao("CIRRUS ", "CIRRUS SR22T G6 GTS");
		Aviao av3 = new Aviao("BELL", "Bell Boeing V-22 Osprey");
		Aviao av4 = new Aviao("k", "CIRRUS SR22T G6 GTS");
		
		System.out.println(av1.equals(av2)); // false
		System.out.println(av1.equals(av3)); // true
		System.out.println(av2.equals(av4)); // false
		System.out.println( av1.toString() ); // [fabricante: BELL, tipo: Bell Boeing V-22 Osprey]
		System.out.println( av2.toString() ); // [fabricante: CIRRUS , tipo: CIRRUS SR22T G6 GTS]
		System.out.println( av3.toString() ); // [fabricante: BELL, tipo: Bell Boeing V-22 Osprey]
		System.out.println( av4.toString() ); // [fabricante: k, tipo: CIRRUS SR22T G6 GTS]
		System.out.println();
		
		
		Tenis te1 = new Tenis("Nike", "Azul", 40);
		Tenis te2 = new Tenis("Puma ", "Branco", 35);
		Tenis te3 = new Tenis("Nike", "Preto", 40);
		
		System.out.println(te1.equals(te2)); // false
		System.out.println(te1.equals(te3)); // false
		System.out.println( te1.toString() ); // [ marca: Nike, cor: Azul, tamanho: 40]
		System.out.println( te2.toString() ); // [ marca: Puma , cor: Branco, tamanho: 35]
		System.out.println( te3.toString() ); // [ marca: Nike, cor: Preto, tamanho: 40]
	
	}
}
