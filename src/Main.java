public class Main {
    public static void main(String[] args) {
        double x = 601.02;
        double y = 120;
        int xx = 12;
        int yy = 24;


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
        int biggest = myOPResult.checkBiggerNumber(xx, yy);
        System.out.println("The bigger number is " + biggest);

        //text comparison Ex. 5 tema
    String isItNow = "FastTrackIT";
    System.out.println(myOPResult.textComparison(isItNow));

     //snow fall Ex 6 tema

        System.out.println(myOPResult.snowFall(13));

    //number equivalence Ex 7
        System.out.println(myOPResult.biggerEqualSmaller(10));

//Showing number Ex. 8 tema
        System.out.println(myOPResult.SwitchCase(11));

        //isNumberEven Ex. 9 tema
        System.out.println(myOPResult.isNumberEven(11));

        // isEligibleToVote Ex 10 tema
        System.out.println(myOPResult.isEligibleToVote(11));

        //biggest number out of given 3 ex 11 tema
        System.out.println(myOPResult.biggestNumber(33, 18, 17));

    }


}

