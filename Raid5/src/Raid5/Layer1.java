package Raid5;
import java.util.Scanner;
import java.util.*;
import java.io.File;
//pour lecture dans fichier
import java.io.FileInputStream;
//pour �criture dans fichier
import java.io.FileOutputStream;

public class Layer1 {
	
	int disk[] = {1,2,3,4};
	int nbFile = 4;
	
	//scanf du r�pertoire
	Scanner scan = new Scanner(System.in);
	String nomRepertoire = scan.nextLine();
	
	//fichiers
	
	
	/**
	 * constructeur layer 1
	 */
	public Layer1(int[] disk, int nbFile, String nomRepertoire) {
		this.disk = disk;
		this.nbFile = nbFile;
		this.nomRepertoire = nomRepertoire;
	}
	
	/* fonction init_disk_raid5 qui initialise le systeme raid5 � son ouverture */
	public void init_disk_raid5(String nomRepertoire) {
		for(int i=0; i<nbFile; i++) {
			//cr�ation des fichiers � faire
			
			//affichage ouverture
			System.out.println("../RAID5/d"+i);
		}
	}
	
	/* fonction fermeture_systeme_raid5 qui ferme le systeme: v�rification pour �viter les pertes + fermeture des fichiers */
	public void fermeture_systeme_raid5() {
		System.out.println("-- Fermeture du systeme ...");
		for (int i=0; i<nbFile; i++) {
			//fermeture des fichiers � faire
			
			//affichage fermeture
			System.out.println("Disque "+ i +" �teint");
		}
		System.out.println("--Fermeture effectu�e.");
	}
	
}
