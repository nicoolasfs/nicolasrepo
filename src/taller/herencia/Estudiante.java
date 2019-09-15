package taller.herencia;

import javax.swing.JOptionPane;

public class Estudiante extends Persona {
    private String carnet;
    private double promedio;
    private int numeromaterias,nota;
    public Estudiante(){
        
    }

    public Estudiante(String nombre,String apellido,int edad,double peso,String carnet, double promedio, int numeromaterias) {
        this.carnet = carnet;
        this.promedio = promedio;
        this.numeromaterias = numeromaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

  
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }


    public int getNumeromaterias() {
        return numeromaterias;
    }

    public void setNumeromaterias(int numeromaterias) {
        this.numeromaterias = numeromaterias;
    }
    public void calcularpromedio(int numerodematerias,double nota){
        double promedio=numerodematerias*nota;
    }
    public Estudiante ingresarDatosEstudiante(){
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
String apellido = "";
int edad = 0;
double peso = 0.0;
int numeroMaterias;
int nota = (int) 0.0;
double promedio=0;
nombre = leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
apellido = leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
carnet=leerDatoTipoCadena("Ingrese el carnet del estudiante");
edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
numeromaterias=leerDatoTipoEntero("Ingrese el numero de materias del estudiante");
nota=leerDatoTipoEntero("Ingrese la nota del estudiante");
nuevoEstudiante.setNombre(nombre);
nuevoEstudiante.setApellido(apellido);
nuevoEstudiante.setCarnet(carnet);
nuevoEstudiante.setEdad(edad);
nuevoEstudiante.setPeso(peso);
nuevoEstudiante.setPromedio(promedio);
nuevoEstudiante.setNumeromaterias(numeromaterias);
nuevoEstudiante.setNota(nota);
        return (nuevoEstudiante);
    }
    public Estudiante imprimirNotasEstudiante(){
        Estudiante nuevoEstudiante= new Estudiante();
        imprimirdatosestudiante();
        JOptionPane.showMessageDialog(null,"El carnet del estudiante es: " + carnet);
       JOptionPane.showMessageDialog(null, "El numero de materias del estudiante es: " + numeromaterias);
            promedio();
       JOptionPane.showMessageDialog(null, "El promedio del estudiante es: " + promedio);

        return (nuevoEstudiante);
    }
    public void promedio(){
        promedio=nota/numeromaterias;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }
    
}
