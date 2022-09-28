import java.util.Scanner;

public class Assignment2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Integer diamondInt;
        int odd, even;
        String space = " ";

        //Determines if the input is positive. If it is negative, new input is required to continue
        do{
        System.out.println("Please enter a positive integer:");
        diamondInt = input.nextInt();
        }
        while (diamondInt<0);
            //Determines if it is even or odd
            if (diamondInt%2==1){
                //This is the odd route
                odd = diamondInt;
                String odd_asterisk = "*";
                System.out.println();

                    for(int i=0, j=odd; i<=odd; i+=2, j--){
                    System.out.println(space.repeat(j)+odd_asterisk.repeat(i+1));
                    }
                        //Second Half of diamond after the Middle section where # of "*" = odd
                        for(int m=odd-2, n=odd-1*(odd-(odd/2))+2; m>=0;m-=2){
                        System.out.println(space.repeat(n++)+odd_asterisk.repeat(m));
                        }
            }
            else{
                //This is the even the route
                even = diamondInt;
                String evenAsterisk = "* ";
                System.out.println(space.repeat(even+1)+"*");
                    for(int i=0,j=even/2 ; i<(even)/2 ; i++,j--){
                    System.out.println((space.repeat(j*2)) + evenAsterisk.repeat((i+1)*2));
                    }
                        //Second Half of diamond after the Middle section where # of "*" = even
                        for(int m=even-2,n=even-(even-4); m>=0 ; m-=2,n+=2){
                        System.out.println((space.repeat(n)) + evenAsterisk.repeat(m));
                        }
                        // "\\033[F is the escape sequence to go back up a line, to add the last point of the diamond"
                        System.out.print("\033[F" + space.repeat(even+1) + "*");
            }
    }
}
