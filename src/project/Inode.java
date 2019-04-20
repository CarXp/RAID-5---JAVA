package project;

public class Inode extends Raid_defines {
	
	private String filename[] = new String [FILENAME_MAX_SIZE];	// dont '\0'
	private int size;	// taille du fichier en octets
	private int nblock;	// nblock du fichier = (size+BLOCK_SIZE-1)/BLOCK_SIZE ?
	private int first_byte;	//  start block number on the virtual disk
	
	
	/**Constructeur de class Inode
	 * 
	 * @param filename
	 * @param size
	 * @param nblock
	 * @param first_byte
	 */
	public Inode(String[] filename, int size, int nblock, int first_byte) {
		this.filename = filename;
		this.size = size;
		this.nblock = nblock;
		this.first_byte = first_byte;
	}
	
	public int get_size() {
		return this.size;
	}
	
	public int get_nblock() {
		return this.nblock;
	}
	
	public int get_first_byte() {
		return this.first_byte;
	}
}
