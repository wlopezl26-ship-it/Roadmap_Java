package repaso;

public class Excepciones {
	public static void main(String[] args) {
		//String str= null;
		//System.out.println(str.length());
		
		try {
			int a=30, b=0;
			int c=a/b;
			System.out.println("resultado="+c);
		}
		
		catch(ArithmeticException e) {
			System.out.println("No se puede dividir un número entre cero.");
		}
		
		try {
			int num= Integer.parseInt("Edureka");
			System.out.println(num);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Number format exception");
		}
		
		try {
			int a[] = new int [5];
			a[7]=9;
		}
		catch (ArithmeticException e) {
			System.out.println("array index out of bounds");
		}
	}

}
