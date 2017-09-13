package aula09exemplo01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Janela extends JFrame{
    private JPanel pnlPrincipal = new JPanel();
    private final JLabel lbl01 = new JLabel("Label 01");
    private final JLabel lbl02 = new JLabel("Label 02");
    private final JLabel lbl03 = new JLabel("Label 03");
    private final JLabel lbl04 = new JLabel("Label 04");
    private final JTextField txt01 = new JTextField("Text 01");
    private final JTextField txt02 = new JTextField("Text 02");
    private final JTextField txt03 = new JTextField("Text 03");
    private final JTextField txt04 = new JTextField("Text 04");
    
    
    public Janela() throws HeadlessException {
        super("Janela");
        //ConfiguraFlowLayout();
        //ConfiguraBorderLayout();
        //ConfiguraLayoutAbsoluto();
        ConfiguraGridLayout();
        add(pnlPrincipal);
    }

    private void ConfiguraFlowLayout() {
        pnlPrincipal.setLayout(new FlowLayout());      
        pnlPrincipal.add(lbl01);
        pnlPrincipal.add(txt01);        
        pnlPrincipal.add(lbl02);
        pnlPrincipal.add(txt02);        
        pnlPrincipal.add(lbl03);
        pnlPrincipal.add(txt03);        
        pnlPrincipal.add(lbl04);
        pnlPrincipal.add(txt04);
        
    }
    
    private void ConfiguraGridLayout() {
        pnlPrincipal.setLayout(new GridLayout(4, 2));      
        pnlPrincipal.add(lbl01);
        pnlPrincipal.add(txt01);        
        pnlPrincipal.add(lbl02);
        pnlPrincipal.add(txt02);        
        pnlPrincipal.add(lbl03);
        pnlPrincipal.add(txt03);        
        pnlPrincipal.add(lbl04);
        pnlPrincipal.add(txt04);
        
    }
    
    private void ConfiguraBorderLayout() {
        pnlPrincipal.setLayout(new BorderLayout());      
        pnlPrincipal.add(txt01, BorderLayout.NORTH);                
        pnlPrincipal.add(lbl02, BorderLayout.WEST);     
        pnlPrincipal.add(txt02, BorderLayout.CENTER);
        pnlPrincipal.add(lbl03, BorderLayout.EAST);
        pnlPrincipal.add(txt03, BorderLayout.SOUTH);         
    }

    private void ConfiguraLayoutAbsoluto() {
        pnlPrincipal.setLayout(null);
        
        //Size
        lbl01.setSize(100, 25);
        txt01.setSize(150, 20);
        
        lbl02.setSize(100, 25);
        txt02.setSize(150, 20);
        
        lbl03.setSize(100, 25);
        txt03.setSize(150, 20);
        
        lbl04.setSize(100, 25);
        txt04.setSize(150, 20);
        
        //Location
        lbl01.setLocation(10, 10);
        txt01.setLocation(100, 10);
        
        lbl02.setLocation(10, 40);
        txt02.setLocation(100, 40);        
        
        lbl03.setLocation(10, 70);
        txt03.setLocation(100, 70);
        
        lbl04.setLocation(10, 100); 
        txt04.setLocation(100, 100);
        
        
        //Adicionando os componentes
        pnlPrincipal.add(lbl01);
        pnlPrincipal.add(txt01);        
        pnlPrincipal.add(lbl02);
        pnlPrincipal.add(txt02);        
        pnlPrincipal.add(lbl03);
        pnlPrincipal.add(txt03);        
        pnlPrincipal.add(lbl04);
        pnlPrincipal.add(txt04);   
    }
    
}
