public class App {
    public static void main(String[] args) throws Exception {
        int userInput;
        if (args.length > 0){
            try {
                userInput = Integer.parseInt(args[0]);
                int firstTerm = 0;
                int secondTerm = 1; 
                
                for (int i = 2; i <= userInput; ++i){
                    
                    int nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                    if (i == userInput){
                        System.out.print(nextTerm);
                    }
                }
            } catch (NumberFormatException e){
                System.err.println("Argument " + args[0] + " must be an non-negative integer.");
                System.exit(1);
            }
        }
    }
}
