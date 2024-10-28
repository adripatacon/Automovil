public class Automovil {
    // Atributos - Propiedadaes - Estado
    private String marca;
    private String modelo;
    private String color = "Verde";
    private float cilindraje;
    // Constructores

    public Automovil() {
       
    }

    // Sobrecarga de métodos y polimorfismo.
    public Automovil(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters y Setters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }


    //Métodos propios de operaciones y tareas

    public String verDetalle(){
        String dv = "La marca es: " +this.marca + "\n" + "El modelo es: " +this.modelo + "\n" + "El color es: " +this.color +  "\n" + "El cilindraje es: " + getCilindraje();
        return dv;
    }


}
