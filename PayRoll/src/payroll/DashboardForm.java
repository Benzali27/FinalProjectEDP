
package payroll;


public class DashboardForm extends javax.swing.JFrame {

 
    public DashboardForm() {
    initComponents();
    setLocationRelativeTo(null);
    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    
    contentPanel.add(new EmployeePanel(), "employee");
    
    // Live date
    java.time.LocalDate today = java.time.LocalDate.now();
    java.time.format.DateTimeFormatter dateFmt = java.time.format.DateTimeFormatter.ofPattern("MMM d, yyyy");
    java.time.format.DateTimeFormatter dayFmt = java.time.format.DateTimeFormatter.ofPattern("EEEE");
    dateValueLbl.setText(today.format(dateFmt));
    DateLbl.setText(today.format(dayFmt));
    
    // Nav buttons
    btnDashboard.addActionListener(e -> showCard("card2"));
    btnEmployee.addActionListener(e -> showCard("employee"));
    btnAttendance.addActionListener(e -> showCard("attendance"));
    btnCalendar.addActionListener(e -> showCard("calendar"));
    btnPayroll.addActionListener(e -> showCard("payroll"));
    btnPayslip.addActionListener(e -> showCard("payslip"));
    btnLogOut.addActionListener(e -> {
        new LoginForm().setVisible(true);
        dispose();
    });
}

private void showCard(String card) {
    java.awt.CardLayout cl = (java.awt.CardLayout) contentPanel.getLayout();
    cl.show(contentPanel, card);
    DashBoardLbl.setText(card.substring(0,1).toUpperCase() + card.substring(1));
}

private void drawDonutChart(java.awt.Graphics g) {
    java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
    g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,
                        java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
    int x = 20, y = 20, size = 120;
    g2.setColor(new java.awt.Color(79, 142, 247));
    g2.fillArc(x, y, size, size, 90, -120);
    g2.setColor(new java.awt.Color(247, 147, 79));
    g2.fillArc(x, y, size, size, -30, -120);
    g2.setColor(new java.awt.Color(79, 247, 176));
    g2.fillArc(x, y, size, size, -150, -120);
    g2.setColor(new java.awt.Color(21, 24, 32));
    g2.fillOval(45, 45, 70, 70);
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
        dateCard = new javax.swing.JPanel();
        DateLbl = new javax.swing.JLabel();
        dateValueLbl = new javax.swing.JLabel();
        ExportCard = new javax.swing.JPanel();
        ExportLbl = new javax.swing.JLabel();
        Datalbl = new javax.swing.JLabel();
        InternValueLbl = new javax.swing.JPanel();
        donutChartPanel = new javax.swing.JPanel();
        FulltimeLbl = new javax.swing.JLabel();
        PartimeLbl = new javax.swing.JLabel();
        InternLbl = new javax.swing.JLabel();
        FulltimeValueLbl = new javax.swing.JLabel();
        PartimeValueLbl = new javax.swing.JLabel();
        InternValueLBL = new javax.swing.JLabel();
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

        DashBoardLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DashBoardLbl.setForeground(new java.awt.Color(255, 255, 255));
        DashBoardLbl.setText("DASHBOARD");

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
                .addContainerGap(1589, Short.MAX_VALUE))
        );
        topBarPanelLayout.setVerticalGroup(
            topBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(logoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(DashBoardLbl)
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addContainerGap(188, Short.MAX_VALUE))
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

        javax.swing.GroupLayout AttendanceCardLayout = new javax.swing.GroupLayout(AttendanceCard);
        AttendanceCard.setLayout(AttendanceCardLayout);
        AttendanceCardLayout.setHorizontalGroup(
            AttendanceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendanceCardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(AttendanceLbl)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        AttendanceCardLayout.setVerticalGroup(
            AttendanceCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendanceCardLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(AttendanceLbl)
                .addContainerGap(70, Short.MAX_VALUE))
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

        donutChartPanel.setBackground(new java.awt.Color(21, 24, 32));
        donutChartPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout donutChartPanelLayout = new javax.swing.GroupLayout(donutChartPanel);
        donutChartPanel.setLayout(donutChartPanelLayout);
        donutChartPanelLayout.setHorizontalGroup(
            donutChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        donutChartPanelLayout.setVerticalGroup(
            donutChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout InternValueLblLayout = new javax.swing.GroupLayout(InternValueLbl);
        InternValueLbl.setLayout(InternValueLblLayout);
        InternValueLblLayout.setHorizontalGroup(
            InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InternValueLblLayout.createSequentialGroup()
                .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(InternValueLblLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InternValueLblLayout.createSequentialGroup()
                                .addComponent(InternLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(InternValueLBL))
                            .addGroup(InternValueLblLayout.createSequentialGroup()
                                .addComponent(PartimeLbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(InternValueLblLayout.createSequentialGroup()
                                .addComponent(FulltimeLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FulltimeValueLbl))))
                    .addGroup(InternValueLblLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(donutChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InternValueLblLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PartimeValueLbl)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        InternValueLblLayout.setVerticalGroup(
            InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InternValueLblLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(donutChartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InternValueLblLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(FulltimeValueLbl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InternValueLblLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FulltimeLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PartimeValueLbl)
                    .addComponent(PartimeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InternValueLblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InternLbl)
                    .addComponent(InternValueLBL))
                .addContainerGap(12, Short.MAX_VALUE))
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
                .addGap(58, 58, 58)
                .addComponent(GwenCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(ZildjianCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(BenzaliCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(EmployeeStatusCardLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(EMPLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(InternValueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalEmpCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(dashboardCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dashboardCardLayout.createSequentialGroup()
                        .addComponent(AttendanceCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(dateCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(ExportCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EmployeeStatusCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
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
                .addContainerGap(211, Short.MAX_VALUE))
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
    private javax.swing.JPanel ExportCard;
    private javax.swing.JLabel ExportLbl;
    private javax.swing.JLabel FulltimeLbl;
    private javax.swing.JLabel FulltimeValueLbl;
    private javax.swing.JPanel GwenCard;
    private javax.swing.JLabel GwenDeptLbl;
    private javax.swing.JLabel GwenIconLbl;
    private javax.swing.JLabel GwenLbl;
    private javax.swing.JLabel InternLbl;
    private javax.swing.JLabel InternValueLBL;
    private javax.swing.JPanel InternValueLbl;
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
    private javax.swing.JPanel donutChartPanel;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JPanel topBarPanel;
    private javax.swing.JPanel totalEmpCard;
    private javax.swing.JLabel totalEmpTitleLbl;
    private javax.swing.JLabel totalEmpValueLbl;
    // End of variables declaration//GEN-END:variables
}


