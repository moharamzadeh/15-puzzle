
public class frame extends javax.swing.JFrame {

    public frame() {
        initComponents();
    }

    private frame(String puzzle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(67, 35, 68));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(231, 238, 251));
        jPanel2.setForeground(new java.awt.Color(240, 240, 240));
        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        jButton17.setBackground(new java.awt.Color(255, 187, 0));
        jButton17.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton17.setText("1");
        jPanel2.add(jButton17);

        jButton18.setBackground(new java.awt.Color(255, 187, 0));
        jButton18.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton18.setText("2");
        jPanel2.add(jButton18);

        jButton19.setBackground(new java.awt.Color(255, 187, 0));
        jButton19.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton19.setText("3");
        jPanel2.add(jButton19);

        jButton21.setBackground(new java.awt.Color(255, 187, 0));
        jButton21.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton21.setText("4");
        jPanel2.add(jButton21);

        jButton20.setBackground(new java.awt.Color(255, 187, 0));
        jButton20.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton20.setText("5");
        jPanel2.add(jButton20);

        jButton25.setBackground(new java.awt.Color(255, 187, 0));
        jButton25.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton25.setText("6");
        jPanel2.add(jButton25);

        jButton22.setBackground(new java.awt.Color(255, 187, 0));
        jButton22.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton22.setText("7");
        jPanel2.add(jButton22);

        jButton29.setBackground(new java.awt.Color(255, 187, 0));
        jButton29.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton29.setText("8");
        jPanel2.add(jButton29);

        jButton23.setBackground(new java.awt.Color(255, 187, 0));
        jButton23.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton23.setText("9");
        jPanel2.add(jButton23);

        jButton24.setBackground(new java.awt.Color(255, 187, 0));
        jButton24.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton24.setText("10");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24);

        jButton26.setBackground(new java.awt.Color(255, 187, 0));
        jButton26.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton26.setText("11");
        jPanel2.add(jButton26);

        jButton27.setBackground(new java.awt.Color(255, 187, 0));
        jButton27.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton27.setText("12");
        jPanel2.add(jButton27);

        jButton28.setBackground(new java.awt.Color(255, 187, 0));
        jButton28.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton28.setText("13");
        jPanel2.add(jButton28);

        jButton30.setBackground(new java.awt.Color(255, 187, 0));
        jButton30.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton30.setText("14");
        jPanel2.add(jButton30);

        jButton31.setBackground(new java.awt.Color(255, 187, 0));
        jButton31.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jButton31.setText("15");
        jPanel2.add(jButton31);

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("       \"15 - Puzzle\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
