
package payroll;


public class PayrollPanel extends javax.swing.JPanel {

   
    public PayrollPanel() {
        initComponents();
        String[] columns = {"Month", "Payroll Type", "Earnings", "Taxes", "Total Pay", "Status"};
    Object[][] data = {};
    payrollTable.setModel(new javax.swing.table.DefaultTableModel(data, columns));
    payrollTable.setBackground(new java.awt.Color(21, 24, 32));
    payrollTable.setForeground(new java.awt.Color(232, 234, 240));
    payrollTable.setGridColor(new java.awt.Color(37, 42, 56));
    payrollTable.setRowHeight(35);
    payrollTable.getTableHeader().setBackground(new java.awt.Color(21, 24, 32));
    payrollTable.getTableHeader().setForeground(new java.awt.Color(85, 93, 120));
    payrollTable.setSelectionBackground(new java.awt.Color(28, 32, 48));
    payrollTable.setFillsViewportHeight(false);
    jScrollPane1.getViewport().setBackground(new java.awt.Color(13, 15, 20));
    jScrollPane1.setBackground(new java.awt.Color(13, 15, 20));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PayrollTitleLbl = new javax.swing.JLabel();
        btnPayrollTab = new javax.swing.JButton();
        btnCompanyTab = new javax.swing.JButton();
        btnTravelTab = new javax.swing.JButton();
        TableCard = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        payrollTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(13, 15, 20));

        PayrollTitleLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PayrollTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        PayrollTitleLbl.setText("Payroll");

        btnPayrollTab.setBackground(new java.awt.Color(79, 142, 247));
        btnPayrollTab.setForeground(new java.awt.Color(255, 255, 255));
        btnPayrollTab.setText("Payroll");

        btnCompanyTab.setBackground(new java.awt.Color(13, 15, 20));
        btnCompanyTab.setForeground(new java.awt.Color(136, 144, 168));
        btnCompanyTab.setText("Company Expense");

        btnTravelTab.setBackground(new java.awt.Color(13, 15, 20));
        btnTravelTab.setForeground(new java.awt.Color(136, 144, 168));
        btnTravelTab.setText("Travel Request");
        btnTravelTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTravelTabActionPerformed(evt);
            }
        });

        payrollTable.setBackground(new java.awt.Color(21, 24, 32));
        payrollTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Month", "Payroll Type", "Earnings", "Taxes", "Total Pay", "Status"
            }
        ));
        jScrollPane1.setViewportView(payrollTable);

        javax.swing.GroupLayout TableCardLayout = new javax.swing.GroupLayout(TableCard);
        TableCard.setLayout(TableCardLayout);
        TableCardLayout.setHorizontalGroup(
            TableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1348, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        TableCardLayout.setVerticalGroup(
            TableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPayrollTab)
                            .addComponent(PayrollTitleLbl))
                        .addGap(47, 47, 47)
                        .addComponent(btnCompanyTab)
                        .addGap(33, 33, 33)
                        .addComponent(btnTravelTab))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(TableCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(417, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(PayrollTitleLbl)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPayrollTab)
                    .addComponent(btnCompanyTab)
                    .addComponent(btnTravelTab))
                .addGap(28, 28, 28)
                .addComponent(TableCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTravelTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTravelTabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTravelTabActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PayrollTitleLbl;
    private javax.swing.JPanel TableCard;
    private javax.swing.JButton btnCompanyTab;
    private javax.swing.JButton btnPayrollTab;
    private javax.swing.JButton btnTravelTab;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable payrollTable;
    // End of variables declaration//GEN-END:variables
}
