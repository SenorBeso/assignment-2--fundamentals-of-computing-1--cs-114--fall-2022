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
                String oddAsterisk = "*";
                System.out.println();

                for (int asterisk = 0, oddSpace = oddInput ; asterisk <= oddInput ; asterisk+=2, oddSpace--) {
                    System.out.println(spaceCharacter.repeat(oddSpace)+oddAsterisk.repeat(asterisk+1));
                }

                //Second Half of diamond after the Middle section where # of "*" = odd
                for (int asteriskSecondHalf = oddInput-2, spaceSecondHalf = oddInput-1*(oddInput - (oddInput/2))+2 ; asteriskSecondHalf >= 0
                ; asteriskSecondHalf-=2) {
                    System.out.println(spaceCharacter.repeat(spaceSecondHalf++)+oddAsterisk.repeat(asteriskSecondHalf));
                }
            } else {
                //This is the even the route
                evenInput = diamondIntInput;
                String evenAsteriskCharacter = "* ";
                System.out.println(spaceCharacter.repeat(evenInput+1) + "*");

                for (int asterisk = 0, evenSpace = evenInput/2 ; asterisk < (evenInput)/2 ; asterisk++,evenSpace--) {
                        System.out.println((spaceCharacter.repeat(evenSpace*2)) + evenAsteriskCharacter.repeat((asterisk+1)*2));
                    }
                        //Second Half of diamond after the Middle section where # of "*" = even
                        for (int asteriskSecondHalf = evenInput-2, spaceSecondHalf = evenInput-(evenInput-4) ; asteriskSecondHalf >= 0
                        ; asteriskSecondHalf-=2, spaceSecondHalf+=2) {
                            System.out.println((spaceCharacter.repeat(spaceSecondHalf)) + evenAsteriskCharacter.repeat(asteriskSecondHalf));
                        }
                        System.out.print(spaceCharacter.repeat(evenInput+1) + "*");
            }
    }
}
