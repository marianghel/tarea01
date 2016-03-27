package Vista;

import Controlador.Controlador_FRM_MenuPrincipal;


public class FRM_MenuPrincipal extends javax.swing.JFrame {

   FRM_RegistroEstudiantes registroE;
   FRM_RegistroCursos registroC;
   FRM_Matricula matricula;
   FRM_Reportes reportes;
   Controlador_FRM_MenuPrincipal controlador;
   
    public FRM_MenuPrincipal() {
        initComponents();
        registroE = new FRM_RegistroEstudiantes();
        registroC= new FRM_RegistroCursos();
        matricula= new FRM_Matricula();
        reportes= new FRM_Reportes();
        controlador= new Controlador_FRM_MenuPrincipal();
        setLocation(200,200);
        agregarEventos();
    }

    public void agregarEventos(){
        this.jm_Salir2.addActionListener(controlador);
        this.jm_MatricularEstudiantes.addActionListener(controlador);
        this.jm_RegistroEstudiantes.addActionListener(controlador);
        this.jm_ResgistrarCursos.addActionListener(controlador);
        this.jm_Reporte.addActionListener(controlador);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jl_FondoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_Registrar = new javax.swing.JMenu();
        jm_RegistroEstudiantes = new javax.swing.JMenuItem();
        jm_ResgistrarCursos = new javax.swing.JMenuItem();
        jm_Matricula = new javax.swing.JMenu();
        jm_MatricularEstudiantes = new javax.swing.JMenuItem();
        jm_Reporte = new javax.swing.JMenuItem();
        jm_Salir1 = new javax.swing.JMenu();
        jm_Salir2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_FondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDO.png"))); // NOI18N

        jm_Registrar.setText("Registrar");

        jm_RegistroEstudiantes.setText("Registro Estudiantes");
        jm_Registrar.add(jm_RegistroEstudiantes);

        jm_ResgistrarCursos.setText("Registrar Cursos");
        jm_Registrar.add(jm_ResgistrarCursos);

        jMenuBar1.add(jm_Registrar);

        jm_Matricula.setText("Matricula");

        jm_MatricularEstudiantes.setText("Matricular Estudiante");
        jm_Matricula.add(jm_MatricularEstudiantes);

        jm_Reporte.setText("Reporte");
        jm_Matricula.add(jm_Reporte);

        jMenuBar1.add(jm_Matricula);

        jm_Salir1.setText("Salir del Sistema");

        jm_Salir2.setText("Salir");
        jm_Salir1.add(jm_Salir2);

        jMenuBar1.add(jm_Salir1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_FondoPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_FondoPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jl_FondoPrincipal;
    private javax.swing.JMenu jm_Matricula;
    private javax.swing.JMenuItem jm_MatricularEstudiantes;
    private javax.swing.JMenu jm_Registrar;
    private javax.swing.JMenuItem jm_RegistroEstudiantes;
    private javax.swing.JMenuItem jm_Reporte;
    private javax.swing.JMenuItem jm_ResgistrarCursos;
    private javax.swing.JMenu jm_Salir1;
    private javax.swing.JMenuItem jm_Salir2;
    // End of variables declaration//GEN-END:variables
}
