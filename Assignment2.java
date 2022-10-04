import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer diamondIntInput;
        int oddInput, evenInput;
        String spaceCharacter = " ";

        //Determines if the input is positive. If it is negative, new input is required to continue
        do {
            System.out.println("Please enter a positive integer:");
            diamondIntInput = input.nextInt();
        } while (diamondIntInput < 0);

            //Determines if it is even or odd
            if (diamondIntInput%2 == 1) {
                //This is the odd route
                oddInput = diamondIntInput;
                String oddAsteriskCharacter = "*";
                int oddSpace = oddInput-1;
                System.out.println();

                for (int asterisk = 1 ; asterisk <= oddInput ; asterisk+=2) {
                    System.out.print(spaceCharacter.repeat(oddSpace--));
                    System.out.println(oddAsteriskCharacter.repeat(asterisk));
                }
                    //Second half of diamond after the midpoint where its # of "*"  == oddInput
                    for (int asterisk = oddInput-2 ; asterisk >= 0 ; asterisk-=2) {
                        System.out.print(spaceCharacter.repeat((2+oddSpace++)));
                        System.out.println(oddAsteriskCharacter.repeat(asterisk));
                    }

            } else {
                //This is the even the route
                evenInput = diamondIntInput;
                String evenAsteriskCharacter = "* ";
                int evenSpace = (evenInput)/2;
                int finalEvenSpace = (evenInput)/2;
                System.out.print(spaceCharacter.repeat(evenInput+1) + "*");

                for (int asterisk = 0 ; asterisk < evenInput/2 ; asterisk++) {
                        System.out.print("\n" + spaceCharacter.repeat(evenSpace*2) + evenAsteriskCharacter.repeat((asterisk+1)*2));
                        evenSpace--;
                }
                    //Second half of diamond after the midpoint where its # of "*" == evenInput
                    int space = evenInput-(evenInput-4);
                    for (int asterisk = evenInput-2 ; asterisk >= 0 ; asterisk-=2) {
                        System.out.print("\n" + spaceCharacter.repeat(space) + evenAsteriskCharacter.repeat(asterisk));
                        space+=2;
                    }
                    System.out.print("*");
            }
    }
}
