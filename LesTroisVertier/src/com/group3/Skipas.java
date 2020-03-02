package com.group3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Skipas extends JFrame {
    public Skipas(int age, int windforce, ArrayList<Piste> listPiste, ArrayList<Gondel> listGondel) throws HeadlessException {
        this.setLayout(new GridBagLayout());
        this.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JButton button;
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

//        button = new JButton("Button 1");
        c.weightx = 0.5;
//        c.gridx = 0;
//        c.gridy = 0;
//        add(button, c);

        c.gridx = 0;
        c.gridy = 0;
        JLabel lblAge = new JLabel("Age: "+ age+"");
        add(lblAge, c);

        c.gridx = 1;
        c.gridy = 0;
        JLabel lblWindforce = new JLabel("Windforce: " +windforce+"");
        add(lblWindforce, c);

        StringBuilder sb = new StringBuilder();
        String showText = "";
        JTextField tfText;
        int m = 1;
        int n = 1;
        for(Gondel g: listGondel){
            if(g.isActive()){
                c.gridx = m;
                c.gridy = n;
                tfText = new JTextField();
                tfText.setText(g.getName());
                add(tfText,c);
                n += m;
                int l = m;
                for(Piste p: listPiste){
                    if(p.getGondel() == g && p.getIsAllowed()) {
                        c.gridx = l++;
                        c.gridy = n;
                        tfText = new JTextField();
                        tfText.setText(p.getName());
                        tfText.setBackground(p.getColor());
                        add(tfText, c);
                    }
                }
                n++;
            }
        }
    }

    public Skipas(GraphicsConfiguration gc) {
        super(gc);
    }
}
