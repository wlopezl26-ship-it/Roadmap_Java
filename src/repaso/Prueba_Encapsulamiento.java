package repaso;

public class Prueba_Encapsulamiento {
    
    public static void main(String args[]) {
        Encapsulamiento encap = new Encapsulamiento();
        
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
    }
}