
package payroll;


public class AttendancePanel extends javax.swing.JPanel {

 
    public AttendancePanel() {
        initComponents();
        String[] columns = {"Employee", "Date", "Time In", "Time Out", "Hours", "Status"};
Object[][] data = {
    {"Gweneth Angela Santiago",  "Mar 7, 2026", "08:00 AM", "05:00 PM", "8h",     "Present"},
    {"Gweneth Angela Santiago",  "Mar 6, 2026", "08:01 AM", "05:00 PM", "8h",     "Present"},
    {"Gweneth Angela Santiago",  "Mar 5, 2026", "09:05 AM", "05:00 PM", "7h 55m", "Late"},
    {"Zildjian Fajardo",         "Mar 7, 2026", "08:30 AM", "05:20 PM", "8h 50m", "Present"},
    {"Zildjian Fajardo",         "Mar 6, 2026", "08:00 AM", "05:00 PM", "8h",     "Present"},
    {"Zildjian Fajardo",         "Mar 4, 2026", "09:10 AM", "05:00 PM", "7h 50m", "Late"},
    {"Benzali Dail Mat Paat",    "Mar 7, 2026", "08:45 AM", "05:07 PM", "8h",     "Present"},
    {"Benzali Dail Mat Paat",    "Mar 6, 2026", "08:00 AM", "05:00 PM", "8h",     "Present"},
    {"Benzali Dail Mat Paat",    "Feb 28, 2026","—",        "—",        "—",      "Absent"},
};
AttendanceTable.setModel(new javax.swing.table.DefaultTableModel(data, columns));

AttendanceTable.getTableHeader().setBackground(new java.awt.Color(21, 24, 32));
AttendanceTable.getTableHeader().setForeground(new java.awt.Color(85, 93, 120));
AttendanceTable.setFillsViewportHeight(false);
    jScrollPane1.getViewport().setBackground(new java.awt.Color(13, 15, 20));
    jScrollPane1.setBackground(new java.awt.Color(13, 15, 20));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AttendanceLbl = new javax.swing.JLabel();
        LogBtn = new javax.swing.JButton();
        PresentCard = new javax.swing.JPanel();
        PresentTitleLbl = new javax.swing.JLabel();
        PresentValueLbl = new javax.swing.JLabel();
        PresentSubLbl = new javax.swing.JLabel();
        AbsentCard = new javax.swing.JPanel();
        AbsentTitleLbl = new javax.swing.JLabel();
        AbsentValueLbl = new javax.swing.JLabel();
        AbesntSubLbl = new javax.swing.JLabel();
        LateCard = new javax.swing.JPanel();
        LateTitleLbl = new javax.swing.JLabel();
        LateValueLbl = new javax.swing.JLabel();
        LateSubLbl = new javax.swing.JLabel();
        LeaveCard = new javax.swing.JPanel();
        LeaveTitleLbl = new javax.swing.JLabel();
        LeaveValueLbl = new javax.swing.JLabel();
        LeaveSubLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AttendanceTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(13, 15, 20));

        AttendanceLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AttendanceLbl.setForeground(new java.awt.Color(255, 255, 255));
        AttendanceLbl.setText("ATTENDANCE");

        LogBtn.setBackground(new java.awt.Color(79, 142, 247));
        LogBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogBtn.setText("+Log Attendance");

        PresentCard.setBackground(new java.awt.Color(21, 24, 32));
        PresentCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PresentCard.setPreferredSize(new java.awt.Dimension(279, 112));

        PresentTitleLbl.setBackground(new java.awt.Color(85, 93, 120));
        PresentTitleLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        PresentTitleLbl.setForeground(new java.awt.Color(85, 93, 120));
        PresentTitleLbl.setText("PRESENT");

        PresentValueLbl.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        PresentValueLbl.setForeground(new java.awt.Color(79, 247, 176));
        PresentValueLbl.setText("2");

        PresentSubLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        PresentSubLbl.setForeground(new java.awt.Color(85, 93, 120));
        PresentSubLbl.setText("Out Of 3 Employee");

