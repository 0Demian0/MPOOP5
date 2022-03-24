package mpoop5;
/**
 * @author Duque Rafael
 * Clase que muestra los datos de una persona
 */
public class Persona {
    /**
     * Atributos con variables de tipo privada
     * (Encapsulamiento)
     */
    private String Nombre;
    private String Apellido;
    private Fecha fNacimiento;
    /**
     * Constructor vacío
     */
    public Persona(){
    }
    /**
     * Constructor inicializado con las variables
     * modificando la estructura de fNacimiento
     * @param nombre
     * @param apellido
     * @param dia
     * @param mes
     * @param anio 
     */
    public Persona(String nombre, String apellido, int dia, int mes, int anio) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.fNacimiento = new Fecha(dia, mes, anio);
    }
    /**
     * Constructor inicializado con la forma original 
     * @param Nombre
     * @param Apellido
     * @param fNacimiento 
     */
    public Persona(String Nombre, String Apellido, Fecha fNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = fNacimiento;
    }
    /**
     * Get and Set para acceder a las propiedades
     * de los objetos entre las clases
     * Set cuando se asigna un valor 
     * Get cuando se accede a la propiedad del objeto
     * @return 
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     *
     * @return
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    /**
     *
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     *
     * @param Apellido
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     *
     * @param fNacimiento
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * Sobrecarga
     * Modifica o sobreescribe el comportamiento de los métodos
     * @return 
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + Nombre + ", apellido=" + Apellido + ", fNacimiento=" + fNacimiento + '}';
    }
}
