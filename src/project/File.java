package project;

public class File extends Raid_defines {

	private int file_size;	// size of file in bytes
	private String data[] = new String [MAX_FILE_SIZE];	// only text files
	
	
	/**Constructeur de class File
	 * 
	 * @param size
	 * @param data
	 */
	public File(int size, String[] data) {
		this.file_size = size;
		this.data = data;
	}
	
	public int get_file_size() {
		return this.file_size;
	}
	
}
