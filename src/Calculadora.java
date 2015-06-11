import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.StringReader;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pilar
 */
public class Calculadora extends javax.swing.JFrame {
    
   
    
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();        
        
        Image icon = new ImageIcon(getClass().getResource("tux.png")).getImage();        

        setIconImage(icon);
        getRootPane().setDefaultButton(bIgual);
        b1.addActionListener(new BotonNumero("1"));
        b2.addActionListener(new BotonNumero("2"));
        b3.addActionListener(new BotonNumero("3"));
        b4.addActionListener(new BotonNumero("4"));
        b5.addActionListener(new BotonNumero("5"));
        b6.addActionListener(new BotonNumero("6"));
        b7.addActionListener(new BotonNumero("7"));
        b8.addActionListener(new BotonNumero("8"));
        b9.addActionListener(new BotonNumero("9"));
        b0.addActionListener(new BotonNumero("0"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lExpresion = new javax.swing.JLabel();
        lPostfija = new javax.swing.JLabel();
        lResultado = new javax.swing.JLabel();
        bBorrar = new javax.swing.JButton();
        tExpresion = new javax.swing.JTextField();
        tPostfija = new javax.swing.JTextField();
        tResultado = new javax.swing.JTextField();
        bIgual = new javax.swing.JButton();
        bIzq = new javax.swing.JButton();
        bDcho = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bMas = new javax.swing.JButton();
        bMenos = new javax.swing.JButton();
        bPor = new javax.swing.JButton();
        bDividir = new javax.swing.JButton();
        bElevar = new javax.swing.JButton();
        bResto = new javax.swing.JButton();
        tError = new javax.swing.JTextField();
        bPunto = new javax.swing.JToggleButton();
        bSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora...");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName(""); // NOI18N

        lExpresion.setText("Expresión:");

        lPostfija.setText("Postfija:");

        lResultado.setText("Resultado:");

        bBorrar.setText("Borrar");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        tExpresion.setToolTipText("Introduce tu operación");

        tPostfija.setEditable(false);

        tResultado.setEditable(false);

        bIgual.setText("=");
        bIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lExpresion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(tExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lPostfija)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(tPostfija, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(tResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lExpresion)
                    .addComponent(tExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lPostfija)
                            .addComponent(tPostfija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lResultado)
                            .addComponent(tResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        bIzq.setText("(");
        bIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIzqActionPerformed(evt);
            }
        });

        bDcho.setText(")");
        bDcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDchoActionPerformed(evt);
            }
        });

        b7.setText("7");

        b4.setText("4");

        b1.setText("1");

        b8.setText("8");

        b5.setText("5");

        b2.setText("2");

        b9.setText("9");

        b6.setText("6");

        b3.setText("3");

        b0.setText("0");

        bMas.setText("+");
        bMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasActionPerformed(evt);
            }
        });

        bMenos.setText("-");
        bMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosActionPerformed(evt);
            }
        });

        bPor.setText("*");
        bPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPorActionPerformed(evt);
            }
        });

        bDividir.setText("/");
        bDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDividirActionPerformed(evt);
            }
        });

        bElevar.setText("^");
        bElevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bElevarActionPerformed(evt);
            }
        });

        bResto.setText("%");
        bResto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestoActionPerformed(evt);
            }
        });

        tError.setBackground(new java.awt.Color(218, 212, 205));
        tError.setEditable(false);
        tError.setText("No hay mensajes");

        bPunto.setText(".");
        bPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPuntoActionPerformed(evt);
            }
        });

        bSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OpenJDK.png"))); // NOI18N
        bSalir.setToolTipText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDcho, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bResto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(bMas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMenos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(bPor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bElevar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tError, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bIzq, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bDcho, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b7)
                                    .addComponent(b8)
                                    .addComponent(b9)
                                    .addComponent(bMas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b5)
                                    .addComponent(b6)
                                    .addComponent(b4)
                                    .addComponent(bMenos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b1)
                                    .addComponent(b2)
                                    .addComponent(b3)
                                    .addComponent(bPor)
                                    .addComponent(bElevar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bPunto)
                                    .addComponent(b0)
                                    .addComponent(bDividir)
                                    .addComponent(bResto))))
                        .addGap(18, 18, 18)
                        .addComponent(tError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(bSalir)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIzqActionPerformed
        añadirTextField(" ( ", tExpresion);
    }//GEN-LAST:event_bIzqActionPerformed

    private void bDchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDchoActionPerformed
        añadirTextField(" ) ", tExpresion);
    }//GEN-LAST:event_bDchoActionPerformed

    private void bMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasActionPerformed
        añadirTextField(" + ", tExpresion);
    }//GEN-LAST:event_bMasActionPerformed

    private void bMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosActionPerformed
        añadirTextField(" - ", tExpresion);
    }//GEN-LAST:event_bMenosActionPerformed

    private void bPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPorActionPerformed
        añadirTextField(" * ", tExpresion);
    }//GEN-LAST:event_bPorActionPerformed

    private void bDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDividirActionPerformed
        añadirTextField(" / ", tExpresion);
    }//GEN-LAST:event_bDividirActionPerformed

    private void bElevarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bElevarActionPerformed
        añadirTextField(" ^ ", tExpresion);
    }//GEN-LAST:event_bElevarActionPerformed

    private void bRestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestoActionPerformed
        añadirTextField(" % ", tExpresion);
    }//GEN-LAST:event_bRestoActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
       tExpresion.setText(null);
       tResultado.setText(null);
       tPostfija.setText(null);
    }//GEN-LAST:event_bBorrarActionPerformed

    private void bIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIgualActionPerformed
        
      try{
        Stack<String> pila = new Stack<String>();  
        Queue<String> cola = new LinkedList<String>();
        
        //FASE 1 
        
        pila.add("(");
        String expresion = tExpresion.getText() + " )";
        
        Scanner scExp = new Scanner(new StringReader(expresion));    
       
        String aux;
        Operador op;
       
        while(!pila.empty())
        {  
            aux = scExp.next();           
           
            if (esNumero(aux))
            {              
                cola.add(aux);               
            }    
            else
            {
           
                if (aux.equals("("))
                {              
                    pila.push(aux);
                }   
                else
                {                   
                    if (aux.equals(")"))
                    {                  
                          while(!pila.peek().equals("(")){                             
                                cola.add(pila.pop());
                            }
                            pila.pop();
                                   
                    }
                    else
                    {              
                        op = new Operador(aux);
                        if (op.esOperador())
                        {   
                            while(op.esMasPreced(pila.peek()))
                            {
                                cola.add(pila.pop());
                            }         
                            pila.push(aux);         
                        }
                        else
                        {
                            throw new Exception();
                        }
                    }
                }
            }       
   
        }
       
          

        
        //FASE 2
        
        
        Stack<Double> pila1 = new Stack<Double>();
        while(!cola.isEmpty())
        {
            String actual = cola.remove();          
            añadirTextField(actual + " ", tPostfija);
           
                if (esNumero(actual)) pila1.push(Double.parseDouble(actual));
            
                else
                {
                  Operador oper = new Operador(actual);
                  Double y = pila1.pop();
                  Double x = pila1.pop();           
                  pila1.push(oper.operar(x,y));
                }             
        }
        
        
        Double res = pila1.pop();               
        tResultado.setText(String.valueOf(res));
        tError.setText("No hay mensajes");
      
      }catch(Exception e){
          tError.setText("ERROR: No está bien construida.");
          
      }
        

        
    }//GEN-LAST:event_bIgualActionPerformed

    private void bPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPuntoActionPerformed
        añadirTextField(".", tExpresion);
    }//GEN-LAST:event_bPuntoActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.out.println("¡Hasta luego!");
        System.exit(0);        
    }//GEN-LAST:event_bSalirActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bDcho;
    private javax.swing.JButton bDividir;
    private javax.swing.JButton bElevar;
    private javax.swing.JButton bIgual;
    private javax.swing.JButton bIzq;
    private javax.swing.JButton bMas;
    private javax.swing.JButton bMenos;
    private javax.swing.JButton bPor;
    private javax.swing.JToggleButton bPunto;
    private javax.swing.JButton bResto;
    private javax.swing.JButton bSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lExpresion;
    private javax.swing.JLabel lPostfija;
    private javax.swing.JLabel lResultado;
    private javax.swing.JTextField tError;
    private javax.swing.JTextField tExpresion;
    private javax.swing.JTextField tPostfija;
    private javax.swing.JTextField tResultado;
    // End of variables declaration//GEN-END:variables


    private void añadirTextField(String s, JTextField j)
    {
        j.setText(j.getText() + s);
        
    }
    
    private void añadirTextField(Double s, JTextField j)
    {
        j.setText(j.getText() + s);
        
    }
    
    private boolean esNumero(String aux){
        try
        {
            double num = Double.parseDouble(aux);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
        
    }   
    
  
    
    
    class BotonNumero implements ActionListener

    {   
        String txt;

        private BotonNumero(String s) {
            txt = s;
        }

        public void actionPerformed(ActionEvent e) {
            String y;
            String x = tExpresion.getText();            
            
            
            if (!x.equals("")){
                char c = x.charAt(x.length()-1);
                if((c == ' ') || esNumero(Character.toString(c)) || c == '.'){
                    y = txt;
                }
                else {y = " " + txt;}                 
                         
                tExpresion.setText(x+y);
            }
            
            else{tExpresion.setText(txt);}
            
        }
    
        
    }

}


