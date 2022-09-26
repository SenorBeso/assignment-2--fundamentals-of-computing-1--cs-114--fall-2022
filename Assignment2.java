import java.util.Scanner;
import java.util.*;

public class Assignment2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Integer diamondInt;
		int odd, even;

		//Determines if the input is positive. If it is negative, new input is required to continue
		do{
		System.out.println("Please enter a positive integer:");
		diamondInt = input.nextInt();
		}
		while (diamondInt<0);

		//Determines if it is even or odd
		if (diamondInt%2==1){
            odd = diamondInt;
            System.out.println("\n" + odd);
                for(int i=0; i<odd;i++){
                    System.out.println("*");
                }
        //Else is the other route for even

		} else{
            even = diamondInt;
            System.out.println("\n" + even);
        }



	}
}




















	// while (true) {
	// 	System.out.println("Please enter a positive integer:");
	// 		diamondInt = input.nextInt();
	// 		    if (diamondInt < 0){
	// 		    System.out.println("Try again");
	// 		    continue;
	// 		}

	//         break;


// for (int i=0; i < diamondInt; i++){
		// 	for (int k = 0; k < diamondInt-1-i/2; i++){
		// 		System.out.println("*");
		//     }
		// }

