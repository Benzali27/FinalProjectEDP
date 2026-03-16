
package payroll;

public class PaySlipPanel extends javax.swing.JPanel {

  
    public PaySlipPanel() {
       
        initComponents();
        setLayout(new java.awt.CardLayout());
        
        PayslipListPanel listPanel = new PayslipListPanel();
        PayslipHistoryPanel historyPanel = new PayslipHistoryPanel();
        PayslipDocPanel docPanel = new PayslipDocPanel();
        
        add(listPanel, "list");
        add(historyPanel, "history");
        add(docPanel, "doc");
        
        showCard("list");
        
        listPanel.EmpTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                showCard("history");
            }
        });
        
        historyPanel.BackBtn.addActionListener(ev -> showCard("list"));
        
        historyPanel.HistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int row = historyPanel.HistoryTable.getSelectedRow();
                if (row >= 0) showCard("doc");
            }
        });
        
        docPanel.BackBtn.addActionListener(ev -> showCard("history"));
    }

    private void showCard(String card) {
        java.awt.CardLayout cl = (java.awt.CardLayout) getLayout();
        cl.show(this, card);
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
