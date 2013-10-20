/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sgexamenes;

/**
 *
 * @author frarlon Rodriguez
 */
import Preguntas.Pregunta;
import Secciones.Seccion;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.util.ArrayList;


public class SGexamenes extends JFrame {

    public static ArrayList<JFrame> preguntas;
    public static ArrayList<JFrame> seccion;
     public static ArrayList<JFrame> examenes;
    public SGexamenes() {
       
        setTitle("My empty Frame");
        setSize(300, 200);
        setLocation(100, 200);
    }

    public static void main(String args[]) {

        final JFrame frame = new SGexamenes();
        final JTextField text1 = new JTextField("ddd");
      
        final ArrayList<SGexamenes> listaV = new ArrayList<>();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
            }
        });

        listaV.add((SGexamenes) frame);
        //  frame.setVisible(false)
  
        listaV.get(0).setVisible(true);


    }
}
