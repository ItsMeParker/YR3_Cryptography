/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c29-parker
 */

public class BCHChecking extends javax.swing.JFrame {

    /**
     * Creates new form BCHChecking
     */
    public BCHChecking() {
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

        sixInput = new javax.swing.JTextField();
        tenInput = new javax.swing.JTextField();
        generate = new javax.swing.JButton();
        decode = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        generate.setText("Generate BCH");
        generate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateMouseClicked(evt);
            }
        });

        decode.setText("Decode BCH");
        decode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decodeMouseClicked(evt);
            }
        });

        textOutput.setColumns(20);
        textOutput.setRows(5);
        jScrollPane1.setViewportView(textOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sixInput)
                            .addComponent(tenInput))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(decode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(generate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sixInput))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(decode)
                    .addComponent(tenInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/************************************************** 
    
Six Digit generation
    
**************************************************/     
    
    private void generateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseClicked
        //clear previous output text
        textOutput.setText("");
        // hold code input in variable
        String digits = sixInput.getText();
        // array to hold code as integers with space for check digits
        int[] finalCode = new int[10];
               
        //check code entered is correct length and composition
        if ((digits.length() == 6) && (digits.matches("^[0-9]*$") == true))
        {
            // loop through the 6 numbers in the code 
            for (int x = 0; x < 6; x++)
            {
                // convert character into integer and store in aray
                finalCode[x] = Integer.parseInt(String.valueOf(digits.charAt(x)));

            }
            
            // calculate the 4 check digits 
            // d7        = (      (4*d1)            +(10*d2)            +(9*d3)            +(2*d4)            +(d5)          +(7*d6))            mod 11 
            finalCode[6] = (mod11((4 * finalCode[0])+(10 * finalCode[1])+(9 * finalCode[2])+(2 * finalCode[3])+(finalCode[4])+(7 * finalCode[5])));
            // d8        = (      (7*d1)            +(8*d2)            +(7*d3)            +(d4)          +(9*d5)            +(6*d6))             mod 11 
            finalCode[7] = (mod11((7 * finalCode[0])+(8 * finalCode[1])+(7 * finalCode[2])+(finalCode[3])+(9 * finalCode[4])+(6 * finalCode[5])));
            // d9        = (      (9*d1)            +(d2)          +(7*d3)            +(8*d4)            +(7*d5)            +(7*d6))             mod 11
            finalCode[8] = (mod11((9 * finalCode[0])+(finalCode[1])+(7 * finalCode[2])+(8 * finalCode[3])+(7 * finalCode[4])+(7 * finalCode[5])));
            // d10       = (      (d1)          +(2*d2)            +(9*d3)            +(10*d4)            +(4*d5)            + (d6))          mod 11
            finalCode[9] = (mod11((finalCode[0])+(2 * finalCode[1])+(9 * finalCode[2])+(10 * finalCode[3])+(4 * finalCode[4])+(finalCode[5])));
 
            // check that none of the check digits are 10
            if ((finalCode[6] == 10) || (finalCode[7] == 10) || (finalCode[8] == 10) || (finalCode[9] == 10))
            {
                textOutput.setText("Unusable Number");
            }
            else
            {
                // output whole number
                textOutput.setText("BCH(10,6): ");
                for (int x = 0; x < 10; x++)
                {
                    textOutput.append(String.valueOf(finalCode[x]));
                }                
            }
            
        } 
        else
        {
            textOutput.append("Enter Code of Six Digits And Or Remove Non Number Characters");
        }
    }//GEN-LAST:event_generateMouseClicked

