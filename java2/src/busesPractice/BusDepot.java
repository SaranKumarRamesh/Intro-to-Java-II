package busesPractice;

import java.util.ArrayList;

public class BusDepot {

    private int turnAroundSize;

	private int maxPassengers;
	
    private ArrayList<Bus> busParking;

    public BusDepot(int turnAroundSize, int maxPassenger) {
        this.turnAroundSize = turnAroundSize;
        this.maxPassengers = maxPassenger;
        this.busParking = new ArrayList<>();
    }

    public boolean canEnter(Bus bus) {
        double busTurnRadius = bus.getTurnRadius();
        return turnAroundSize > busTurnRadius && bus.getPassengerCapacity() <= this.maxPassengers;
    }

    public boolean addBus(Bus bus) {
        if (canEnter(bus)) {
            return busParking.add(bus);
        }
        return false;
    }

    public ArrayList<Bus> getBusList() {
        return busParking;
    }
    
    public int getTurnSize() {
		return turnAroundSize;
	}

	@Override
	public String toString() {
		return "BusDepot turnAroundSize = " + turnAroundSize + ", maxPassengers = " + maxPassengers + ", busParking = "
				+ busParking;
	}

    // Below is there just for practice all empty data
    public int getMaxPassengers() {
        return 0;
    }
}
