
package Controlador;

import Vista.FRM_Matricula;
import Vista.FRM_RegistroCursos;
import Vista.FRM_RegistroEstudiantes;
import Vista.FRM_Reportes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Controlador_FRM_MenuPrincipal implements ActionListener{
    
    FRM_RegistroEstudiantes registroE;
    FRM_RegistroCursos registroC;
    FRM_Matricula matricula;
    FRM_Reportes reporte;

    public Controlador_FRM_MenuPrincipal() {
    registroE= new FRM_RegistroEstudiantes();
    registroC=new FRM_RegistroCursos();
    matricula= new FRM_Matricula();
    reporte=new FRM_Reportes();
    }
      
     public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals("Registro Estudiantes")){
       registroE.setVisible(true);  
       System.out.println("registrar estudiantes");
       }
        
        if(e.getActionCommand().equals("Registrar Cursos")){
        registroC.setVisible(true);
        }
        
        if(e.getActionCommand().equals("Matricula Estudiantes")){
            matricula.setVisible(true);
        }
        if(e.getActionCommand().equals("Reportes")){
            reporte.setVisible(true);
        }
        
        if(e.getActionCommand().equals("Salir")){
             System.exit(0);
            System.out.println("salir");
        }
    }
}
