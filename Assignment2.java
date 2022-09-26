import java.util.Scanner;
import java.util.*;

public class Assignment2
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Integer diamondInt;
		int odd, even;
		String space = " ";


		//Determines if the input is positive. If it is negative, new input is required to continue
		do
		{
		System.out.println("Please enter a positive integer:");
		diamondInt = input.nextInt();
		}
		while (diamondInt<0);

			//Determines if it is even or odd
			if (diamondInt%2==1)
			{
				odd = diamondInt;
				String odd_asterisk = "*";
				System.out.println();
					for(int i=0; i<(odd+1)/2;i++)
					{
						// for(int j=0;j<odd/2;j++){

						// System.out.println("b");
						// }
					}

            //Else is the other route for even
			}else
                {
                    even = diamondInt;
                    String evenAsterisk = "* ";
                    System.out.println(space.repeat(even+1)+"*");
                        for(int i=0,j=even/2 ; i<(even)/2 ; i++,j--)
                        {
                        System.out.println((space.repeat(j*2)) + evenAsterisk.repeat((i+1)*2));
                        }
                            for(int m=even-2,n=even-(even-4); m>=0 ; m-=2,n+=2)
                            {
                            System.out.println((space.repeat(n)) + evenAsterisk.repeat(m));
                            }
                            System.out.print(space.repeat(even+1)+"*");
                }

	}
}














        // for(int k=even/2,l=0; k<(even)/2;k--,l++){
		// 	System.out.println((space.repeat(l)) + even_asterisk.repeat((k+1)*2));
		// 	}



// for (int i=0; i < diamondInt; i++){
		// 	for (int k = 0; k < diamondInt-1-i/2; i++){
		// 		System.out.println("*");
		//     }
		// }

