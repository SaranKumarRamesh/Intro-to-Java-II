package busesPractice;

public class AccessBus extends Bus implements Comparable<AccessBus>, Stowable {
	
	private boolean hasWheelchairLift;
	private int liftCapacity;
	

	public AccessBus(String licenceNum, boolean hasWheelchairLift, int liftCapacity) {
		super(15, 15, 12, licenceNum);
		this.hasWheelchairLift = hasWheelchairLift;
		this.liftCapacity = liftCapacity;
	}
	
	public boolean hasLift() {
		return hasWheelchairLift;
	}

	public void setHasWheelchairLift(boolean hasWheelchairLift) {
		this.hasWheelchairLift = hasWheelchairLift;
	}

	public int getLiftCapacity() {
		return liftCapacity;
	}

	public void setLiftCapacity(int liftCapacity) {
		this.liftCapacity = liftCapacity;
	}

    public int calLuggageCapacity() {
        return getBusLength() ;
    }

	@Override
	public double getTurnRadius() {
		return getBusLength();
	}

	@Override
	public String toString() {
		return "AccessBus Wheelchair Lift " + hasWheelchairLift + "and liftCapacity" + liftCapacity ;
	}

	@Override
	public boolean canStow() {
		double calculatedCapacity =  (double) (getBusLength() * 6) / getPassengerCapacity();
		return calculatedCapacity >= Stowable.MIN_LUGGAGE;
	}

	@Override
	public int compareTo(AccessBus sch) {
		return this.getPassengerCapacity() - sch.getPassengerCapacity();
	}
}
