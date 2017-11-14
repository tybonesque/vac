package vac;

import java.awt.Component;
import java.util.ArrayList;
public class Classe {

	//Attribut
		private String nom;
		private ArrayList<Eleve>lesEleves;
		
		//static 
		private static ArrayList<Eleve> btsSio = new ArrayList(); 
		
		/* methodes
		 * 
		 */
		
		//Constructeur
		public Classe( String nom){
			ArrayList<Eleve> lesEleves = ArrayList();
			this.nom = nom;
		}
		
		public Classe(){
			ArrayList<Eleve> lesEleves = ArrayList();
		}
	
		private ArrayList<Eleve> ArrayList() {
			// TODO Auto-generated method stub
			return null;
		}
		/**
		 * Ajoute un objet Eleve dans la liste btsSio
		 * @param add
		 * @return
		 */
		//ajouter
		public static String ajouterDansLaClasse(Eleve add){
			Classe a = new Classe();
			btsSio.add(btsSio.size(), add);
			return add.toString()+" a ete ajouter a la liste";
		}
		/**
		 * retourne la liste btsSio
		 */
		// afficher
		public static String afficherClasse(){
			String retour = "";
			
			//permet de verifier si la liste et vide ou non
			
			if (btsSio.size() == 0){
				retour= "la liste est vide";
			}
			else{
				for(int i =0; i<=btsSio.size()-1; i++){
					retour =" "+ retour+""+btsSio.get(i).toString()+", \n";
				}
			}
			return retour;
		}
		/**
		 * recherche un eleve dans la liste btsSio
		 * @param prenom
		 * @return
		 */
		//rehercher
		public static String rechercher(String prenom){
			String retour = "";
			if(btsSio.size() == 0){
				retour = "La classe est vide";
			}
			else{
				for(int i=0; i<btsSio.size(); i++){
					if(prenom.equals(btsSio.get(i).getPrenom())){
						retour= retour+" "+btsSio.get(i).getNom()+",\n";
					}
				}
				
			}
			if(retour == ""){
				retour = "introuvable";
			}
			return retour;
		}
		/**
		 * Supprime un eleve dans la liste btsSio
		 * @param prenom
		 * @param nom
		 * @return
		 */
		//Supprimer
		public static String supprimer(String prenom, String nom){
			String retour = prenom+" "+nom+" n'est pas dans la liste";
			int i = 0;
			while(i<btsSio.size() && (!prenom.equals(btsSio.get(i).getPrenom()) || !nom.equals(btsSio.get(i).getNom())) ){
				i++;
			}
			if(i<btsSio.size()){
				retour = btsSio.get(i).toString()+" a été supprimer";
				btsSio.remove(btsSio.get(i));
			}
			return retour;
		}
		//nbEleve
		public int nbEleve(){
			return btsSio.size();
		}
		// afficher
				public static String afficherClasse(int i){
					String retour = "";
					
					//permet de verifier si la liste et vide ou non
					
					if (btsSio.size() == 0){
						retour= "la liste est vide";
					}
					else{
						retour =" "+btsSio.get(i).toString();
					}
					return retour;
				}
}
	



