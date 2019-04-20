package project;

public class Virtual_disk extends Raid_defines {

	private int number_of_files;
	private int ndisk;
	private Super_block super_block[] = new Super_block[SUPER_BLOCK_SIZE];
	private Inode_table inode[] = new Inode_table [INODE_SIZE];	// tableau
	private File storage[] = new File [ndisk];	// tab[number_of_disks]
	
	
	/**Constructeur de class Virtual disk
	 * 
	 * @param number_of_files
	 * @param ndisk
	 * @param super_block
	 * @param inode
	 * @param storage
	 */
	public Virtual_disk(int number_of_files, int ndisk, Super_block[] super_block, Inode_table[] inode,
			File[] storage) {
		this.number_of_files = number_of_files;
		this.ndisk = ndisk;
		this.super_block = super_block;
		this.inode = inode;
		this.storage = storage;
	}
	
	public int get_number_of_files() {
		return this.number_of_files;
	}
	
	public int get_ndisk() {
		return this.ndisk;
	}
	
}
