package Views;

import Controller.MovieJpaController;
import Controller.exceptions.NonexistentEntityException;
import Entities.Movie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {
    
    private JTextField usernameAddInputField;
    private JTextField passwordAddInputField;
    private JPanel myPanel;
    private Movie m;
    private MovieJpaController mc;
    
    public Menu() {
        initComponents();
        panel = null;
        setLocationRelativeTo(null);
        jTableMovie.setShowGrid(true);
        usernameAddInputField = new JTextField();
        passwordAddInputField = new JTextField();
        myPanel = new JPanel();
        usernameAddInputField = new JTextField(10);
        passwordAddInputField = new JTextField(10);
        myPanel.add(new JLabel("Username:"));
        myPanel.add(usernameAddInputField);
        myPanel.add(Box.createHorizontalStrut(10)); // a spacer
        myPanel.add(Box.createVerticalStrut(30));
        myPanel.add(new JLabel("Password:"));
        myPanel.add(passwordAddInputField);
        m = new Movie();
        mc = new MovieJpaController();
        loadMovieTable();
    }
    
    public void loadMovieTable(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Id");
        dtm.addColumn("Name");
        dtm.addColumn("Director");
        dtm.addColumn("Duration");
        dtm.addColumn("Genre");
        dtm.addColumn("Classification");
        dtm.addColumn("Producer");
        dtm.addColumn("Status");
        
        List<Movie> movieList = new ArrayList<>();
        MovieJpaController jm = new MovieJpaController();
        movieList = jm.findMovieEntities();
        
        for(Movie m : movieList){
            Object row[] = new Object[8];
            row[0] = m.getMovieId();
            row[1] = m.getMovieName();
            row[2] = m.getMovieDirector();
            row[3] = m.getMovieDuration();
            row[4] = m.getMovieGenre();
            row[5] = m.getMovieClassification();
            row[6] = m.getMovieProducer();
            row[7] = m.getMovieStatus();
            dtm.addRow(row);
        }
        jTableMovie.setModel(dtm);
    }
    
    public void clearMovieInputFields(){
        usernameAddInputField.setText("");
        passwordAddInputField.setText("");
        jTextFieldMovieId.setText("");
        jTextFieldMovieName.setText("");
        jTextFieldMovieDirector.setText("");
        jTextFieldMovieProducer.setText("");
        jTextFieldMovieDuration.setText("");
        jComboBoxMovieGenre.setSelectedIndex(0);
        jComboBoxMovieClassification.setSelectedIndex(0);
        jComboBoxMovieStatus.setSelectedIndex(0);
        jTextFieldMovieSearch.setText("");
        jTextFieldMovieSearch.setText("");
        loadMovieTable();
    }
    
    //returns int from selected status accordingly
    public int selectStatus(JTable tbl, int row, int statusPlace){
        String selected = tbl.getValueAt(row, statusPlace).toString();
        int value = 0;
        
        switch(selected){
            case "Active":
                value = 0;
                break;
            case "Inactive":
                value = 1;
                break;
        }
        return value;
    }
    
    //Returns int value from ranked movie for classification
    public int selectMovieRank(JTable tbl, int row){
        String selected = tbl.getValueAt(row, 4).toString();
        int value = 0;
        
        switch(selected){
            case "A":
                value = 0;
                break;
            case "B":
                value = 1;
                break;
            case "B15":
                value = 2;
                break;
            case "C":
                value = 3;
                break;
            case "D":
                value = 4;
                break;
        }
        return value;
    }
      
    //Returns int value from ranked movie for genre
    public int selectMovieGenre(JTable tbl, int row){
        String selected = tbl.getValueAt(row, 4).toString();
        int value = 0;
        
        switch(selected){
            case "Action":
                value = 0;
                break;
            case "Adventure":
                value = 1;
                break;
            case "Comedy":
                value = 2;
                break;
            case "Sci-Fy":
                value = 3;
                break;
            case "Terror":
                value = 4;
                break;
        }
        return value;
    }
    
    @SuppressWarnings("unused")
    private String getSelectedValue(){
        int column = jTableMovie.getSelectedColumn();
        int row = jTableMovie.getSelectedRow();
        String value = jTableMovie.getModel().getValueAt(row, column).toString();
        return value;
    }
    
    //Print values as: System.out.println(jTable1.getModel().getValueAt(row, column).toString());
    @SuppressWarnings("unused")
	private ArrayList<Integer> getSelectedValueCoordenates(){
        int column = jTableMovie.getSelectedColumn();
        int row = jTableMovie.getSelectedRow();
        ArrayList<Integer> values;
        values = new ArrayList<>(Arrays.asList(column, row));
        return values;
    }
        
    // DB only supports 20 chars for every String variable
    public void lenghtValidator(String input){
        if(input.length() > 20){
            JOptionPane.showMessageDialog(null, "Apologies, only 20 chars allowed!");
            clearMovieInputFields();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMovie = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMovieId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldMovieName = new javax.swing.JTextField();
        jTextFieldMovieDirector = new javax.swing.JTextField();
        jTextFieldMovieProducer = new javax.swing.JTextField();
        jTextFieldMovieDuration = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxMovieGenre = new javax.swing.JComboBox<>();
        jComboBoxMovieClassification = new javax.swing.JComboBox<>();
        jComboBoxMovieStatus = new javax.swing.JComboBox<>();
        jButtonClearMovieInputFields = new javax.swing.JButton();
        buttonAddMovie = new javax.swing.JButton();
        buttonUpdateMovie = new javax.swing.JButton();
        buttonDeleteMovie = new javax.swing.JButton();
        jTextFieldMovieSearch = new javax.swing.JTextField();
        buttonExit = new javax.swing.JButton();
        jButtonSearchMovie = new javax.swing.JButton();

        jButton2.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jTableMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {

            }
        ));
        jTableMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMovieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMovie);

        jPanel2.setForeground(new java.awt.Color(102, 153, 255));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Director");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Producer");

        jTextFieldMovieId.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Duration");

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Genre");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Classification");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Status");

        jComboBoxMovieGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Adventure", "Comedy", "Sci-Fy", "Terror" }));

        jComboBoxMovieClassification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "B15", "C", "D"}));

        jComboBoxMovieStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive"}));

        jButtonClearMovieInputFields.setBackground(new java.awt.Color(102, 153, 255));
        jButtonClearMovieInputFields.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonClearMovieInputFields.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClearMovieInputFields.setText("CLEAR");
        jButtonClearMovieInputFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearMovieInputFieldsActionPerformed(evt);
            }
        });

        buttonAddMovie.setBackground(new java.awt.Color(102, 153, 255));
        buttonAddMovie.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonAddMovie.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddMovie.setText("ADD");
        buttonAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddMovieActionPerformed(evt);
            }
        });

        buttonUpdateMovie.setBackground(new java.awt.Color(102, 153, 255));
        buttonUpdateMovie.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonUpdateMovie.setForeground(new java.awt.Color(255, 255, 255));
        buttonUpdateMovie.setText("UPDATE");
        buttonUpdateMovie.setEnabled(false);
        buttonUpdateMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateMovieActionPerformed(evt);
            }
        });

        buttonDeleteMovie.setBackground(new java.awt.Color(102, 153, 255));
        buttonDeleteMovie.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        buttonDeleteMovie.setForeground(new java.awt.Color(255, 255, 255));
        buttonDeleteMovie.setText("DELETE");
        buttonDeleteMovie.setEnabled(false);
        buttonDeleteMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteMovieActionPerformed(evt);
            }
        });

        jTextFieldMovieSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMovieSearchActionPerformed(evt);
            }
        });

        buttonExit.setBackground(new java.awt.Color(102, 153, 255));
        buttonExit.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(255, 255, 255));
        buttonExit.setText("EXIT");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        jButtonSearchMovie.setBackground(new java.awt.Color(102, 153, 255));
        jButtonSearchMovie.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButtonSearchMovie.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearchMovie.setText("Search");
        jButtonSearchMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchMovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMovieSearch)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMovieProducer)
                            .addComponent(jTextFieldMovieName)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMovieId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxMovieGenre, 0, 146, Short.MAX_VALUE)
                                        .addComponent(jTextFieldMovieDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxMovieClassification, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxMovieStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextFieldMovieDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 64, Short.MAX_VALUE)))
                        .addGap(127, 127, 127)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonDeleteMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAddMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonUpdateMovie, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonClearMovieInputFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jButtonSearchMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMovieId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButtonClearMovieInputFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldMovieDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldMovieProducer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(buttonAddMovie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMovieDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxMovieGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxMovieClassification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonUpdateMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDeleteMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxMovieStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSearchMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMovieSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        JOptionPane.showMessageDialog(null, "Thanks for using my GUI!"); // Uncomment when program works entirely
        buttonDeleteMovie.setEnabled(false);
        buttonAddMovie.setEnabled(false);
        buttonUpdateMovie.setEnabled(false);
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddMovieActionPerformed
        int movieDurationValidation = Integer.parseInt(jTextFieldMovieDuration.getText());
        
        m.setMovieName(jTextFieldMovieName.getText());
        m.setMovieDirector(jTextFieldMovieDirector.getText());
        m.setMovieProducer(jTextFieldMovieProducer.getText());
        
        if(movieDurationValidation > 240 || movieDurationValidation < 80){
            JOptionPane.showConfirmDialog(null, myPanel, 
                 "Invalid movie duration", JOptionPane.OK_OPTION);
            clearMovieInputFields();
        }
        
        m.setMovieDuration(movieDurationValidation);
        m.setMovieGenre((String) jComboBoxMovieGenre.getSelectedItem());
        m.setMovieClassification((String) jComboBoxMovieClassification.getSelectedItem());
        String tempMovieStatus = (String)jComboBoxMovieStatus.getSelectedItem();
        if(tempMovieStatus.equals("Active")){
            m.setMovieStatus(true);
        } else { m.setMovieStatus(false); }
        
        try {
            lenghtValidator(jTextFieldMovieName.getText());
            lenghtValidator(jTextFieldMovieDirector.getText());
            lenghtValidator(jTextFieldMovieProducer.getText());
            mc.create(m);
            clearMovieInputFields();
            loadMovieTable();
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAddMovieActionPerformed
    
    private void buttonUpdateMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateMovieActionPerformed
        Movie me = new Movie();
        int movieDurationValidation = Integer.parseInt(jTextFieldMovieDuration.getText());
        String tempMovieStatus = (String)jComboBoxMovieStatus.getSelectedItem();
        
        me.setMovieName(jTextFieldMovieName.getText());
        me.setMovieDirector(jTextFieldMovieDirector.getText());
        me.setMovieProducer(jTextFieldMovieProducer.getText());
        
        if(movieDurationValidation > 240 || movieDurationValidation < 80){
            JOptionPane.showConfirmDialog(null, myPanel, 
                 "Invalid movie duration", JOptionPane.OK_OPTION);
            clearMovieInputFields();
        }
        
        me.setMovieDuration(movieDurationValidation);
        me.setMovieGenre((String) jComboBoxMovieGenre.getSelectedItem());
        me.setMovieClassification((String) jComboBoxMovieClassification.getSelectedItem());
        
        if(tempMovieStatus.equals("Active")){
            me.setMovieStatus(true);
        } else { me.setMovieStatus(false); }
        
        try {
            lenghtValidator(jTextFieldMovieName.getText());
            lenghtValidator(jTextFieldMovieDirector.getText());
            lenghtValidator(jTextFieldMovieProducer.getText());
            mc.edit(me);
            clearMovieInputFields();
            loadMovieTable();
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonUpdateMovieActionPerformed

    private void buttonDeleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteMovieActionPerformed
        m.setMovieName(jTextFieldMovieName.getText());
        m.setMovieDirector(jTextFieldMovieDirector.getText());
        m.setMovieProducer(jTextFieldMovieProducer.getText());
        m.setMovieDuration(Integer.parseInt(jTextFieldMovieDuration.getText()));
        m.setMovieClassification((String) jComboBoxMovieClassification.getSelectedItem());
        m.setMovieStatus(Boolean.parseBoolean((String) jComboBoxMovieStatus.getSelectedItem()));

        try{
            mc.destroy(Integer.valueOf(jTextFieldMovieId.getText()));
            clearMovieInputFields();
            loadMovieTable();
        }catch(NonexistentEntityException ex){
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonDeleteMovieActionPerformed

    private void jTextFieldMovieSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMovieSearchActionPerformed
        //AUTOGENERATED, NOTHING TO DO HERE
    }//GEN-LAST:event_jTextFieldMovieSearchActionPerformed

    private void jButtonClearMovieInputFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearMovieInputFieldsActionPerformed
        clearMovieInputFields();
    }//GEN-LAST:event_jButtonClearMovieInputFieldsActionPerformed

    private void jTableMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMovieMouseClicked
        int row = jTableMovie.getSelectedRow();

        jTextFieldMovieId.setText(jTableMovie.getValueAt(row, 0).toString());
        jTextFieldMovieName.setText(jTableMovie.getValueAt(row, 1).toString());
        jTextFieldMovieDirector.setText(jTableMovie.getValueAt(row, 2).toString());
        jTextFieldMovieDuration.setText(jTableMovie.getValueAt(row, 3).toString());
        jTextFieldMovieProducer.setText(jTableMovie.getValueAt(row, 6).toString());
        
        //Missing to retrieve information
        jComboBoxMovieClassification.setSelectedIndex(selectMovieRank(jTableMovie, row));
        jComboBoxMovieGenre.setSelectedIndex(selectMovieGenre(jTableMovie, row));
        jComboBoxMovieStatus.setSelectedIndex(selectStatus(jTableMovie, row, 7));
        
        buttonAddMovie.setEnabled(false);
        buttonDeleteMovie.setEnabled(true);
        buttonUpdateMovie.setEnabled(true);
        loadMovieTable();
    }//GEN-LAST:event_jTableMovieMouseClicked

    public void searchMovie(String movieQuery){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Id");
        dtm.addColumn("Name");
        dtm.addColumn("Director");
        dtm.addColumn("Duration");
        dtm.addColumn("Genre");
        dtm.addColumn("Classification");
        dtm.addColumn("Producer");
        dtm.addColumn("Status");
        
        List<Movie> movieList = new ArrayList<>();
        MovieJpaController jm = new MovieJpaController();
        movieList = jm.findMovieEntities();
        
        for(Movie m : movieList){
            String id = String.valueOf(m.getMovieId());
            String name = m.getMovieName();
            String director = m.getMovieDirector();
            String duration = String.valueOf(m.getMovieDuration());
            String genre = m.getMovieGenre();
            String classification = m.getMovieClassification();
            String producer = m.getMovieProducer();
            String status = String.valueOf(m.getMovieStatus());
            
            if( id.equals(movieQuery) || name.toLowerCase().equals(movieQuery) 
                    || director.toLowerCase().equals(movieQuery) || genre.toLowerCase().equals(movieQuery) ||
                    classification.toLowerCase().equals(movieQuery) || producer.toLowerCase().equals(movieQuery) ||
                    status.toLowerCase().equals(movieQuery)){
             Object row[] = new Object[8];
                row[0] = m.getMovieId();
                row[1] = m.getMovieName();
                row[2] = m.getMovieDirector();
                row[3] = m.getMovieDuration();
                row[4] = m.getMovieGenre();
                row[5] = m.getMovieClassification();
                row[6] = m.getMovieProducer();
                row[7] = m.getMovieStatus();
                dtm.addRow(row);   
            }
        }
        jTableMovie.setModel(dtm);
    }
    
    private void jButtonSearchMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchMovieActionPerformed
        String query = jTextFieldMovieSearch.getText().toLowerCase();
        searchMovie(query);
    }//GEN-LAST:event_jButtonSearchMovieActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddMovie;
    private javax.swing.JButton buttonDeleteMovie;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonUpdateMovie;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonClearMovieInputFields;
    private javax.swing.JButton jButtonSearchMovie;
    private javax.swing.JComboBox<String> jComboBoxMovieClassification;
    private javax.swing.JComboBox<String> jComboBoxMovieGenre;
    private javax.swing.JComboBox<String> jComboBoxMovieStatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMovie;
    private javax.swing.JTextField jTextFieldMovieDirector;
    private javax.swing.JTextField jTextFieldMovieDuration;
    private javax.swing.JTextField jTextFieldMovieId;
    private javax.swing.JTextField jTextFieldMovieName;
    private javax.swing.JTextField jTextFieldMovieProducer;
    private javax.swing.JTextField jTextFieldMovieSearch;
    // End of variables declaration//GEN-END:variables
	private JScrollPane panel;
}
