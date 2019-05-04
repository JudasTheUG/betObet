
package neverLand;
import java.awt.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javax.swing.JOptionPane;
import javax.swing.JButton;
/**
 *
 * @author JudasTheUG
 */
public class betObet extends javax.swing.JFrame {

    public betObet() {
        initComponents();
    }
    int times1=0,times2=0,times3=0,times4=0,times5=0,times6=0,times7=0,times8=0,times9=0,times10=0;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtAway = new javax.swing.JTextPane();
        btnStatus2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtHome = new javax.swing.JTextPane();
        btnStatus1 = new javax.swing.JButton();
        btnStatus3 = new javax.swing.JButton();
        btnStatus4 = new javax.swing.JButton();
        btnStatus5 = new javax.swing.JButton();
        btnStatus7 = new javax.swing.JButton();
        btnStatus6 = new javax.swing.JButton();
        btnStatus8 = new javax.swing.JButton();
        btnStatus9 = new javax.swing.JButton();
        btnStatus10 = new javax.swing.JButton();
        txtJfield = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane2.setViewportView(txtAway);

        btnStatus2.setText("4");
        btnStatus2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatus2MouseClicked(evt);
            }
        });

        jScrollPane3.setViewportView(txtHome);

        btnStatus1.setText("1");
        btnStatus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatus1MouseClicked(evt);
            }
        });

        btnStatus3.setText("5");
        btnStatus3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatus3MouseClicked(evt);
            }
        });

        btnStatus4.setText("2");
        btnStatus4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatus4MouseClicked(evt);
            }
        });

        btnStatus5.setText("3");
        btnStatus5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatus5MouseClicked(evt);
            }
        });

        btnStatus7.setText("2");
        btnStatus7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatus7MouseClicked(evt);
            }
        });

        btnStatus6.setText("1");
        btnStatus6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatus6MouseClicked(evt);
            }
        });

        btnStatus8.setText("3");
        btnStatus8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatus8MouseClicked(evt);
            }
        });

        btnStatus9.setText("4");
        btnStatus9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatus9MouseClicked(evt);
            }
        });

        btnStatus10.setText("5");
        btnStatus10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatus10MouseClicked(evt);
            }
        });

        btnCalculate.setLabel("Calculate The Odds!");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jLabel1.setText("   Given Winning Chance");

        jLabel2.setText("   Given Winning Chance");

        jLabel3.setText("        << Last 5 Matches >>");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/away.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.png"))); // NOI18N

        jLabel5.setText("WARNING!!!! chances should be in format of x.x");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnStatus5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                            .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtJfield)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnStatus6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(btnStatus7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnStatus8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnStatus9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnStatus10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStatus7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStatus8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStatus6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnStatus9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnStatus10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnStatus5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(234, 234, 234))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtJfield, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        btnStatus2.getAccessibleContext().setAccessibleName("jButton1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatus1MouseClicked
        times1++;
        switch (times1%3) {
            case 1:
                btnStatus1.setBackground(Color.green);
                btnStatus1.setText("W");
                break;
            case 2:
                btnStatus1.setBackground(Color.yellow);
                btnStatus1.setText("D");
                break;
            case 0:
                btnStatus1.setBackground(Color.red);
                btnStatus1.setText("L");
                break;
            default:
                break;
        }
        
    }//GEN-LAST:event_btnStatus1MouseClicked

    private void btnStatus2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatus2MouseClicked
        times2++;
        switch (times2%3) {
            case 1:
                btnStatus2.setBackground(Color.green);
                btnStatus2.setText("W");
                break;
            case 2:
                btnStatus2.setBackground(Color.yellow);
                btnStatus2.setText("D");
                break;
            case 0:
                btnStatus2.setBackground(Color.red);
                btnStatus2.setText("L");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnStatus2MouseClicked

    private void btnStatus3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatus3MouseClicked
        times3++;
        switch (times3%3) {
            case 1:
                btnStatus3.setBackground(Color.green);
                btnStatus3.setText("W");
                break;
            case 2:
                btnStatus3.setBackground(Color.yellow);
                btnStatus3.setText("D");
                break;
            case 0:
                btnStatus3.setBackground(Color.red);
                btnStatus3.setText("L");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnStatus3MouseClicked

    private void btnStatus4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatus4MouseClicked
        times4++;
        switch (times4%3) {
            case 1:
                btnStatus4.setBackground(Color.green);
                btnStatus4.setText("W");
                break;
            case 2:
                btnStatus4.setBackground(Color.yellow);
                btnStatus4.setText("D");
                break;
            case 0:
                btnStatus4.setBackground(Color.red);
                btnStatus4.setText("L");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnStatus4MouseClicked

    private void btnStatus5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatus5MouseClicked
        times5++;
        switch (times5%3) {
            case 1:
                btnStatus5.setBackground(Color.green);
                btnStatus5.setText("W");
                break;
            case 2:
                btnStatus5.setBackground(Color.yellow);
                btnStatus5.setText("D");
                break;
            case 0:
                btnStatus5.setBackground(Color.red);
                btnStatus5.setText("L");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnStatus5MouseClicked

    private void btnStatus6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatus6MouseClicked
        times6++;
        switch (times6%3) {
            case 1:
                btnStatus6.setBackground(Color.green);
                btnStatus6.setText("W");
                break;
            case 2:
                btnStatus6.setBackground(Color.yellow);
                btnStatus6.setText("D");
                break;
            case 0:
                btnStatus6.setBackground(Color.red);
                btnStatus6.setText("L");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnStatus6MouseClicked

    private void btnStatus7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatus7MouseClicked
       times7++;
        switch (times7%3) {
            case 1:
                btnStatus7.setBackground(Color.green);
                btnStatus7.setText("W");
                break;
            case 2:
                btnStatus7.setBackground(Color.yellow);
                btnStatus7.setText("D");
                break;
            case 0:
                btnStatus7.setBackground(Color.red);
                btnStatus7.setText("L");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnStatus7MouseClicked

    private void btnStatus8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatus8MouseClicked
        times8++;
        switch (times8%3) {
            case 1:
                btnStatus8.setBackground(Color.green);
                btnStatus8.setText("W");
                break;
            case 2:
                btnStatus8.setBackground(Color.yellow);
                btnStatus8.setText("D");
                break;
            case 0:
                btnStatus8.setBackground(Color.red);
                btnStatus8.setText("L");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnStatus8MouseClicked

    private void btnStatus9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatus9MouseClicked
        times9++;
        switch (times9%3) {
            case 1:
                btnStatus9.setBackground(Color.green);
                btnStatus9.setText("W");
                break;
            case 2:
                btnStatus9.setBackground(Color.yellow);
                btnStatus9.setText("D");
                break;
            case 0:
                btnStatus9.setBackground(Color.red);
                btnStatus9.setText("L");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnStatus9MouseClicked

    private void btnStatus10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatus10MouseClicked
        times10++;
        switch (times10%3) {
            case 1:
                btnStatus10.setBackground(Color.green);
                btnStatus10.setText("W");
                break;
            case 2:
                btnStatus10.setBackground(Color.yellow);
                btnStatus10.setText("D");
                break;
            case 0:
                btnStatus10.setBackground(Color.red);
                btnStatus10.setText("L");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnStatus10MouseClicked

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        double homeTeamChance=homeTeamChance();
        double awayTeamChance=awayTeamChance();
        homeTeamChance= homeTeamChance/Double.parseDouble(txtHome.getText());
        awayTeamChance= awayTeamChance/Double.parseDouble(txtAway.getText());
        
        writeToBoard(homeTeamChance,awayTeamChance);
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
JOptionPane.showMessageDialog(null,"You can look up to sahadan.com, mackolik.com or any other bet website for needed info!");        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    public double homeTeamChance(){
       double points=0;
       points+=pointTaker(btnStatus1);
       points+=pointTaker(btnStatus2);
       points+=pointTaker(btnStatus3);
       points+=pointTaker(btnStatus4);
       points+=pointTaker(btnStatus5);
       
       return points;
    }
        public double awayTeamChance(){
       double points=0;
       points+=pointTaker(btnStatus6);
       points+=pointTaker(btnStatus7);
       points+=pointTaker(btnStatus8);
       points+=pointTaker(btnStatus9);
       points+=pointTaker(btnStatus10);
       
       return points;
    }
    
        public void writeToBoard(Double home, Double away){
            if(home>away+0.5)
                txtJfield.setText("Home team will WIN");
            else if(home<away+0.5)
                txtJfield.setText("Away team will WIN");
            else
                txtJfield.setText("It is gonna be a boring match a.k.a DRAW");
        }
    
    public double pointTaker(JButton btn){
        double pass=0;
        if(btn.getText()=="W")
            pass+=3;
        else if(btn.getText()=="D")
            pass+=2;
        else if(btn.getText()=="L")
            pass+=1;
        
        return pass;
    }
    
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnStatus1;
    private javax.swing.JButton btnStatus10;
    private javax.swing.JButton btnStatus2;
    private javax.swing.JButton btnStatus3;
    private javax.swing.JButton btnStatus4;
    private javax.swing.JButton btnStatus5;
    private javax.swing.JButton btnStatus6;
    private javax.swing.JButton btnStatus7;
    private javax.swing.JButton btnStatus8;
    private javax.swing.JButton btnStatus9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane txtAway;
    private javax.swing.JTextPane txtHome;
    private javax.swing.JTextField txtJfield;
    // End of variables declaration//GEN-END:variables
}
