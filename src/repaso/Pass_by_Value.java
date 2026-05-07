package repaso;

public class Pass_by_Value {
	public void whenModifyingObjects_thenOriginalObjectChanged() {
        Foo a = new Foo(1);
        Foo b = new Foo(1);

        // Before Modification
        assertEquals(a.num, 1);
        assertEquals(b.num, 1);
        
        modify(a, b);
        
        // After Modification
        assertEquals(a.num, 2);
        assertEquals(b.num, 1);
    }
 
    private void assertEquals(int num, int i) {
		
	}

	public static void modify(Foo a1, Foo b1) {
        a1.num++;
       
        b1 = new Foo(1);
        b1.num++;
    }
}
 
class Foo {
    public int num;
   
    public Foo(int num) {
        this.num = num;
    }

}
