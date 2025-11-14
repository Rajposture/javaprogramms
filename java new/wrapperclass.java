public class wrapperclass {
    public static void main(String[] args) {
        // Primitive data types
        int num = 10;
        double d = 20.5;
        char c = 'A';

        // Converting primitives to objects (Boxing)
        Integer numObj = Integer.valueOf(num);
        Double dObj = Double.valueOf(d);
        Character cObj = Character.valueOf(c);

        System.out.println("Boxing (Primitive to Object):");
        System.out.println("Integer Object: " + numObj);
        System.out.println("Double Object: " + dObj);
        System.out.println("Character Object: " + cObj);

        // Converting objects to primitives (Unboxing)
        int numUnboxed = numObj.intValue();
        double dUnboxed = dObj.doubleValue();
        char cUnboxed = cObj.charValue();

        System.out.println("\nUnboxing (Object to Primitive):");
        System.out.println("Integer value: " + numUnboxed);
        System.out.println("Double value: " + dUnboxed);
        System.out.println("Character value: " + cUnboxed);

        // Auto-boxing and Auto-unboxing (Java does it automatically)
        Integer autoBoxed = num; // auto-boxing
        int autoUnboxed = autoBoxed; // auto-unboxing

        System.out.println("\nAuto-boxing and Auto-unboxing:");
        System.out.println("Auto-boxed Integer: " + autoBoxed);
        System.out.println("Auto-unboxed int: " + autoUnboxed);
    }

 
    
}