        javax.swing.GroupLayout PresentCardLayout = new javax.swing.GroupLayout(PresentCard);
        PresentCard.setLayout(PresentCardLayout);
        PresentCardLayout.setHorizontalGroup(
            PresentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PresentCardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PresentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PresentSubLbl)
                    .addGroup(PresentCardLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(PresentValueLbl))
                    .addComponent(PresentTitleLbl))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        PresentCardLayout.setVerticalGroup(
            PresentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PresentCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PresentTitleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PresentValueLbl)
                .addGap(12, 12, 12)
                .addComponent(PresentSubLbl)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        AbsentCard.setBackground(new java.awt.Color(21, 24, 32));
        AbsentCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AbsentTitleLbl.setBackground(new java.awt.Color(85, 93, 120));
        AbsentTitleLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        AbsentTitleLbl.setForeground(new java.awt.Color(85, 93, 120));
        AbsentTitleLbl.setText("ABSENT");

        AbsentValueLbl.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        AbsentValueLbl.setForeground(new java.awt.Color(247, 79, 122));
        AbsentValueLbl.setText("1");

        AbesntSubLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        AbesntSubLbl.setForeground(new java.awt.Color(85, 93, 120));
        AbesntSubLbl.setText("no. of record today");

        javax.swing.GroupLayout AbsentCardLayout = new javax.swing.GroupLayout(AbsentCard);
        AbsentCard.setLayout(AbsentCardLayout);
        AbsentCardLayout.setHorizontalGroup(
            AbsentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbsentCardLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(AbsentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AbsentValueLbl)
                    .addComponent(AbsentTitleLbl)
                    .addComponent(AbesntSubLbl))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        AbsentCardLayout.setVerticalGroup(
            AbsentCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbsentCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AbsentTitleLbl)
                .addGap(12, 12, 12)
                .addComponent(AbsentValueLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AbesntSubLbl)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        LateCard.setBackground(new java.awt.Color(21, 24, 32));
        LateCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LateCard.setForeground(new java.awt.Color(255, 255, 255));
        LateCard.setPreferredSize(new java.awt.Dimension(219, 112));

        LateTitleLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        LateTitleLbl.setForeground(new java.awt.Color(85, 93, 120));
        LateTitleLbl.setText("LATE");

        LateValueLbl.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        LateValueLbl.setForeground(new java.awt.Color(255, 255, 255));
        LateValueLbl.setText("0");

        LateSubLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        LateSubLbl.setForeground(new java.awt.Color(85, 93, 120));
        LateSubLbl.setText("Arrived After 9AM");

        javax.swing.GroupLayout LateCardLayout = new javax.swing.GroupLayout(LateCard);
        LateCard.setLayout(LateCardLayout);
        LateCardLayout.setHorizontalGroup(
            LateCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LateCardLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(LateCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LateTitleLbl)
                    .addComponent(LateSubLbl)
                    .addComponent(LateValueLbl))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        LateCardLayout.setVerticalGroup(
            LateCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LateCardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LateTitleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LateValueLbl)
                .addGap(12, 12, 12)
                .addComponent(LateSubLbl)
                .addGap(21, 21, 21))
        );

        LeaveCard.setBackground(new java.awt.Color(21, 24, 32));
        LeaveCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LeaveCard.setPreferredSize(new java.awt.Dimension(219, 112));

        LeaveTitleLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        LeaveTitleLbl.setForeground(new java.awt.Color(85, 93, 120));
        LeaveTitleLbl.setText("ON LEAVE");

        LeaveValueLbl.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        LeaveValueLbl.setForeground(new java.awt.Color(255, 255, 255));
        LeaveValueLbl.setText("0");

        LeaveSubLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        LeaveSubLbl.setForeground(new java.awt.Color(85, 93, 120));
        LeaveSubLbl.setText("Approved Leaves");

        javax.swing.GroupLayout LeaveCardLayout = new javax.swing.GroupLayout(LeaveCard);
        LeaveCard.setLayout(LeaveCardLayout);
        LeaveCardLayout.setHorizontalGroup(
            LeaveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeaveCardLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(LeaveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeaveSubLbl)
                    .addComponent(LeaveValueLbl)
                    .addComponent(LeaveTitleLbl))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        LeaveCardLayout.setVerticalGroup(
            LeaveCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeaveCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LeaveTitleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LeaveValueLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LeaveSubLbl)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(21, 24, 32));
        jScrollPane1.setForeground(new java.awt.Color(232, 234, 240));

        AttendanceTable.setBackground(new java.awt.Color(21, 24, 32));
        AttendanceTable.setForeground(new java.awt.Color(232, 234, 240));
        AttendanceTable.setModel(new javax.swing.table.DefaultTableModel(
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
        AttendanceTable.setGridColor(new java.awt.Color(37, 42, 56));
        AttendanceTable.setRowHeight(35);
        AttendanceTable.setSelectionBackground(new java.awt.Color(28, 32, 48));
        AttendanceTable.setSelectionForeground(new java.awt.Color(232, 234, 240));
        jScrollPane1.setViewportView(AttendanceTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(AttendanceLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogBtn)
                .addGap(201, 201, 201))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PresentCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(AbsentCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(LateCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215)
                        .addComponent(LeaveCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1735, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AttendanceLbl)
                    .addComponent(LogBtn))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PresentCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbsentCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LateCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LeaveCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AbesntSubLbl;
    private javax.swing.JPanel AbsentCard;
    private javax.swing.JLabel AbsentTitleLbl;
    private javax.swing.JLabel AbsentValueLbl;
    private javax.swing.JLabel AttendanceLbl;
    private javax.swing.JTable AttendanceTable;
    private javax.swing.JPanel LateCard;
    private javax.swing.JLabel LateSubLbl;
    private javax.swing.JLabel LateTitleLbl;
    private javax.swing.JLabel LateValueLbl;
    private javax.swing.JPanel LeaveCard;
    private javax.swing.JLabel LeaveSubLbl;
    private javax.swing.JLabel LeaveTitleLbl;
    private javax.swing.JLabel LeaveValueLbl;
    private javax.swing.JButton LogBtn;
    private javax.swing.JPanel PresentCard;
    private javax.swing.JLabel PresentSubLbl;
    private javax.swing.JLabel PresentTitleLbl;
    private javax.swing.JLabel PresentValueLbl;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
