package vac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

//import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener{

    private JPanel monPanel;
    private JButton btnAjouter;
	private JButton btnAfficher;
	private JButton btnRechercher;
	private JButton btnSupprimer;

	private JMenuBar menuBar = new JMenuBar();
	private JMenu menuGes;
	private JMenu menuEtat;
	
	private JMenuItem itemAjouter;
	private JMenuItem itemSupprimer;
	private JMenuItem itemAfficher;
	private JMenuItem itemRechercher;
    //
    
    public Fenetre(){
        this.setTitle("vacances 2017 Menu");
        this.setLocationRelativeTo(null);
        this.setSize(400,300);
        this.setLocation(1,200);
        this.setUndecorated(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        
      //initialisation 
        this.monPanel= new JPanel();
        this.btnAjouter = new JButton("Ajouter");
        this.btnAfficher = new JButton("Afficher");
        this.btnRechercher = new JButton("Rechercher");
        this.btnSupprimer = new JButton("Supprimer");
        Font police = new Font("Arial", Font.BOLD, 14);
        
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
        
      //placement des elements 
        this.monPanel.setLayout(new GridLayout(4,1));
        this.monPanel.add(btnAjouter);
        this.monPanel.add(btnAfficher);
        this.monPanel.add(btnRechercher);
        this.monPanel.add(btnSupprimer);
		
        this.btnAfficher.addActionListener(this);
        this.btnAjouter.addActionListener(this);
        this.btnRechercher.addActionListener(this);
        this.btnSupprimer.addActionListener(this);
        this.getContentPane().add(monPanel);
        this.setVisible(true);
    }
	public void actionPerformed(java.awt.event.ActionEvent evenement) {
		if(evenement.getSource() == btnAfficher){
			FenetreAffi aff = new FenetreAffi();
		}
		if(evenement.getSource() == btnAjouter){
			FenetreAjouter ajou = new FenetreAjouter();
		}
		if(evenement.getSource() == btnRechercher){
			FenetreRechercher recher = new FenetreRechercher();
		}
		if(evenement.getSource() == btnSupprimer){
			FenetreSupprimer supp = new FenetreSupprimer();
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
