package payroll;
public class LoginForm extends javax.swing.JFrame {

    
    public LoginForm() {
      initComponents();
    setLocationRelativeTo(null);
    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    getContentPane().setBackground(new java.awt.Color(13, 15, 20));
    errorLbl.setText(" ");
}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        Roles = new javax.swing.JComboBox<>();
        usernameLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordLbl = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        signinBtn = new javax.swing.JButton();
        errorLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        loginPanel.setBackground(new java.awt.Color(21, 24, 32));
        loginPanel.setPreferredSize(new java.awt.Dimension(1800, 800));

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setText("PAYROLL PH");

        Roles.setForeground(new java.awt.Color(0, 0, 0));
        Roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));

        usernameLbl.setForeground(new java.awt.Color(255, 255, 255));
        usernameLbl.setText("USERNAME");

        passwordLbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordLbl.setText("PASSWORD");

        signinBtn.setBackground(new java.awt.Color(51, 51, 255));
        signinBtn.setForeground(new java.awt.Color(255, 255, 255));
        signinBtn.setText("SIGN IN");
        signinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinBtnActionPerformed(evt);
            }
        });

        errorLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(862, 862, 862)
                .addComponent(Roles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(837, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordLbl)
                            .addComponent(usernameLbl)
                            .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameTxt)
                            .addComponent(passwordField))
                        .addGap(818, 818, 818))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(signinBtn)
                        .addGap(853, 853, 853))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(errorLbl)
                        .addGap(871, 871, 871))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Roles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signinBtn)
                .addGap(18, 18, 18)
                .addComponent(errorLbl)
                .addContainerGap(420, Short.MAX_VALUE))
        );

        getContentPane().add(loginPanel, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinBtnActionPerformed
        String username = usernameTxt.getText().trim();
    String password = new String(passwordField.getPassword());
    String role = Roles.getSelectedItem().toString();
    errorLbl.setText(" ");

    if (role.equals("Admin")) {
        if (username.equals("admin") && password.equals("admin1234")) {
           new DashboardForm().setVisible(true);
           this.dispose();
        } else {
            errorLbl.setText("Incorrect username or password.");
        }
    } else {
        errorLbl.setText("Employee login coming soon.");
    }

    }//GEN-LAST:event_signinBtnActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Roles;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JButton signinBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
