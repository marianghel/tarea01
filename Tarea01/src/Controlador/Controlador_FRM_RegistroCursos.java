
package Controlador;

import Modelo.MetodosCursos;
import Vista.FRM_RegistroCursos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_FRM_RegistroCursos implements ActionListener {
    MetodosCursos metodosC;
    FRM_RegistroCursos registroC;

    public Controlador_FRM_RegistroCursos(FRM_RegistroCursos registroC) {
        this.metodosC = new MetodosCursos();
        this.registroC = registroC;
    }
    
    
    public void actionPerformed(ActionEvent e){
       
        if(e.getActionCommand().equals("Buscar ")){
            System.out.println("Buscar ");
            this.metodosC.consultarCursos(null);
        }
        if(e.getActionCommand().equals("Agregar")){
            System.out.println("Agregar");
            this.metodosC.agregarCursoArray(this.registroC.devolverInformacion());
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            System.out.println("Modificar");
            this.metodosC.modificarCursoArray(this.registroC.devolverInformacion());
        }
        if(e.getActionCommand().equals("Eliminar")){
            metodosC.eliminarCursoArray(this.registroC.devolverInformacion());
        }
        if(e.getActionCommand().equals("Consultar")){
            
            String datos[]=this.metodosC.consultarCursos(this.registroC.devolverSigla());
            System.out.println("nombre"+datos[0]+"creditos"+datos[1]);
             this.registroC.mostrarInformacionCurso(metodosC.consultarCursos(registroC.devolverSigla()));
        }
    }
}
