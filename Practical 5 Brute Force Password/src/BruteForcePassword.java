
import java.io.UnsupportedEncodingException;
import static java.lang.reflect.Array.get;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c29-parker
 */
public class BruteForcePassword extends javax.swing.JFrame {

    int last = 0;

    /**
     * Creates new form BruteForcePassword
     */
    public BruteForcePassword() {
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
        jTextArea1 = new javax.swing.JTextArea();
        input = new javax.swing.JTextField();
        Force = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textOutput = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        chooseMethod = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Force.setText("Break");
        Force.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForceMouseClicked(evt);
            }
        });

        textOutput.setColumns(20);
        textOutput.setRows(5);
        jScrollPane1.setViewportView(textOutput);

        jTextField1.setEditable(false);
        jTextField1.setText("Select Brute Force Method on Right");

        jTextField2.setEditable(false);
        jTextField2.setText("Enter Hashed Password to Break Below");

        chooseMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Simple", "Simple Threaded", "Dictionary", "Dictionary Threaded", "Rainbow" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(input)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(454, 454, 454)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Force))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chooseMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Force))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/**************************************************

Brute Force Password

**************************************************/
    Map<Integer,String> charaSet = new HashMap();
    Map<String,Integer> keySet = new HashMap();
    
    private void initialiseMaps()
    {        
        charaSet.put(0, "a");
        charaSet.put(1, "b");
        charaSet.put(2, "c");
        charaSet.put(3, "d");
        charaSet.put(4, "e");
        charaSet.put(5, "f");
        charaSet.put(6, "g");
        charaSet.put(7, "h");
        charaSet.put(8, "i");
        charaSet.put(9, "j");
        charaSet.put(10,"k");
        charaSet.put(11,"l");
        charaSet.put(12,"m");
        charaSet.put(13,"n");
        charaSet.put(14,"o");
        charaSet.put(15,"p");
        charaSet.put(16,"q");
        charaSet.put(17,"r");
        charaSet.put(18,"s");
        charaSet.put(19,"t");
        charaSet.put(20,"u");
        charaSet.put(21,"v");
        charaSet.put(22,"w");
        charaSet.put(23,"x");
        charaSet.put(24,"y");
        charaSet.put(25,"z");
        charaSet.put(26,"0");
        charaSet.put(27,"1");
        charaSet.put(28,"2");
        charaSet.put(29,"3");
        charaSet.put(30,"4");
        charaSet.put(31,"5");
        charaSet.put(32,"6");
        charaSet.put(33,"7");
        charaSet.put(34,"8");
        charaSet.put(35,"9");

        keySet.put("a",0 );
        keySet.put("b",1 );
        keySet.put("c",2 );
        keySet.put("d",3 );
        keySet.put("e",4 );
        keySet.put("f",5 );
        keySet.put("g",6 );
        keySet.put("h",7 );
        keySet.put("i",8 );
        keySet.put("j",9 );
        keySet.put("k",10);
        keySet.put("l",11);
        keySet.put("m",12);
        keySet.put("n",13);
        keySet.put("o",14);
        keySet.put("p",15);
        keySet.put("q",16);
        keySet.put("r",17);
        keySet.put("s",18);
        keySet.put("t",19);
        keySet.put("u",20);
        keySet.put("v",21);
        keySet.put("w",22);
        keySet.put("x",23);
        keySet.put("y",24);
        keySet.put("z",25);
        keySet.put("0",26);
        keySet.put("1",27);
        keySet.put("2",28);
        keySet.put("3",29);
        keySet.put("4",30);
        keySet.put("5",31);
        keySet.put("6",32);
        keySet.put("7",33);
        keySet.put("8",34);
        keySet.put("9",35); 
        
    }
    
    
    private void ForceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForceMouseClicked
        // password is a maximum of six lower-case letters and digits
        // https://dzone.com/articles/java-thread-tutorial-creating-threads-and-multithr
        // hold hashed password
        String passwordHash = input.getText();

        // get method of password breaking selected in drop down box
        Object selected = chooseMethod.getSelectedItem();
        String method = selected.toString();

        // start a timer to measure CPU time taken to break passwordk
        timeStart();
        
        // call different method depending on option chosed
        switch (method)
        {
            case "Simple":
                // call function for simple brute force password breaking from
                simpleBreak(passwordHash,"");
                break;
            case "Simple Threaded":
                textOutput.setText("Simple Threaded Breaking not yet Implemented");
                
                // create threads and call simpleBreak with different start strings
                // create list of threads so that once one finds it they can be killed
                break;
            case "Dictionary":
                textOutput.setText("Dictionary Breaking not yet Implemented");
                break;
            case "Dictionary Threaded":
                textOutput.setText("Dictionary Threaded Breaking not yet Implemented");
                break;
            case "Rainbow":
                textOutput.setText("Rainbow Breaking not yet Implemented");

                break;
        }
        
        // end timer started above and output time taken
        timeStop("showSec");

    }//GEN-LAST:event_ForceMouseClicked

