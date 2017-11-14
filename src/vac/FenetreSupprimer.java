package vac;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

//import java.awt.event.ActionListener;

public class FenetreSupprimer extends JFrame implements ActionListener{

    private JPanel monPanel;
    private JLabel affichage;
    private JButton btnAccueil;
    private JTextField JtfNom;
    private JTextField JtfPrenom;
    private JButton btnSupprimer;
  
    private JMenuBar menuBar = new JMenuBar();
	private JMenu menuGes;
	private JMenu menuEtat;
	
	private JMenuItem itemAjouter;
	private JMenuItem itemSupprimer;
	private JMenuItem itemAfficher;
	private JMenuItem itemRechercher;
    
    
    public FenetreSupprimer(){
        this.setTitle("vacances 2017 Supprimer");
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
        this.JtfNom = new JTextField("nom");
        this.JtfPrenom = new JTextField("prenom");
        this.btnSupprimer = new JButton("Supprimer");
        
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
        
      //
        this.JtfNom.setPreferredSize(new Dimension(150, 30));
        this.JtfPrenom.setPreferredSize(new Dimension(150, 30));
        
      //placement des elements
        this.monPanel.setLayout(new GridLayout(5,1));
        this.monPanel.add(affichage, BorderLayout.CENTER);
        this.monPanel.add(JtfNom, BorderLayout.NORTH);
        this.monPanel.add(JtfPrenom, BorderLayout.SOUTH);
        this.monPanel.add(btnSupprimer);
        this.monPanel.add(btnAccueil);
        
      //affichage
        this.btnAccueil.addActionListener(this);
        this.btnSupprimer.addActionListener(this);
        this.getContentPane().add(monPanel);
        this.setVisible(true);
    }

    public void actionPerformed(java.awt.event.ActionEvent evenement) {
		if(evenement.getSource() == btnAccueil){
			Fenetre aff = new Fenetre();
			dispose();
		}
		if(evenement.getSource() == btnSupprimer){
			//cl Objet part défaut pour appeler les procédures
			Classe cl = new Classe();
			this.affichage.setText(cl.supprimer(JtfPrenom.getText(),JtfNom.getText()));
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