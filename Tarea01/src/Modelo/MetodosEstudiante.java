

package Modelo;


import java.util.ArrayList;

public class MetodosEstudiante {
    
    ArrayList <Estudiante> arrayEstudiantes;

    public MetodosEstudiante() {
        arrayEstudiantes=new ArrayList <Estudiante>();
    }
      
    public void agregar(String informacion[]){
       Estudiante temporal= new Estudiante(informacion[0],informacion[1]);
       arrayEstudiantes.add(temporal);
    }
    public void mostraInformacion(){
        Estudiante temporal;
        temporal=arrayEstudiantes.get(0);
        System.out.println(temporal.getInformacion());
    }
    public void modificar(String arreglo[]){
        for(int contador=0;contador<arrayEstudiantes.size();contador++){
            if(arrayEstudiantes.get(contador).getCarnet().equals(arreglo[0])){
                arrayEstudiantes.get(contador).setNombre(arreglo[1]);  
            }
        }
    }
    public void eliminar(String arreglo[]){
       for(int contador=0;contador<arrayEstudiantes.size();contador++){
           if(arrayEstudiantes.get(contador).getCarnet().equals(arreglo[0])){
               arrayEstudiantes.remove(contador);
           }
       } 
    }
    public String[] consultarEstudiantes(String carnet){
        String arregloDatos[]=new String[1];
        for(int contador=0;contador<arrayEstudiantes.size();contador++){
             System.out.println("carnet"+arrayEstudiantes.get(contador).getCarnet());
            if(arrayEstudiantes.get(contador).getCarnet().equals(carnet)){
              arregloDatos[0]=arrayEstudiantes.get(contador).getNombre();
            }
        }
        return arregloDatos;
    }
 
    /*public String[] buscar(String carnet){
        String arregloDatos[]=new String[1];
        for(int contador=0;contador<arrayEstudiantes.size();contador++){
          arregloDatos[0]=arrayEstudiantes.get(contador).getInformacion();
             
            }
    return arregloDatos;  
        }*/
    
       public String todosEstudiantes()
    {
        String informacion="Carnet           NOMBRE\n";
       for(int contador=0;contador<arrayEstudiantes.size();contador++)
       {
           informacion+=arrayEstudiantes.get(contador).getCarnet()+"        "+arrayEstudiantes.get(contador).getNombre()+"\n";
       }
       return informacion;
    }
}
