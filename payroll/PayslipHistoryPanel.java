
package payroll;


public class PayslipHistoryPanel extends javax.swing.JPanel {

 
    public PayslipHistoryPanel() {
        initComponents();
    HistoryTable.setForeground(new java.awt.Color(232, 234, 240));
    HistoryTable.setGridColor(new java.awt.Color(37, 42, 56));
    HistoryTable.setRowHeight(40);
    HistoryTable.getTableHeader().setBackground(new java.awt.Color(21, 24, 32));
    HistoryTable.getTableHeader().setForeground(new java.awt.Color(85, 93, 120));
    HistoryTable.setSelectionBackground(new java.awt.Color(28, 32, 48));
    HistoryTable.setFillsViewportHeight(false);
    HistoryPane.getViewport().setBackground(new java.awt.Color(21, 24, 32));
    HistoryPane.setBackground(new java.awt.Color(21, 24, 32));    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HistoryPanel = new javax.swing.JPanel();
        BackBtn = new javax.swing.JButton();
        EmpIconLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HistoryCard = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        HistoryPane = new javax.swing.JScrollPane();
        HistoryTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(13, 15, 20));
        setPreferredSize(new java.awt.Dimension(1280, 800));

        HistoryPanel.setBackground(new java.awt.Color(13, 15, 20));
        HistoryPanel.setPreferredSize(new java.awt.Dimension(1280, 800));

        javax.swing.GroupLayout HistoryPanelLayout = new javax.swing.GroupLayout(HistoryPanel);
        HistoryPanel.setLayout(HistoryPanelLayout);
        HistoryPanelLayout.setHorizontalGroup(
            HistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1287, Short.MAX_VALUE)
        );
        HistoryPanelLayout.setVerticalGroup(
            HistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        BackBtn.setBackground(new java.awt.Color(21, 24, 32));
        BackBtn.setForeground(new java.awt.Color(232, 234, 240));
        BackBtn.setText("<- Back");

        EmpIconLbl.setBackground(new java.awt.Color(79, 140, 247));
        EmpIconLbl.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        EmpIconLbl.setForeground(new java.awt.Color(255, 255, 255));
        EmpIconLbl.setText("G");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Name");

        jLabel2.setForeground(new java.awt.Color(85, 93, 120));
        jLabel2.setText("ID · Dept · Position");

        HistoryCard.setBackground(new java.awt.Color(21, 24, 32));
        HistoryCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(21, 24, 32));
        jLabel3.setForeground(new java.awt.Color(85, 93, 120));
        jLabel3.setText("Payslip History");

        HistoryPane.setBackground(new java.awt.Color(21, 24, 32));

        HistoryTable.setBackground(new java.awt.Color(21, 24, 32));
        HistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Month", "Pay Date", "Gross Pay", "Deduction", "Net Pay", "Status"
            }
        ));
        HistoryPane.setViewportView(HistoryTable);

        javax.swing.GroupLayout HistoryCardLayout = new javax.swing.GroupLayout(HistoryCard);
        HistoryCard.setLayout(HistoryCardLayout);
        HistoryCardLayout.setHorizontalGroup(
            HistoryCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryCardLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HistoryCardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HistoryPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HistoryCardLayout.setVerticalGroup(
            HistoryCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoryCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HistoryPane, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HistoryCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EmpIconLbl)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EmpIconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(HistoryCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HistoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BackBtn;
    private javax.swing.JLabel EmpIconLbl;
    private javax.swing.JPanel HistoryCard;
    private javax.swing.JScrollPane HistoryPane;
    private javax.swing.JPanel HistoryPanel;
    public javax.swing.JTable HistoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
