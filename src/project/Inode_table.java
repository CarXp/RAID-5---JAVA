package project;

public class Inode_table extends Raid_defines {
	
	private String inode_table[] = new String [INODE_TABLE_SIZE]; // la taille du tableau est fixe

	
	/**Constructeur de class Inode_table
	 * 
	 * @param inode_table
	 */
	public Inode_table(String[] inode_table) {
		this.inode_table = inode_table;
	}
	
}
