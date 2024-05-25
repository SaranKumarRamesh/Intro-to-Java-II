package busesPractice;

public interface Stowable {
    int MIN_LUGGAGE = 2;
        // The following required method will return true if a
        // bus's luggage capacity per passenger is calculated to
        // be greater than or equal to the above constant.
    boolean canStow();
}
