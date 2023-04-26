import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageExample {

    private JFrame frame;
    private ImageIcon carIcon;
    private JLabel myLabel;
    private JButton startButton;

    public ImageExample(){
        carIcon = new ImageIcon(this.getClass().getResource("/car.jpg"));
        myLabel = new JLabel(carIcon);
        myLabel.setSize(650, 450);

        startButton = new JButton("Start");
        startButton.setBounds(50,50,100,50);
        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You have clicked start button");
            }
        });

        myLabel.add(startButton);

        frame= new JFrame("Hello World");
        frame.add(myLabel);
        frame.setSize(650, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        myLabel.setVisible(true);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new ImageExample();
    }
}