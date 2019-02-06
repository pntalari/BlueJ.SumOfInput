import java.util.Scanner;

public class Main {
//    instance Variables
    static int input;
    static int result;
    static int output;
    public static void main(String[] args)
    {
        Main calc = new Main();
        input = calc.getInput();
        output = calc.sumNums(input);
        System.out.println("The sum of numbers is: " + output);
        
    }
    //get input from the user
    public static int getInput()
    {
        Scanner read = new Scanner(System.in);
        System.out.println("Please input a number");
        return input = read.nextInt();
    }
    //calcualte the summation and return the result
    public int sumNums(int input)
    {
        int[] arr = new int[input+1];
       for (int i=0; i <= input; i++)
       {
          arr[i] = i;
          result = result + arr[i];
       //   System.out.println("array:" + result + arr[i]);
       }
        //System.out.println("The result is: " + result);
        return result; 
    }
}
