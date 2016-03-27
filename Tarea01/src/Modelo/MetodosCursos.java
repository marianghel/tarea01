
package Modelo;

import java.util.ArrayList;

public class MetodosCursos {
    ArrayList <Curso> arrayCurso;

    public MetodosCursos() {
        arrayCurso=new ArrayList <Curso>();
    }
    public void agregarCursoArray(String informacion[]){
        Curso temporal=new Curso(informacion[0],informacion[1],informacion[2]);
       // for(int contador=0;contador<arrayCurso.size();contador++){
            arrayCurso.add(temporal);
       // }
    }
    public void modificarCursoArray(String arreglo[]){
        for(int contador=0;contador<arrayCurso.size();contador++){
            if(this.arrayCurso.get(contador).getSigla().equals(arreglo[0])){
              arrayCurso.get(contador).setNombreCurso(arreglo[1]);
              arrayCurso.get(contador).setCreditos(arreglo[2]);
            }
        }
    }
    public void eliminarCursoArray(String arreglo[]){
         for(int contador=0;contador<arrayCurso.size();contador++){
           if(arrayCurso.get(contador).getSigla().equals(arreglo[0])){
               arrayCurso.remove(contador);
           }
       } 
    }
 
       public String[] consultarCursos(String sigla){
        String datos[]=new String[2];
       for(int contador=0;contador<arrayCurso.size();contador++){
           if(arrayCurso.get(contador).getSigla().equals(sigla)){
              datos[0]=arrayCurso.get(contador).getNombreCurso();
              datos[1]=arrayCurso.get(contador).getCreditos();
       }
       }
           return datos;
    }
      
    public void mostrarCurso(){
        Curso temporal;
        temporal=arrayCurso.get(0);
        System.out.println(temporal.getInformacion());
        
    }
}
