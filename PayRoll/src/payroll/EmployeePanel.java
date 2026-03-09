
package payroll;


public class EmployeePanel extends javax.swing.JPanel {

  
    public EmployeePanel() {
        initComponents();
    
    btnFilterAll.addActionListener(e -> {
        GwenCard.setVisible(true);
        ZildCard.setVisible(true);
        BenzCard.setVisible(true);
        revalidate();
        repaint();
    });
    
    BtnFilterFull.addActionListener(e -> {
        GwenCard.setVisible(true);
        ZildCard.setVisible(false);
        BenzCard.setVisible(false);
        revalidate();
        repaint();
    });
    
    BtnFilterPart.addActionListener(e -> {
        GwenCard.setVisible(false);
        ZildCard.setVisible(true);
        BenzCard.setVisible(false);
        revalidate();
        repaint();
    });
    
    BtnFilterIntern.addActionListener(e -> {
        GwenCard.setVisible(false);
        ZildCard.setVisible(false);
        BenzCard.setVisible(true);
        revalidate();
        repaint();
    });
    
    GwenCard.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            javax.swing.JOptionPane.showMessageDialog(null, "Gweneth Angela Santiago\nEngineering | Senior Developer\nFull-Time");
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            GwenCard.setBackground(new java.awt.Color(28, 32, 48));
            GwenCard.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            GwenCard.setBackground(new java.awt.Color(21, 24, 32));
        }
    });
    
    ZildCard.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            javax.swing.JOptionPane.showMessageDialog(null, "Zildjian Fajardo\nDesign | UI/UX Designer\nPart-Time");
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            ZildCard.setBackground(new java.awt.Color(28, 32, 48));
            ZildCard.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            ZildCard.setBackground(new java.awt.Color(21, 24, 32));
        }
    });
    
    BenzCard.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            javax.swing.JOptionPane.showMessageDialog(null, "Benzali Dail Mat Paat\nEngineering | Dev Intern\nIntern");
        }
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            BenzCard.setBackground(new java.awt.Color(28, 32, 48));
            BenzCard.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            BenzCard.setBackground(new java.awt.Color(21, 24, 32));
        }
    });
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmpLbl = new javax.swing.JLabel();
        ImportBtn = new javax.swing.JButton();
        btnFilterAll = new javax.swing.JButton();
        BtnFilterFull = new javax.swing.JButton();
        BtnFilterPart = new javax.swing.JButton();
        BtnFilterIntern = new javax.swing.JButton();
        GwenCard = new javax.swing.JPanel();
        GwenIconLbl = new javax.swing.JLabel();
        GwenNameLbl = new javax.swing.JLabel();
        GwenDeptLbl = new javax.swing.JLabel();
        GwenPosLbl = new javax.swing.JLabel();
        GwenTypeLbl = new javax.swing.JLabel();
        ZildCard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ZildIconLbl = new javax.swing.JLabel();
        ZildNameLbl = new javax.swing.JLabel();
        ZildDeptLbl = new javax.swing.JLabel();
        ZildPosLbl = new javax.swing.JLabel();
        ZildTypeLbl = new javax.swing.JLabel();
        BenzCard = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(13, 15, 20));
        setPreferredSize(new java.awt.Dimension(1280, 800));

        EmpLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmpLbl.setForeground(new java.awt.Color(255, 255, 255));
        EmpLbl.setText("EMPLOYEE");

        ImportBtn.setBackground(new java.awt.Color(21, 24, 32));
        ImportBtn.setForeground(new java.awt.Color(255, 255, 255));
        ImportBtn.setText("Import");
        ImportBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnFilterAll.setBackground(new java.awt.Color(79, 142, 247));
        btnFilterAll.setForeground(new java.awt.Color(255, 255, 255));
        btnFilterAll.setText("All Employees");

        BtnFilterFull.setBackground(new java.awt.Color(13, 15, 20));
        BtnFilterFull.setForeground(new java.awt.Color(136, 144, 168));
        BtnFilterFull.setText("Full-Time");

        BtnFilterPart.setBackground(new java.awt.Color(13, 15, 20));
        BtnFilterPart.setForeground(new java.awt.Color(136, 144, 168));
        BtnFilterPart.setText("Part-Time");

        BtnFilterIntern.setBackground(new java.awt.Color(13, 15, 20));
        BtnFilterIntern.setForeground(new java.awt.Color(136, 144, 168));
        BtnFilterIntern.setText("Intern");

        GwenCard.setBackground(new java.awt.Color(21, 24, 32));
        GwenCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        GwenIconLbl.setForeground(new java.awt.Color(255, 255, 255));
        GwenIconLbl.setText("G");

        GwenNameLbl.setBackground(new java.awt.Color(255, 255, 255));
        GwenNameLbl.setForeground(new java.awt.Color(232, 234, 240));
        GwenNameLbl.setText("Gweneth Angela Santiago");

        GwenDeptLbl.setForeground(new java.awt.Color(25, 93, 120));
        GwenDeptLbl.setText("Engineering");

        GwenPosLbl.setForeground(new java.awt.Color(85, 93, 120));
        GwenPosLbl.setText("Senior Developer");

        GwenTypeLbl.setForeground(new java.awt.Color(79, 142, 247));
        GwenTypeLbl.setText("● Full-Time");

        javax.swing.GroupLayout GwenCardLayout = new javax.swing.GroupLayout(GwenCard);
        GwenCard.setLayout(GwenCardLayout);
        GwenCardLayout.setHorizontalGroup(
            GwenCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GwenCardLayout.createSequentialGroup()
                .addGroup(GwenCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GwenCardLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(GwenDeptLbl))
                    .addGroup(GwenCardLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(GwenIconLbl))
                    .addGroup(GwenCardLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(GwenNameLbl))
                    .addGroup(GwenCardLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(GwenPosLbl))
                    .addGroup(GwenCardLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(GwenTypeLbl)))
                .addGap(141, 141, 141))
        );
        GwenCardLayout.setVerticalGroup(
            GwenCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GwenCardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(GwenIconLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GwenNameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GwenDeptLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GwenPosLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GwenTypeLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ZildCard.setBackground(new java.awt.Color(21, 24, 32));
        ZildCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ZildCard.setForeground(new java.awt.Color(255, 255, 255));
        ZildCard.setPreferredSize(new java.awt.Dimension(370, 157));

        ZildIconLbl.setForeground(new java.awt.Color(255, 255, 255));
        ZildIconLbl.setText("Z");

        ZildNameLbl.setForeground(new java.awt.Color(232, 234, 240));
        ZildNameLbl.setText("Zildjian Fajardo");

        ZildDeptLbl.setForeground(new java.awt.Color(153, 51, 0));
        ZildDeptLbl.setText("Designs");

        ZildPosLbl.setForeground(new java.awt.Color(153, 102, 0));
        ZildPosLbl.setText("UI/UX Designer");

        ZildTypeLbl.setForeground(new java.awt.Color(247, 147, 79));
        ZildTypeLbl.setText("● Part-Time");

        javax.swing.GroupLayout ZildCardLayout = new javax.swing.GroupLayout(ZildCard);
        ZildCard.setLayout(ZildCardLayout);
        ZildCardLayout.setHorizontalGroup(
            ZildCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZildCardLayout.createSequentialGroup()
                .addGroup(ZildCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ZildCardLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(ZildIconLbl))
                    .addGroup(ZildCardLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(ZildCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ZildNameLbl)
                            .addGroup(ZildCardLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(103, 103, 103)
                                .addGroup(ZildCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ZildPosLbl)
                                    .addGroup(ZildCardLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(ZildTypeLbl))))))
                    .addGroup(ZildCardLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(ZildDeptLbl)))
                .addContainerGap())
        );
        ZildCardLayout.setVerticalGroup(
            ZildCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZildCardLayout.createSequentialGroup()
                .addGroup(ZildCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ZildCardLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1))
                    .addGroup(ZildCardLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(ZildIconLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZildNameLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZildDeptLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ZildPosLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ZildTypeLbl)
                .addGap(12, 12, 12))
        );

        BenzCard.setBackground(new java.awt.Color(21, 24, 32));
        BenzCard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BenzCard.setPreferredSize(new java.awt.Dimension(370, 157));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("B");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Benzali Dail Mat Paat");

        jLabel3.setForeground(new java.awt.Color(25, 93, 120));
        jLabel3.setText("Engineering");

        jLabel4.setForeground(new java.awt.Color(85, 93, 120));
        jLabel4.setText("Dev Intern");

        jLabel5.setForeground(new java.awt.Color(79, 247, 176));
        jLabel5.setText(" ● Intern");

        javax.swing.GroupLayout BenzCardLayout = new javax.swing.GroupLayout(BenzCard);
        BenzCard.setLayout(BenzCardLayout);
        BenzCardLayout.setHorizontalGroup(
            BenzCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BenzCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(122, 122, 122))
            .addGroup(BenzCardLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(BenzCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BenzCardLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(BenzCardLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addComponent(jLabel3)
                    .addGroup(BenzCardLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)))
                .addGap(143, 143, 143))
        );
        BenzCardLayout.setVerticalGroup(
            BenzCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BenzCardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(EmpLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ImportBtn)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GwenCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFilterAll)
                                .addGap(18, 18, 18)
                                .addComponent(BtnFilterFull)
                                .addGap(18, 18, 18)
                                .addComponent(BtnFilterPart)
                                .addGap(18, 18, 18)
                                .addComponent(BtnFilterIntern)))
                        .addGap(193, 193, 193)
                        .addComponent(ZildCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                        .addComponent(BenzCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpLbl)
                    .addComponent(ImportBtn))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilterAll)
                    .addComponent(BtnFilterFull)
                    .addComponent(BtnFilterPart)
                    .addComponent(BtnFilterIntern))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BenzCard, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(ZildCard, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(GwenCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(472, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BenzCard;
    private javax.swing.JButton BtnFilterFull;
    private javax.swing.JButton BtnFilterIntern;
    private javax.swing.JButton BtnFilterPart;
    private javax.swing.JLabel EmpLbl;
    private javax.swing.JPanel GwenCard;
    private javax.swing.JLabel GwenDeptLbl;
    private javax.swing.JLabel GwenIconLbl;
    private javax.swing.JLabel GwenNameLbl;
    private javax.swing.JLabel GwenPosLbl;
    private javax.swing.JLabel GwenTypeLbl;
    private javax.swing.JButton ImportBtn;
    private javax.swing.JPanel ZildCard;
    private javax.swing.JLabel ZildDeptLbl;
    private javax.swing.JLabel ZildIconLbl;
    private javax.swing.JLabel ZildNameLbl;
    private javax.swing.JLabel ZildPosLbl;
    private javax.swing.JLabel ZildTypeLbl;
    private javax.swing.JButton btnFilterAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
