package laboratory4;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jerry Momodu
 */
public class Lab4App {

    private static final Scanner input = new Scanner(System.in);
    private double radius;
    private double minimumOfCircles;
    private double maximumOfCircles;

    public void processInput() {
        //JFrame parent = new JFrame("Input");
        //JPanel panel = new JPanel();
        //JOptionPane.showInputDialog(null, this, "Input", JOptionPane.QUESTION_MESSAGE);
        Object[] options = {"OK", "CANCEL"};
        JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
    }

    public static void main(String[] args) {
        Lab4App app = new Lab4App();
        app.processInput();
    }

}
