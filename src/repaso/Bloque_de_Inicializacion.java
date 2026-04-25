package repaso;

public class Bloque_de_Inicializacion {
	
	{
        System.out.println("Instance initializer block 1");
    }
    
    {
        System.out.println("Instance initializer block 2");
    }
    
    public Bloque_de_Inicializacion() {
        System.out.println("Class constructor");
    }

    public static void main(String[] args) {
    	Bloque_de_Inicializacion iib = new Bloque_de_Inicializacion();
        System.out.println("Main Method");
    }

}
