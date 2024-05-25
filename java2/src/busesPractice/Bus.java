package busesPractice;

public abstract class Bus {
	
	private int sizeEngine;
	private int busLength;
	private int passengerCapacity;
	private String licenceNum;
	
	public Bus(String licenceNum) {
		this.licenceNum = licenceNum;
		this.passengerCapacity = 20;
	}

	public Bus(int sizeEngine, int busLength, int passengerCapacity, String licenceNum) {
		this.sizeEngine = sizeEngine;
		this.busLength = busLength;
		this.passengerCapacity = passengerCapacity;
		this.licenceNum = licenceNum;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	
	public abstract double getTurnRadius(); 
	
	public int getSizeEngine() {
		return sizeEngine;
	}

	public int getBusLength() {
		return busLength;
	}
	
	public boolean equals( Bus obj1) {
        return this.licenceNum.equals(obj1.licenceNum);
    }
	
	@Override
    public String toString() {
        return licenceNum + " | " + sizeEngine + " | " + passengerCapacity;
    }
	
}
