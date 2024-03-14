import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EstudianteGUI extends JFrame {
    private JTextField txtLlave;
    private JButton btnBuscar;
    private JTextArea areaResultado;

    public EstudianteGUI() {
        setTitle("Búsqueda de Estudiantes");
        setSize(300, 200);
        setLayout(new FlowLayout());

        txtLlave = new JTextField(15);
        add(txtLlave);

        btnBuscar = new JButton("Buscar");
        add(btnBuscar);
        btnBuscar.addActionListener(e -> buscarEstudiante());

        areaResultado = new JTextArea(5, 20);
        add(new JScrollPane(areaResultado));
    }

    private void buscarEstudiante() {
        // Aquí deberías implementar la lógica de búsqueda utilizando el texto en txtLlave
        // y luego mostrar los resultados en areaResultado
    }

    public static void main(String[] args) {
        EstudianteGUI gui = new EstudianteGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }
}
