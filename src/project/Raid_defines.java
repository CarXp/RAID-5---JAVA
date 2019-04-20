package project;

public class Raid_defines {

	public final int BLOCK_SIZE = 4; // octets
	public final int FILENAME_MAX_SIZE = 32; // caractrères
	public final int MAX_FILE_SIZE = (50*1024); // uchar
	public final int INODE_TABLE_SIZE = 10; // taille fixe = nb max fichiers
	public final int MAX_MSG = 1024; // uchar
	public final int SUPER_BLOCK_SIZE = 4; // nb blocs avec parité
	public final int INODES_START = SUPER_BLOCK_SIZE*BLOCK_SIZE+1; // en octets
	public final int INODE_SIZE = 11; // en blocs avec parité
	
	enum raid {ZERO,UN,CINQ,ZERO_UN,UN_ZERO,CINQUANTE,CENT};
	
}
