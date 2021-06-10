import javax.swing.*;

/**
 * @author : rjuvekar
 * @created : 6/7/21, Monday
 **/
public class CharacterCreation {

    public static void main(String[] args) {
        CharacterCreation frame2 = new CharacterCreation();

        JFrame f = new JFrame();
        final JTextField tf = new JTextField();
        tf.setBounds(175, 50, 40, 20);
        tf.setText("Create your player: ");
        tf.setEditable(false); // makes sure to set text field to be uneditable

        final JTextField tf2 = new JTextField();
        tf.setBounds(175, 30, 40, 20);
        tf.setText("Name: ");
        tf.setEditable(false);

        final JTextField tf3 = new JTextField();
        tf.setBounds(155, 30, 40, 20);
        tf.setText("");
    }

    public void setVisible(boolean b) {

    }
}
