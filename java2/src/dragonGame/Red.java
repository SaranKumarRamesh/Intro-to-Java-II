package dragonGame;

public class Red extends Dragon{
	
	private String sName;

	public Red(String sName, DragonSize nSize) {
		super(nSize);
		this.sName = sName;
	}

	@Override
	public void defendAttack(Dragon obOther) {

		DragonSize currDragonSize = getSize();
		
		switch (currDragonSize) {
        case Small:
        	if(((int) (Math.random() * 101)) > 30) {
        		double hitPointsDamage = (double) obOther.getAttack() - (double) this.getDefense();
        		if (this.isDead()) {
        			
        		} else {
        			setnHitPoints(this.getnHitPoints() - hitPointsDamage);
        		}
        	}
            break;
        case Medium:
        	if(((int) (Math.random() * 101)) > 20) {
        		double hitPointsDamage = (double) obOther.getAttack() - (double) this.getDefense();
        		if (this.isDead()) {
        			
        		} else {
        			setnHitPoints(this.getnHitPoints() - hitPointsDamage);
        		}
        	}
            break;
        case Large:
        	double hitPointsDamage = (double) obOther.getAttack() - (double) this.getDefense();
        	if (this.isDead()) {
    			
    		} else {
    			setnHitPoints(this.getnHitPoints() - hitPointsDamage);
    		}
            break;
		}
	}
	
	@Override
	public String toString() {
		return "The name of Red is " + this.sName ;
	}
}
