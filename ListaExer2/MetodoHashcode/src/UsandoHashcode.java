
public class UsandoHashcode {
	public static void main(String[] args) {
		
		Integer i= 10; //exibição- i: 10
		Integer j= 10; //exibição- j: 10
		
		System.out.println("i: " +i.hashCode() );
		System.out.println("j: " +j.hashCode() );
		System.out.println();
		
		String a= "a";
		String b= "b";
		
		System.out.println("a: " +a.hashCode() ); //exibição- a: 97
		System.out.println("b: " +b.hashCode() ); //exibição- b: 98		
	}
}