/************************************************** 
    
ten Digit decoding
    
**************************************************/     
    
    private void decodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decodeMouseClicked
        //clear previous output text
        textOutput.setText("");
        // hold code input in variable
        String digits = tenInput.getText();
        // array to hold code as integers
        int[] wholeCode = new int[10];
        // array to hold calculated syndromes
        int[] syndromes = new int[4];
        // P Q R i and j for use in error correction, temps values for use in calculation of i j
        int P = -1, Q = -1, R = -1, i = -1, j = -1, a = -1, b = -1, tempQ = -1, tempQ2 = -1, temp4PR = -1, tempSQRT = -1, tempPlusMinus = -1;
        // ints for error position and magnitude calculation.
        int posiOne = 0, posiTwo = 0, magniA = 0, magniB = 0;
        
        //check code entered is correct length and composition
        if ((digits.length() == 10) && (digits.matches("^[0-9]*$") == true))
        {
            // loop through the 10 numbers in the code 
            for (int x = 0; x < 10; x++)
            {
                // convert character into integer and store in aray
                wholeCode[x] = Integer.parseInt(String.valueOf(digits.charAt(x)));

            }
            
            // calculate the 4 syndromes
            // s1        = (       d1           +     d2           +     d3           +     d4           +     d5           +     d6           +     d7            +    d8            +    d9            +     d10)          mod 11 
            syndromes[0] = (mod11((wholeCode[0])+(    wholeCode[1])+(    wholeCode[2])+(    wholeCode[3])+(    wholeCode[4])+(    wholeCode[5])+(    wholeCode[6])+(    wholeCode[7])+(    wholeCode[8])+(     wholeCode[9])));
            // s2        =  (     (d1           +(2*d2)            +(3*d3)            +(4*d4)            +(5*d5)            +(6*d6)            +(7*d7)            +(8*d8)            +(9*d9)            +(10*d10))          mod 11
            syndromes[1] = (mod11((wholeCode[0])+(2 * wholeCode[1])+(3 * wholeCode[2])+(4 * wholeCode[3])+(5 * wholeCode[4])+(6 * wholeCode[5])+(7 * wholeCode[6])+(8 * wholeCode[7])+(9 * wholeCode[8])+(10 * wholeCode[9])));
            // s3        = (      (d1)          +(4*d2)            +(9*d3)            +(5*d4)            +(3*d5)            +(3*d6)            +(5*d7)            +(9*d8)            +(4*d9)            +(     d10))        mod 11
            syndromes[2] = (mod11((wholeCode[0])+(4 * wholeCode[1])+(9 * wholeCode[2])+(5 * wholeCode[3])+(3 * wholeCode[4])+(3 * wholeCode[5])+(5 * wholeCode[6])+(9 * wholeCode[7])+(4 * wholeCode[8])+(     wholeCode[9])));
            // s4        = (      (d1)          +(8*d2)            +(5*d3)            +(9*d4)            +(4*d5)            +(7*d6)            +(2*d7)            +(6*d8)            +(3*d9)            +(10*d10))          mod 11
            syndromes[3] = (mod11((wholeCode[0])+(8 * wholeCode[1])+(5 * wholeCode[2])+(9 * wholeCode[3])+(4 * wholeCode[4])+(7 * wholeCode[5])+(2 * wholeCode[6])+(6 * wholeCode[7])+(3 * wholeCode[8])+(10 * wholeCode[9])));
 
            // output the four syndromes
            textOutput.setText("Syndromes: ");
            for (int x = 0; x < 4; x++)
            {
                textOutput.append(String.valueOf(syndromes[x]) + ",");
            }     
            // newline in text output
            textOutput.append("\n");
            /************************************************** 
            ******************No Error*************************
            **************************************************/ 
            // check whether all syndroms are 0 for no error
            if ((syndromes[0] == 0) && (syndromes[1] == 0) && (syndromes[2] == 0) && (syndromes[3] == 0))
            {
                textOutput.append("No Error");
            }
            else
            {
                // calculate P Q and R
                // P = (s2^2 - s1 * s3) mod 11
                P = (mod11(((syndromes[1])*(syndromes[1])) - ((syndromes[0])*(syndromes[2]))));
                // Q = (s1 * s4 - s2 * s3) mod 11
                Q = (mod11(((syndromes[0])*(syndromes[3])) - ((syndromes[1])*(syndromes[2]))));
                // R = (s3^2 - s2 * s4) mod 11 
                R = (mod11(((syndromes[2])*(syndromes[2])) - ((syndromes[1])*(syndromes[3]))));

                // output P Q R to text box
                textOutput.append("P: " + P + " Q: " + Q + " R: " + R + "\n");

                // check whether P=Q=R=0 for One Error . also possible for more that three errors to have P=Q=R=0
                if ((P == 0) && (Q == 0) && (R == 0))
                {
                    // calculate position of the error with s2/s1 corrected to (s2 * s1^-1) mod 11
                    i = (mod11((syndromes[1] * inverse(syndromes[0],11))));
                    // i - 1 to account for array starting at 0
                    posiOne = i - 1;
                    // assign magnitude of error s1
                    magniA = syndromes[0];
                    
                    /***************************************************************/
                    /*Three Or More Errors detected during Single Error Correction**/
                    /***************************************************************/
                    //(Q2-4*P*R) doesn’t have a square root (under mod 11), or position value i is zero, or one of d1-d10 is corrected into 10
                    if ((sqrt(((Q * Q) - 4 * P * R)) == -1) || (i == 0) || ((mod11(wholeCode[posiOne] - magniA)) == 10))
                    {
                        textOutput.append("Three or more errors have occured");
                    }           /*************************************************/
                    else        /*****************One Error Correction************/
                    {           /*************************************************/
                        textOutput.append("Single Error at position: (" + String.valueOf(syndromes[1]) + "/" + String.valueOf(syndromes[0]) + ")mod11=" + String.valueOf(posiOne + 1) + " with magnitude: s1 = " + magniA + "\n");

                        textOutput.append("Original     : ");
                        // output original number to text box
                        printCode(wholeCode,posiOne);

                        // add magnitude of error to incorrect digit and mod by 11 to allow for wrap around
                        wholeCode[posiOne] = (mod11(wholeCode[posiOne] - magniA));

                        textOutput.append("\nCorrected : ");
                        // output corrected number to text box
                        printCode(wholeCode,posiOne);      
                    }
                    
                }        
                else    
                {       

                    
                    //calculate the two positions (i,j) and two magnitudes (a,b)
                    // i = (-Q + √(Q^2-4*P*R)) / 2*P
                    // - Q                    
                    tempQ = (-1 * Q);
                    // Q^2 
                    tempQ2 = (Q * Q);
                    // (4 * P * R) modular 11 
                    temp4PR = mod11(4 * P * R);
                    // √(Q^2-4*P*R)
                    tempSQRT = sqrt(tempQ2 - temp4PR);
                   // -Q + √(Q^2-4*P*R)
                    tempPlusMinus = tempQ + tempSQRT;
                    // (-Q + √(Q^2-4*P*R)) / 2*P   corrected to    -Q + √(Q^2-4*P*R) * inverse of 2 * P
                    i = mod11(tempPlusMinus * inverse(mod11((2 * P)),11));
                    // - 1 from i to account for array then assign to posiOne
                    posiOne = i - 1;     

                    // j = (- Q -  √(Q^2-4*P*R)) / 2*P
                   // -Q - √(Q^2-4*P*R)
                    tempPlusMinus = tempQ - tempSQRT;
                    // (-Q - √(Q^2-4*P*R)) / 2*P   corrected to    -Q - √(Q^2-4*P*R) * inverse of 2 * P
                    j = mod11(tempPlusMinus * inverse(mod11((2 * P)),11));
                    // - 1 from j to account for array then assign to posiTwo
                    posiTwo = j - 1;   

                    //                b = (i*s1-s2) / (i-j)
                    //magnitude two = b = (((i * s1) - s2) / (i - j)) corrected to ((i * s1) - s2) * inverse(i-j)
                    magniB =            mod11(((i * syndromes[0]) - syndromes[1]) * inverse(mod11(i - j),11));
                    
                    //                a = s1 - b
                    //mangitude one = a = (s1           - b       )
                    magniA =            mod11(syndromes[0] - magniB);
                    

                    /***************************************************************/
                    /*Three Or More Errors detected during Double Error Correction**/
                    /***************************************************************/
                    //(Q2-4*P*R) doesn’t have a square root (under mod 11), or position value i or j is zero, or one of d1-d10 is corrected into 10
                    if ((tempSQRT == -1) || (i == 0) || (j == 0) || ((mod11(wholeCode[posiOne] - magniA)) == 10) || ((mod11(wholeCode[posiTwo] - magniB)) == 10))
                    {
                        textOutput.append("Three or more errors have occured");
                        
                    }           /*************************************************/
                    else        /*****************Two Errors Correction***********/
                    {           /*************************************************/
                        textOutput.append("Two Errors at positions: i = " + String.valueOf(i) + " and j = " + String.valueOf(j) + " with magnitudes: a = " + String.valueOf(magniA) + " and b = " + String.valueOf(magniB) + "\n");

                        textOutput.append("Original    : ");
                        // output original number to text box
                        printCode(wholeCode,posiOne,posiTwo);

                        // add magnitude of error to incorrect digits and mod by 11 to allow for wrap around
                        // position i - a
                        wholeCode[posiOne] = (mod11(wholeCode[posiOne] - magniA));
                        // position j - b
                        wholeCode[posiTwo] = (mod11(wholeCode[posiTwo] - magniB));

                        textOutput.append("\nCorrected: ");
                        // output corrected number to text box
                        printCode(wholeCode,posiOne,posiTwo); 
                    }
                    
                } 
                
            }
            
            
        } 
        else
        {
            textOutput.append("Enter Code of Ten Digits And Or Remove Non Number Characters");
        }
    }//GEN-LAST:event_decodeMouseClicked
  
