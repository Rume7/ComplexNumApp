package laboratory4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author E238958
 */
public class Circle extends JPanel {

    private Scanner input = new Scanner(System.in);
    private Random random = new Random();

    private static final long serialVersionUID = 1L;

    @Override
    public void paintComponent(Graphics g) {
        // draw Oval
        g.drawOval(150, 30, 100, 100);
    }

    private void rangeOfCircle() {
        int min = input.nextInt();
        int max = input.nextInt();

        if (max > min) {
            double radius = generateNumberBetweenRange(min, max);
        }
    }

    private int generateNumberBetweenRange(int min, int max) {
        while (true) {
            int value = random.nextInt(max);
            if (value > min) {
                return value;
            }
        }
    }

    public static void main(String[] args) {

        /*
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Draw Oval and Circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(300, 200);

        Circle panel = new Circle();
        frame.add(panel);

        frame.setVisible(true);*/
        
        new Circle().graphic();
    }

    private void graphic() {
        JFrame frame = new JFrame();

        JLabel numOfCircleLabel = new JLabel("Enter number of circles");
        JTextField noOfCircleTF = new JTextField(20);
        
        JLabel rangeLabel = new JLabel("Enter the range of sizes");
        JTextField rangeOfRadiusTF = new JTextField(20);
        
        Circle circleObject =  new Circle();
        circleObject.setName("Input");
        circleObject.setLayout(new GridLayout(5, 1));
        
        circleObject.add(numOfCircleLabel);
        circleObject.add(noOfCircleTF);
        circleObject.add(rangeLabel);
        circleObject.add(rangeOfRadiusTF);
        
        frame.add(circleObject);
        JOptionPane.showInputDialog(frame, "", "Input", JFrame.EXIT_ON_CLOSE);
    }
}
