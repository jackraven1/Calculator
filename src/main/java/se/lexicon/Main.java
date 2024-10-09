package se.lexicon;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        boolean isActive = true;

        while (isActive){
            int userChoice= userInput.getUserChoice();
            switch (userChoice){
                case 1:
                    System.out.println("Result: " + Operations.add());
                    break;
                case 2:
                    System.out.println("Result: " + Operations.subtract());
                    break;
                case 3:
                    System.out.println("Result: " + Operations.multiply());
                    break;
                case 4:
                    System.out.println("Result: " + Operations.divide());
                    break;
                case 0 :
                    System.out.println("Bye");
                    isActive=false;
                    break;
                default:
                    System.out.println("Error,Enter a Number between 0-4");
                    break;
            }
            if(isActive){
                int moreOperations = userInput.getContinueResponse();
                if(moreOperations==0){
                    isActive=false;
                }
            }
        }
    }
}