/****************************************************************
* Function name     : printCode
*    returns        : void                     
*    arg1 : int[]   : code    : integer array holding code to be printed
*    arg2 : int     : posiOne : location in code for first error
*    arg3 : int     : posiTwo :  optional location of second error
* Created by        : Connor Parker
* Description       : function to print 10 digit hamming code with [] 
*                     surrounding either one or two errors
* Notes             : Second error variable is made optional by overloading
*                     the printCode method
***************************************************************/    

    public void printCode(int[] code, int posiOne, int posiTwo) 
    { 
        for (int x = 0; x < 10; x++)
        {
            // surround both corrections with brackets
            if (x == (posiTwo + 1))
                textOutput.append("]");

            if (x == (posiOne + 1))
                textOutput.append("]");
            
            if (x == (posiTwo))
                textOutput.append("[");

            if (x == (posiOne))
                textOutput.append("[");


            textOutput.append(String.valueOf(code[x]));
            // add end bracket since previous if wont when error in 10th digit 
            if (((posiOne == 9) || (posiTwo == 9)) && (x == 9))
                textOutput.append("]"); 
        }
    }
    
    // overload printCode
    public void printCode(int[] code, int posiOne) 
    { 
        // -2 to avoid [ at start of code
        printCode(code,posiOne,-2);
    }
    
