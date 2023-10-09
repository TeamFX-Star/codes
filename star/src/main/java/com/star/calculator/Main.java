package com.star.calculator;

import java.util.Stack;
import java.util.StringTokenizer;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(25, 28, 36));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jButton48.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton48.setText("/");
        jButton48.setBorder(null);
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton48ActionPerformed(evt);
            }
        });

        jButton49.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton49.setText("-");
        jButton49.setBorder(null);
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton49ActionPerformed(evt);
            }
        });

        jButton50.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton50.setText("*");
        jButton50.setBorder(null);
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton50ActionPerformed(evt);
            }
        });

        jButton51.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton51.setText("C");
        jButton51.setBorder(null);
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton51ActionPerformed(evt);
            }
        });

        jButton52.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton52.setText("+");
        jButton52.setBorder(null);
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton52ActionPerformed(evt);
            }
        });

        jButton53.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton53.setText("9");
        jButton53.setBorder(null);
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton53ActionPerformed(evt);
            }
        });

        jButton54.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton54.setText("8");
        jButton54.setBorder(null);
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton54ActionPerformed(evt);
            }
        });

        jButton55.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton55.setText("7");
        jButton55.setBorder(null);
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton55ActionPerformed(evt);
            }
        });

        jButton56.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton56.setText("6");
        jButton56.setBorder(null);
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton56ActionPerformed(evt);
            }
        });

        jButton57.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton57.setText("5");
        jButton57.setBorder(null);
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton57ActionPerformed(evt);
            }
        });

        jButton58.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton58.setText("4");
        jButton58.setBorder(null);
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton58ActionPerformed(evt);
            }
        });

        jButton59.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton59.setText("=");
        jButton59.setBorder(null);
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton59ActionPerformed(evt);
            }
        });

        jButton60.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton60.setText("3");
        jButton60.setBorder(null);
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton60ActionPerformed(evt);
            }
        });

        jButton61.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton61.setText("2");
        jButton61.setBorder(null);
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton61ActionPerformed(evt);
            }
        });

        jButton62.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton62.setText("1");
        jButton62.setBorder(null);
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton62ActionPerformed(evt);
            }
        });

        jButton63.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton63.setText(".");
        jButton63.setBorder(null);
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton63ActionPerformed(evt);
            }
        });

        jButton64.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton64.setText("⌫");
        jButton64.setBorder(null);
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton64ActionPerformed(evt);
            }
        });

        jButton65.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton65.setText("0");
        jButton65.setBorder(null);
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton65ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold> 
	
	private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + "0");
	}	

	private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + ".");
	}	

	private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {
		String labelText = jLabel3.getText();
		if (!labelText.isEmpty()) {
			labelText = labelText.substring(0, labelText.length() - 1);
			jLabel3.setText(labelText);
		}
	}

	private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + "3");
	}	
	
	private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + "2");
	}	

	private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + "1");
	}	

	private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + "4");
	}	

	private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + "5");
	}	

	private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + "6");
	}
	
	private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + "9");
	}

	private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + "8");
	}

	private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + "7");
	}

	private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + " + ");
	}

	private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText("");
	}

	private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + " * ");
	}

	private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + " - ");
	}

	private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {
		jLabel3.setForeground(new java.awt.Color(187, 187, 187));
		jLabel3.setText(jLabel3.getText() + " /" );
	}

	private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {
		String expresion = jLabel3.getText();
	
		try {
			double resultado = evaluarExpresion(expresion);
			jLabel3.setText(String.valueOf(resultado));
		} catch (Exception e) {
			jLabel3.setText("Error"); 
		}
	}
    
	private double evaluarExpresion(String expresion) throws Exception {
		StringTokenizer st = new StringTokenizer(expresion);
		Stack<Double> pila = new Stack<>();
	
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			switch (token) {
				case "+":
					pila.push(pila.pop() + Double.parseDouble(st.nextToken()));
					break;
				case "-":
					pila.push(pila.pop() - Double.parseDouble(st.nextToken()));
					break;
				case "*":
					pila.push(pila.pop() * Double.parseDouble(st.nextToken()));
					break;
				case "/":
					pila.push(pila.pop() / Double.parseDouble(st.nextToken()));
					break;
				default:
					pila.push(Double.parseDouble(token));
					break;
			}
		}
	
		// El resultado final debe estar en la cima de la pila
		return pila.pop();
	}	
	
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
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
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration                   
}
