public class Main {
    public static void main(String[] args) {
        double x = 601.02;
        double y = 120;
        int xx = 12;
        int yy = 24;
        String myString = "FastTrackIT";
        String myString2 = "girl, please";


        //object creating (an instance of Calculator class)
        Calculator sum = new Calculator();
        //method calling
        double mySum = sum.addition(x,y);
        System.out.println("sum is " +mySum);


        //object creating (an instance of Calculator class)
        Calculator myResult = new Calculator();
        //method calling
        double myDifference = myResult.substraction(x,y);
        System.out.println("differece is " + myDifference);


        double myProduct = myResult.multiplication(x,y);
        System.out.println("product is " + myProduct);

        double myQuotient = myResult.division(x,y);
        System.out.println("quotient is " + myQuotient);


        double myReminder = myResult.modulo(x, y);
        System.out.println("modulo is " + myReminder);

        LogicalOp myOPResult = new LogicalOp();
        int biggest = myOPResult.checkBiggerNumber(xx,yy);
        System.out.println("The bigger number is " + myOPResult );

    String isItNow = myOPResult.isTextTheSame(myString, myString2);
    System.out.println(myOPResult);
    }
}