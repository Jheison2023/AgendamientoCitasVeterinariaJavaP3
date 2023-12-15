package vista;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VistaBuscarCita extends javax.swing.JFrame {

    public VistaBuscarCita() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_ID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_DatosCita = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_DatosCliente = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jta_DatosVeterinario = new javax.swing.JTextArea();
        jbtnBuscar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jta_DatosMascota = new javax.swing.JTextArea();
        jbtnVolver = new javax.swing.JButton();
        jbtnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Buscar cita por ID");

        jtf_ID.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        jta_DatosCita.setColumns(20);
        jta_DatosCita.setRows(5);
        jta_DatosCita.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la cita"));
        jScrollPane1.setViewportView(jta_DatosCita);

        jta_DatosCliente.setColumns(20);
        jta_DatosCliente.setRows(5);
        jta_DatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del dueño de la mascota"));
        jScrollPane2.setViewportView(jta_DatosCliente);

        jta_DatosVeterinario.setColumns(20);
        jta_DatosVeterinario.setRows(5);
        jta_DatosVeterinario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del veterinario asignado"));
        jScrollPane3.setViewportView(jta_DatosVeterinario);

        jbtnBuscar.setText("Buscar");

        jta_DatosMascota.setColumns(20);
        jta_DatosMascota.setRows(5);
        jta_DatosMascota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la mascota"));
        jScrollPane4.setViewportView(jta_DatosMascota);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnBuscar)))
                .addGap(276, 276, 276))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jbtnVolver.setText("Volver");

        jbtnCerrar.setText("Cerrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCerrar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCerrar)
                    .addComponent(jbtnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(VistaBuscarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaBuscarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaBuscarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaBuscarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaBuscarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnVolver;
    private javax.swing.JTextArea jta_DatosCita;
    private javax.swing.JTextArea jta_DatosCliente;
    private javax.swing.JTextArea jta_DatosMascota;
    private javax.swing.JTextArea jta_DatosVeterinario;
    private javax.swing.JTextField jtf_ID;
    // End of variables declaration//GEN-END:variables

    public JButton getJbtnBuscar() {
        return jbtnBuscar;
    }

    public void setJbtnBuscar(JButton jbtnBuscar) {
        this.jbtnBuscar = jbtnBuscar;
    }

    public JButton getJbtnCerrar() {
        return jbtnCerrar;
    }

    public void setJbtnCerrar(JButton jbtnCerrar) {
        this.jbtnCerrar = jbtnCerrar;
    }

    public JButton getJbtnVolver() {
        return jbtnVolver;
    }

    public void setJbtnVolver(JButton jbtnVolver) {
        this.jbtnVolver = jbtnVolver;
    }

    public JTextArea getJta_DatosCita() {
        return jta_DatosCita;
    }

    public void setJta_DatosCita(JTextArea jta_DatosCita) {
        this.jta_DatosCita = jta_DatosCita;
    }

    public JTextArea getJta_DatosCliente() {
        return jta_DatosCliente;
    }

    public void setJta_DatosCliente(JTextArea jta_DatosCliente) {
        this.jta_DatosCliente = jta_DatosCliente;
    }

    public JTextArea getJta_DatosVeterinario() {
        return jta_DatosVeterinario;
    }

    public void setJta_DatosVeterinario(JTextArea jta_DatosVeterinario) {
        this.jta_DatosVeterinario = jta_DatosVeterinario;
    }

    public JTextField getJtf_ID() {
        return jtf_ID;
    }

    public void setJtf_ID(JTextField jtf_ID) {
        this.jtf_ID = jtf_ID;
    }

    public JTextArea getJta_DatosMascota() {
        return jta_DatosMascota;
    }

    public void setJta_DatosMascota(JTextArea jta_DatosMascota) {
        this.jta_DatosMascota = jta_DatosMascota;
    }

}
