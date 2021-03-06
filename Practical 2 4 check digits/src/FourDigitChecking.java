/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c29-parker
 */
public class FourDigitChecking extends javax.swing.JFrame {

    /**
     * Creates new form FourDigitChecking
     */
    public FourDigitChecking() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        verificationOutput = new javax.swing.JTextArea();
        sixInput = new javax.swing.JTextField();
        verifySix = new javax.swing.JButton();
        tenInput = new javax.swing.JTextField();
        verifyTen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        verificationOutput.setColumns(20);
        verificationOutput.setRows(5);
        jScrollPane1.setViewportView(verificationOutput);

        verifySix.setText("Verify 6 Digit");
        verifySix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verifySixMouseClicked(evt);
            }
        });

        verifyTen.setText("Verify 10 Digit");
        verifyTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verifyTenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sixInput)
                            .addComponent(tenInput))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verifySix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verifyTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sixInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifySix))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifyTen))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/************************************************** 
    
Six Digit Checking
    
**************************************************/       
    
    private void verifySixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifySixMouseClicked
        //clear previous output text
        verificationOutput.setText("");
        // hold code input in variable
        String digits = sixInput.getText();
        // array to hold code as integers with space for check digits
        int[] finalCode = new int[10];
               
        //check code entered is correct length
        if (digits.length() == 6)
        {
            // loop through the 6 numbers in the code 
            for (int x = 0; x < 6; x++)
            {
                // convert character into integer and store in aray
                finalCode[x] = Integer.parseInt(String.valueOf(digits.charAt(x)));

            }
            
            // calculate the 4 check digits 
            // d7        = ( (4*d1)            +(10*d2)            +(9*d3)            +(2*d4)            +(d5)          +(7*d6))            mod 11 
            finalCode[6] = (((4 * finalCode[0])+(10 * finalCode[1])+(9 * finalCode[2])+(2 * finalCode[3])+(finalCode[4])+(7 * finalCode[5])) % 11);
            // d8        = ( (7*d1)            +(8*d2)            +(7*d3)            +(d4)          +(9*d5)            +(6*d6))             mod 11 
            finalCode[7] = (((7 * finalCode[0])+(8 * finalCode[1])+(7 * finalCode[2])+(finalCode[3])+(9 * finalCode[4])+(6 * finalCode[5])) % 11);
            // d9        = ( (9*d1)            +(d2)          +(7*d3)            +(8*d4)            +(7*d5)            +(7*d6))             mod 11
            finalCode[8] = (((9 * finalCode[0])+(finalCode[1])+(7 * finalCode[2])+(8 * finalCode[3])+(7 * finalCode[4])+(7 * finalCode[5])) % 11);
            // d10       = ( (d1)          +(2*d2)            +(9*d3)            +(10*d4)            +(4*d5)            + (d6))          mod 11
            finalCode[9] = (((finalCode[0])+(2 * finalCode[1])+(9 * finalCode[2])+(10 * finalCode[3])+(4 * finalCode[4])+(finalCode[5])) % 11);
 
            // check that none of the check digits are 10
            if ((finalCode[6] == 10) || (finalCode[7] == 10) || (finalCode[8] == 10) || (finalCode[9] == 10))
            {
                verificationOutput.setText("Unusable Number");
            }
            else
            {
                // output whole number
                verificationOutput.setText("Number: ");
                for (int x = 0; x < 10; x++)
                {
                    verificationOutput.append(String.valueOf(finalCode[x]));
                }                
            }
            
        } 
        else
        {
            verificationOutput.append("Enter Code of Six Digits");
        }
    }//GEN-LAST:event_verifySixMouseClicked

/************************************************** 
    
Ten Digit Checking
    
**************************************************/     
    
    private void verifyTenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifyTenMouseClicked
        //clear previous output text
        verificationOutput.setText("");
        // hold code input in variable
        String digits = tenInput.getText();
        // array to hold code as integers
        int[] wholeCode = new int[10];
        // array to hold calculated syndromes
        int[] syndromes = new int[4];

        //check code entered is correct length
        if (digits.length() == 10)
        {
            // loop through the 10 numbers in the code 
            for (int x = 0; x < 10; x++)
            {
                // convert character into integer and store in aray
                wholeCode[x] = Integer.parseInt(String.valueOf(digits.charAt(x)));

            }
            
            // calculate the 4 syndromes
            // s1        = (  d1           + d2           + d3           + d4           + d5           + d6           +d7            +d8            +d9            +d10)          mod 11 
            syndromes[0] = (((wholeCode[0])+(wholeCode[1])+(wholeCode[2])+(wholeCode[3])+(wholeCode[4])+(wholeCode[5])+(wholeCode[6])+(wholeCode[7])+(wholeCode[8])+(wholeCode[9])) % 11);
            // s2        =  ((d1           +(2*d2)            +(3*d3)            +(4*d4)            +(5*d5)            +(6*d6)            +(7*d7)            +(8*d8)            +(9*d9)            +(10*d10))          mod 11
            syndromes[1] = (((wholeCode[0])+(2 * wholeCode[1])+(3 * wholeCode[2])+(4 * wholeCode[3])+(5 * wholeCode[4])+(6 * wholeCode[5])+(7 * wholeCode[6])+(8 * wholeCode[7])+(9 * wholeCode[8])+(10 * wholeCode[9])) % 11);
            // s3        = ( (d1)          +(4*d2)            +(9*d3)            +(5*d4)            +(3*d5)            +(3*d6)            +(5*d7)            +(9*d8)            +(4*d9)            +(d10))        mod 11
            syndromes[2] = (((wholeCode[0])+(4 * wholeCode[1])+(9 * wholeCode[2])+(5 * wholeCode[3])+(3 * wholeCode[4])+(3 * wholeCode[5])+(5 * wholeCode[6])+(9 * wholeCode[7])+(4 * wholeCode[8])+(wholeCode[9])) % 11);
            // s4        =  ((d1)          +(8*d2)            +(5*d3)            +(9*d4)            +(4*d5)            +(7*d6)            +(2*d7)            +(6*d8)            +(3*d9)            +(10*d10))          mod 11
            syndromes[3] = (((wholeCode[0])+(8 * wholeCode[1])+(5 * wholeCode[2])+(9 * wholeCode[3])+(4 * wholeCode[4])+(7 * wholeCode[5])+(2 * wholeCode[6])+(6 * wholeCode[7])+(3 * wholeCode[8])+(10 * wholeCode[9])) % 11);
 
            // output the four syndromes
            verificationOutput.setText("Syndrome: ");
            for (int x = 0; x < 4; x++)
            {
                verificationOutput.append(String.valueOf(syndromes[x]));
            }                

            
        } 
        else
        {
            verificationOutput.append("Enter Code of Ten Digits");
        }
    }//GEN-LAST:event_verifyTenMouseClicked

    
    
    
/************************************************** 
    
END OF CUSTOM CODE
    
**************************************************/ 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FourDigitChecking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FourDigitChecking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FourDigitChecking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FourDigitChecking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FourDigitChecking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sixInput;
    private javax.swing.JTextField tenInput;
    private javax.swing.JTextArea verificationOutput;
    private javax.swing.JButton verifySix;
    private javax.swing.JButton verifyTen;
    // End of variables declaration//GEN-END:variables
}
