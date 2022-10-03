import java.util.Scanner;

public class Assignment2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Integer diamondInteger;
        int oddInput, evenInput;
        String space = " ";

        //Determines if the input is positive. If it is negative, new input is required to continue
        do{
        System.out.println("Please enter a positive integer:");
        diamondInteger = input.nextInt();
        }
        while (diamondInteger<0);
            //Determines if it is even or odd
            if (diamondInteger%2==1){
                //This is the odd route
                oddInput = diamondInteger;
                String oddAsterisk = "*";
                System.out.println();
                    for(int i = oddInput; i<=oddInput; i--){
                        System.out.print(space.repeat(i));
                        System.out.print("*");

                    }
                    // for(int i=0, j=oddInput; i<=oddInput; i+=2, j--){
                    // System.out.println(space.repeat(j)+oddAsterisk.repeat(i+1));
                    // }
                    //     //Second Half of diamond after the Middle section where # of "*" = odd
                    //     for(int m=oddInput-2, n=oddInput-1*(oddInput-(oddInput/2))+2; m>=0;m-=2){
                    //     System.out.println(space.repeat(n++)+oddAsterisk.repeat(m));
                    //     }
            }else{
                //This is the even the route
                evenInput = diamondInteger;
                String evenAsterisk = "* ";
                System.out.println(space.repeat(evenInput+1)+"*");
                    for(int i=0,j=evenInput/2 ; i<(evenInput)/2 ; i++,j--){
                    System.out.println((space.repeat(j*2)) + evenAsterisk.repeat((i+1)*2));
                    }
                        //Second Half of diamond after the Middle section where # of "*" = even
                        for(int m=evenInput-2,n=evenInput-(evenInput-4); m>=0 ; m-=2,n+=2){
                        System.out.println((space.repeat(n)) + evenAsterisk.repeat(m));
                        }
                        System.out.println(space.repeat(evenInput) + "*");
            }
    }
}
