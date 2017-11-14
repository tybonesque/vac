package vac;
import java.io.*;
import java.util.ArrayList;
public class Principale2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fenetre maFenetre = new Fenetre();
		/*try {
			FileInputStream fichier = new FileInputStream("eleve.obj");
			ObjectInputStream flux = new ObjectInputStream(fichier);
			Eleve uneEleve = (Eleve) flux.readObject();
			Eleve uneEleve2 = (Eleve) flux.readObject();
			Eleve uneEleve3 = (Eleve) flux.readObject();
			System.out.println(uneEleve.toString());
			System.out.println(uneEleve2.toString());
			System.out.println(uneEleve3.toString());
		}
		catch (IOException erreur) {
			System.out.println("erreur IO");
		}
		catch (ClassNotFoundException erreur) {
			System.out.println("erreur de classe");
		}*/
		try {
			FileInputStream fichier = new FileInputStream("eleveCollec.obj");
			ObjectInputStream flux = new ObjectInputStream(fichier);
			ArrayList<Eleve>eleve = new ArrayList<Eleve>();
			eleve = (ArrayList<Eleve>) flux.readObject();
			for (int i = 0; i < eleve.size(); i++){
				System.out.println(eleve.get(i).toString());
			}
		}
		catch (IOException erreur) {
			System.out.println("erreur IO");
		}
		catch (ClassNotFoundException erreur) {
			System.out.println("erreur de classe");
		}
	}

}
