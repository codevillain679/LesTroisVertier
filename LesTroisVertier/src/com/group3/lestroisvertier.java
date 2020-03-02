package com.group3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class lestroisvertier extends JFrame {
    public static void main(String[] args) {
        //
        int windforce = 0;
        int age = 0;

        Gondel CampBas = new Gondel("Camp Bas", 500, 1100, true, 10);
        Gondel Central = new Gondel("Central", 1100, 2050, true, 7);
        Gondel Plafond = new Gondel("Plafond", 2050, 2950, true, 5);

        ArrayList<Piste> listPiste = new ArrayList<>();
        ArrayList<Gondel> listGondel = new ArrayList<>();

        Piste ApresSki = new Piste(Plafond, "Apres-Ski", Color.BLACK, 2950);
        Piste LeChasseNeige = new Piste(Plafond, "Le Chasse-Neige", Color.RED,2950);

        Piste LaStation = new Piste(Central, "La Station", Color.RED, 2050);
        Piste LeTireFesses = new Piste(Central, "Le Tire-Fesses", Color.BLUE, 2050);
        Piste LesBosses = new Piste(Central, "Les Bosses", Color.RED, 2050);

        Piste LaDameuse = new Piste(CampBas, "La Dameuse", Color.BLUE, 1100);
        Piste LeDebutant = new Piste(CampBas, "Le Debutant", Color.GREEN, 1100);
        Piste LaPisteVerte = new Piste(CampBas, "La Piste Verte", Color.BLUE, 1100);
        Piste LaBleue = new Piste(CampBas, "La Bleue", Color.GREEN, 1100);

        listPiste.add(ApresSki);
        listPiste.add(LeChasseNeige);
        listPiste.add(LaStation);
        listPiste.add(LeTireFesses);
        listPiste.add(LesBosses);
        listPiste.add(LaDameuse);
        listPiste.add(LeDebutant);
        listPiste.add(LaPisteVerte);
        listPiste.add(LaBleue);

        listGondel.add(CampBas);
        listGondel.add(Central);
        listGondel.add(Plafond);

        Scanner in = new Scanner(System.in);

        System.out.print("Enter wind force: ");
        windforce = in.nextInt();

        System.out.println(windforce);

        for(Gondel g: listGondel){
            g.disable(windforce);
            System.out.println(g.getName()+"\t"+g.isActive());
        }

        System.out.print("Enter age: ");
        age = in.nextInt();

        System.out.println(age);

        for(Piste p: listPiste){
            p.disable(age);
            System.out.println(p.getName()+ "\t"+p.getIsAllowed());
        }

        JFrame frame = new Skipas(age, windforce, listPiste, listGondel);

        frame.setTitle("Ski Pas");
        frame.setSize(new Dimension(300,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
