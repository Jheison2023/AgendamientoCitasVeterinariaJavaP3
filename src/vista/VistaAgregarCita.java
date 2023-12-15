package vista;

import javax.swing.JButton;
import javax.swing.JTextField;

public class VistaAgregarCita extends javax.swing.JFrame {

    public VistaAgregarCita() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_ID = new javax.swing.JTextField();
        jtf_fecha = new javax.swing.JTextField();
        jtf_NombreCliente = new javax.swing.JTextField();
        jtf_CorreoCliente = new javax.swing.JTextField();
        jtf_TeléfonoCliente = new javax.swing.JTextField();
        jtf_IDVeterinario = new javax.swing.JTextField();
        jtf_nombreMascota = new javax.swing.JTextField();
        jtf_tipoAnimal = new javax.swing.JTextField();
        jbtnCerrar = new javax.swing.JButton();
        jbtnVolver = new javax.swing.JButton();
        jbtnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Agregar cita");

        jtf_ID.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        jtf_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));

        jtf_NombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del cliente"));

        jtf_CorreoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Correo del cliente"));

        jtf_TeléfonoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfono del cliente"));

        jtf_IDVeterinario.setBorder(javax.swing.BorderFactory.createTitledBorder("ID del veterinario"));

        jtf_nombreMascota.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre de mascota"));

        jtf_tipoAnimal.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de animal"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jtf_ID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtf_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_TeléfonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_nombreMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtf_CorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_IDVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_tipoAnimal))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_TeléfonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_CorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_IDVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_tipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnCerrar.setText("Cerrar");

        jbtnVolver.setText("Volver");

        jbtnRegistrar.setText("Registrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCerrar)))
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
                    .addComponent(jbtnVolver)
                    .addComponent(jbtnRegistrar))
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
            java.util.logging.Logger.getLogger(VistaAgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAgregarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAgregarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnCerrar;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JButton jbtnVolver;
    private javax.swing.JTextField jtf_CorreoCliente;
    private javax.swing.JTextField jtf_ID;
    private javax.swing.JTextField jtf_IDVeterinario;
    private javax.swing.JTextField jtf_NombreCliente;
    private javax.swing.JTextField jtf_TeléfonoCliente;
    private javax.swing.JTextField jtf_fecha;
    private javax.swing.JTextField jtf_nombreMascota;
    private javax.swing.JTextField jtf_tipoAnimal;
    // End of variables declaration//GEN-END:variables

    public JButton getJbtnCerrar() {
        return jbtnCerrar;
    }

    public void setJbtnCerrar(JButton jbtnCerrar) {
        this.jbtnCerrar = jbtnCerrar;
    }

    public JButton getJbtnRegistrar() {
        return jbtnRegistrar;
    }

    public void setJbtnRegistrar(JButton jbtnRegistrar) {
        this.jbtnRegistrar = jbtnRegistrar;
    }

    public JButton getJbtnVolver() {
        return jbtnVolver;
    }

    public void setJbtnVolver(JButton jbtnVolver) {
        this.jbtnVolver = jbtnVolver;
    }

    public JTextField getJtf_CorreoCliente() {
        return jtf_CorreoCliente;
    }

    public void setJtf_CorreoCliente(JTextField jtf_CorreoCliente) {
        this.jtf_CorreoCliente = jtf_CorreoCliente;
    }

    public JTextField getJtf_ID() {
        return jtf_ID;
    }

    public void setJtf_ID(JTextField jtf_ID) {
        this.jtf_ID = jtf_ID;
    }

    public JTextField getJtf_IDVeterinario() {
        return jtf_IDVeterinario;
    }

    public void setJtf_IDVeterinario(JTextField jtf_IDVeterinario) {
        this.jtf_IDVeterinario = jtf_IDVeterinario;
    }

    public JTextField getJtf_NombreCliente() {
        return jtf_NombreCliente;
    }

    public void setJtf_NombreCliente(JTextField jtf_NombreCliente) {
        this.jtf_NombreCliente = jtf_NombreCliente;
    }

    public JTextField getJtf_TeléfonoCliente() {
        return jtf_TeléfonoCliente;
    }

    public void setJtf_TeléfonoCliente(JTextField jtf_TeléfonoCliente) {
        this.jtf_TeléfonoCliente = jtf_TeléfonoCliente;
    }

    public JTextField getJtf_fecha() {
        return jtf_fecha;
    }

    public void setJtf_fecha(JTextField jtf_fecha) {
        this.jtf_fecha = jtf_fecha;
    }

    public JTextField getJtf_nombreMascota() {
        return jtf_nombreMascota;
    }

    public void setJtf_nombreMascota(JTextField jtf_nombreMascota) {
        this.jtf_nombreMascota = jtf_nombreMascota;
    }

    public JTextField getJtf_tipoAnimal() {
        return jtf_tipoAnimal;
    }

    public void setJtf_tipoAnimal(JTextField jtf_tipoAnimal) {
        this.jtf_tipoAnimal = jtf_tipoAnimal;
    }

}
