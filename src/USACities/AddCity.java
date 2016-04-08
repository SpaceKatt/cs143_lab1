/*
 * Copyright (C) 2016 thomas.kercheval
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package USACities;

import javax.swing.JOptionPane;

/**
 * A class which defines the form by which users may add a city
 * to our application.
 * <pre>
    Project: CitiesGUI Database
    Platform: jdk 1.8.0_14; NetBeans IDE 8.1; Windows 10
    Course:
    Hours: 2 hours and 15 minutes
    Created on Apr 5, 2016, 12:32:49 PM
    Revised on Arp 7, 2016, 2:30:21 PM
 </pre>
 * @author Thomas Kercheval
 */
public class AddCity extends javax.swing.JDialog {

    /**
     * The City object which will be added to the Citystats database.
     */
    private City newCity;
    
    /**
     * Creates new form AddCity
     */
    public AddCity() {
        initComponents();
    }

    /**
     * Constructor which spawns AddCity GUI and sets modality.
     * @param aThis GUI which spawns AddCity
     * @param b boolean value which indicates modality
     */
    AddCity(CitiesGUI aThis, boolean b) {
        this.setModal(b);
        initComponents();
    }

    /**
     * Method: getCity
     * Returns the new city object
     * @return City: the new city to be added.
     */
    City getCity() {
        return newCity;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        addJButton = new javax.swing.JButton();
        exitJButton = new javax.swing.JButton();
        displayJPanel = new javax.swing.JPanel();
        nameJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        popJLabel = new javax.swing.JLabel();
        popJTextField = new javax.swing.JTextField();
        medianJLabel = new javax.swing.JLabel();
        medianJTextField = new javax.swing.JTextField();
        percentJLabel = new javax.swing.JLabel();
        percentJTextField = new javax.swing.JTextField();
        degreetJLabel = new javax.swing.JLabel();
        degreeJTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New City Form");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/USACities/buckinghamfountain.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        jLabel2.setText("Add New City");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titlePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(titlePanel, java.awt.BorderLayout.NORTH);

        controlPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        controlPanel.setMinimumSize(new java.awt.Dimension(299, 45));
        controlPanel.setLayout(new java.awt.GridLayout(1, 5, 5, 5));

        addJButton.setBackground(new java.awt.Color(204, 255, 204));
        addJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addJButton.setMnemonic('S');
        addJButton.setText("Save");
        addJButton.setToolTipText("Save new city");
        addJButton.setMinimumSize(new java.awt.Dimension(57, 45));
        addJButton.setPreferredSize(new java.awt.Dimension(57, 35));
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });
        controlPanel.add(addJButton);

        exitJButton.setBackground(new java.awt.Color(204, 255, 204));
        exitJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitJButton.setMnemonic('C');
        exitJButton.setText("Cancel");
        exitJButton.setToolTipText("Cancel adding new city");
        exitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });
        controlPanel.add(exitJButton);

        getContentPane().add(controlPanel, java.awt.BorderLayout.SOUTH);

        displayJPanel.setLayout(new java.awt.GridLayout(5, 2, 5, 5));

        nameJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nameJLabel.setText("Name of city: ");
        displayJPanel.add(nameJLabel);

        nameJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        displayJPanel.add(nameJTextField);

        popJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        popJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        popJLabel.setText("Population (in millions): ");
        displayJPanel.add(popJLabel);

        popJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        popJTextField.setToolTipText("Press Enter to update");
        displayJPanel.add(popJTextField);

        medianJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        medianJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        medianJLabel.setText("Median income (per household): ");
        displayJPanel.add(medianJLabel);

        medianJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        medianJTextField.setToolTipText("Enter with no $ or commas and press Enter to update");
        displayJPanel.add(medianJTextField);

        percentJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        percentJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        percentJLabel.setText("Percent native to state: ");
        displayJPanel.add(percentJLabel);

        percentJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        percentJTextField.setToolTipText("Enter without % sign and pres Enter to update");
        displayJPanel.add(percentJTextField);

        degreetJLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        degreetJLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        degreetJLabel.setText("Percent advanced degrees: ");
        displayJPanel.add(degreetJLabel);

        degreeJTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        degreeJTextField.setToolTipText("Enter without % sign and press Enter to update");
        displayJPanel.add(degreeJTextField);

        getContentPane().add(displayJPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Event handler for saving the new city from text field input.
     * Validates input before saving and closing the pop-up window.
     * @param evt 
     * @return void
     */
    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        String name = nameJTextField.getText();
        String median = medianJTextField.getText();
        String local = percentJTextField.getText();
        String degree = degreeJTextField.getText();
        String population = popJTextField.getText();
        boolean condition = !(name.equals("") && median.equals("") &&
                            population.equals("") && degree.equals("") &&
                            local.equals(""));
        if (condition) {
            try {
                double pop = Double.parseDouble(population);
                double medianDouble = Double.parseDouble(median);
                double localDouble = Double.parseDouble(local);
                double degreeDouble = Double.parseDouble(degree);
                newCity = new City(name, pop, medianDouble, localDouble, 
                        degreeDouble);
                this.setVisible(false);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,
                                          "Some Fields must be numeric.",
                                          "Incomplete Form",
                                          JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                                          "All Fields must be complete.",
                                          "Incomplete Form",
                                          JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveJButtonActionPerformed

    /**
     * Event handler for the cancellation of new City creation.
     * @param evt 
     * @return void
     */
    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        // End  program
        this.newCity = null;
        this.setVisible(false);
    }//GEN-LAST:event_cancelJButtonActionPerformed

    /**
     * Spawns AddCity form.
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
            java.util.logging.Logger.getLogger(AddCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JTextField degreeJTextField;
    private javax.swing.JLabel degreetJLabel;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JButton exitJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel medianJLabel;
    private javax.swing.JTextField medianJTextField;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JLabel percentJLabel;
    private javax.swing.JTextField percentJTextField;
    private javax.swing.JLabel popJLabel;
    private javax.swing.JTextField popJTextField;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

}
