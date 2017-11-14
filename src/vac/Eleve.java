package vac;
import java.io.Serializable;

public class Eleve implements Serializable {
		//Attribut
			private String prenom;
			private String nom;
		//Constructeur		
			public Eleve( String prenom, String nom){
				this.prenom = prenom;
				this.nom = nom;
			}
			public Eleve(String prenom){
				this.prenom = prenom;
			}
			public Eleve(){
			}
			
			/**
			 * retourne le prenom
			 * @return
			 */
		//get Prenom
			public String getPrenom(){
				return this.prenom;
			}
			/**
			 * retourne le nom
			 * @return
			 */
		//get Nom
			public String getNom(){
				return this.nom;
			}
			/**
			 * retourne le nom et le prenom
			 */
		// toString
			public String toString (){
				return ""+this.nom+" "+this.prenom;
			}
}
