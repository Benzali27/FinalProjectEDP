
package payroll;


public class DashboardForm extends javax.swing.JFrame {

 
    public DashboardForm() {
    initComponents();
    setLocationRelativeTo(null);
    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

    contentPanel.add(new EmployeePanel(), "employee");
    contentPanel.add(new AttendancePanel(), "attendance");
    contentPanel.add(new CalendarPanel(), "calendar");
    contentPanel.add(new PayrollPanel(), "payroll");
    contentPanel.add(new PaySlipPanel(), "payslip");
    

    // Live date
    java.time.LocalDate today = java.time.LocalDate.now();
    java.time.format.DateTimeFormatter dateFmt = java.time.format.DateTimeFormatter.ofPattern("MMM d, yyyy");
    java.time.format.DateTimeFormatter dayFmt = java.time.format.DateTimeFormatter.ofPattern("EEEE");
    dateValueLbl.setText(today.format(dateFmt));
    DateLbl.setText(today.format(dayFmt));

    // Nav buttons
    btnDashboard.addActionListener(e -> {
        showCard("card2");
        DashBoardLbl.setText("Dashboard");
    });
    btnEmployee.addActionListener(e -> showCard("employee"));
    btnAttendance.addActionListener(e -> showCard("attendance"));
    btnCalendar.addActionListener(e ->{ showCard("calendar");
        DashBoardLbl.setText("Payroll Calendar");
    });
    btnPayroll.addActionListener(e -> showCard("payroll"));
    btnPayslip.addActionListener(e -> showCard("payslip"));
    btnLogOut.addActionListener(e -> {
        new LoginForm().setVisible(true);
        dispose();
    });
    totalEmpValueLbl.setText("0");

FulltimeValueLbl.setText("0");
PartimeValueLbl.setText("0");
InternValueLBL.setText("0");

GwenLbl.setText("-");
GwenDeptLbl.setText("-");
GwenIconLbl.setText("-");

ZildLbl.setText("-");
ZildDeptLbl.setText("-");
ZildIconLbl.setText("-");

BenzaliLbl.setText("-");
BenzDeptLbl.setText("-");
BenzIconLbl.setText("-");

OntimeBar.setValue(0);
LateBar.setValue(0);
AbsentBar.setValue(0);
jLabel1.setText("● On Time  0%");
jLabel2.setText("● Late  0%");
jLabel3.setText("● Absent  0%");
}

private void showCard(String card) {
    java.awt.CardLayout cl = (java.awt.CardLayout) contentPanel.getLayout();
    cl.show(contentPanel, card);
    DashBoardLbl.setText(card.substring(0,1).toUpperCase() + card.substring(1));
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SidebarPanel = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnAttendance = new javax.swing.JButton();
        btnCalendar = new javax.swing.JButton();
        btnPayroll = new javax.swing.JButton();
        btnPayslip = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        adminNameLbl = new javax.swing.JLabel();
        adminRoleLbl = new javax.swing.JLabel();
        topBarPanel = new javax.swing.JPanel();
        DashBoardLbl = new javax.swing.JLabel();
        logoLbl = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        dashboardCard = new javax.swing.JPanel();
        totalEmpCard = new javax.swing.JPanel();
        totalEmpTitleLbl = new javax.swing.JLabel();
        totalEmpValueLbl = new javax.swing.JLabel();
        AttendanceCard = new javax.swing.JPanel();
        AttendanceLbl = new javax.swing.JLabel();
        OntimeBar = new javax.swing.JProgressBar();
        LateBar = new javax.swing.JProgressBar();
        AbsentBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateCard = new javax.swing.JPanel();
        DateLbl = new javax.swing.JLabel();
        dateValueLbl = new javax.swing.JLabel();
        ExportCard = new javax.swing.JPanel();
        ExportLbl = new javax.swing.JLabel();
        Datalbl = new javax.swing.JLabel();
        InternValueLbl = new javax.swing.JPanel();
        FulltimeLbl = new javax.swing.JLabel();
        PartimeLbl = new javax.swing.JLabel();
        InternLbl = new javax.swing.JLabel();
        FulltimeValueLbl = new javax.swing.JLabel();
        PartimeValueLbl = new javax.swing.JLabel();
        InternValueLBL = new javax.swing.JLabel();
        FulltimeBarPanel = new javax.swing.JPanel();
        PartTimeBarPanel = new javax.swing.JPanel();
        InternBarPanel = new javax.swing.JPanel();
        EmployeeTypeLbl = new javax.swing.JLabel();
        EmployeeStatusCard = new javax.swing.JPanel();
        GwenCard = new javax.swing.JPanel();
        GwenIconLbl = new javax.swing.JLabel();
        GwenLbl = new javax.swing.JLabel();
        GwenDeptLbl = new javax.swing.JLabel();
        ZildjianCard = new javax.swing.JPanel();
        ZildIconLbl = new javax.swing.JLabel();
        ZildLbl = new javax.swing.JLabel();
        ZildDeptLbl = new javax.swing.JLabel();
        BenzaliCard = new javax.swing.JPanel();
        BenzIconLbl = new javax.swing.JLabel();
        BenzaliLbl = new javax.swing.JLabel();
        BenzDeptLbl = new javax.swing.JLabel();
        EMPLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SidebarPanel.setBackground(new java.awt.Color(21, 24, 32));
        SidebarPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(37, 42, 56)));
        SidebarPanel.setPreferredSize(new java.awt.Dimension(210, 760));

        btnDashboard.setText("📊  Dashboard");

        btnEmployee.setText("👥  Employee");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnAttendance.setText("🕐  Attendance");

        btnCalendar.setText("📅  Payroll Calendar");

        btnPayroll.setText("💳  Payroll");

        btnPayslip.setText("🧾  Payslip");

        btnLogOut.setText("🚪  Log Out");

        adminNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        adminNameLbl.setText("Admin");

        adminRoleLbl.setForeground(new java.awt.Color(255, 255, 255));
        adminRoleLbl.setText("ADMIN");

        javax.swing.GroupLayout SidebarPanelLayout = new javax.swing.GroupLayout(SidebarPanel);
        SidebarPanel.setLayout(SidebarPanelLayout);
        SidebarPanelLayout.setHorizontalGroup(
            SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidebarPanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDashboard)
                    .addComponent(btnEmployee)
                    .addComponent(btnAttendance)
                    .addComponent(btnCalendar)
                    .addGroup(SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnPayslip)
                        .addComponent(btnPayroll)))
                .addGap(28, 28, 28))
            .addGroup(SidebarPanelLayout.createSequentialGroup()
                .addGroup(SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidebarPanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnLogOut))
                    .addGroup(SidebarPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminRoleLbl)
                            .addComponent(adminNameLbl))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SidebarPanelLayout.setVerticalGroup(
            SidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(adminRoleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminNameLbl)
                .addGap(18, 18, 18)
                .addComponent(btnDashboard)
                .addGap(18, 18, 18)
                .addComponent(btnEmployee)
                .addGap(18, 18, 18)
                .addComponent(btnAttendance)
                .addGap(18, 18, 18)
                .addComponent(btnCalendar)
                .addGap(18, 18, 18)
                .addComponent(btnPayroll)
                .addGap(18, 18, 18)
                .addComponent(btnPayslip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(49, 49, 49))
        );

        getContentPane().add(SidebarPanel, java.awt.BorderLayout.LINE_START);

        topBarPanel.setBackground(new java.awt.Color(21, 24, 32));
        topBarPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(32, 42, 56)));
        topBarPanel.setPreferredSize(new java.awt.Dimension(1280, 150));

        DashBoardLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DashBoardLbl.setForeground(new java.awt.Color(255, 255, 255));
        DashBoardLbl.setText("Dashboard");

        logoLbl.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        logoLbl.setForeground(new java.awt.Color(255, 255, 255));
        logoLbl.setText("Payroll System");

        javax.swing.GroupLayout topBarPanelLayout = new javax.swing.GroupLayout(topBarPanel);
        topBarPanel.setLayout(topBarPanelLayout);
        topBarPanelLayout.setHorizontalGroup(
            topBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarPanelLayout.createSequentialGroup()
                .addGroup(topBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topBarPanelLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(DashBoardLbl))
                    .addGroup(topBarPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(logoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1593, Short.MAX_VALUE))
        );
        topBarPanelLayout.setVerticalGroup(
            topBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(logoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(DashBoardLbl)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(topBarPanel, java.awt.BorderLayout.PAGE_START);

        contentPanel.setBackground(new java.awt.Color(13, 15, 20));
        contentPanel.setLayout(new java.awt.CardLayout());

        dashboardCard.setBackground(new java.awt.Color(13, 15, 20));

        totalEmpCard.setBackground(new java.awt.Color(21, 24, 32));
        totalEmpCard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        totalEmpTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        totalEmpTitleLbl.setText("Total Employee");

        totalEmpValueLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        totalEmpValueLbl.setForeground(new java.awt.Color(255, 255, 255));
        totalEmpValueLbl.setText("3");

        javax.swing.GroupLayout totalEmpCardLayout = new javax.swing.GroupLayout(totalEmpCard);
        totalEmpCard.setLayout(totalEmpCardLayout);
        totalEmpCardLayout.setHorizontalGroup(
            totalEmpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalEmpCardLayout.createSequentialGroup()
                .addGroup(totalEmpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(totalEmpCardLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(totalEmpValueLbl))
                    .addGroup(totalEmpCardLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(totalEmpTitleLbl)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        totalEmpCardLayout.setVerticalGroup(
            totalEmpCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(totalEmpCardLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(totalEmpTitleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalEmpValueLbl)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        AttendanceCard.setBackground(new java.awt.Color(21, 24, 32));
        AttendanceCard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AttendanceLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AttendanceLbl.setForeground(new java.awt.Color(255, 255, 255));
        AttendanceLbl.setText("Attendance Overview");

        OntimeBar.setForeground(new java.awt.Color(79, 247, 176));
        OntimeBar.setValue(66);
        OntimeBar.setOpaque(true);

        LateBar.setForeground(new java.awt.Color(247, 147, 79));
        LateBar.setValue(17);

        AbsentBar.setForeground(new java.awt.Color(247, 79, 122));
        AbsentBar.setValue(10);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("● On Time  75%");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("● Late  15%");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("● Absent  10%");

        javax.swing.GroupLayout AttendanceCardLayout = new javax.swing.GroupLayout(AttendanceCard);
        AttendanceCard.setLayout(AttendanceCardLayout);
        AttendanceCardLayout.setHorizontalGroup(
            AttendanceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendanceCardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(AttendanceLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AttendanceCardLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OntimeBar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LateBar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AbsentBar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        AttendanceCardLayout.setVerticalGroup(
            AttendanceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AttendanceCardLayout.createSequentialGroup()
                .addGroup(AttendanceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AttendanceCardLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(AttendanceLbl)
                        .addGap(18, 25, Short.MAX_VALUE)
                        .addGroup(AttendanceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(OntimeBar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AttendanceCardLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AttendanceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AbsentBar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(LateBar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(33, 33, 33))
        );

        dateCard.setBackground(new java.awt.Color(21, 24, 32));
        dateCard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DateLbl.setForeground(new java.awt.Color(255, 255, 255));
        DateLbl.setText("Date");

        dateValueLbl.setForeground(new java.awt.Color(255, 255, 255));
        dateValueLbl.setText("Mar  8, 2026");

        javax.swing.GroupLayout dateCardLayout = new javax.swing.GroupLayout(dateCard);
        dateCard.setLayout(dateCardLayout);
        dateCardLayout.setHorizontalGroup(
            dateCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dateCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateLbl)
                    .addComponent(dateValueLbl))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        dateCardLayout.setVerticalGroup(
            dateCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DateLbl)
                .addGap(18, 18, 18)
                .addComponent(dateValueLbl)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        ExportCard.setBackground(new java.awt.Color(21, 24, 32));
        ExportCard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ExportLbl.setForeground(new java.awt.Color(255, 255, 255));
        ExportLbl.setText("Export");

        Datalbl.setForeground(new java.awt.Color(255, 255, 255));
        Datalbl.setText("Data");

        javax.swing.GroupLayout ExportCardLayout = new javax.swing.GroupLayout(ExportCard);
        ExportCard.setLayout(ExportCardLayout);
        ExportCardLayout.setHorizontalGroup(
            ExportCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExportCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ExportCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExportLbl)
                    .addGroup(ExportCardLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Datalbl)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        ExportCardLayout.setVerticalGroup(
            ExportCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExportCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExportLbl)
                .addGap(18, 18, 18)
                .addComponent(Datalbl)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        InternValueLbl.setBackground(new java.awt.Color(21, 24, 32));
        InternValueLbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FulltimeLbl.setForeground(new java.awt.Color(255, 255, 255));
        FulltimeLbl.setText("Full-time");

        PartimeLbl.setForeground(new java.awt.Color(255, 255, 255));
        PartimeLbl.setText("Part-Time");

        InternLbl.setForeground(new java.awt.Color(255, 255, 255));
        InternLbl.setText("Intern");

        FulltimeValueLbl.setForeground(new java.awt.Color(255, 255, 255));
        FulltimeValueLbl.setText("1");

        PartimeValueLbl.setForeground(new java.awt.Color(255, 255, 255));
        PartimeValueLbl.setText("1");

        InternValueLBL.setForeground(new java.awt.Color(255, 255, 255));
        InternValueLBL.setText("1");

        FulltimeBarPanel.setBackground(new java.awt.Color(79, 142, 247));

        javax.swing.GroupLayout FulltimeBarPanelLayout = new javax.swing.GroupLayout(FulltimeBarPanel);
        FulltimeBarPanel.setLayout(FulltimeBarPanelLayout);
        FulltimeBarPanelLayout.setHorizontalGroup(
            FulltimeBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        FulltimeBarPanelLayout.setVerticalGroup(
            FulltimeBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        PartTimeBarPanel.setBackground(new java.awt.Color(247, 147, 79));

        javax.swing.GroupLayout PartTimeBarPanelLayout = new javax.swing.GroupLayout(PartTimeBarPanel);
        PartTimeBarPanel.setLayout(PartTimeBarPanelLayout);
        PartTimeBarPanelLayout.setHorizontalGroup(
            PartTimeBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        PartTimeBarPanelLayout.setVerticalGroup(
            PartTimeBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        InternBarPanel.setBackground(new java.awt.Color(79, 247, 176));

        javax.swing.GroupLayout InternBarPanelLayout = new javax.swing.GroupLayout(InternBarPanel);
        InternBarPanel.setLayout(InternBarPanelLayout);
        InternBarPanelLayout.setHorizontalGroup(
            InternBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        InternBarPanelLayout.setVerticalGroup(
            InternBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        EmployeeTypeLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EmployeeTypeLbl.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeTypeLbl.setText("Employee Types");

        javax.swing.GroupLayout InternValueLblLayout = new javax.swing.GroupLayout(InternValueLbl);
        InternValueLbl.setLayout(InternValueLblLayout);
        InternValueLblLayout.setHorizontalGroup(
            InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InternValueLblLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InternValueLblLayout.createSequentialGroup()
                        .addComponent(EmployeeTypeLbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InternValueLblLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InternValueLblLayout.createSequentialGroup()
                                .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InternValueLblLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(FulltimeValueLbl))
                                    .addComponent(FulltimeBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PartTimeBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(InternValueLblLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(PartimeValueLbl)))
                                .addGap(28, 28, 28)
                                .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InternValueLblLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(InternValueLBL))
                                    .addComponent(InternBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InternValueLblLayout.createSequentialGroup()
                                .addComponent(FulltimeLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PartimeLbl)
                                .addGap(12, 12, 12)
                                .addComponent(InternLbl)
                                .addGap(24, 24, 24))))))
        );
        InternValueLblLayout.setVerticalGroup(
            InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InternValueLblLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(EmployeeTypeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FulltimeBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PartTimeBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InternBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FulltimeValueLbl)
                    .addComponent(InternValueLBL)
                    .addComponent(PartimeValueLbl))
                .addGap(11, 11, 11)
                .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FulltimeLbl)
                    .addComponent(PartimeLbl)
                    .addComponent(InternLbl))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        EmployeeStatusCard.setBackground(new java.awt.Color(21, 24, 32));
        EmployeeStatusCard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        GwenCard.setBackground(new java.awt.Color(28, 32, 48));
        GwenCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        GwenIconLbl.setForeground(new java.awt.Color(255, 255, 255));
        GwenIconLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GwenIconLbl.setText("G");

        GwenLbl.setForeground(new java.awt.Color(255, 255, 255));
        GwenLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GwenLbl.setText("Gweneth");

        GwenDeptLbl.setForeground(new java.awt.Color(255, 255, 255));
        GwenDeptLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GwenDeptLbl.setText("Engineering");

        javax.swing.GroupLayout GwenCardLayout = new javax.swing.GroupLayout(GwenCard);
        GwenCard.setLayout(GwenCardLayout);
        GwenCardLayout.setHorizontalGroup(
            GwenCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GwenCardLayout.createSequentialGroup()
                .addGroup(GwenCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GwenCardLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(GwenCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GwenLbl)
                            .addGroup(GwenCardLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(GwenIconLbl))))
                    .addGroup(GwenCardLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(GwenDeptLbl)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        GwenCardLayout.setVerticalGroup(
            GwenCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GwenCardLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(GwenIconLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GwenLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GwenDeptLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ZildjianCard.setBackground(new java.awt.Color(28, 32, 48));
        ZildjianCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ZildIconLbl.setForeground(new java.awt.Color(255, 255, 255));
        ZildIconLbl.setText("Z");

        ZildLbl.setForeground(new java.awt.Color(255, 255, 255));
        ZildLbl.setText("Zildjian");

        ZildDeptLbl.setForeground(new java.awt.Color(255, 255, 255));
        ZildDeptLbl.setText("Design");

        javax.swing.GroupLayout ZildjianCardLayout = new javax.swing.GroupLayout(ZildjianCard);
        ZildjianCard.setLayout(ZildjianCardLayout);
        ZildjianCardLayout.setHorizontalGroup(
            ZildjianCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZildjianCardLayout.createSequentialGroup()
                .addGroup(ZildjianCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ZildDeptLbl)
                    .addGroup(ZildjianCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ZildjianCardLayout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(ZildIconLbl))
                        .addGroup(ZildjianCardLayout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(ZildLbl))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        ZildjianCardLayout.setVerticalGroup(
            ZildjianCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZildjianCardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ZildIconLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ZildLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ZildDeptLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BenzaliCard.setBackground(new java.awt.Color(28, 32, 48));
        BenzaliCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BenzIconLbl.setForeground(new java.awt.Color(255, 255, 255));
        BenzIconLbl.setText("B");

        BenzaliLbl.setForeground(new java.awt.Color(255, 255, 255));
        BenzaliLbl.setText("Benzali");

        BenzDeptLbl.setForeground(new java.awt.Color(255, 255, 255));
        BenzDeptLbl.setText("Engineering");

        javax.swing.GroupLayout BenzaliCardLayout = new javax.swing.GroupLayout(BenzaliCard);
        BenzaliCard.setLayout(BenzaliCardLayout);
        BenzaliCardLayout.setHorizontalGroup(
            BenzaliCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BenzaliCardLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(BenzaliCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BenzaliCardLayout.createSequentialGroup()
                        .addGroup(BenzaliCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BenzaliLbl)
                            .addGroup(BenzaliCardLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(BenzIconLbl)))
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BenzaliCardLayout.createSequentialGroup()
                        .addComponent(BenzDeptLbl)
                        .addGap(74, 74, 74))))
        );
        BenzaliCardLayout.setVerticalGroup(
            BenzaliCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BenzaliCardLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BenzIconLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BenzaliLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BenzDeptLbl)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        EMPLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EMPLbl.setForeground(new java.awt.Color(255, 255, 255));
        EMPLbl.setText("Employees");

        javax.swing.GroupLayout EmployeeStatusCardLayout = new javax.swing.GroupLayout(EmployeeStatusCard);
        EmployeeStatusCard.setLayout(EmployeeStatusCardLayout);
        EmployeeStatusCardLayout.setHorizontalGroup(
            EmployeeStatusCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeStatusCardLayout.createSequentialGroup()
                .addGroup(EmployeeStatusCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EmployeeStatusCardLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(GwenCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addComponent(ZildjianCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(BenzaliCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EmployeeStatusCardLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(EMPLbl)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        EmployeeStatusCardLayout.setVerticalGroup(
            EmployeeStatusCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeeStatusCardLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(EMPLbl)
                .addGap(31, 31, 31)
                .addGroup(EmployeeStatusCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GwenCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ZildjianCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BenzaliCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dashboardCardLayout = new javax.swing.GroupLayout(dashboardCard);
        dashboardCard.setLayout(dashboardCardLayout);
        dashboardCardLayout.setHorizontalGroup(
            dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardCardLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalEmpCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashboardCardLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(InternValueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardCardLayout.createSequentialGroup()
                        .addComponent(AttendanceCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(ExportCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EmployeeStatusCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        dashboardCardLayout.setVerticalGroup(
            dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardCardLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AttendanceCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalEmpCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExportCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InternValueLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeStatusCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(242, Short.MAX_VALUE))
        );

        contentPanel.add(dashboardCard, "card2");

        getContentPane().add(contentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeeActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardForm().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar AbsentBar;
    private javax.swing.JPanel AttendanceCard;
    private javax.swing.JLabel AttendanceLbl;
    private javax.swing.JLabel BenzDeptLbl;
    private javax.swing.JLabel BenzIconLbl;
    private javax.swing.JPanel BenzaliCard;
    private javax.swing.JLabel BenzaliLbl;
    private javax.swing.JLabel DashBoardLbl;
    private javax.swing.JLabel Datalbl;
    private javax.swing.JLabel DateLbl;
    private javax.swing.JLabel EMPLbl;
    private javax.swing.JPanel EmployeeStatusCard;
    private javax.swing.JLabel EmployeeTypeLbl;
    private javax.swing.JPanel ExportCard;
    private javax.swing.JLabel ExportLbl;
    private javax.swing.JPanel FulltimeBarPanel;
    private javax.swing.JLabel FulltimeLbl;
    private javax.swing.JLabel FulltimeValueLbl;
    private javax.swing.JPanel GwenCard;
    private javax.swing.JLabel GwenDeptLbl;
    private javax.swing.JLabel GwenIconLbl;
    private javax.swing.JLabel GwenLbl;
    private javax.swing.JPanel InternBarPanel;
    private javax.swing.JLabel InternLbl;
    private javax.swing.JLabel InternValueLBL;
    private javax.swing.JPanel InternValueLbl;
    private javax.swing.JProgressBar LateBar;
    private javax.swing.JProgressBar OntimeBar;
    private javax.swing.JPanel PartTimeBarPanel;
    private javax.swing.JLabel PartimeLbl;
    private javax.swing.JLabel PartimeValueLbl;
    private javax.swing.JPanel SidebarPanel;
    private javax.swing.JLabel ZildDeptLbl;
    private javax.swing.JLabel ZildIconLbl;
    private javax.swing.JLabel ZildLbl;
    private javax.swing.JPanel ZildjianCard;
    private javax.swing.JLabel adminNameLbl;
    private javax.swing.JLabel adminRoleLbl;
    private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPayroll;
    private javax.swing.JButton btnPayslip;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel dashboardCard;
    private javax.swing.JPanel dateCard;
    private javax.swing.JLabel dateValueLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JPanel topBarPanel;
    private javax.swing.JPanel totalEmpCard;
    private javax.swing.JLabel totalEmpTitleLbl;
    private javax.swing.JLabel totalEmpValueLbl;
    // End of variables declaration//GEN-END:variables
}


