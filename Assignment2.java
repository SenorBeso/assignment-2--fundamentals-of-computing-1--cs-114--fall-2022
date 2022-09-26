import java.util.Scanner;
import java.util.*;

public class Assignment2 {
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		Integer diamondInt;

	while (true) {
		System.out.println("Please enter a positive integer:");
			diamondInt = input.nextInt();
			    if (diamondInt < 0){
			    System.out.println("Try again");
			    continue;
			}

            break;
        }

		for (int i=0; i < diamondInt; i++){
			for (int k = 0; k < diamondInt-1-i/2; i++){
				System.out.println("*");
            }
    	}



	}
	}

