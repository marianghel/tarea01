
package Vista;

import Controlador.Controlador_FRM_RegistroCursos;


public class GUI_InformacionCursos extends javax.swing.JPanel {
    public GUI_InformacionCursos() {
        initComponents();
    }
public String[] devolverInformacion(){
    String arreglo[];
    arreglo=new String[3];
    arreglo[0]=this.jt_Siglas.getText();
    arreglo[1]=this.jt_NombreCurso.getText();
    arreglo[2]=this.jt_Creditos.getText();
    return arreglo;
}
public void agregarEventoConsultar(Controlador_FRM_RegistroCursos controladorC){
   this.jb_Consultar.addActionListener(controladorC); 
}
public String devolverSigla(){
   return this.jt_Siglas.getText();
}
public void mostrarInformacion(String arreglo[]){
    this.jt_NombreCurso.setText(arreglo[0]);
    this.jt_Creditos.setText(arreglo[1]);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_Siglas = new javax.swing.JLabel();
        jt_Siglas = new javax.swing.JTextField();
        jl_NombreCurso = new javax.swing.JLabel();
        jt_NombreCurso = new javax.swing.JTextField();
        jl_Creditos = new javax.swing.JLabel();
        jt_Creditos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_VerCusos = new javax.swing.JTextArea();
        jb_Consultar = new javax.swing.JButton();

        jl_Siglas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_Siglas.setText("Siglas");

        jl_NombreCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_NombreCurso.setText("Nombre Curso");

        jl_Creditos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_Creditos.setText("Créditos");

        jta_VerCusos.setColumns(20);
        jta_VerCusos.setRows(5);
        jScrollPane1.setViewportView(jta_VerCusos);

        jb_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        jb_Consultar.setText("Consultar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_NombreCurso)
                    .addComponent(jl_Creditos)
                    .addComponent(jl_Siglas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jt_Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jt_Siglas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_Consultar))
                    .addComponent(jt_NombreCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Siglas)
                            .addComponent(jt_Siglas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_Consultar))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_NombreCurso)
                            .addComponent(jt_NombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_Creditos)
                            .addComponent(jt_Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Consultar;
    private javax.swing.JLabel jl_Creditos;
    private javax.swing.JLabel jl_NombreCurso;
    private javax.swing.JLabel jl_Siglas;
    private javax.swing.JTextField jt_Creditos;
    private javax.swing.JTextField jt_NombreCurso;
    private javax.swing.JTextField jt_Siglas;
    private javax.swing.JTextArea jta_VerCusos;
    // End of variables declaration//GEN-END:variables
}
