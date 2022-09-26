import java.util.Scanner;
import java.util.*;

public class Assignment2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Integer diamondInt;
		int odd, even;
		String even_asterisk = "* ";
		String odd_asterisk = "*";
		String space = " ";
		//Determines if the input is positive. If it is negative, new input is required to continue
		do{
		System.out.println("Please enter a positive integer:");
		diamondInt = input.nextInt();
		}
		while (diamondInt<0);

		//Determines if it is even or odd
		if (diamondInt%2==1){
            odd = diamondInt;

            System.out.println();
                for(int i=0; i<(odd+1)/2;i++){






					// for(int j=0;j<odd/2;j++){
						// System.out.println("b");
						// }
				}
				// for(int k=0;k<(odd/2);k++){
				// 	System.out.println("*");
				// 	System.out.println("*");
				// 		for(int l=0;l<k;l++){
				// 			System.out.println("s");
				// 			System.out.println("*");
				// 		}
				// }


        //Else is the other route for even

		} 	else{
            even = diamondInt;
			System.out.println(space.repeat(even+1)+"*");
				for(int i=0,j=even/2; i<(even)/2;i++,j--){
				System.out.println((space.repeat(j*2)) + even_asterisk.repeat((i+1)*2));

        		// for(int k=even/2,l=0; k<(even)/2;k--,l++){
				// 	System.out.println((space.repeat(l)) + even_asterisk.repeat((k+1)*2));
				// 	}
				}



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

