
package Vista;

import Controlador.Controlador_FRM_RegistroCursos;


public class FRM_RegistroCursos extends javax.swing.JFrame {

     Controlador_FRM_RegistroCursos controladorC;
    public FRM_RegistroCursos() {
        initComponents();
        setLocation(200,200);
        setVisible(false);
       controladorC=new Controlador_FRM_RegistroCursos(this);
       this.gUI_Botones1.agregarEventosCursos(controladorC);
       this.gUI_InformacionCursos1.agregarEventoConsultar(controladorC);
        
    }

    public String[] devolverInformacion(){
        return this.gUI_InformacionCursos1.devolverInformacion();
    }
    public String devolverSigla(){
        return this.gUI_InformacionCursos1.devolverSigla();
    }

    public void setgUI_Botones1(GUI_Botones gUI_Botones1) {
        this.gUI_Botones1 = gUI_Botones1;
    }

    public void setgUI_InformacionCursos1(GUI_InformacionCursos gUI_InformacionCursos1) {
        this.gUI_InformacionCursos1 = gUI_InformacionCursos1;
    }
    public void mostrarInformacionCurso(String arreglo[]){
        this.gUI_InformacionCursos1.mostrarInformacion(arreglo);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_Botones1 = new Vista.GUI_Botones();
        gUI_InformacionCursos1 = new Vista.GUI_InformacionCursos();
        jl_Fondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(gUI_Botones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));
        getContentPane().add(gUI_InformacionCursos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        getContentPane().add(jl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_InformacionCursos gUI_InformacionCursos1;
    private javax.swing.JLabel jl_Fondo;
    // End of variables declaration//GEN-END:variables
}
