import javax.swing.*;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(() -> {
            EstudianteGUI gui = new EstudianteGUI();
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.setVisible(true);
        });
    }
}
