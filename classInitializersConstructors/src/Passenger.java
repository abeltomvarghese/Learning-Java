public class Passenger {
    private int freeBags;
    private int checkedBags;
    private double perBagFee;

    public Passenger(int freeBags) {        //THIS CONSTRUCTOR WILL CALL THE THIRD CONSTRUCTOR
        this(freeBags > 1 ? 25.0d:50.0d);   //LAMBDA FUNCTION FOR AN IF STATEMENT
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);         //THIS WILL CALL THE FIRST CONSTRUCTOR
        this.checkedBags = checkedBags;
    }

    /* private constructor only allowed to be called
    * from within the class  */
    private Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }
}
