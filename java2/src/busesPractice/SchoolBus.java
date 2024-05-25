package busesPractice;

public class SchoolBus extends Bus implements Comparable<SchoolBus>, Stowable{
	
	private boolean stopArmInstalled;
	
	public SchoolBus(String licenceNum, boolean stopArmInstalled) {
		super(25,25,20,licenceNum);
		this.stopArmInstalled = stopArmInstalled;
	}
	
	public boolean isArmInstalled() {
		return stopArmInstalled;
	}

	public void setArmInstalled() {
		stopArmInstalled = true;
	}
	

    public int calLuggageCapacity() {
        return getBusLength() * 3;
    }

	@Override
	public double getTurnRadius() {
		return super.getBusLength() + 20;
	}
	
	@Override
    public String toString() {
        return " Is stop arm installed " + stopArmInstalled;
    }

	@Override
	public boolean canStow() {
		double calculatedCapacity =  (double) (getBusLength() * 3) / getPassengerCapacity();
		return calculatedCapacity >= Stowable.MIN_LUGGAGE;
	}
	@Override
	public int compareTo(SchoolBus sch) {
		return this.getPassengerCapacity() - sch.getPassengerCapacity();
	}
}
