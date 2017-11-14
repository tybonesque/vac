package vac;
import java.io.*;
import java.util.ArrayList;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fenetre maFenetre = new Fenetre();
		
		Eleve unEleve = new Eleve("Antoine","DUPONT");
		Eleve unEleve1 = new Eleve("Stan","STAN-NOM");
		Eleve unEleve2 = new Eleve("vig","Pundai");
		ArrayList<Eleve>eleve = new ArrayList<Eleve>();
		eleve.add(unEleve);
		eleve.add(unEleve1);
		eleve.add(unEleve2);
		try{
			FileOutputStream fichier = new FileOutputStream("eleveCollec.obj");
			ObjectOutputStream s = new ObjectOutputStream(fichier);
			s.writeObject(eleve);
			s.flush();
			s.close();
			
		}
		catch(IOException e){
			System.out.println("Probleme IO");
		}
	}
}

