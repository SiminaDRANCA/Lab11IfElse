public class LogicalOp {
    public int checkBiggerNumber(int first, int second) {

        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String textComparison(String textInput){
        if(textInput.equals("FastTrackIT")){
            return "Learning text comparison";
        }else {
            return "Got to try some more";
        }
    }
    //Ex 6 snow
    public String snowFall(int snow){
        if (snow>8 || snow==6){

            return "The amount of snow this winter was " + snow;

        } else {
            return "The forecast snow is (cm) " + snow;}

    }

    //Ex. 7
    public String biggerEqualSmaller(int number) {

        if (number > 3 && number != 4){
            System.out.println("The number " + number + " is bigger than 3 and not equal to 4");
        } else if (number == 4) {
                System.out.println("The number " + number + " is equal to 4");
            } else if (number < 3) {
                System.out.println("The number " + number + " is smaller than 3");
            }
        return "!";}

    public int SwitchCase (int numberInput) {
    switch (numberInput) {
        case 1:
        System.out.println("Showing number: 1");
        break;
        case 2:
            System.out.println("Showing number: 2");
            break;
        case 3:
            System.out.println("Showing number: 3");
            break;
        case 4:
            System.out.println("Showing number: 4");
            break;
        case 5:
            System.out.println("Showing number: 5");
            break;
        case 6:
            System.out.println("Showing number: 6");
            break;
        case 7:
            System.out.println("Showing number: 7");
            break;
        case 8:
            System.out.println("Showing number: 8");
            break;
        case 9:
            System.out.println("Showing number: 9");
            break;

        default:
            System.out.println("Invalid input - Wrong number.");
            break;
    }
    return numberInput;

    }
/* 9. Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar,
 si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false.
  Apelati metoda in main() pentru a verifica daca functioneaza.
 */
    public boolean isNumberEven(int myNumber) {
        if (myNumber % 2 == 0) {
            return true;
        } else {
           return false; }
    }
   // 10. Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,
    // care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
    // Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

     public boolean isEligibleToVote(int age) {
        if (age < 18) {
            return false;
        }else {
            return true;
        }
     }
//11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public int biggestNumber(int first, int second, int third) {
        if (first >= second && first >= third) {
            return first;
        } else if (second >= first && second >= third) {
            return second;
        }else{
            return third;
        }
    }
    }

