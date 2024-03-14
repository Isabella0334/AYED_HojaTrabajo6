import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class FileReader {
    public static List<Student> readStudentsFromFile(String fileName) {
        List<Student> students = new ArrayList<>();
        try {
            InputStream is = new FileInputStream("ruta/a/tu/archivo.json");
            JSONTokener tokener = new JSONTokener(is);
            JSONArray jsonArray = new JSONArray(tokener);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Student student = new Student(
                        jsonObject.getString("name"),
                        jsonObject.getString("phone"),
                        jsonObject.getString("email"),
                        jsonObject.getString("postalZip"),
                        jsonObject.getString("country"));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        String fileName = "path_to_your_students_file.json"; // Reemplaza esto con la ruta real a tu archivo JSON
        List<Student> students = readStudentsFromFile(fileName);

        // Imprimir los estudiantes para verificar
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
