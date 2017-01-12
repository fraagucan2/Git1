package pruebas;

public class Suma {

public static int suma (int a, int b){
	return a+b;
}

	public static void main(String[] args) {
		if (suma(2,1) == 3){
			System.out.println("Todo bien.");
		}else{
			System.out.println("Algo falla.");

		}
	}

}
