package vac;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

//import java.awt.event.ActionListener;

public class FenetreAffi extends JFrame implements ActionListener{

    private JPanel monPanel;
    private JLabel affichage;
    private JButton btnAccueil;

    private JMenuBar menuBar = new JMenuBar();
	private JMenu menuGes;
	private JMenu menuEtat;
	
	private JMenuItem itemAjouter;
	private JMenuItem itemSupprimer;
	private JMenuItem itemAfficher;
	private JMenuItem itemRechercher;
	
	private JTable tableau;
	private JScrollPane scrollPane;

    
    public FenetreAffi(){
        this.setTitle("vacances 2017 afficher");
        this.setLocationRelativeTo(null);
        this.setSize(400,300);
        this.setLocation(1,200);
        this.setUndecorated(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        
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
		
		//cl Objet part défaut pour appeler les procédures
        Classe cl = new Classe();
		
        //JTab
		
		// JTable avec le contenu d'une collection
		//Object data[]= new Object[10];
        String data[]= new String[10];
		//Exemple de parcours de la collection et remplissage du tableau
		
		for (int i = 0;i<cl.nbEleve();i++){
		 data[i]= cl.afficherClasse(i);
		}

        
       int nb = cl.nbEleve();
       
      //initialisation
        this.monPanel= new JPanel();
        String nbEleve = cl.nbEleve()+"";
        this.affichage = new JLabel(nbEleve);
        this.btnAccueil = new JButton("Accueil");
       
        this.tableau = new JTable() ;
        this.scrollPane = new JScrollPane(this.tableau);
        this.monPanel.add(this.scrollPane);
		//this.affichage.add();
		
      //placement des elements
        this.monPanel.setLayout(new GridLayout(2,1));
        this.monPanel.add(affichage, BorderLayout.CENTER);
        this.monPanel.add(btnAccueil);
        
      //affichage
        this.btnAccueil.addActionListener(this);
        this.getContentPane().add(monPanel);
        this.setVisible(true);
        
       
    }
public void actionPerformed(java.awt.event.ActionEvent evenement) {
	if(evenement.getSource() == btnAccueil){
		Fenetre aff = new Fenetre();
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
	dispose();
	
}
}

