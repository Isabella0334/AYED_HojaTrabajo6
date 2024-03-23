/*
*   UNIVERSIDAD DEL VALLE DE GUATEMALA
*   ALGORITMOS Y ESTRUCTURA DE DATOS
*   CC2016
*   AUTORES:
            Milton Giovanni Polanco Serrano
            Isabella Recinos Rodríguez
    FECHA: Viernes 22 de marzo del año 2024
    DESCRIPCIÓN: Hoja de trabajo 6
    LINK A REPOSITORIO: https://github.com/Isabella0334/AYED_HojaTrabajo6.git
*/
public class Student {
    private String name;
    private String phone;
    private String email;
    private String postalZip;
    private String country;

    public Student(String name, String phone, String email, String postalZip, String country) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.postalZip = postalZip;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPostalZip() {
        return postalZip;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", postalZip='" + postalZip + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
