package vac;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.EventObject;

import java.awt.event.ActionListener;

public class FenetreAjouter extends JFrame implements ActionListener{

    private JPanel monPanel;
    private JLabel affichage;
    private JButton btnAccueil;
    private JButton btnAjouter;
    private JTextField JtfNom;
    private JTextField JtfPrenom;
    
    private JMenuBar menuBar = new JMenuBar();
	private JMenu menuGes;
	private JMenu menuEtat;
	
	private JMenuItem itemAjouter;
	private JMenuItem itemSupprimer;
	private JMenuItem itemAfficher;
	private JMenuItem itemRechercher;
    
    
    public FenetreAjouter(){
        this.setTitle("vacances 2017 Ajouter");
        this.setLocationRelativeTo(null);
        this.setSize(400,300);
        this.setLocation(1,200);
        this.setUndecorated(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        
      //initialisation
        this.monPanel= new JPanel();
        this.affichage = new JLabel("");
        this.btnAccueil = new JButton("Accueil");
        this.btnAjouter = new JButton("Ajouter");
        this.JtfNom = new JTextField("nom");
        this.JtfPrenom = new JTextField("prenom");
        
      //menu
        this.menuBar = new JMenuBar();
        this.menuGes = new JMenu("Gestion de la classe");
        this.menuEtat = new JMenu("Etat de la classe");
        
        this.itemAjouter = new JMenuItem("Ajouter");
        this.itemSupprimer = new JMenuItem("Supprimer");
        this.itemAfficher = new JMenuItem("Afficher");
        this.itemRechercher = new JMenuItem("Rechercher");
        
        this.itemAjouter.addActionListener(this);
        this.itemSupprimer.addActionListener(this);
        this.itemAfficher.addActionListener(this);
        this.itemRechercher.addActionListener(this);
        
        this.menuGes.add(itemAjouter);
        this.menuGes.add(itemSupprimer);
        this.menuEtat.add(itemAfficher);
        this.menuEtat.add(itemRechercher);	
		
		menuBar.add(menuGes);
		menuBar.add(menuEtat);
		setJMenuBar(menuBar);
        
      //Caracteristique
        Font police = new Font("Arial", Font.BOLD, 14);
        
      //placement des elements
        this.monPanel.setLayout(new GridLayout(5,1));
        this.monPanel.add(affichage, BorderLayout.CENTER);
        this.monPanel.add(JtfNom, BorderLayout.NORTH);
        this.monPanel.add(JtfPrenom, BorderLayout.SOUTH);
        this.monPanel.add(btnAjouter);
        this.monPanel.add(btnAccueil);
        
      //affichage
        this.btnAccueil.addActionListener(this);
        this.btnAjouter.addActionListener(this);
        this.getContentPane().add(monPanel);
        this.setVisible(true);
    }
    public void actionPerformed(java.awt.event.ActionEvent evenement) {
		if(evenement.getSource() == btnAccueil){
			Fenetre aff = new Fenetre();
			dispose();
		}
		if(evenement.getSource() == btnAjouter){
			//cl Objet part défaut pour appeler les procédures
			Classe cl = new Classe();
			Eleve el = new Eleve(JtfPrenom.getText(),JtfNom.getText());
			this.affichage.setText(cl.ajouterDansLaClasse(el));
		}
		if(evenement.getSource() == itemAfficher){
			FenetreAffi aff = new FenetreAffi();
		}
		if(evenement.getSource() == itemAjouter){
			FenetreAjouter ajou = new FenetreAjouter();
		}
		if(evenement.getSource() == itemRechercher){
			FenetreRechercher recher = new FenetreRechercher();
		}
		if(evenement.getSource() == itemSupprimer){
			FenetreSupprimer supp = new FenetreSupprimer();
		}
		
	}
}
