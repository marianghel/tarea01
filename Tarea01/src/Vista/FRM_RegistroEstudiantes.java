
package Vista;

import Controlador.Controlador_FRM_RegistroEstudiantes;

public class FRM_RegistroEstudiantes extends javax.swing.JFrame {

    Controlador_FRM_RegistroEstudiantes controladorE;
    public FRM_RegistroEstudiantes() {
        initComponents();
        setLocation(200,200);
        setVisible(false);
        controladorE=new Controlador_FRM_RegistroEstudiantes(this);
        this.gUI_Botones1.agregarEventos(controladorE);
        this.gUI_Informacion1.agregarEventos(controladorE);
        
    }

    public String[] devolverInformacion(){
        return this.gUI_Informacion1.devolverInformacion();
    }
    public String devolverCarnet(){
        return this.gUI_Informacion1.devolverCarnet();
    }
    public String devolverNombre(){
        return this.gUI_Informacion1.devolverNombre();
    }

    public void setgUI_Botones1(GUI_Botones gUI_Botones1) {
        this.gUI_Botones1 = gUI_Botones1;
    }

    public void setgUI_Informacion1(GUI_InformacionEstudiantes gUI_Informacion1) {
        this.gUI_Informacion1 = gUI_Informacion1;
    }
   public void mostrarInformacionEstudiante(String arreglo[]){
       this.gUI_Informacion1.mostrarNombreEstudiante(arreglo);
   }
  public void  mostrarTodosEstudiantes(String informacion){
      this.gUI_Informacion1.VerEstudiantes(informacion);
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gUI_Informacion1 = new Vista.GUI_InformacionEstudiantes();
        gUI_Botones1 = new Vista.GUI_Botones();
        jl_Fondo = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(gUI_Informacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));
        getContentPane().add(gUI_Botones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.png"))); // NOI18N
        jl_Fondo.setPreferredSize(new java.awt.Dimension(780, 448));
        getContentPane().add(jl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_Botones gUI_Botones1;
    private Vista.GUI_InformacionEstudiantes gUI_Informacion1;
    private javax.swing.JLabel jl_Fondo;
    // End of variables declaration//GEN-END:variables
}
