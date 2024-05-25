package busesPractice;

import java.util.ArrayList;

public class GreyhoundBus extends Bus implements Comparable<GreyhoundBus>, Stowable{
	
	private ArrayList<featureType> entertainmentFeatures;;
	
	public GreyhoundBus( String licenceNum, ArrayList<featureType> entertainmentFeatures ) {
		super(50,50,50,licenceNum);
		this.entertainmentFeatures = entertainmentFeatures;
	}
	
	public ArrayList<featureType> getFeatures() {
		return entertainmentFeatures;
	}
	
	public boolean removeFeatures(featureType feature) {
		return entertainmentFeatures.remove(feature);
	}
	
	public boolean addFeatures(featureType feature) {
		return entertainmentFeatures.add(feature);
	}
	
    public int calLuggageCapacity() {
        return getBusLength() * 6;
    }
    
    @Override
    public String toString() {
        return " Entertainment features " + entertainmentFeatures;
    }
	

	@Override
	public double getTurnRadius() {
		return getBusLength() * 2;
	}

	@Override
	public boolean canStow() {
		double calculatedCapacity =  (double) (getBusLength() * 6) / getPassengerCapacity();
		return calculatedCapacity >= Stowable.MIN_LUGGAGE;
	}

	@Override
	public int compareTo(GreyhoundBus ghb) {
		return this.getPassengerCapacity() - ghb.getPassengerCapacity();
	}

}
