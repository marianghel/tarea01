
package Modelo;


public class Estudiante {
   private String nombre;
   private String carnet;

    public Estudiante(String carnet , String nombre) {
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarnet() {
        return carnet;
    }
   public String getInformacion(){
      return "carnet:"+getCarnet()+"\nNombre: "+getNombre();
   }
   
}
