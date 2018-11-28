/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rongyang (written for Crypto module's assignment 2017-18)
 */
public class WhyOneTimePad extends javax.swing.JFrame {

    /**
     * Creates new form AllHere
     */
    public WhyOneTimePad() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(880, 484));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jButton1.setText("S1 XOR S2 -> S3");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Find letters in S3 -> S4");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel1.setText("S1");

        jLabel2.setText("S2");

        jLabel3.setText("S3");

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel4.setText("S4");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel5.setText("Note Pad");

        jButton3.setText("Clear All");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Guess key from S1-S4");
        jButton4.setActionCommand("Gusse key from S1-S4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Find printable in S3 -> S4");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("load to S1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("load to S2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField1.setText("");

        jButton8.setText("S4 to Hex -> S3");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 433, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 70, Short.MAX_VALUE)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 434, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(66, 66, 66)
                .add(jButton6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel3)
                .add(40, 40, 40))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jScrollPane5)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 433, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jButton1)
                                        .add(27, 27, 27)
                                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(jButton5)
                                .add(60, 60, 60)))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jButton4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel4)
                                .add(27, 27, 27))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 57, Short.MAX_VALUE)
                                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 432, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jButton8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jButton3)
                                .add(8, 8, 8)))))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel5)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(17, 17, 17)
                            .add(jLabel1))
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jButton6)
                                .add(jButton7)
                                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jScrollPane3)
                    .add(jScrollPane1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton2)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton5)
                    .add(jButton8)
                    .add(jButton3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .add(28, 28, 28))
        );

        jButton4.getAccessibleContext().setAccessibleName("Gusse key from S1-S4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // S1 xor S2 -> S3
        // read input from textArea1 and textArea2, perform xor, then display at textArea3
        // note that there is a big different from normal xor
        // we allow '_' in the strings which means unkown. we use the rule:  _ xor x = _
         String s1, s2;
        
         StringBuilder buf = new StringBuilder();
         
         s1 = jTextArea1.getText();
         s2 = jTextArea2.getText();
         
         if(!isHex(s1) || !isHex(s2)) {
             System.out.println("please input HEX numbers");
             return;
         }
         int n1 = s1.length();
         int n2 = s2.length();
         int n;
         if(n1 > n2) n = n2;
         else n = n1; // now n = min(n1,n2) need this to handle different lengths of input
         
         for(int i=0; i<n; i++) {
             // char c; remove
             int b;
             if(s1.charAt(i) != '_' && s2.charAt(i) != '_') {
                b = HexAscii2Binary(s1.charAt(i)) ^ HexAscii2Binary(s2.charAt(i));
                buf.append(Binary2HexAscii((byte)b));
             }
             else { // really need this special case ?
                buf.append('_');
             }
         }
         // copy remaining sub-string over
         /* Actually it makes more sense to not copy, so commended this out
         if(n1 > n2) {
             for(int i=n; i<n1; i++) 
                 buf.append(s1.charAt(i));
         
         }
         else {
                for(int i=n; i<n2; i++) 
                 buf.append(s2.charAt(i));
         }
         */         
         jTextArea3.setText(buf.toString());
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // find letters in S3 -> S4
        // read from String 3, convert to a-z if possible, if not, place an underscore, i.e. '_'
        String s3, s4;
        s3 = jTextArea3.getText();
        s4 = showA2Z(s3);
        System.out.println(s4);
        jTextArea4.setText(s4);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // Button "Clear all" - it simply removes all displays and resit global variabels 
         jTextArea5.setText("");
         jTextArea4.setText("");
         jTextArea3.setText("");
         jTextArea2.setText("");
         jTextArea1.setText("");
         jTextField1.setText("");
         possKeyGlobal1="";
         possKeyGlobal2=""; // clear up history for possible key stream 
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // this button is for guessing key strams from the current information in s1, s2 and s4
        // if there is the previous guessed stored in possKey1 and possKey2, we merge both?
        // we also combine String1 and String2 wiht s4 to work out partial Key Stream ?
        String s1, s2, s4;
        String PossKeyStream1 =""; // when we two possible cases: space or letter, 
        String PossKeyStream2 =""; // we save two possible key streams
        s1 = jTextArea1.getText();
        s2 = jTextArea2.getText();
        s4 = jTextArea4.getText(); // s4 is a form of "____l___d___M___"
        
        int n;
        if(s1.length() > s2.length()) n = s2.length()/2;
        else n = s1.length()/2; // the real text stream is only half length of its HEX string
        if(n > s4.length()) {
            System.out.println("Warning: S4 is too short. s4 = " + s4.length() + " min(S1,S2) = " + n);
        }
        for(int i=0; i<n; i++) {
            if(s4.charAt(i) == '_') { // no information
                PossKeyStream1 = PossKeyStream1 + "__"; // need to double length
                PossKeyStream2 = PossKeyStream2 + "__";
            }
            else { // if not '_', assume it is 'L, them we know there are two cases
                   // either 'l' xor x = s1 and ' ' xor x = s2, or the other way around
                char x1, x2;
                //char letter = (char)(s4.charAt(i) ^ ' '); // change lowercase to upcase or upcase to lowercase
                char space = ' ';
                char c1 = (char)(HexAscii2Binary(s1.charAt(2*i+1)) + 16 * HexAscii2Binary(s1.charAt(2*i)));
                char c2 = (char)(HexAscii2Binary(s2.charAt(2*i+1)) + 16 * HexAscii2Binary(s2.charAt(2*i)));
                // one possible key: assume string1 has a space
                x1 = (char)(c1^space);
                // another possible key: assume string2 has a space                   
                x2 = (char)(c2^space);
                
                PossKeyStream1 = PossKeyStream1 + Binary2HexAscii((byte)(x1 >> 4));
                PossKeyStream1 = PossKeyStream1 + Binary2HexAscii((byte)(x1 % 16));
                PossKeyStream2 = PossKeyStream2 + Binary2HexAscii((byte)(x2 >> 4));
                PossKeyStream2 = PossKeyStream2 + Binary2HexAscii((byte)(x2 % 16));
            }
        }
        
        System.out.println("before merge");
        System.out.println(possKeyGlobal1);
        System.out.println(possKeyGlobal2);
        
        mergePossKeyStreams(PossKeyStream1, PossKeyStream2);// update global vars here, ad hoc!
        
        System.out.println("after merge");
        System.out.println(possKeyGlobal1);
        System.out.println(possKeyGlobal2);
        
        //jTextArea6.setText(PossKeyStream1);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // pick up all which is not "_", convery from Hex to Ascii
        String s3, s4;
        s3 = jTextArea3.getText();
        s4 = showAllChars(s3);
        jTextArea4.setText(s4);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // load data from static data array then display it on S1
        readGivenDataThenDisplay(jTextArea1);   
    }//GEN-LAST:event_jButton6ActionPerformed

  
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // similar as button 6 but send to S2
        readGivenDataThenDisplay(jTextArea2);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // read string (guessed ciphertext) from S4 display its Hex form in S3
        String s3, s4;
        s4 = jTextArea4.getText();
        s3 = "";
        int n = s4.length();
        for(int i=0; i<n; i++ ){
            int c = (int)s4.charAt(i);
            s3 = s3 + Integer.toHexString(c);
        }
        jTextArea3.setText(s3);
    }//GEN-LAST:event_jButton8MouseClicked
    
    private void readGivenDataThenDisplay(javax.swing.JTextArea displayTo) {
        // load data from static data array then display it on S1
        String WhichOne;
        int n = 0;
        WhichOne = jTextField1.getText();
        if(WhichOne.length() == 0) {
             System.out.println(
                "Please input which data you want to upload: a1, b1 , .. ?");
                return;
        }
        if(WhichOne.charAt(0)== 'b' || WhichOne.charAt(0)== 'a') {
           /* group B starts from 6 */
           if(WhichOne.charAt(0)== 'b') n = 6;
           WhichOne = WhichOne.substring(1, WhichOne.length()); /* remove the first letter */
        }
        n = n + Integer.parseInt(WhichOne);
        if(n > givenData.length) {
            System.out.println(
                "Please input a number less than " + givenData.length  +" Your input is "+n);
        }
        else {
            n = n-1; // we count from 1, but array atart from 0 
            displayTo.setText(givenData[n]);
        }
    }
      
    private void mergePossKeyStreams(String p1, String p2) {
        // p1 and p2 are form of __83_2_ab_9, i.e. mixed hex and '_' which means dont know yet
        // we merge them with global possible key streams, that is to add new information
         String merged1 = "";
         String merged2 = "";
         int local = p1.length(); // p2 must be same length
         int global = possKeyGlobal1.length();
         int n;
         if(local > global) n = global;
         else n = local; // now n = min(local, global) need this to handle different lengths of input
         
         // check if local==global, if yes do nothing
         if(p1.equals(possKeyGlobal1) && p2.equals(possKeyGlobal2)) return;
         // otherwise merge
         for(int i=0; i<n; i=i+2) {
             if(p1.charAt(i) == '_' && possKeyGlobal1.charAt(i) == '_') { // both unknow, so still unknow
                 // do nothing
                 merged1 = merged1 + "__";
                 merged2 = merged2 + "__";
             }
             else if(p1.charAt(i) == '_') { // Global is NOT '_', keep global
                 // do nothing
                 merged1 = merged1 + possKeyGlobal1.charAt(i);
                 merged1 = merged1 + possKeyGlobal1.charAt(i+1);
                 merged2 = merged2 + possKeyGlobal2.charAt(i);
                 merged2 = merged2 + possKeyGlobal2.charAt(i+1);
             }
             else if(possKeyGlobal1.charAt(i) == '_') { // p1 is NOT '_', keep p
                 merged1 = merged1 + p1.charAt(i);
                 merged1 = merged1 + p1.charAt(i+1);
                 merged2 = merged2 + p2.charAt(i);
                 merged2 = merged2 + p2.charAt(i+1);
             }
             else { // both not "_", conver two bytes into one 
                 int p1_2 = HexAscii2Binary(p1.charAt(i+1)) + 16 * HexAscii2Binary(p1.charAt(i));
                 int g1_2 = HexAscii2Binary(possKeyGlobal1.charAt(i+1)) + 16 * HexAscii2Binary(possKeyGlobal1.charAt(i));
                 int p2_2 = HexAscii2Binary(p2.charAt(i+1)) + 16 * HexAscii2Binary(p2.charAt(i));
                 int g2_2 = HexAscii2Binary(possKeyGlobal2.charAt(i+1)) + 16 * HexAscii2Binary(possKeyGlobal2.charAt(i));
                 // case 1: global pair is same (already deterministic), we ignore local,
                if(g1_2 == g2_2) {
                    merged1 = merged1 + possKeyGlobal1.charAt(i); 
                    merged1 = merged1 + possKeyGlobal1.charAt(i+1);
                    merged2 = merged2 + possKeyGlobal2.charAt(i);
                    merged2 = merged2 + possKeyGlobal2.charAt(i+1);
                }
                // case 2 global pair = local pair p1=g1 p2=g2
                else if((p1_2 == g1_2)&& (p2_2 == g2_2)) {         
                    merged1 = merged1 + possKeyGlobal1.charAt(i);
                    merged1 = merged1 + possKeyGlobal1.charAt(i+1);
                    merged2 = merged2 + possKeyGlobal2.charAt(i); 
                    merged2 = merged2 + possKeyGlobal2.charAt(i+1);
                }
                 // case 3: if only one pair match, discard mismatched ones
                else if((p1_2 == g1_2) ) { // p2_2 != g2_2, we keep g1 delete g2
                    merged1 = merged1 + possKeyGlobal1.charAt(i);
                    merged1 = merged1 + possKeyGlobal1.charAt(i+1);
                    merged2 = merged2 + possKeyGlobal1.charAt(i); // delete the 2nd guess
                    merged2 = merged2 + possKeyGlobal1.charAt(i+1);   
                }
                // case 4: similar to case 3
                else if((p2_2 == g2_2)) { //p1_2 != g1_2, we keep g2
                    merged1 = merged1 + possKeyGlobal2.charAt(i);
                    merged1 = merged1 + possKeyGlobal2.charAt(i+1);
                    merged2 = merged2 + possKeyGlobal2.charAt(i); // delete the 1st guess
                    merged2 = merged2 + possKeyGlobal2.charAt(i+1); 
                }
                // case 5: local=global in crossed way
                else if(p2_2==g1_2 && p1_2==g2_2) {// same as case 2, we ignore local
                    merged1 = merged1 + possKeyGlobal1.charAt(i); 
                    merged1 = merged1 + possKeyGlobal1.charAt(i+1);
                    merged2 = merged2 + possKeyGlobal2.charAt(i);
                    merged2 = merged2 + possKeyGlobal2.charAt(i+1);
                }
                // case 6; one pair is same, ignore others
                else if(p2_2==g1_2){
                    merged1 = merged1 + possKeyGlobal1.charAt(i); 
                    merged1 = merged1 + possKeyGlobal1.charAt(i+1);
                    merged2 = merged2 + possKeyGlobal1.charAt(i);
                    merged2 = merged2 + possKeyGlobal1.charAt(i+1);
                }
                // case 7: another paris is same
                else if(p1_2==g2_2) {
                    merged1 = merged1 + possKeyGlobal2.charAt(i); 
                    merged1 = merged1 + possKeyGlobal2.charAt(i+1);
                    merged2 = merged2 + possKeyGlobal2.charAt(i);
                    merged2 = merged2 + possKeyGlobal2.charAt(i+1);
                }
                else { // shouldn't come to here, at hoc keep global
                    merged1 = merged1 + possKeyGlobal1.charAt(i);
                    merged1 = merged1 + possKeyGlobal1.charAt(i+1);
                    merged2 = merged2 + possKeyGlobal2.charAt(i); 
                    merged2 = merged2 + possKeyGlobal2.charAt(i+1);
                    System.out.println("warning in merge");
                }
             }
         }
         // copy remaining sub-string over
         if(local > global) {
            merged1 = merged1 + p1.substring(n);
            merged2 = merged2 + p2.substring(n);
         }
         else {
            merged1 = merged1 + possKeyGlobal1.substring(n);
            merged2 = merged2 + possKeyGlobal2.substring(n);
         }
         possKeyGlobal1 = merged1;
         possKeyGlobal2 = merged2;
    }
    
    private String showAllChars(String in) { 
        // it simply convert Hex (Ascii) to Chars, but skip '_'
        String out = "";
        char cc;
        int size = in.length();
        if(size%2 != 0) {// in case user input a hex string with a missing 4 bits, we trim it
            size = size - 1;
        }
        for(int i=0; i<size; i=i+2){ // two char represent one ascii
            if(in.charAt(i) == '_') { // make two __ to one
                cc = '_';
            }
            else {
                cc= (char)(HexAscii2Binary(in.charAt(i+1)) + 16 * HexAscii2Binary(in.charAt(i)));
            }
            out = out + cc ;
        }
        return out; 
    }
    
    private String showA2Z(String in) { // this is called from button Find letters in S3 -> S4
        String out = "";
        int size = in.length();
        if(size%2 != 0) {// in case user input a hex string with a missing 4 bits, we trim it
            size = size - 1;
        }
        for(int i=0; i<size; i=i+2){ // two char represent one ascii
            char c = (char)(HexAscii2Binary(in.charAt(i+1)) + 16 * HexAscii2Binary(in.charAt(i)));
            char cc = showA2ZifPossible(c);
            // System.out.println(""+  in.charAt(i) + " " + in.charAt(i+1) + " " + (int)c + " "+ (int)cc);

            out = out + cc ;
        }
        return out; 
    }
    
    private char showA2ZifPossible(char c) {
        if((c >=65 && c < 91) || (c >=97 && c <123)) {// in alpabet 
            return c;
        }
        else {
           return  95; // return '_'
        }
    }
    
     private boolean isHex(String s) { // check if s is a hex string
        char b;
        int n = s.length();
        for(int i=0; i<n; i++) {
            b = s.charAt(i);
            if(b >= '0' && b <='9') continue;
            if(b >= 'a' && b <='f') continue;
            return false;
        }
	return true; 	
    }
     
    private byte HexAscii2Binary(char Hex) {
        byte b;
	if (('0' <= Hex) && (Hex <= '9'))
            b = (byte)(Hex - '0');          
	else
            b = (byte)(Hex - 'a' + 10);
	return b; 	
    }
    
     private char Binary2HexAscii(byte Bin) {
        char c;
	if ((0 <= Bin) && (Bin <= 9))
            c = (char)(Bin + '0');          
	else
            c = (char)(Bin + 'a' - 10);
	return c; 	
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WhyOneTimePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WhyOneTimePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WhyOneTimePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WhyOneTimePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new WhyOneTimePad().setVisible(true);
            }
        });
    }
    
    String possKeyGlobal1=""; // we are guessing possible key stream step by step. These variables keep the current result
    String possKeyGlobal2=""; // had to make them global. ad hoc 
    int textBox1 = 0; 
    int textBox2 = 0;
    
    String[] givenData = {
    //ciphertext #1:
"1c6eff84eb2b4679b9e0194b95c23a19cc3ab30c6c7dadd7be14cb168308d4170ee9fe5db76a1dd554f37c8b8a3472fd1950e1e5a502e71791d0705468b8ab8d66f02fc6a713563edc859ca1bc37520255ab13da2d8259ee41b706377a34ee577e",

    //ciphertext #2:
"1675ffc0fd2d5d7ff5f75146858e3f5bd23af0176433a1dcab58de178808c9121ba6ff5da4650ad513fb779c8a2e7ff90950e9efb24684118780665e2fbfb9986aa97bc8e103562f8e8f98a0f83a530541ab14d727831cf70ebe16286c7b",

    //ciphertext #3:
"0d68e4d0a2636c74a5eb574c9e96321acc7ff40a6c2abcc7ee11d95f8c46801606b9e25bb16a07c413f17c818a3775ee0950f8e8a905af43b7d0735c68a1b78769b935cea7115c2f8e9582f5e52c4f1906fc12d63a8459f441a806346627fd1c",

    //ciphertext #4:
"1169ef84fb2c5c7ea6e14e4682897b16d52ce7586138e8c7af16ce1a8905c9114babe84faa790c9002a834c9996d28ac5c48a1a09313a50e9784324827b8aac861bf3fcca7165d398e9dcca7f933551952ab14d06e9250fb02b1012b6827ed1c",

    //ciphertext #5:
"1169ef84db140961a0f74d0992877b13c131f71d6770a1c1ee1acf19825ac55f5afba018f6265b8002a237d8f93578f10404aff9af13b5439d9f765468acb68c22b17bdbe2075c2fdadc98babc21560a45e002d02f8258b4",
    
    //target ciphertext (decrypt this one):
"1c6eff84fb22472cb1e15a5b89922f5bd437fa0b2330addcbd19cd1acd4dc10c02a5f409a76e0ad146e97cd8de287fbc0615f6a0b312b5069f9d325929bef88a67b53589f20456398e9183a7f9634e0347e540d0209359b4",

    /* group B starts here */
    //ciphertext #1:
"d01f52298e959ff5eb31550541ab09d96e9350f304b41764683bed1223bad7b48581ad5cb66e49c352f77cd8fa337fe9091fafd2a108a30c93d0555426a8aa8976bf2989236ef884fa2c5d64f5e95c5a83833c1ed37ff216677dbacabe14c31a9e17",

    //ciphertext #2:
"c802417dcd9399a7ef264d0454e040d72f9e58ba08b443206821ec1239ac85f3d2debc1ae83959810bb439a1c5353af11803fba0b313a50e9784324827b8aac861bf3fcc6560e4c0b822097eb0f4565b84c22f14803dff196036aac0af0ace51",

    //ciphertext #3:
"c802417dedabccbdfd2d5e4b4fe540db2f8459ba08a943753b78b8017ded95f3d8ddad70aa7e49dd46e96dd8d93578f10404aff9af13b543989f674368bdaa8765a23ac43621ebcafc63482ca7e1494682967b0fcf7ff114623ea3cda119d81bc3",

    //ciphertext #4:
"cf1e5d2994dca9adec2c540e48ff09de22d05be80ead172c293cfa1231b185ab8d83e25bb16a07c413f17c818a3775ee0950f8e8a905af43b7d0735c68a1b78769b935ce6567e5d6b82a472caceb4c5bd0952912d42bf616232faddfa10ade51",

    //ciphertext #5:
"d31f567dc39388a0f0261a1f53ff0fcd6e9f5aba15b20a372938e65625b3c0e28980ad6cb67808dd13dd7199ce217cf54d58bbd1f652ee4ddea47a5468a0b78c77bc3e892964ebc0fd310965a6a46b469e857b22c131f4582b6e999cfe5184",

    //target ciphertext (decrypt this one):
"d71b563cdd99cca7f92e5f0644ee12856e9e59ec04a843217f30fb1225acc0e2949be809ae6e10905ef56b9d8a3472fd0350e0eea303e7019b9373443ba8f89c75bf76dd2c6cef84e8224d2cbcf7195d9f963a17cc26b3116d2eadccbb0acf51"

    };
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}