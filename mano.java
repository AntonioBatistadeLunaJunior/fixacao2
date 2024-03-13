
package loucura;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;



public class mano extends JFrame {
    private JLabel pBrisadeiro;
    private JLabel pCookie;
    private JLabel pPudin;
    private JLabel magem1;
    private JLabel magem2;
    private JLabel magem3;
    private JTextField qtdBrisadeiro;
    private JTextField qtdCookie;
    private JTextField qtdPudin;
    private JButton calcular;
    
    public mano(){
        
        super ("Compra de doces");
        setLayout(new FlowLayout());
        
        
         ImageIcon imageIcon1 = new ImageIcon(getClass().getResource("brisa.png"));
         
        magem1 = new JLabel (imageIcon1);
        add(magem1);
        
        pBrisadeiro = new JLabel("R$ 10,00");
        add(pBrisadeiro);
        
        qtdBrisadeiro = new JTextField("0", 3);
        qtdBrisadeiro.setEditable(true);
        add(qtdBrisadeiro);
        
        
        ImageIcon imageIcon2 = new ImageIcon(getClass().getResource("koo.png"));
         
        magem2 = new JLabel (imageIcon2);
        add(magem2);
        
         pCookie = new JLabel("R$ 15,00");
        add(pCookie);
        
        qtdCookie = new JTextField("0", 3);
        qtdCookie.setEditable(true);
        add(qtdCookie);
        
        ImageIcon imageIcon3 = new ImageIcon(getClass().getResource("pud.png"));
         
        magem3 = new JLabel (imageIcon3);
        add(magem3);
        
        pPudin = new JLabel("R$ 25,00");
        add(pPudin);
        
        qtdPudin = new JTextField("0", 3);
        qtdPudin.setEditable(true);
        add(qtdPudin);
        
        calcular = new JButton("pedir");
        add(calcular);
        
        
        Handler handler = new Handler();
        qtdBrisadeiro.addActionListener(handler);
        qtdCookie.addActionListener(handler);
        qtdPudin.addActionListener(handler);
        calcular.addActionListener(handler);
    }
    
    private class Handler implements ActionListener{
        
        public void ActionPerformed (ActionEvent event){
            
            
            String aparece = "";
            if(event.getSource() == calcular){
                int num1 = Integer.parseInt(qtdBrisadeiro.getText());
                int num2 = Integer.parseInt(qtdCookie.getText());
                int num3 = Integer.parseInt(qtdPudin.getText());
                double soma = num1 * 10 + num2 * 15 + num3 * 25;
                
                aparece = String.format("o total do pedido é: %S", soma);
                JOptionPane.showMessageDialog(null, aparece);
                
            }
        }      
        
    }
    
    
}
