package repaso;

public class Car {
	public String marca = null;
    public String modelo = null;
    public String color = null;
    
    

	public Car(String marca, String modelo, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	public Car() {}
		
	public void setColor(String newColor) {
        this.color = newColor;
	}
	
	public static class MyNestedClass{
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();


    }
	
}