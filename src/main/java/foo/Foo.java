package foo;

/**
 * Foo class
 */
public class Foo {
    
    private Foo() {
        throw new IllegalStateException("Utility class");
    }
    
    public static int div(int a, int b) throws UnsupportedOperationException {
    	if (b == 0) {
    		throw new UnsupportedOperationException("Can't divide by zero!");
    	}
        return a / b;  
    }

}
