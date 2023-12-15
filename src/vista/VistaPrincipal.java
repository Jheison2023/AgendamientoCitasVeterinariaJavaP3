package vista;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTable;

public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_Citas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_Veterinarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jbtnCerrarPrograma = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOpciones = new javax.swing.JMenu();
        opcionesCita = new javax.swing.JMenu();
        opAgregarCita = new javax.swing.JMenuItem();
        opBuscarCita = new javax.swing.JMenuItem();
        opEliminarCita = new javax.swing.JMenuItem();
        opFinalizarC = new javax.swing.JMenuItem();
        opcionesVeterinario = new javax.swing.JMenu();
        opAgregarVeterinario = new javax.swing.JMenuItem();
        opBuscarVeterinario = new javax.swing.JMenuItem();
        opEliminarVeterinario = new javax.swing.JMenuItem();
        opEjecutarComandos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("Listado de citas registradas");

        jtbl_Citas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtbl_Citas);

        jtbl_Veterinarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtbl_Veterinarios);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setText("Listado de veterinarios registrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnCerrarPrograma.setText("Cerrar");
        jbtnCerrarPrograma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuOpciones.setText("Opciones");

        opcionesCita.setText("Citas");
        opcionesCita.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        opAgregarCita.setText("Agregar cita");
        opAgregarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionesCita.add(opAgregarCita);

        opBuscarCita.setText("Buscar cita");
        opBuscarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionesCita.add(opBuscarCita);

        opEliminarCita.setText("Eliminar cita");
        opEliminarCita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionesCita.add(opEliminarCita);

        opFinalizarC.setText("Finalizar cita");
        opcionesCita.add(opFinalizarC);

        menuOpciones.add(opcionesCita);

        opcionesVeterinario.setText("Veterinarios");

        opAgregarVeterinario.setText("Agregar veterinario");
        opAgregarVeterinario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionesVeterinario.add(opAgregarVeterinario);

        opBuscarVeterinario.setText("Buscar veterinario");
        opBuscarVeterinario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionesVeterinario.add(opBuscarVeterinario);

        opEliminarVeterinario.setText("Eliminar veterinario");
        opEliminarVeterinario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionesVeterinario.add(opEliminarVeterinario);

        menuOpciones.add(opcionesVeterinario);

        opEjecutarComandos.setText("Ejecutar comandos");
        menuOpciones.add(opEjecutarComandos);

        jMenuBar1.add(menuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnCerrarPrograma)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCerrarPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnCerrarPrograma;
    private javax.swing.JTable jtbl_Citas;
    private javax.swing.JTable jtbl_Veterinarios;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenuItem opAgregarCita;
    private javax.swing.JMenuItem opAgregarVeterinario;
    private javax.swing.JMenuItem opBuscarCita;
    private javax.swing.JMenuItem opBuscarVeterinario;
    private javax.swing.JMenuItem opEjecutarComandos;
    private javax.swing.JMenuItem opEliminarCita;
    private javax.swing.JMenuItem opEliminarVeterinario;
    private javax.swing.JMenuItem opFinalizarC;
    private javax.swing.JMenu opcionesCita;
    private javax.swing.JMenu opcionesVeterinario;
    // End of variables declaration//GEN-END:variables

    public JButton getJbtnCerrarPrograma() {
        return jbtnCerrarPrograma;
    }

    public void setJbtnCerrarPrograma(JButton jbtnCerrarPrograma) {
        this.jbtnCerrarPrograma = jbtnCerrarPrograma;
    }

    public JMenu getMenuOpciones() {
        return menuOpciones;
    }

    public void setMenuOpciones(JMenu menuOpciones) {
        this.menuOpciones = menuOpciones;
    }

    public JMenuItem getOpAgregarCita() {
        return opAgregarCita;
    }

    public void setOpAgregarCita(JMenuItem opAgregarCita) {
        this.opAgregarCita = opAgregarCita;
    }

    public JMenuItem getOpAgregarVeterinario() {
        return opAgregarVeterinario;
    }

    public void setOpAgregarVeterinario(JMenuItem opAgregarVeterinario) {
        this.opAgregarVeterinario = opAgregarVeterinario;
    }

    public JMenuItem getOpBuscarCita() {
        return opBuscarCita;
    }

    public void setOpBuscarCita(JMenuItem opBuscarCita) {
        this.opBuscarCita = opBuscarCita;
    }

    public JMenuItem getOpBuscarVeterinario() {
        return opBuscarVeterinario;
    }

    public void setOpBuscarVeterinario(JMenuItem opBuscarVeterinario) {
        this.opBuscarVeterinario = opBuscarVeterinario;
    }

    public JMenuItem getOpEliminarCita() {
        return opEliminarCita;
    }

    public void setOpEliminarCita(JMenuItem opEliminarCita) {
        this.opEliminarCita = opEliminarCita;
    }

    public JMenuItem getOpEliminarVeterinario() {
        return opEliminarVeterinario;
    }

    public void setOpEliminarVeterinario(JMenuItem opEliminarVeterinario) {
        this.opEliminarVeterinario = opEliminarVeterinario;
    }

    public JMenu getOpcionesCita() {
        return opcionesCita;
    }

    public void setOpcionesCita(JMenu opcionesCita) {
        this.opcionesCita = opcionesCita;
    }

    public JMenu getOpcionesVeterinario() {
        return opcionesVeterinario;
    }

    public void setOpcionesVeterinario(JMenu opcionesVeterinario) {
        this.opcionesVeterinario = opcionesVeterinario;
    }

    public JTable getJtbl_Citas() {
        return jtbl_Citas;
    }

    public void setJtbl_Citas(JTable jtbl_Citas) {
        this.jtbl_Citas = jtbl_Citas;
    }

    public JTable getJtbl_Veterinarios() {
        return jtbl_Veterinarios;
    }

    public void setJtbl_Veterinarios(JTable jtbl_Veterinarios) {
        this.jtbl_Veterinarios = jtbl_Veterinarios;
    }

    public JMenuItem getOpEjecutarComandos() {
        return opEjecutarComandos;
    }

    public void setOpEjecutarComandos(JMenuItem opEjecutarComandos) {
        this.opEjecutarComandos = opEjecutarComandos;
    }

    public JMenuItem getOpFinalizarC() {
        return opFinalizarC;
    }

    public void setOpFinalizarC(JMenuItem opFinalizarC) {
        this.opFinalizarC = opFinalizarC;
    }

}
