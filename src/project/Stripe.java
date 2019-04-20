package project;

public class Stripe extends Raid_defines {

	// inclut le block de parit�
	private int nblocks; // egal � NB_DISK : un bloc par disque
	private Block stripe[] = new Block [nblocks];
	
	
	/**Constructeur de class Stripe
	 * 
	 * @param nblocks
	 * @param stripe
	 */
	public Stripe(int nblocks, Block[] stripe) {
		this.nblocks = nblocks;
		this.stripe = stripe;
	}
	
	public int get_nblocks() {
		return this.nblocks;
	}
}
