// Utility class to package two values
// Designed to work with searching examples
//
// David John
// October 2020

public class TwoValues {

    private int steps;
    private boolean found;

    public TwoValues (int mysteps, boolean myfound){
        steps = mysteps;
        found = myfound;
    }

    public int getSteps() {
        return steps;
    }

    public boolean isFound() {
        return found;
    }
}
