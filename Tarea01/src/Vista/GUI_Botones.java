
package Vista;

import Controlador.Controlador_FRM_RegistroCursos;
import Controlador.Controlador_FRM_RegistroEstudiantes;


public class GUI_Botones extends javax.swing.JPanel {
Controlador_FRM_RegistroEstudiantes controladorE;
  
    public GUI_Botones() {
        initComponents();
    }

    public void agregarEventos(Controlador_FRM_RegistroEstudiantes controladorE){
        this.controladorE=controladorE;
        this.jb_Agregar.addActionListener(controladorE);
        this.jb_Buscar.addActionListener(controladorE);
        this.jb_Eliminar.addActionListener(controladorE);
        this.jb_Modificar.addActionListener(controladorE);
    }
    
    public void agregarEventosCursos(Controlador_FRM_RegistroCursos controladorC){
         controladorC=controladorC;
        this.jb_Agregar.addActionListener(controladorC);
        this.jb_Buscar.addActionListener(controladorC);
        this.jb_Eliminar.addActionListener(controladorC);
        this.jb_Modificar.addActionListener(controladorC);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Buscar = new javax.swing.JButton();
        jb_Modificar = new javax.swing.JButton();
        jb_Agregar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();

        jb_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar2.png"))); // NOI18N
        jb_Buscar.setText("Buscar ");

        jb_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MODIFICAR.png"))); // NOI18N
        jb_Modificar.setText("Modificar");

        jb_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGREGAR.png"))); // NOI18N
        jb_Agregar.setText("Agregar");

        jb_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ELIMINAR (2).png"))); // NOI18N
        jb_Eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_Buscar)
                .addGap(18, 18, 18)
                .addComponent(jb_Agregar)
                .addGap(18, 18, 18)
                .addComponent(jb_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Modificar)
                    .addComponent(jb_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Modificar;
    // End of variables declaration//GEN-END:variables
}