/****************************************************************
* Function name     : mod11
*    returns        : int                     
*    arg1           : int : value of integer to return the modular 11 of 
* Created by        : Connor Parker
* Description       : Apply correction for % 11 returning negative values
*                     to neaten code 
* Notes             : N/A
***************************************************************/    

    public int mod11(int input) 
    { 
        int answer = -1;
        // mod input by 11
        answer = input % 11;                    
        // account for mod 11 returning negative values
        if (answer < 0)                
            answer = 11 + answer;     
        
        return answer;
    }
    
/****************************************************************
* Function name     : sqrt
*    returns        : int                     
*    arg1           : int : value of integer to return the square root of 
* Created by        : Connor Parker
* Description       : Return value of square root according to table of Zn 
*                     example found in lecture 3 BCH codes page 23                   
* Notes             : N/A
***************************************************************/    
    
    public int sqrt(int input) 
    { 
        int answer = -1;
        // ensure that input is within 1 to 10
        input = mod11(input);
        
        // change value to return based on input 
        switch(input) 
        {
            case 0 : 
                answer = 0;
                break;
            case 1 :
                answer = 1;
                break;
                
            case 3 :
                answer = 5;
                break;
                
            case 4 :
                answer = 2;
                break;
                
            case 5 :
                answer = 4;
                break;
                
            case 9 :
                answer = 3;
                break;
            // any other case returns - 1    
            default : 
                answer = -1;
                
        }       
        
        return answer;
    }
    
/****************************************************************
* Function name     : inverse
*    returns        : int                     
*    arg1           : int : value of integer to return the inverse of 
*    arg2           : int : value arg1 will be moduloded by
* Created by        : Rong Yang
* Source            : Cryptography lecture 2 Hamming Codes page 31
* Description       : Extended Euclidean Algorithm of calculating inverse                    
* Notes             : N/A
***************************************************************/
        
    public int inverse(int a, int n) { 
    int t = 0; int newt = 1; 
    int r = n; int newr = a;    int q, temp;  
    while(newr != 0) { 
        q = r / newr;  /* integer division */        
        temp = newt;   /* remember newt    */
        newt = t - q*newt;
        t = temp;
        temp = newr;   /* remember newr    */
        newr = r - q*newr;
        r = temp;
    } 
    if(r > 1) return -1; /* not invertible */
    if(t < 0) t = t + n; /* change to positive */
    return t;
    }
    
/******************End of Code by Rong Yang***********************/  

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
            java.util.logging.Logger.getLogger(BCHChecking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BCHChecking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BCHChecking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BCHChecking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BCHChecking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decode;
    private javax.swing.JButton generate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sixInput;
    private javax.swing.JTextField tenInput;
    private javax.swing.JTextArea textOutput;
    // End of variables declaration//GEN-END:variables
}
