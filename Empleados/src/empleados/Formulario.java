/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Erick
 */
public class Formulario extends javax.swing.JFrame {
    //Lista de empleados
    DefaultTableModel tblModelEmpleados; 
    String[][] empleados;
    
    List<Empleados> listaEmpleados = new ArrayList<Empleados>();
    
    String[] listaCargos = new String[]{
        "Gerente","Vendedor","Bodega","Contador","Recursos Humanos"
    };
    DefaultComboBoxModel listaCargosModel = new DefaultComboBoxModel(listaCargos);
    /**
     * Creates new form Formulario
     */
    
    public Formulario() {
        initComponents();
        this.setTitle("Formulario de Empleados");
        
        String titulosColumnasEmpleados[]= new String []{
            "Nombre","Apellido","Cargo"
        };
        tblModelEmpleados = new DefaultTableModel(empleados,titulosColumnasEmpleados);
        tblListaEmpleados.setModel(tblModelEmpleados);
        cmbCargo.setModel(listaCargosModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpnFormulario = new javax.swing.JTabbedPane();
        jplRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        jplListaEmpleados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaEmpleados = new javax.swing.JTable();
        cmbFiltroCargos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        lblApellido.setText("Apellido:");

        lblCargo.setText("Cargo:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplRegistroLayout = new javax.swing.GroupLayout(jplRegistro);
        jplRegistro.setLayout(jplRegistroLayout);
        jplRegistroLayout.setHorizontalGroup(
            jplRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplRegistroLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(jplRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnRegistrar)
                    .addGroup(jplRegistroLayout.createSequentialGroup()
                        .addComponent(lblCargo)
                        .addGap(26, 26, 26)
                        .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jplRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre))
                    .addGroup(jplRegistroLayout.createSequentialGroup()
                        .addComponent(lblApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido)))
                .addGap(147, 147, 147))
        );
        jplRegistroLayout.setVerticalGroup(
            jplRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplRegistroLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jplRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jplRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo)
                    .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(btnRegistrar)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        tpnFormulario.addTab("Registro", jplRegistro);

        jLabel2.setText("Filtrar Cargo:");

        tblListaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(tblListaEmpleados);

        cmbFiltroCargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Vendedor", "Bodega", "Contador", "Recursos Humanos", "Todos" }));
        cmbFiltroCargos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFiltroCargosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jplListaEmpleadosLayout = new javax.swing.GroupLayout(jplListaEmpleados);
        jplListaEmpleados.setLayout(jplListaEmpleadosLayout);
        jplListaEmpleadosLayout.setHorizontalGroup(
            jplListaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplListaEmpleadosLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(cmbFiltroCargos, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplListaEmpleadosLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jplListaEmpleadosLayout.setVerticalGroup(
            jplListaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplListaEmpleadosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jplListaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbFiltroCargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tpnFormulario.addTab("Lista de Empleados", jplListaEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpnFormulario)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cargo = cmbCargo.getSelectedItem().toString();
        
        int afirmar = JOptionPane.showConfirmDialog
        (rootPane, "¿Está seguro en registrar a este empleado?", "Comprobación de registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(!nombre.equals("") && !apellido.equals("")){
            if (afirmar == 0) {
                Empleados newEmpleado = new Empleados(nombre,apellido,cargo);
                //empleado = newEmpleado;
                JOptionPane.showMessageDialog
                (rootPane, "Se registró exitosamente a: "+newEmpleado.getNombre()+" "+newEmpleado.getApellido()
                        +" con el cargo de: "+newEmpleado.getCargo());
                
                listaEmpleados.add(newEmpleado);
                tblModelEmpleados.addRow(new String[]{newEmpleado.getNombre(),newEmpleado.getApellido(),newEmpleado.getCargo()});
                txtNombre.setText("");
                txtApellido.setText("");
            }

        }else{
            JOptionPane.showMessageDialog(rootPane, "Llene todos los campos, por favor.");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cmbFiltroCargosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFiltroCargosItemStateChanged
        String filtro = cmbFiltroCargos.getSelectedItem().toString();
        
        TableRowSorter<DefaultTableModel> tblFiltro = new TableRowSorter<DefaultTableModel>(tblModelEmpleados);
        tblListaEmpleados.setRowSorter(tblFiltro);
        
        if(!filtro.equals("Todos")){
            tblFiltro.setRowFilter(RowFilter.regexFilter(filtro,2));
        }else{
            tblListaEmpleados.setRowSorter(tblFiltro);
        }
    }//GEN-LAST:event_cmbFiltroCargosItemStateChanged

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbFiltroCargos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jplListaEmpleados;
    private javax.swing.JPanel jplRegistro;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JTable tblListaEmpleados;
    private javax.swing.JTabbedPane tpnFormulario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
