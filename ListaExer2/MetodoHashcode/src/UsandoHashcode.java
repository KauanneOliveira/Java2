
public class UsandoHashcode {
	public static void main(String[] args) {
		
		Integer i= 10; //exibi��o- i: 10
		Integer j= 10; //exibi��o- j: 10
		
		System.out.println("i: " +i.hashCode() );
		System.out.println("j: " +j.hashCode() );
		System.out.println();
		
		String a= "a";
		String b= "b";
		
		System.out.println("a: " +a.hashCode() ); //exibi��o- a: 97
		System.out.println("b: " +b.hashCode() ); //exibi��o- b: 98		
	}
}