/****************************************************************
* Function name   : simpleBreak
*    returns      : boolean
*    arg1         : String : passwordHash
*    arg1         : String : startFrom
* Created by      : Connor Parker
* Created on      : 08/11/2018
* Description     : take a string to start creating hashes from and compare 
*                   them to the password hash passed in
* Notes           : return boolean so that if password is found other threads can be killed
***************************************************************/

    private boolean simpleBreak(String passwordHash, String startFrom)
    {
        boolean found = false;
        
        String generatedHash = "";
        
        String generatedPassword = startFrom;
       
        // if either map is unpopulated call function to populate them
        if (charaSet.isEmpty() || keySet.isEmpty())
        {
            initialiseMaps();
        }
        
        // if string to start from is empty call get Next string to start from single character
        if (Objects.equals(generatedPassword, ""))
        {
            generatedPassword = getNextString(startFrom);
        }
        
        // continue loop until password is found
        while(found == false)
        {
            // create a hash from the password string generated
/******************Following code is taken from practical 4 word document***********************/
            try {
                generatedHash = SHA1(generatedPassword);
            } catch (NoSuchAlgorithmException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
/******************End of Code taken from practical 4.docx***********************/
            
            // compare the hash of the generated password to the hash of the real password
            if (Objects.equals(generatedHash, passwordHash))
            {
                found = true;
            }
            
            if (found == false)
            {
                // generated password was not correct so generate next password to check
                generatedPassword = getNextString(generatedPassword);
            }

            
        }
        
        textOutput.append( passwordHash + " Broken \n\n Password = " + generatedPassword);
        
        return found;

    }
    
    
/****************************************************************
* Function name   : getNextString
*    returns      : String
*    arg1         : String : In 
* Created by      : Connor Parker 
* Created on      : 08/11/2018
* Description     : recursive function that takes a string and returns the next 
*                   string for the sake of looping through all possible strings
* Notes           : Based upon function in tutorial 7 
***************************************************************/
    
    private String getNextString(String Input)
    {
        int length;
        String out; 
        String c;

        length = Input.length();
        // if empty string passed in set string to first character in the character set
        if (length == 0)
        {
            // return first character in the map of characters
            return String.valueOf(charaSet.get(0));
        }
        
        //charaSet.get((charaSet.size() - 1))
        
        // if character at end of string is the character at the end of the character set
        // e.g. in charaSet {a-z}    string aaz  z is end of charasSet
        // - 1 from each value to account for arrays starting at 0
        if (Objects.equals(String.valueOf(Input.charAt(length - 1)), charaSet.get((charaSet.size() - 1))))
        {
            out = Input.substring(0, length-1);
            // call recursively rather than looping 
            return getNextString(out) + String.valueOf(charaSet.get(0));            
        }
        // if character at the end of string is any other character in the character set 
        // e.g. in charaSet {a-z}    string aac 
        else
        {
            // c = value of last character in Input casted to a string
            c = String.valueOf(Input.charAt(length-1));
            // remove last character from string then append next character in the character set 
            out = Input.substring(0, length-1) + String.valueOf(charaSet.get((keySet.get(c)) + 1));
            // return string with last character incremented
            return out;
        }

    }

/****************************************************************
* Function name   :
*    returns      :
*    arg1         :
* Created by      :
* Created on      :
* Description     :
* Notes           : N/A
***************************************************************/

/******************Following code is taken from measuringCPUtimeInJava.docx***********************/

// a variable to remember the start time,  use the following methods
long timer = 0;

void timeStart() {
        timer = System.currentTimeMillis();
}

void timeStop(String s) {
        timer = System.currentTimeMillis() - timer;
        if(s.equals("showMs") || s.equals(""))
            System.out.println("Time taken is " + timer + "  milliseconds");
        else if(s.equals("showSec"))
            System.out.println("Time taken is " + timer/1000 + " seconds");
        else if(s.equals("showMin")) {
            System.out.println("Time taken is " + timer/60000 + " munites and "
                    + (timer%60000)/1000 + " seconds");
        }
 }
/******************End of Code taken from measuringCPUtimeInJava.docx***********************/


//******************Following code is taken from practical 4.docx***********************/

    private static String convertToHex(byte[] data)
    {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) {
        	int halfbyte = (data[i] >>> 4) & 0x0F;
        	int two_halfs = 0;
        	do {
	            if ((0 <= halfbyte) && (halfbyte <= 9))
	                buf.append((char) ('0' + halfbyte));
	            else
	            	buf.append((char) ('a' + (halfbyte - 10)));
	            halfbyte = data[i] & 0x0F;
        	} while(two_halfs++ < 1);
        }
        return buf.toString();
    }

    public static String SHA1(String text)
    throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        MessageDigest md;
        md = MessageDigest.getInstance("SHA-1");
        byte[] sha1hash = new byte[40];
        md.update(text.getBytes("iso-8859-1"), 0, text.length());
        sha1hash = md.digest();
        return convertToHex(sha1hash);
    }

/******************End of Code taken from practical 4.docx***********************/

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
            java.util.logging.Logger.getLogger(BruteForcePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BruteForcePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BruteForcePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BruteForcePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BruteForcePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Force;
    private javax.swing.JComboBox<String> chooseMethod;
    private javax.swing.JTextField input;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea textOutput;
    // End of variables declaration//GEN-END:variables

    private String get(Map charaSet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
