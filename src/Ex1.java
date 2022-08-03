import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Ex1 extends JFrame implements ActionListener{
    static JLabel lab1=new JLabel("first name:");
    static JLabel lab2=new JLabel("last name:");
    static JTextField tex1=new JTextField(10);
    static JTextField tex2=new JTextField(10);
    static JTextArea texar=new JTextArea(2,10);
    static JButton resbut=new JButton();
    static JButton valbut=new JButton(); 
    
    public static void main(String[] args){
       Ex1 frm=new Ex1();
       frm.setTitle("creat acount");
       frm.setLayout(new FlowLayout());
       frm.setSize(250,200);
       frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frm.setVisible(true);
       
       frm.add(lab1);
       frm.add(tex1);
       frm.add(lab2);
       frm.add(tex2);
       
       resbut.setText("rest");
       frm.add(resbut);
       valbut.setText("validate");
       frm.add(valbut);
       
       texar.setEditable(false);
       frm.add(texar);
       
       resbut.addActionListener(frm);
       valbut.addActionListener(frm);
      
       texar.setLineWrap(true);
       texar.setWrapStyleWord(true);
    }
    
      public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resbut)
        {
            tex1.setText("");
            tex2.setText("");
            texar.setText("");
           // valTxt.setText("");
        }
      if (e.getSource()==valbut)
        {
            texar.setText("");
            if(tex1.getText().isEmpty())
                texar.setText(texar.getText()+"* insert your first name.\n");
            if(tex2.getText().isEmpty())
               texar.setText(texar.getText()+"* insert your last name.\n");            
            if(!(tex1.getText().isEmpty())&&!(tex2.getText().isEmpty()))
                texar.setText("welldone! "+tex1.getText()+" "+tex2.getText());
        }
    }
}
