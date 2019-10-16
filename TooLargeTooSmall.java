
/**
 * Write a description of class TooLargeTooSmall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }

    public Integer guess(Integer g) {
        if (g < chosenNum){
            chosenNum = -1;
        }else if (g > chosenNum){
            chosenNum = 1; 
        }else { chosenNum = 0;
        }
        return chosenNum;
    }

}