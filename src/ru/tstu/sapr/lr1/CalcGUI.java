/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.tstu.sapr.lr1;

/**
 * @author Алейников ПОКС-45w
 */
public class CalcGUI extends javax.swing.JFrame {
    Integer intA, intB, intX;
    Double dblA, dblB;
    boolean pointA = false, pointB = false;
    int numVar = 1;
    int numOp = 0;

    /**
     * Creates new form CalcGUI
     */
    public CalcGUI() {
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
        tfExp = new javax.swing.JTextField();
        btBack = new javax.swing.JButton();
        btClearExp = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btSign = new javax.swing.JButton();
        btSqrt = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btDiv = new javax.swing.JButton();
        btMod = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btMul = new javax.swing.JButton();
        btInverse = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btSub = new javax.swing.JButton();
        btRes = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btPoint = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graphical Interface of Calculator");

        tfExp.setFont(new java.awt.Font("Consolas", 0, 40)); // NOI18N
        tfExp.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfExp.setText("0");
        tfExp.setToolTipText("");
        tfExp.setName(""); // NOI18N

        btBack.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        btBack.setText("<html>&#8592");

        btClearExp.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        btClearExp.setText("CE");

        btClear.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        btClear.setText("C");
        btClear.setToolTipText("");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btSign.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        btSign.setText("<html>&#177");

        btSqrt.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        btSqrt.setText("<html>&#8730");

        bt7.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt9.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        btDiv.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        btDiv.setText("/");
        btDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivActionPerformed(evt);
            }
        });

        btMod.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        btMod.setText("%");

        bt4.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt6.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        btMul.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        btMul.setText("*");
        btMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMulActionPerformed(evt);
            }
        });

        btInverse.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        btInverse.setText("<html>1/<i>x</i>");

        bt1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        btSub.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        btSub.setText("-");
        btSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubActionPerformed(evt);
            }
        });

        btRes.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        btRes.setText("=");
        btRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResActionPerformed(evt);
            }
        });

        bt0.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });

        btPoint.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        btPoint.setText(",");
        btPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPointActionPerformed(evt);
            }
        });

        btAdd.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        btAdd.setText("+");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1)
                                        .addComponent(tfExp)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btMul, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btClearExp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btSign, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btMod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(btSub, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(btPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btRes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tfExp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btClearExp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btSign, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btMod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btMul, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btSub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(btRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        switch (numVar) {
            case 1:
                if (!pointA) {
                    intX = Integer.valueOf(tfExp.getText());
                    intA = intX * 10 + 2;
                    tfExp.setText(intA.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("2"));
                    dblA = Double.valueOf(tfExp.getText());
                }
                break;

            case 2:
                if (!pointB) {
                    intX = Integer.valueOf(tfExp.getText());
                    intB = intX * 10 + 2;
                    tfExp.setText(intB.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("2"));
                    dblB = Double.valueOf(tfExp.getText());
                }
                break;
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        tfExp.setText("0");
        numVar = 2;
        numOp = 1;
    }//GEN-LAST:event_btAddActionPerformed

    private void btResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResActionPerformed
        switch (numOp) {
            case 1:
                if (pointA & pointB) tfExp.setText(Double.toString(dblA + dblB));
                if (!pointA & pointB) tfExp.setText(Double.toString(intA.doubleValue() + dblB));
                if (pointA & !pointB) tfExp.setText(Double.toString(dblA + intB.doubleValue()));
                if (!pointA & !pointB) tfExp.setText(Integer.toString(intA + intB));
                break;

            case 2:
                if (pointA & pointB) tfExp.setText(Double.toString(dblA - dblB));
                if (!pointA & pointB) tfExp.setText(Double.toString(intA.doubleValue() - dblB));
                if (pointA & !pointB) tfExp.setText(Double.toString(dblA - intB.doubleValue()));
                if (!pointA & !pointB) tfExp.setText(Integer.toString(intA - intB));
                break;

            case 3:
                if (pointA & pointB) tfExp.setText(Double.toString(dblA * dblB));
                if (!pointA & pointB) tfExp.setText(Double.toString(intA.doubleValue() * dblB));
                if (pointA & !pointB) tfExp.setText(Double.toString(dblA * intB.doubleValue()));
                if (!pointA & !pointB) tfExp.setText(Integer.toString(intA * intB));
                break;

            case 4:
                if (pointA & pointB) tfExp.setText(Double.toString(dblA / dblB));
                if (!pointA & pointB) tfExp.setText(Double.toString(intA.doubleValue() / dblB));
                if (pointA & !pointB) tfExp.setText(Double.toString(dblA / intB.doubleValue()));
                if (!pointA & !pointB) tfExp.setText(Double.toString(intA.doubleValue() / intB.doubleValue()));
                break;
        }

        numVar = 1;
        pointA = false;
        pointB = false;
        intA = intB = 0;
        dblA = dblB = 0.0;
    }//GEN-LAST:event_btResActionPerformed

    private void btPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPointActionPerformed
        tfExp.setText(tfExp.getText().concat("."));
        if (numVar == 1) pointA = true;
        if (numVar == 2) pointB = true;
    }//GEN-LAST:event_btPointActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        tfExp.setText("0");
    }//GEN-LAST:event_btClearActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        switch (numVar) {
            case 1:
                if (!pointA) {
                    intX = Integer.valueOf(tfExp.getText());
                    intA = intX * 10 + 1;
                    tfExp.setText(intA.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("1"));
                    dblA = Double.valueOf(tfExp.getText());
                }
                break;

            case 2:
                if (!pointB) {
                    intX = Integer.valueOf(tfExp.getText());
                    intB = intX * 10 + 1;
                    tfExp.setText(intB.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("1"));
                    dblB = Double.valueOf(tfExp.getText());
                }
                break;
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        switch (numVar) {
            case 1:
                if (!pointA) {
                    intX = Integer.valueOf(tfExp.getText());
                    intA = intX * 10 + 0;
                    tfExp.setText(intA.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("0"));
                    dblA = Double.valueOf(tfExp.getText());
                }
                break;

            case 2:
                if (!pointB) {
                    intX = Integer.valueOf(tfExp.getText());
                    intB = intX * 10 + 0;
                    tfExp.setText(intB.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("0"));
                    dblB = Double.valueOf(tfExp.getText());
                }
                break;
        }
    }//GEN-LAST:event_bt0ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        switch (numVar) {
            case 1:
                if (!pointA) {
                    intX = Integer.valueOf(tfExp.getText());
                    intA = intX * 10 + 3;
                    tfExp.setText(intA.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("3"));
                    dblA = Double.valueOf(tfExp.getText());
                }
                break;

            case 2:
                if (!pointB) {
                    intX = Integer.valueOf(tfExp.getText());
                    intB = intX * 10 + 3;
                    tfExp.setText(intB.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("3"));
                    dblB = Double.valueOf(tfExp.getText());
                }
                break;
        }
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        switch (numVar) {
            case 1:
                if (!pointA) {
                    intX = Integer.valueOf(tfExp.getText());
                    intA = intX * 10 + 4;
                    tfExp.setText(intA.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("4"));
                    dblA = Double.valueOf(tfExp.getText());
                }
                break;

            case 2:
                if (!pointB) {
                    intX = Integer.valueOf(tfExp.getText());
                    intB = intX * 10 + 4;
                    tfExp.setText(intB.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("4"));
                    dblB = Double.valueOf(tfExp.getText());
                }
                break;
        }
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        switch (numVar) {
            case 1:
                if (!pointA) {
                    intX = Integer.valueOf(tfExp.getText());
                    intA = intX * 10 + 5;
                    tfExp.setText(intA.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("5"));
                    dblA = Double.valueOf(tfExp.getText());
                }
                break;

            case 2:
                if (!pointB) {
                    intX = Integer.valueOf(tfExp.getText());
                    intB = intX * 10 + 5;
                    tfExp.setText(intB.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("5"));
                    dblB = Double.valueOf(tfExp.getText());
                }
                break;
        }
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        switch (numVar) {
            case 1:
                if (!pointA) {
                    intX = Integer.valueOf(tfExp.getText());
                    intA = intX * 10 + 6;
                    tfExp.setText(intA.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("6"));
                    dblA = Double.valueOf(tfExp.getText());
                }
                break;

            case 2:
                if (!pointB) {
                    intX = Integer.valueOf(tfExp.getText());
                    intB = intX * 10 + 6;
                    tfExp.setText(intB.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("6"));
                    dblB = Double.valueOf(tfExp.getText());
                }
                break;
        }
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        switch (numVar) {
            case 1:
                if (!pointA) {
                    intX = Integer.valueOf(tfExp.getText());
                    intA = intX * 10 + 7;
                    tfExp.setText(intA.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("7"));
                    dblA = Double.valueOf(tfExp.getText());
                }
                break;

            case 2:
                if (!pointB) {
                    intX = Integer.valueOf(tfExp.getText());
                    intB = intX * 10 + 7;
                    tfExp.setText(intB.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("7"));
                    dblB = Double.valueOf(tfExp.getText());
                }
                break;
        }
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        switch (numVar) {
            case 1:
                if (!pointA) {
                    intX = Integer.valueOf(tfExp.getText());
                    intA = intX * 10 + 8;
                    tfExp.setText(intA.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("8"));
                    dblA = Double.valueOf(tfExp.getText());
                }
                break;

            case 2:
                if (!pointB) {
                    intX = Integer.valueOf(tfExp.getText());
                    intB = intX * 10 + 8;
                    tfExp.setText(intB.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("8"));
                    dblB = Double.valueOf(tfExp.getText());
                }
                break;
        }
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        switch (numVar) {
            case 1:
                if (!pointA) {
                    intX = Integer.valueOf(tfExp.getText());
                    intA = intX * 10 + 9;
                    tfExp.setText(intA.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("9"));
                    dblA = Double.valueOf(tfExp.getText());
                }
                break;

            case 2:
                if (!pointB) {
                    intX = Integer.valueOf(tfExp.getText());
                    intB = intX * 10 + 9;
                    tfExp.setText(intB.toString());
                } else {
                    tfExp.setText(tfExp.getText().concat("9"));
                    dblB = Double.valueOf(tfExp.getText());
                }
                break;
        }
    }//GEN-LAST:event_bt9ActionPerformed

    private void btSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubActionPerformed
        tfExp.setText("0");
        numVar = 2;
        numOp = 2;
    }//GEN-LAST:event_btSubActionPerformed

    private void btMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMulActionPerformed
        tfExp.setText("0");
        numVar = 2;
        numOp = 3;
    }//GEN-LAST:event_btMulActionPerformed

    private void btDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivActionPerformed
        tfExp.setText("0");
        numVar = 2;
        numOp = 4;
    }//GEN-LAST:event_btDivActionPerformed

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
            java.util.logging.Logger.getLogger(CalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btClearExp;
    private javax.swing.JButton btDiv;
    private javax.swing.JButton btInverse;
    private javax.swing.JButton btMod;
    private javax.swing.JButton btMul;
    private javax.swing.JButton btPoint;
    private javax.swing.JButton btRes;
    private javax.swing.JButton btSign;
    private javax.swing.JButton btSqrt;
    private javax.swing.JButton btSub;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfExp;

    // End of variables declaration//GEN-END:variables
}