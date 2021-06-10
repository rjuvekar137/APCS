import javax.swing.*;
import java.awt.event.*;

public class WelcomeScreen extends JFrame {

    private JButton button1;
    private JTextField textField1;

    public static void main(String[] args) {
        WelcomeScreen frame1 = new WelcomeScreen();
        CharacterCreation frame2 = new CharacterCreation();

        JFrame f = new JFrame();
        final JTextField tf = new JTextField();
        tf.setBounds(175,50, 40,20);
        tf.setText("Rät");
        tf.setEditable(false); // makes sure to set text field to be uneditable

        JButton b = new JButton("START.");
        b.setBounds(150,150,95,30);

        // this is how to make the button do something
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                frame1.setVisible(false); //hide the First frame
                frame2.setVisible(true);
            }
        });

        f.add(b);
        f.add(tf);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }

}
