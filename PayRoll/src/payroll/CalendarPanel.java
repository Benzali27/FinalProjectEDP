
package payroll;


public class CalendarPanel extends javax.swing.JPanel {

 
    public CalendarPanel() {
        initComponents();
    
    String[] columns = {"Month", "Total Working Days", "Pay Date", "Status"};
    Object[][] data = {};
    calendarTable.setModel(new javax.swing.table.DefaultTableModel(data, columns));
    calendarTable.setBackground(new java.awt.Color(21, 24, 32));
    calendarTable.setForeground(new java.awt.Color(232, 234, 240));
    calendarTable.setGridColor(new java.awt.Color(37, 42, 56));
    calendarTable.setRowHeight(35);
    calendarTable.getTableHeader().setBackground(new java.awt.Color(21, 24, 32));
    calendarTable.getTableHeader().setForeground(new java.awt.Color(85, 93, 120));
    calendarTable.setSelectionBackground(new java.awt.Color(28, 32, 48));
    calendarTable.setFillsViewportHeight(false);
    jScrollPane1.getViewport().setBackground(new java.awt.Color(13, 15, 20));
    jScrollPane1.setBackground(new java.awt.Color(13, 15, 20));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PayrollCalendarLbl = new javax.swing.JLabel();
        MonthlyBtn = new javax.swing.JButton();
        PayPeriodCard = new javax.swing.JPanel();
        TotalPayLbl = new javax.swing.JLabel();
        TotalPayValueLbl = new javax.swing.JLabel();
        PaymentCard = new javax.swing.JPanel();
        PaymentPeriodLbl = new javax.swing.JLabel();
        PaymentPeriodValueLbl = new javax.swing.JLabel();
        WorkingDaysCard = new javax.swing.JPanel();
        WorkingDaysLbl = new javax.swing.JLabel();
        WorkingDaysValueLbl = new javax.swing.JLabel();
        StatusCard = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        calendarTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(13, 15, 20));
        setPreferredSize(new java.awt.Dimension(185, 200));

        PayrollCalendarLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PayrollCalendarLbl.setForeground(new java.awt.Color(255, 255, 255));
        PayrollCalendarLbl.setText("Payroll Calendar");

        MonthlyBtn.setBackground(new java.awt.Color(79, 142, 247));
        MonthlyBtn.setForeground(new java.awt.Color(255, 255, 255));
        MonthlyBtn.setText("Monthly");

        PayPeriodCard.setBackground(new java.awt.Color(21, 24, 32));
        PayPeriodCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PayPeriodCard.setPreferredSize(new java.awt.Dimension(300, 105));

        TotalPayLbl.setBackground(new java.awt.Color(85, 93, 120));
        TotalPayLbl.setForeground(new java.awt.Color(85, 93, 120));
        TotalPayLbl.setText("Total Pay Period");

        TotalPayValueLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TotalPayValueLbl.setForeground(new java.awt.Color(255, 255, 255));
        TotalPayValueLbl.setText("12");

        javax.swing.GroupLayout PayPeriodCardLayout = new javax.swing.GroupLayout(PayPeriodCard);
        PayPeriodCard.setLayout(PayPeriodCardLayout);
        PayPeriodCardLayout.setHorizontalGroup(
            PayPeriodCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayPeriodCardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PayPeriodCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalPayValueLbl)
                    .addComponent(TotalPayLbl))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        PayPeriodCardLayout.setVerticalGroup(
            PayPeriodCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayPeriodCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TotalPayLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TotalPayValueLbl)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        PaymentCard.setBackground(new java.awt.Color(21, 24, 32));
        PaymentCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PaymentCard.setForeground(new java.awt.Color(255, 255, 255));
        PaymentCard.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PaymentCard.setPreferredSize(new java.awt.Dimension(300, 105));

        PaymentPeriodLbl.setForeground(new java.awt.Color(85, 93, 120));
        PaymentPeriodLbl.setText("Payment Period");

        PaymentPeriodValueLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PaymentPeriodValueLbl.setForeground(new java.awt.Color(255, 255, 255));
        PaymentPeriodValueLbl.setText("Monthly");

        javax.swing.GroupLayout PaymentCardLayout = new javax.swing.GroupLayout(PaymentCard);
        PaymentCard.setLayout(PaymentCardLayout);
        PaymentCardLayout.setHorizontalGroup(
            PaymentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentCardLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PaymentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PaymentPeriodValueLbl)
                    .addComponent(PaymentPeriodLbl))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        PaymentCardLayout.setVerticalGroup(
            PaymentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PaymentPeriodLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PaymentPeriodValueLbl)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        WorkingDaysCard.setBackground(new java.awt.Color(21, 24, 32));
        WorkingDaysCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        WorkingDaysCard.setPreferredSize(new java.awt.Dimension(300, 105));

        WorkingDaysLbl.setForeground(new java.awt.Color(85, 93, 120));
        WorkingDaysLbl.setText("Working Days");

        WorkingDaysValueLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        WorkingDaysValueLbl.setForeground(new java.awt.Color(255, 255, 255));
        WorkingDaysValueLbl.setText("20");

        javax.swing.GroupLayout WorkingDaysCardLayout = new javax.swing.GroupLayout(WorkingDaysCard);
        WorkingDaysCard.setLayout(WorkingDaysCardLayout);
        WorkingDaysCardLayout.setHorizontalGroup(
            WorkingDaysCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkingDaysCardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(WorkingDaysCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WorkingDaysValueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WorkingDaysLbl))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        WorkingDaysCardLayout.setVerticalGroup(
            WorkingDaysCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkingDaysCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WorkingDaysLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WorkingDaysValueLbl)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        StatusCard.setBackground(new java.awt.Color(21, 24, 32));
        StatusCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        calendarTable.setBackground(new java.awt.Color(21, 24, 32));
        calendarTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(calendarTable);

        javax.swing.GroupLayout StatusCardLayout = new javax.swing.GroupLayout(StatusCard);
        StatusCard.setLayout(StatusCardLayout);
        StatusCardLayout.setHorizontalGroup(
            StatusCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusCardLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        StatusCardLayout.setVerticalGroup(
            StatusCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(PayrollCalendarLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MonthlyBtn)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatusCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PayPeriodCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222)
                        .addComponent(WorkingDaysCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221)
                        .addComponent(PaymentCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 125, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MonthlyBtn)
                    .addComponent(PayrollCalendarLbl))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PayPeriodCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WorkingDaysCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaymentCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(StatusCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MonthlyBtn;
    private javax.swing.JPanel PayPeriodCard;
    private javax.swing.JPanel PaymentCard;
    private javax.swing.JLabel PaymentPeriodLbl;
    private javax.swing.JLabel PaymentPeriodValueLbl;
    private javax.swing.JLabel PayrollCalendarLbl;
    private javax.swing.JPanel StatusCard;
    private javax.swing.JLabel TotalPayLbl;
    private javax.swing.JLabel TotalPayValueLbl;
    private javax.swing.JPanel WorkingDaysCard;
    private javax.swing.JLabel WorkingDaysLbl;
    private javax.swing.JLabel WorkingDaysValueLbl;
    private javax.swing.JTable calendarTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

