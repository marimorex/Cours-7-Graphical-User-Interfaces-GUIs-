import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fenetre extends JFrame implements ActionListener {
  JButton button;
  JLabel label;
  int nbclicks;
  /** Creates a new instance of Fenetre */
  public Fenetre(String title) {
    super(title);
  }

  public void actionPerformed(ActionEvent e) {
    ++nbclicks;
    label.setText("Nb. clicks: "+nbclicks);
  }

  public void createComponents() {
    button = new JButton("New click");
    button.addActionListener(this);
    JPanel panel = new JPanel();
    label = new JLabel("No clicks");
    panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
    panel.setLayout(new BorderLayout());
    panel.add(button, BorderLayout. CENTER);
    panel.add(label , BorderLayout. NORTH);
    this.add(panel, BorderLayout. NORTH);
  }

  public static void main(String[] args) {
    Fenetre fenetre = new Fenetre("New Window");
    fenetre.createComponents();
    fenetre.pack();
    fenetre.setVisible(true);
  }
}
