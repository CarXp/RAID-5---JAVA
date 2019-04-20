package project;

public class Super_block extends Raid_defines {

	private int nb_blocks_used;
	private int first_free_byte;		// premier octet libre
	
	
	/**Constructeur de class Super_block
	 * 
	 * @param nb_blocks_used
	 * @param first_free_byte
	 */
	public Super_block(int nb_blocks_used, int first_free_byte) {
		super();
		this.nb_blocks_used = nb_blocks_used;
		this.first_free_byte = first_free_byte;
	}
	
	public int get_nb_blocks_used() {
		return this.nb_blocks_used;
	}
	
	public int get_first_free_byte() {
		return this.first_free_byte;
	}
	
}
