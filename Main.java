import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static double Total = 0;

    public static void main(String[] args) {

        boolean Falcon = true;

        while (Falcon){

            Decider();
            System.out.println("Do you want to process: ");
            String Calculate = scan.next();

            if(Calculate.equals("Y")){
                Falcon =true;
            }
            else {
                Falcon = false;
            }
        }

    }

    public static void Decider(){
        System.out.println("Orders: \n 1- Add \n 2-Divide \n 3- Mines \n 4- Multiply \n 5 Mod \n 6 Squere and Area \n 7 Power \n 8 Factorial");


        int ant = scan.nextInt();


        switch (ant){

            case 1:
                SumOf();
                break;
            case 2:
                Divider();
                break;

            case 3:
                Mines();
                break;

            case 4:
                Multiplication();
                break;

            case 5:
                Mod();
                break;

            case 6:
                SquereAndArea();
                break;

            case 7:
                Power();
                break;

            case 8:
                Factorial();
                break;

        }
    }

    public static void SumOf(){
        double Second = scan.nextDouble();
        System.out.println("Second number for sum: ");
        double First = scan.nextDouble();

        Total += First+Second;

        System.out.println("Sum of two numbers is: "+ Total);
    }

    public static void Divider(){
        System.out.println("Enter the divided");
        double Dividend = scan.nextDouble();
        System.out.println("Please enter the divider: ");
        double SecondDivisor = scan.nextDouble();

        if(Dividend<SecondDivisor){
            System.out.println("The division is equal to 0");
        }
        else {
            System.out.println("The division is equal to "+ Dividend/SecondDivisor);
        }

    }

    public static void Mines(){
        System.out.println("Enter the Minuend: ");
        int ae = scan.nextInt();

        System.out.println("Subtrahend: ");

        int be = scan.nextInt();

        int total = ae-be;

        System.out.println("The Difference is : "+ total);


    }

    public static void Multiplication(){
        System.out.println("Enter the number for multiplicand: ");
        int aka = scan.nextInt();

        System.out.println("Enter the number for multiplier: ");
        int delta = scan.nextInt();
        int Product = aka*delta;

        System.out.println("The product is: " +Product);
    }

    public static void Mod(){
        System.out.println("First number to be moded: ");
        double Argument = scan.nextDouble();
        System.out.println("Second Number to be moded: ");
        double Answer = scan.nextDouble();

        double total = Argument%Answer;

        System.out.println("The result is equal t: "+ Total);
    }

    public static void SquereAndArea(){
        System.out.println(" One side of the rectangle: ");
        int FirstSide = scan.nextInt();
        System.out.println(" Second side of the rectangle: ");
        int SecondSide = scan.nextInt();

        int Totalarirty = FirstSide*SecondSide;

        int TotalSquare = 2*FirstSide+2*SecondSide;

        System.out.println("The Are is equal to: "+ Totalarirty);
        System.out.println("The Squere is totally equal to: "+ TotalSquare);
    }

    public static void Power(){

        System.out.println("The number to be power: ");
        int power = scan.nextInt();

        System.out.println("The power amount:");

        int Amount = scan.nextInt();

        int Gelgo = power;

        for(int data = 0; data<Amount;data++){
            power*=Gelgo;
        }
        System.out.println("The result is equal to "+ power);
    }

    public static void Factorial(){
        System.out.println("The number for factorial calculation");
        int Factorial = scan.nextInt();

        int Result =1;

        System.out.println("The number for factorial amount: ");
        int FactorialAmount = scan.nextInt();

        if(FactorialAmount>0 && Factorial>0){
            for(int i = 1; i<FactorialAmount; i++){
                Result =  Factorial*(Factorial-1);
                Factorial--;
            }
            System.out.println("Result is:"+ Result);

        }



    }

}