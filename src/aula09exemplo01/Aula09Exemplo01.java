package aula09exemplo01;

import javax.swing.JFrame;

public class Aula09Exemplo01 {

    public static void main(String[] args) {
        Janela j = new Janela();
        j.setSize(400, 300);  
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
        j.setTitle("Janela");
    }
    
}
