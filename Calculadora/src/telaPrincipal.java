import static java.lang.Math.sqrt;
import javax.swing.JTextField;

public class telaPrincipal extends javax.swing.JFrame {

    float num1, num2, resultado = 0;
    int operacao;

    public telaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        visor = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        porcentagem = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        quadrado = new javax.swing.JButton();
        fracao = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        maismenos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        deletar = new javax.swing.JButton();
        limparElemento = new javax.swing.JButton();
        limparTudo = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        um = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        ponto = new javax.swing.JButton();
        adicao = new javax.swing.JButton();
        divisao = new javax.swing.JButton();

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        visor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        visor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visorActionPerformed(evt);
            }
        });

        jButton22.setText("MC");

        jButton23.setText("M+");

        jButton24.setText("M?");

        jButton25.setText("MR");

        jButton26.setText("MS");

        jButton27.setText("M-");
        jButton27.setToolTipText("");

        porcentagem.setText("%");
        porcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentagemActionPerformed(evt);
            }
        });

        raiz.setText("Raiz");
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

        quadrado.setText("Quad");
        quadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quadradoActionPerformed(evt);
            }
        });

        fracao.setText("1/x");
        fracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fracaoActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(204, 204, 204));
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(204, 204, 204));
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        maismenos.setBackground(new java.awt.Color(204, 204, 204));
        maismenos.setText("+/-");
        maismenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maismenosActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(204, 204, 204));
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        dois.setBackground(new java.awt.Color(204, 204, 204));
        dois.setText("2");
        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisActionPerformed(evt);
            }
        });

        sete.setBackground(new java.awt.Color(204, 204, 204));
        sete.setText("7");
        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteActionPerformed(evt);
            }
        });

        deletar.setBackground(new java.awt.Color(204, 204, 204));
        deletar.setText("Del");

        limparElemento.setBackground(new java.awt.Color(204, 204, 204));
        limparElemento.setText("CE");
        limparElemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparElementoActionPerformed(evt);
            }
        });

        limparTudo.setBackground(new java.awt.Color(204, 204, 204));
        limparTudo.setText("C");
        limparTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTudoActionPerformed(evt);
            }
        });

        multiplicacao.setBackground(new java.awt.Color(204, 204, 204));
        multiplicacao.setText("x");
        multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacaoActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(204, 204, 204));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        subtracao.setBackground(new java.awt.Color(204, 204, 204));
        subtracao.setText("-");
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        um.setBackground(new java.awt.Color(204, 204, 204));
        um.setText("1");
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(204, 204, 204));
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        oito.setBackground(new java.awt.Color(204, 204, 204));
        oito.setText("8");
        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoActionPerformed(evt);
            }
        });

        nove.setBackground(new java.awt.Color(204, 204, 204));
        nove.setText("9");
        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveActionPerformed(evt);
            }
        });

        quatro.setBackground(new java.awt.Color(204, 204, 204));
        quatro.setText("4");
        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroActionPerformed(evt);
            }
        });

        ponto.setBackground(new java.awt.Color(204, 204, 204));
        ponto.setText(".");
        ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoActionPerformed(evt);
            }
        });

        adicao.setBackground(new java.awt.Color(204, 204, 204));
        adicao.setText("+");
        adicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicaoActionPerformed(evt);
            }
        });

        divisao.setBackground(new java.awt.Color(204, 204, 204));
        divisao.setText("/");
        divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(visor)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(quadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(fracao, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limparElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(um, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quatro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(maismenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(limparTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27)
                    .addComponent(jButton22)
                    .addComponent(jButton25)
                    .addComponent(jButton23)
                    .addComponent(jButton26)
                    .addComponent(jButton24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(porcentagem)
                    .addComponent(raiz)
                    .addComponent(quadrado)
                    .addComponent(fracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparElemento)
                    .addComponent(limparTudo)
                    .addComponent(deletar)
                    .addComponent(divisao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sete)
                    .addComponent(oito)
                    .addComponent(nove)
                    .addComponent(multiplicacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quatro)
                    .addComponent(cinco)
                    .addComponent(seis)
                    .addComponent(subtracao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(um)
                    .addComponent(dois)
                    .addComponent(tres)
                    .addComponent(adicao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maismenos)
                    .addComponent(zero)
                    .addComponent(ponto)
                    .addComponent(igual))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton22.getAccessibleContext().setAccessibleName("");
        jButton23.getAccessibleContext().setAccessibleName("");
        jButton24.getAccessibleContext().setAccessibleName("");
        jButton25.getAccessibleContext().setAccessibleName("");
        jButton26.getAccessibleContext().setAccessibleName("");
        jButton27.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visorActionPerformed
        visor = new JTextField("");
    }//GEN-LAST:event_visorActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
        visor.setText(visor.getText() + "1");
    }//GEN-LAST:event_umActionPerformed

    private void adicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicaoActionPerformed
        num1 = Float.parseFloat(visor.getText());
        visor.setText(null);
        operacao = 1;
    }//GEN-LAST:event_adicaoActionPerformed

    private void limparElementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparElementoActionPerformed
        visor.setText(""); // ARRUMAR ESSE
    }//GEN-LAST:event_limparElementoActionPerformed

    private void limparTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTudoActionPerformed
        visor.setText("");
    }//GEN-LAST:event_limparTudoActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
        visor.setText(visor.getText() + "2");
    }//GEN-LAST:event_doisActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        visor.setText(visor.getText() + "3");
    }//GEN-LAST:event_tresActionPerformed

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        visor.setText(visor.getText() + "4");
    }//GEN-LAST:event_quatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        visor.setText(visor.getText() + "5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        visor.setText(visor.getText() + "6");
    }//GEN-LAST:event_seisActionPerformed

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        visor.setText(visor.getText() + "7");
    }//GEN-LAST:event_seteActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        visor.setText(visor.getText() + "8");
    }//GEN-LAST:event_oitoActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
        visor.setText(visor.getText() + "9");
    }//GEN-LAST:event_noveActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        visor.setText(visor.getText() + "0");
    }//GEN-LAST:event_zeroActionPerformed

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
        num1 = Float.parseFloat(visor.getText());
        visor.setText(null);
        operacao = 2;
    }//GEN-LAST:event_subtracaoActionPerformed

    private void multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacaoActionPerformed
        num1 = Float.parseFloat(visor.getText());
        visor.setText(null);
        operacao = 3;
    }//GEN-LAST:event_multiplicacaoActionPerformed

    private void divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaoActionPerformed

        num1 = Float.parseFloat(visor.getText());
        visor.setText(null);
        operacao = 4;
    }//GEN-LAST:event_divisaoActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed

        num2 = Float.parseFloat(visor.getText());

        if (operacao == 1) {
            resultado = num1 + num2;
        }
        if (operacao == 2) {
            resultado = num1 - num2;
        }
        if (operacao == 3) {
            resultado = num1 * num2;
        }
        if (operacao == 4) {
            resultado = num1 / num2;
        }

        visor.setText(String.valueOf(resultado));
    }//GEN-LAST:event_igualActionPerformed

    private void pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoActionPerformed
        visor.setText(visor.getText() + ".");
    }//GEN-LAST:event_pontoActionPerformed

    private void fracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fracaoActionPerformed
        float valor = Float.parseFloat(visor.getText());
        float resultado = 1 / valor;
        visor.setText(String.valueOf(resultado));
    }//GEN-LAST:event_fracaoActionPerformed

    private void quadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quadradoActionPerformed
        float valor = Float.parseFloat(visor.getText());
        float resultado = valor; //ARRUMAR ESSE
        visor.setText(String.valueOf(resultado));
    }//GEN-LAST:event_quadradoActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        float valor = Float.parseFloat(visor.getText());
        float resultado = (float) sqrt(valor);
        visor.setText(String.valueOf(resultado));
    }//GEN-LAST:event_raizActionPerformed

    private void porcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentagemActionPerformed
        float valor = Float.parseFloat(visor.getText());
        float resultado = valor / 100;
        visor.setText(String.valueOf(resultado));
    }//GEN-LAST:event_porcentagemActionPerformed

    private void maismenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maismenosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maismenosActionPerformed

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
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicao;
    private javax.swing.JButton cinco;
    private javax.swing.JButton deletar;
    private javax.swing.JButton divisao;
    private javax.swing.JButton dois;
    private javax.swing.JButton fracao;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparElemento;
    private javax.swing.JButton limparTudo;
    private javax.swing.JButton maismenos;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton ponto;
    private javax.swing.JButton porcentagem;
    private javax.swing.JButton quadrado;
    private javax.swing.JButton quatro;
    private javax.swing.JButton raiz;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton subtracao;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JTextField visor;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
