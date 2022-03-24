package mpoop5;
/**
 *@author Duque Rafael
* Clase que indica los datos y funciones de un coche
*/
public class Coche {
    /**
     * Zona de atributos (Encapsulamiento)
     * Variables de tipo cadena y entero 
     * que son privadas para solo acceder a ellas por medio
     * de los métodos de la misma clase
     */
    private String marca;
    private String color;
    private int placa;
    private int numPuertas;
    private int modeloAnio;
    /**
     * Constructor vacío
     */
    public Coche(){   
    }
    /**
     * Constructor inicializado con las variables:
     * @param marca
     * @param color
     * @param placa
     * @param numPuertas
     * @param modeloAnio 
     */
    public Coche(String marca, String color, int placa, int numPuertas, int modeloAnio) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.modeloAnio = modeloAnio;
    }
    /**
     * Get and Set para acceder 
     * a las propiedades de los objetos entre las clases
     * Set cuando se asigna un valor 
     * Get cuando se accede a la propiedad del objeto
     * @return 
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public int getPlaca() {
        return placa;
    }

    /**
     *
     * @param placa
     */
    public void setPlaca(int placa) {
        this.placa = placa;
    }

    /**
     *
     * @return
     */
    public int getNumPuertas() {
        return numPuertas;
    }

    /**
     *
     * @param numPuertas
     */
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    /**
     *
     * @return
     */
    public int getModeloAnio() {
        return modeloAnio;
    }

    /**
     *
     * @param modeloAnio
     */
    public void setModeloAnio(int modeloAnio) {
        this.modeloAnio = modeloAnio;
    }
    /**
     * Zona de métodos
     * Indica lo que hace el coche
     */
    public void encender(){
        System.out.println("Estoy encendido");
    }
    /**
     * Imprime cuando el coche se apaga 
     */
    public void apagar(){
        System.out.println("me voy a apagar");  
    }
    /**
     * Imprime cuando está frenando 
     */
    public void frenar(){
        System.out.println("frenando");
    }
    /**
     * Imprime un aviso que simula el claxon 
     * para quitarte del camino
     */
    public void tocarClaxon(){
        System.out.println("Quitate del camino");
    }
    /**
     * Método que muestra la velocidad del coche
     * con el parametro velocidad indicamos a la velocidad que se encuentra 
     * @param velocidad 
     */
    public void acelerar(int velocidad){
        System.out.println("Voy a una velocidad de "+velocidad+"km/h");
    }
    /**
     * Sobrecarga 
     * Modifica o sobreescribe el comportammiento de los métodos 
     * @return 
     */
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + ", placa=" + placa + ", numPuertas=" + numPuertas + ", modeloAnio=" + modeloAnio + '}';
    }    
}

