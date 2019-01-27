package me.maxsaleh.test;

import javax.swing.*;
import java.awt.*;

public class Main
{

    public static void main(String[] args) {

        // Strings for names
        String maxname = "Max";

        // Says this in console when program starts
        System.out.println("PROGRAM HAS STARTED!");

        // Frame & Frame Title
        JFrame frame = new JFrame("Max Test Program");

        for(int i=1; i<5; i++){
            System.out.println("Count is: " + i);
        }

        // Max's Car
        MaxsCar maxscar = new MaxsCar();

        maxscar.carname = "Max's Car";
        maxscar.cartype = 1;

        // String for Max's Car
        String maxcarinfo = "(Car Types)\n1: Toyota\n2: GMC\n3: Infinity\n\n" +
                "Your car name is: " + maxscar.carname +
                "\nDo your car have Diesel: " + maxscar.hasDiesel +
                "\nYour type is: " + maxscar.cartype;

        // Text getting displayed in the frame
        JLabel label = new JLabel("" + maxscar.carname, SwingConstants.CENTER);

        // Fixing new sentanced etc.
        label.setText("<html>" + maxcarinfo.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>") + "</html>");

        // Frame related things here
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setMaximumSize(new Dimension(500, 600));
        frame.setMinimumSize(new Dimension(500, 600));
        frame.setLocationRelativeTo(null);
        frame.add(label);
        frame.setVisible(true);

        // Telling console if max has Diesel or not
        if (maxscar.hasDiesel == true) {
            System.out.println("You have Diesel " + maxname);
        } else {
            System.out.println("You do not have Diesel " + maxname);
        }

        // Telling what car Max has in console
        if (maxscar.cartype == 1) {
            System.out.println("You have a Toyota " + maxname);
        } else if(maxscar.cartype == 2) {
            System.out.println("You have a GMC " + maxname);
        } else if (maxscar.cartype == 3) {
            System.out.println("You have a Infinity " + maxname);
        }

        System.out.println(maxname + " your car name is: " + maxscar.carname);
    }
}
