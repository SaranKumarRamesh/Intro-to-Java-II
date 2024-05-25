package dragonGame;

public abstract class Dragon {

	private double nAttackRank;
	private int nDefenseRank;
	private double nHitPoints;
	private int nInitiative;
	private DragonSize nSize;
	
	private String sName;

	public Dragon(DragonSize nSize) {
        this.nSize = nSize;
        switch (nSize) {
            case Small:
                nHitPoints = (int) (Math.random() * 20) + 51; 
                nAttackRank = (int) (Math.random() * 15) + 36; 
                nDefenseRank = (int) (Math.random() * 10) + 10; 
                nInitiative = (int) (Math.random() * 21) + 40; 
                break;
            case Medium:
                nHitPoints = (int) (Math.random() * 15) + 71; 
                nAttackRank = (int) (Math.random() * 10) + 51; 
                nDefenseRank = (int) (Math.random() * 10) + 20; 
                nInitiative = (int) (Math.random() * 21) + 20; 
                break;
            case Large:
                nHitPoints= (int) (Math.random() * 15) + 86; 
                nAttackRank = (int) (Math.random() * 10) + 61; 
                nDefenseRank = (int) (Math.random() * 6) + 29; 
                nInitiative = (int) (Math.random() * 11) + 0;
                break;
        }
    }

	public int getInitiative() {
		return nInitiative;
	}

	public double getAttack() {
		return nAttackRank;
	}

	public int getDefense() {
		return nDefenseRank;
	}
	
	public void changeAttackRankForColor( double changeRate) {
		this.nAttackRank = this.nAttackRank * changeRate ;
	}

	public double getnHitPoints() {
		return nHitPoints;
	}
	
	public void setnHitPoints(double nHitPoints) {
		this.nHitPoints = nHitPoints;
	}

	public DragonSize getSize() {
		return nSize;
	}

	public boolean isDead() {
		return nHitPoints <= 0;
	}
	
	public int getNumAttacksPerTurn() {
		switch (nSize) {
        	case Small: return 3;
        	case Medium: return 2;
        	case Large : return 1;
        	default : return 0;
		}
	}
	
	public void resurrect( ) {
		switch (nSize) {
        case Small:
            nHitPoints = (int) (Math.random() * 20) + 51;
            break;
        case Medium:
            nHitPoints = (int) (Math.random() * 15) + 71; 
            break;
        case Large:
            nHitPoints = (int) (Math.random() * 15) + 86;
            break;
        default :
        	nHitPoints = 0;
        	break;
		}
	}

	@Override
	public String toString() {
		return "Dragon Attack rating = " + nAttackRank + ", Defense rating = " + nDefenseRank + ", HitPoints rating = " + nHitPoints
				+ ", Initiative rating = " + nInitiative + ", Size is =" + nSize;
	}
	
	public abstract void defendAttack(Dragon obOther);
	
	public String getsName() {
		return sName;
	}
}
