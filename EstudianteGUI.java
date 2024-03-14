import javax.swing.*;
import java.awt.*;
import java.util.List;

public class EstudianteGUI extends JFrame {
    private JTextField txtLlave;
    private JButton btnBuscar, btnCargar;
    private JComboBox<String> comboMapType, comboHashType;
    private JTextArea areaResultado;
    private StudentManager studentManager;
    private HashFunctionFactory hashFunctionFactory;

    public EstudianteGUI() {
        setTitle("Búsqueda de Estudiantes");
        setSize(400, 300);
        setLayout(new FlowLayout());

        comboMapType = new JComboBox<>(new String[]{"HashMap", "TreeMap", "LinkedHashMap"});
        add(comboMapType);

        comboHashType = new JComboBox<>(new String[]{"MD5", "SHA-1", "Organic"});
        add(comboHashType);

        btnCargar = new JButton("Cargar Datos");
        add(btnCargar);
        btnCargar.addActionListener(e -> cargarDatos());

        txtLlave = new JTextField(15);
        add(txtLlave);

        btnBuscar = new JButton("Buscar");
        add(btnBuscar);
        btnBuscar.addActionListener(e -> buscarEstudiante());

        areaResultado = new JTextArea(10, 30);
        areaResultado.setEditable(false);
        add(new JScrollPane(areaResultado));
    }

    private void cargarDatos() {
        String mapType = (String) comboMapType.getSelectedItem();
        String hashType = (String) comboHashType.getSelectedItem();
        studentManager = new StudentManager(MapFactory.getMap(mapType));
        List<Student> students = FileReader.readStudentsFromFile("students.json");
        IHashFunction hashFunction = HashFunctionFactory.getHashFunction(hashType);
        
        for (Student student : students) {
            String key = hashFunction.hash(student.getEmail());  // Assuming using email as key
            studentManager.agregarEstudiante(key, student);
        }
        JOptionPane.showMessageDialog(this, "Datos cargados correctamente!");
    }

    private void buscarEstudiante() {
        String llave = txtLlave.getText();
        Student student = studentManager.buscarPorLlave(llave);
        if (student != null) {
            areaResultado.setText(student.toString());
        } else {
            areaResultado.setText("Estudiante no encontrado.");
        }
    }
}
