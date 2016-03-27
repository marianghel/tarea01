
package Controlador;

import Modelo.MetodosEstudiante;
import Vista.FRM_RegistroEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_FRM_RegistroEstudiantes implements ActionListener{
     MetodosEstudiante metodosE;
    FRM_RegistroEstudiantes registroE;
    
        public Controlador_FRM_RegistroEstudiantes( FRM_RegistroEstudiantes registroE) {
        this.registroE=registroE;
        metodosE= new MetodosEstudiante();
    }
  
     public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Buscar ")){
            System.out.println("Buscar ");
            this.metodosE.todosEstudiantes();
        }
        if(e.getActionCommand().equals("Agregar")){
            System.out.println("Agregar");
            this.metodosE.agregar(this.registroE.devolverInformacion());
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            System.out.println("Modificar");
            this.metodosE.modificar(this.registroE.devolverInformacion());
        }
        if(e.getActionCommand().equals("Eliminar")){
            metodosE.eliminar(this.registroE.devolverInformacion());
        }
        if(e.getActionCommand().equals("Consultar")){
            
            String datos[]=this.metodosE.consultarEstudiantes(this.registroE.devolverCarnet());
            System.out.println("devolucion del arreglo"+datos[0]);
             this.registroE.mostrarInformacionEstudiante(metodosE.consultarEstudiantes(registroE.devolverCarnet()));
        }
    }
}
