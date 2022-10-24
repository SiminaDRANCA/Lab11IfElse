public class LogicalOp {
    public int checkBiggerNumber(int first, int second) {

        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String isTextTheSame(String first1, String second2){
    String first1 = "FastTrackBT";
    String second2 = "FastTrackIT";

           if ( first1.equals(second2) ) {
        System.out.println("Learning text equivalence");
    } else if ( !first1.equals(second2) ){
       System.out.println("Got to try some more");}
    }
}