
package payroll;


public class PayslipListPanel extends javax.swing.JPanel {

  
    public PayslipListPanel() {
    initComponents();
    EmpTable.setForeground(new java.awt.Color(232, 234, 240));
    EmpTable.setGridColor(new java.awt.Color(37, 42, 56));
    EmpTable.setRowHeight(45);
    EmpTable.getTableHeader().setBackground(new java.awt.Color(21, 24, 32));
    EmpTable.getTableHeader().setForeground(new java.awt.Color(85, 93, 120));
    EmpTable.setSelectionBackground(new java.awt.Color(28, 32, 48));
    EmpTable.setFillsViewportHeight(false);
    tableCard.getViewport().setBackground(new java.awt.Color(21, 24, 32));
    tableCard.setBackground(new java.awt.Color(21, 24, 32));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListPanel = new javax.swing.JPanel();
        PayslipLbl = new javax.swing.JLabel();
        SelectLbl = new javax.swing.JLabel();
        TableCard = new javax.swing.JPanel();
        tableCard = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1280, 800));

        ListPanel.setBackground(new java.awt.Color(13, 15, 20));
        ListPanel.setPreferredSize(new java.awt.Dimension(1280, 800));

        PayslipLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PayslipLbl.setForeground(new java.awt.Color(255, 255, 255));
        PayslipLbl.setText("Payslip");

        SelectLbl.setForeground(new java.awt.Color(255, 255, 255));
        SelectLbl.setText("SELECT AN EMPLOYEE TO VIEW PAYSLIP HISTORY");

        TableCard.setBackground(new java.awt.Color(21, 24, 32));

        tableCard.setBackground(new java.awt.Color(21, 24, 32));
        tableCard.setForeground(new java.awt.Color(255, 255, 255));
        tableCard.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableCard.setViewportView(null);

        EmpTable.setBackground(new java.awt.Color(21, 24, 32));
        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableCard.setViewportView(EmpTable);

        javax.swing.GroupLayout TableCardLayout = new javax.swing.GroupLayout(TableCard);
        TableCard.setLayout(TableCardLayout);
        TableCardLayout.setHorizontalGroup(
            TableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableCard, javax.swing.GroupLayout.DEFAULT_SIZE, 1163, Short.MAX_VALUE)
                .addContainerGap())
        );
        TableCardLayout.setVerticalGroup(
            TableCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableCard)
                .addContainerGap())
        );

        javax.swing.GroupLayout ListPanelLayout = new javax.swing.GroupLayout(ListPanel);
        ListPanel.setLayout(ListPanelLayout);
        ListPanelLayout.setHorizontalGroup(
            ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TableCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PayslipLbl)
                    .addComponent(SelectLbl))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        ListPanelLayout.setVerticalGroup(
            ListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(PayslipLbl)
                .addGap(18, 18, 18)
                .addComponent(SelectLbl)
                .addGap(18, 18, 18)
                .addComponent(TableCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ListPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable EmpTable;
    private javax.swing.JPanel ListPanel;
    private javax.swing.JLabel PayslipLbl;
    private javax.swing.JLabel SelectLbl;
    private javax.swing.JPanel TableCard;
    private javax.swing.JScrollPane tableCard;
    // End of variables declaration//GEN-END:variables
}
