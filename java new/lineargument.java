public class lineargument {
    
    public static void main(String[] args) {
       
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            System.out.println("Usage: java CommandLineArgumentsDemo <arg1> <arg2> ...");
        } else {
            System.out.println("Command-line arguments received:");
       
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
