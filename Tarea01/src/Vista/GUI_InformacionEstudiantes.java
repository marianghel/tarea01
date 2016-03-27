
package Vista;

import Controlador.Controlador_FRM_RegistroEstudiantes;
import javax.swing.JTextField;

public class GUI_InformacionEstudiantes extends javax.swing.JPanel {


    public GUI_InformacionEstudiantes() {
        initComponents();

    }
 public String[] devolverInformacion(){
       String arreglo[];
       arreglo=new String[2];
       arreglo[0]=this.jt_Carnet.getText();
       arreglo[1]=this.jt_Nombre.getText();
       
              return arreglo;
   }
   public void agregarEventos(Controlador_FRM_RegistroEstudiantes controlador){
       this.jb_Consultar.addActionListener(controlador);
   }
   public String devolverCarnet()
   {
      return this.jt_Carnet.getText();
   }
   public String devolverNombre(){
       return this.jt_Nombre.getText();
   }
   
   public void mostrarNombreEstudiante(String arreglo[]){
       this.jt_Nombre.setText(arreglo[0]);
   }
   public void VerEstudiantes(String informacion){
       this.jta_EstudiantesRegistrados.setText(informacion);
   }
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Carnet = new javax.swing.JLabel();
        jt_Carnet = new javax.swing.JTextField();
        jl_Nombre = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jb_Consultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_EstudiantesRegistrados = new javax.swing.JTextArea();

        jl_Carnet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_Carnet.setText("Carnet");

        jl_Nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_Nombre.setText("Nombre");

        jt_Nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jb_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jb_Consultar.setText("Consultar");

        jta_EstudiantesRegistrados.setColumns(20);
        jta_EstudiantesRegistrados.setRows(5);
        jScrollPane1.setViewportView(jta_EstudiantesRegistrados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Carnet)
                            .addComponent(jl_Nombre))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_Nombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt_Carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jb_Consultar)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Carnet)
                    .addComponent(jt_Carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Consultar))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nombre)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Consultar;
    private javax.swing.JLabel jl_Carnet;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JTextField jt_Carnet;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextArea jta_EstudiantesRegistrados;
    // End of variables declaration//GEN-END:variables
}
