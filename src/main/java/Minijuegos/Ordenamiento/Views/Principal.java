/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Minijuegos.Ordenamiento.Views;

import Minijuegos.Ordenamiento.Info.GetSentences;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import org.json.JSONArray;

/**
 *
 * @author Alisser
 */
public class Principal extends javax.swing.JFrame implements ActionListener {

    GetSentences info = new GetSentences();
    JSONArray words;
    String question;
    int mission;
    public int index = 0;

    /**
     * Creates new form Principal
     */
    public Principal() throws IOException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        fromWordsPanel = new javax.swing.JPanel();
        toWordsPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionTextArea = new javax.swing.JTextArea();
        backgroundImg = new javax.swing.JLabel();
        responseLabel = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 102));
        setMaximumSize(new java.awt.Dimension(900, 630));
        setMinimumSize(new java.awt.Dimension(900, 630));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 630));

        jPanel1.setMaximumSize(new java.awt.Dimension(15000, 15000));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setMaximumSize(new java.awt.Dimension(15000, 15000));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Monocraft", 1, 36)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Monocraft", 1, 18)); // NOI18N

        titleLabel.setFont(new java.awt.Font("Monocraft", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 0));
        titleLabel.setText("ORDER THE WORDS");

        fromWordsPanel.setBackground(new java.awt.Color(217, 213, 185));
        fromWordsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fromWordsPanel.setForeground(new java.awt.Color(173, 128, 90));
        fromWordsPanel.setMaximumSize(new java.awt.Dimension(830, 160));
        fromWordsPanel.setMinimumSize(new java.awt.Dimension(830, 160));
        fromWordsPanel.setPreferredSize(new java.awt.Dimension(830, 160));
        fromWordsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fromWordsPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fromWordsPanelLayout = new javax.swing.GroupLayout(fromWordsPanel);
        fromWordsPanel.setLayout(fromWordsPanelLayout);
        fromWordsPanelLayout.setHorizontalGroup(
            fromWordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 824, Short.MAX_VALUE)
        );
        fromWordsPanelLayout.setVerticalGroup(
            fromWordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        fromWordsPanel.setLayout(new GridLayout(6, 10));

        toWordsPanel.setBackground(new java.awt.Color(217, 213, 185));
        toWordsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toWordsPanel.setForeground(new java.awt.Color(173, 128, 90));
        toWordsPanel.setMaximumSize(new java.awt.Dimension(830, 160));
        toWordsPanel.setMinimumSize(new java.awt.Dimension(830, 160));
        toWordsPanel.setPreferredSize(new java.awt.Dimension(830, 160));

        exitButton.setBackground(new java.awt.Color(217, 213, 185));
        exitButton.setFont(new java.awt.Font("Monocraft", 1, 28)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 0, 0));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toWordsPanelLayout = new javax.swing.GroupLayout(toWordsPanel);
        toWordsPanel.setLayout(toWordsPanelLayout);
        toWordsPanelLayout.setHorizontalGroup(
            toWordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toWordsPanelLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(exitButton)
                .addContainerGap(364, Short.MAX_VALUE))
        );
        toWordsPanelLayout.setVerticalGroup(
            toWordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toWordsPanelLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(48, 48, 48))
        );

        jScrollPane1.setMaximumSize(new java.awt.Dimension(830, 130));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(830, 130));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(830, 130));

        questionTextArea.setEditable(false);
        questionTextArea.setBackground(new java.awt.Color(217, 213, 185));
        questionTextArea.setColumns(20);
        questionTextArea.setFont(new java.awt.Font("Monocraft", 0, 24)); // NOI18N
        questionTextArea.setForeground(new java.awt.Color(173, 128, 90));
        questionTextArea.setRows(5);
        questionTextArea.setAutoscrolls(false);
        questionTextArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        questionTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        questionTextArea.setFocusable(false);
        questionTextArea.setMaximumSize(new java.awt.Dimension(830, 130));
        questionTextArea.setMinimumSize(new java.awt.Dimension(830, 130));
        questionTextArea.setOpaque(false);
        jScrollPane1.setViewportView(questionTextArea);

        backgroundImg.setBackground(new java.awt.Color(217, 213, 185));
        backgroundImg.setMaximumSize(new java.awt.Dimension(900, 600));
        backgroundImg.setMinimumSize(new java.awt.Dimension(900, 600));
        backgroundImg.setPreferredSize(new java.awt.Dimension(900, 600));

        responseLabel.setFont(new java.awt.Font("Minecraft", 1, 28)); // NOI18N
        responseLabel.setForeground(new java.awt.Color(0, 0, 0));
        responseLabel.setText("Correct!");
        responseLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fromWordsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toWordsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(responseLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(titleLabel)))
                .addContainerGap(272, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backgroundImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addComponent(titleLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fromWordsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(toWordsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(responseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 30, Short.MAX_VALUE)
                    .addComponent(backgroundImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void fromWordsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromWordsPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fromWordsPanelMouseClicked

    /**
     * @param args the command line arguments
     */
    public void WordsToLabel() throws IOException {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\minecraft_font.ttf"));
            titleLabel.setFont(font.deriveFont(Font.PLAIN, 36));
            exitButton.setFont(font.deriveFont(Font.PLAIN, 28));
            questionTextArea.setFont(font.deriveFont(Font.PLAIN, 24));
            responseLabel.setFont(font.deriveFont(Font.PLAIN, 28));
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        backgroundImg.setIcon(new ImageIcon("src\\main\\java\\Minijuegos\\Ordenamiento\\Views\\background.png"));
        if (this.index < info.NumSentences()) {
            toWordsPanel.removeAll();
            this.setLocation(0, 0);
            exitButton.setVisible(false);
            this.mission = info.Mission(index);
            this.words = info.Words(index);
            this.question = info.Questions(index);
            questionTextArea.setVisible(false);
            responseLabel.setVisible(false);
            ArrayList<String> wordsList = new ArrayList<>();
            for (int i = 0; i < words.length(); i++) {
                String word = words.getString(i);
                wordsList.add(word);
            }
            Collections.shuffle(wordsList);
            JSONArray wordsDisorder = new JSONArray(wordsList);
            fromWordsPanel.setLayout(new GridLayout(5, 4));
            fromWordsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            fromWordsPanel.setMinimumSize(new Dimension(830, 120));
            fromWordsPanel.setPreferredSize(new Dimension(830, 120));
            fromWordsPanel.setMaximumSize(new Dimension(830, 120));
            toWordsPanel.setLayout(new GridLayout(5, 4));
            toWordsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            toWordsPanel.setMinimumSize(new Dimension(830, 120));
            toWordsPanel.setPreferredSize(new Dimension(830, 120));
            toWordsPanel.setMaximumSize(new Dimension(830, 120));
            questionTextArea.setText(String.valueOf(this.mission) + ". " + question);
            questionTextArea.setLineWrap(true);
            questionTextArea.setWrapStyleWord(true);
            questionTextArea.setPreferredSize(new Dimension(830, 100));
            questionTextArea.setBorder(null);
            questionTextArea.setVisible(true);
            for (int i = 0; i < wordsDisorder.length(); i++) {
                JButton word = new JButton(wordsDisorder.getString(i));
                word.setPreferredSize(new Dimension(150, 30));
                word.setBackground(new java.awt.Color(204, 204, 204));
                try {
                    Font font = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\minecraft_font.ttf"));
                    word.setFont(font.deriveFont(Font.BOLD, 14));
                } catch (IOException | FontFormatException e) {
                    e.printStackTrace();
                }
                word.addActionListener(this);
                word.setBounds(10, 10, 200, 100);
                fromWordsPanel.add(word);
                fromWordsPanel.revalidate();
            }
        } else {
            fromWordsPanel.removeAll();
            toWordsPanel.removeAll();
            questionTextArea.setText("Congratulations, you have completed the game!");
            questionTextArea.setLineWrap(true);
            questionTextArea.setWrapStyleWord(true);
            questionTextArea.setPreferredSize(new Dimension(830, 100));
            questionTextArea.setBorder(null);
            questionTextArea.setVisible(true);
            toWordsPanel.setLayout(new GridLayout(1, 1));
            toWordsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            toWordsPanel.setMinimumSize(new Dimension(830, 120));
            toWordsPanel.setPreferredSize(new Dimension(830, 120));
            toWordsPanel.setMaximumSize(new Dimension(830, 120));
            toWordsPanel.add(exitButton);
            exitButton.setVisible(true);
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton button) {
            String buttonText = button.getText();
            JButton wordSelected = new JButton(buttonText);
            wordSelected.setPreferredSize(new Dimension(150, 30));
            wordSelected.setBackground(new java.awt.Color(204, 204, 204));
            try {
                Font font = Font.createFont(Font.TRUETYPE_FONT, new File("fonts\\minecraft_font.ttf"));
                wordSelected.setFont(font.deriveFont(Font.BOLD, 14));
            } catch (IOException | FontFormatException t) {
                t.printStackTrace();
            }
            wordSelected.addActionListener(this);
            wordSelected.setBounds(10, 10, 200, 100);
            Container parent = button.getParent();
            if (parent == fromWordsPanel) {
                fromWordsPanel.remove(button);
                fromWordsPanel.repaint();
                toWordsPanel.add(wordSelected);
                toWordsPanel.revalidate();
            } else if (parent == toWordsPanel) {
                toWordsPanel.remove(button);
                toWordsPanel.repaint();
                fromWordsPanel.add(wordSelected);
                fromWordsPanel.revalidate();
            }
            if (toWordsPanel.getComponentCount() == words.length()) {
                JSONArray sentence = new JSONArray();
                Component[] components = toWordsPanel.getComponents();
                for (Component component : components) {
                    if (component instanceof JButton) {
                        JButton word = (JButton) component;
                        String text = word.getText();
                        sentence.put(text);
                    }
                }
                StringBuilder sentenceTrue = new StringBuilder();
                StringBuilder sentenceUser = new StringBuilder();
                for (int i = 0; i < words.length(); i++) {
                    sentenceTrue.append(words.getString(i) + " ");
                    sentenceUser.append(sentence.getString(i) + " ");
                }
                Timer timer = new Timer(1000, (ActionEvent e1) -> {
                    // Aquí es donde ocultaremos el JLabel
                    responseLabel.setVisible(false);
                    try {
                        //this.words = info.Words(index-1);
                        this.WordsToLabel();
                    } catch (IOException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                if (sentenceTrue.toString().equals(sentenceUser.toString())) {
                    responseLabel.setText("Correct!");
                    responseLabel.setVisible(true);
                    timer.setRepeats(false);
                    timer.start();
                    toWordsPanel.removeAll();
                    this.index += 1;
                    toWordsPanel.repaint();
                } else {
                    responseLabel.setText("Incorrect!");
                    responseLabel.setVisible(true);
                    timer.setRepeats(false);
                    timer.start();
                    toWordsPanel.removeAll();
                    toWordsPanel.repaint();
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImg;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel fromWordsPanel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea questionTextArea;
    private javax.swing.JLabel responseLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel toWordsPanel;
    // End of variables declaration//GEN-END:variables
}