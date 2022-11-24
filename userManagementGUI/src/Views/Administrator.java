package Views;

import Controller.MovieJpaController;
import Controller.exceptions.NonexistentEntityException;
import Entities.Movie;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Administrator extends javax.swing.JFrame {
    private Movie m;
    private MovieJpaController mc;
 
    public Administrator() {
        initComponents();
        this.setLocationRelativeTo(null);
        m = new Movie();
        mc = new MovieJpaController();
        loadMovieTable();
//        loadUserTable();
        tblMovie.setShowGrid(true); //Shows grid in table
        tblUser.setShowGrid(true);
        tblBillboard.setShowGrid(true);
    }
    
    //Set Movie values as default
    public void clearMovieInfo(){
        txtSearchMovie.setText("");
        txtMovieName.setText("");
        txtDirector.setText("");
        txtId.setText("");
        txtProducer.setText("");
        txtDuration.setText("");
        cmbClassification.setSelectedIndex(0);
        cmbGenre.setSelectedIndex(0);
        btnDeleteMovie.setEnabled(false);
        btnUpdateMovie.setEnabled(false);
        btnAddMovie.setEnabled(true);
        txtMovieName.requestFocus();
        txtSearchMovie.setText("");
    }
    
    public void loadMovieTable(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("id");
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
        tblMovie.setModel(dtm);
    }
    
//    public void loadUserTable(){
//        DefaultTableModel dtm = new DefaultTableModel();
//        dtm.addColumn("id");
//        dtm.addColumn("Name");
//        dtm.addColumn("Password");
//        dtm.addColumn("Type");
//        dtm.addColumn("Status");
//        
//        List<User> userList = new ArrayList<>();
//        UserJpaController ujc = new UserJpaController();
//        userList = ujc.findUserEntities();
//        
//        for(User u : userList){
//            Object row[] = new Object[5];
//            row[0] = u.getUserId();
//            row[1] = u.getUserName();
//            row[2] = u.getUserPassword();
//            row[3] = u.getUserType();
//            row[4] = u.getUserStatus();
//            dtm.addRow(row);
//        }
//        tblUser.setModel(dtm);
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        tab = new javax.swing.JTabbedPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        txtClassification = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        btnAddMovie = new javax.swing.JButton();
        btnUpdateMovie = new javax.swing.JButton();
        btnDeleteMovie = new javax.swing.JButton();
        txtSearchMovie = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnClearMovie = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMovieName = new javax.swing.JTextField();
        txtDirector = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtProducer = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbClassification = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cmbGenre = new javax.swing.JComboBox<>();
        lblDurationValidation = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMovie = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnAddUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        txtSearchUser = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnClearUser = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        txtIdUser = new javax.swing.JTextField();
        txtNameUser = new javax.swing.JTextField();
        txtPassUser = new javax.swing.JTextField();
        cmbUserType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbStatusUser = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        txtRoomId = new javax.swing.JTextField();
        txtRoomNumber = new javax.swing.JTextField();
        cmbRoomStatus = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jLabel22 = new javax.swing.JLabel();
        cmbScheduleStatus = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        jPanel17 = new javax.swing.JPanel();
        txtBillboardId = new javax.swing.JTextField();
        cmbBillboardStatus = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        txtBillboardMovie = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        tblBillboard = new javax.swing.JTable();
        btnBackMovie2 = new javax.swing.JButton();
        btnExitMovie1 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddMovie.setText("Add");
        btnAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMovieActionPerformed(evt);
            }
        });

        btnUpdateMovie.setText("Update");
        btnUpdateMovie.setEnabled(false);
        btnUpdateMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMovieActionPerformed(evt);
            }
        });

        btnDeleteMovie.setText("Delete");
        btnDeleteMovie.setEnabled(false);
        btnDeleteMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMovieActionPerformed(evt);
            }
        });

        jLabel19.setText("Search");

        btnClearMovie.setText("Clear");
        btnClearMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearMovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAddMovie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdateMovie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDeleteMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClearMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddMovie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateMovie)
                .addGap(1, 1, 1)
                .addComponent(btnDeleteMovie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtSearchMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnClearMovie)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        txtId.setEnabled(false);

        jLabel5.setText("Id");

        jLabel6.setText("Name");

        jLabel7.setText("Director");

        txtProducer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProducerActionPerformed(evt);
            }
        });

        txtDuration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDurationKeyPressed(evt);
            }
        });

        jLabel8.setText("Producer");

        jLabel10.setText("Duration");

        cmbClassification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "B15", "C", "D" }));

        jLabel9.setText("Classification");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        jLabel20.setText("Status");

        jLabel25.setText("Genre");

        cmbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Action", "Adventure", "Comedy", "Sci-Fy", "Terror" }));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbClassification, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducer, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblDurationValidation))
                    .addComponent(cmbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProducer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDurationValidation))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(cmbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbClassification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout txtClassificationLayout = new javax.swing.GroupLayout(txtClassification);
        txtClassification.setLayout(txtClassificationLayout);
        txtClassificationLayout.setHorizontalGroup(
            txtClassificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtClassificationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        txtClassificationLayout.setVerticalGroup(
            txtClassificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtClassificationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(txtClassificationLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMovieMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMovie);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jDesktopPane2.setLayer(txtClassification, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtClassification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addComponent(txtClassification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tab.addTab("Movies", jDesktopPane2);

        btnAddUser.setText("Add");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnUpdateUser.setText("Update");
        btnUpdateUser.setEnabled(false);
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setText("Delete");
        btnDeleteUser.setEnabled(false);
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        jLabel18.setText("Search");

        btnClearUser.setText("Clear");
        btnClearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnClearUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchUser)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDeleteUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(btnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(btnUpdateUser, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(btnAddUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearUser)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtIdUser.setEnabled(false);

        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Administrator" }));

        jLabel1.setText("Id");

        jLabel2.setText("Name");

        jLabel3.setText("Password");

        jLabel4.setText("Type");

        cmbStatusUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));

        jLabel21.setText("Status");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbUserType, 0, 94, Short.MAX_VALUE)
                            .addComponent(txtIdUser)
                            .addComponent(txtPassUser)
                            .addComponent(txtNameUser)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbStatusUser, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStatusUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)))
        );

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
            }
        ));
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUser);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab.addTab("Users", jDesktopPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
    
    //Returns int value from ranked movie
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
    
    //Returns int value from ranked movie
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
    
    //Sets user info as default
    public void clearUserInfo(){
        txtIdUser.setText("");
        txtPassUser.setText("");
        txtNameUser.setText("");
        cmbStatusUser.setSelectedIndex(0);
        cmbUserType.setSelectedIndex(0);
        txtSearchUser.setText("");
    }
	
    //returns int from selected status accordingly
    public int selectType(JTable tbl, int row, int typePlace){
        String selected = tbl.getValueAt(row, typePlace).toString();
        int value = 0;
        
        switch(selected){
            case "User":
                value = 0;
                break;
            case "Administrator":
                value = 1;
                break;
        }
        return value;
    }
    
   //Gets you back to Login
    private void btnBackMovie2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMovie2ActionPerformed
        hideCurrent();
    }//GEN-LAST:event_btnBackMovie2ActionPerformed
    //Exits Program
    private void btnExitMovie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitMovie1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnExitMovie1ActionPerformed

    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        int row = tblUser.getSelectedRow();

        txtIdUser.setText(tblUser.getValueAt(row, 0).toString());
        txtNameUser.setText(tblUser.getValueAt(row, 1).toString());
        txtPassUser.setText(tblUser.getValueAt(row, 2).toString());
        cmbUserType.setSelectedIndex(selectType(tblUser, row, 3));
        cmbStatusUser.setSelectedIndex(selectStatus(tblUser, row, 4));
        btnAddUser.setEnabled(false);
        btnDeleteUser.setEnabled(true);
        btnUpdateUser.setEnabled(true);
//        loadUserTable();
    }//GEN-LAST:event_tblUserMouseClicked

    //Invokes clearUserInfo method
    private void btnClearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearUserActionPerformed
        clearUserInfo();
    }//GEN-LAST:event_btnClearUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
//        try{
//            try {
//                uc.destroy(Integer.parseInt(txtIdUser.getText()));
//            } catch (IllegalOrphanException ex) {
//                Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            clearUserInfo();
//            loadUserTable();
//        }catch(NonexistentEntityException ex){
//            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
//        u.setUserId(Integer.parseInt(txtIdUser.getText()));
//        u.setUserName(txtNameUser.getText());
//        u.setUserPassword(txtPassUser.getText());
//        String tempType = (String)cmbUserType.getSelectedItem();
//        if(tempType.equals("Administrator")){
//            u.setUserType(true);
//        } else {u.setUserType(false); }
//        String tempStatus = (String)cmbStatusUser.getSelectedItem();
//        if(tempStatus.equals("Active")){
//            u.setUserStatus(true);
//        } else { u.setUserStatus(false); }
//        try {
//            uc.edit(u);
//            clearUserInfo();
//            loadUserTable();
//        } catch (NonexistentEntityException ex) {
//            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
//        u.setUserName(txtNameUser.getText());
//        u.setUserPassword(txtPassUser.getText());
//        String tempUserType =  ((String) cmbUserType.getSelectedItem());
//        if(tempUserType.equals("Administrator")){
//            u.setUserType(true);
//        } else { u.setUserType(false); }
//        String tempStatus = (String)cmbStatusUser.getSelectedItem();
//        if(tempStatus.equals("Active")){
//            u.setUserStatus(true);
//        } else { u.setUserStatus(false); }
//        try {
//            uc.create(u);
//            clearMovieInfo();
//            loadUserTable();
//        } catch (Exception ex) {
//            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void tblMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMovieMouseClicked
        int row = tblMovie.getSelectedRow();

        txtId.setText(tblMovie.getValueAt(row, 0).toString());
        txtMovieName.setText(tblMovie.getValueAt(row, 1).toString());
        txtDirector.setText(tblMovie.getValueAt(row, 2).toString());
        txtDuration.setText(tblMovie.getValueAt(row, 3).toString());
        cmbClassification.setSelectedIndex(selectMovieRank(tblMovie, row));
        cmbGenre.setSelectedIndex(selectMovieGenre(tblMovie, row));
        txtProducer.setText(tblMovie.getValueAt(row, 5).toString());
        cmbStatus.setSelectedIndex(selectStatus(tblMovie, row, 6));
        btnAddMovie.setEnabled(false);
        btnDeleteMovie.setEnabled(true);
        btnUpdateMovie.setEnabled(true);
        loadMovieTable();
    }//GEN-LAST:event_tblMovieMouseClicked

    private void txtDurationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDurationKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            //Won't be able to enter in text field if enter char is not number
            txtBillboardMovie.setEditable(false);
            jLabel33.setText("Please enter numbers only");
        } else {
            txtBillboardMovie.setEditable(true);
        }
    }//GEN-LAST:event_txtDurationKeyPressed

    private void txtProducerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProducerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProducerActionPerformed

    private void btnClearMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearMovieActionPerformed
        clearMovieInfo();
    }//GEN-LAST:event_btnClearMovieActionPerformed

    private void btnDeleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMovieActionPerformed
        m.setMovieName(txtMovieName.getText());
        m.setMovieDirector(txtDirector.getText());
        m.setMovieClassification((String) cmbClassification.getSelectedItem());
        m.setMovieDuration(Integer.parseInt(txtDuration.getText()));
        m.setMovieProducer(txtProducer.getText());
        m.setMovieStatus(Boolean.parseBoolean((String) cmbStatus.getSelectedItem()));

        try{
            mc.destroy(Integer.parseInt(txtIdUser.getText()));
            clearUserInfo();
//            loadUserTable();
        }catch(NonexistentEntityException ex){
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteMovieActionPerformed

   //Updates movie
    private void btnUpdateMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMovieActionPerformed
        m.setMovieId(Integer.parseInt(txtId.getText()));
        m.setMovieName(txtMovieName.getText());
        m.setMovieDirector(txtDirector.getText());
        m.setMovieClassification((String) cmbClassification.getSelectedItem());
        m.setMovieGenre((String) cmbGenre.getSelectedItem());
        m.setMovieDuration(Integer.parseInt(txtDuration.getText()));
        m.setMovieProducer(txtProducer.getText());
        String tempMovieStatus = (String)cmbStatus.getSelectedItem();
        if(tempMovieStatus.equals("Active")){
            m.setMovieStatus(true);
        } else { m.setMovieStatus(false); }
        try {
            mc.edit(m);
            clearMovieInfo();
            loadMovieTable();
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateMovieActionPerformed

    private void btnAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMovieActionPerformed
        m.setMovieName(txtMovieName.getText());
        m.setMovieDirector(txtDirector.getText());
        m.setMovieClassification((String) cmbClassification.getSelectedItem());
        m.setMovieGenre((String) cmbGenre.getSelectedItem());
        m.setMovieDuration(Integer.parseInt(txtDuration.getText()));
        m.setMovieProducer(txtProducer.getText());
        String tempMovieStatus = (String)cmbStatus.getSelectedItem();
        if(tempMovieStatus.equals("Active")){
            m.setMovieStatus(true);
        } else { m.setMovieStatus(false); }
        try {
            mc.create(m);
            clearMovieInfo();
            loadMovieTable();
        } catch (Exception ex) {
            Logger.getLogger(Administrator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddMovieActionPerformed

    //return int value when user type is selected
    public int selectUserType(JTable tbl, int row){
        String selected = tbl.getValueAt(row, 6).toString();
        int value = 0;
        switch(selected){
            case "User":
                value = 0;
                break;
            case "Administrator":
                value = 1;
                break;
        }
        return value;
    }
    
    //Hide current frameand set Login frame visible
    public void hideCurrent(){
        Login welcome = new Login();
        welcome.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMovie;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnBackMovie2;
    private javax.swing.JButton btnClearMovie;
    private javax.swing.JButton btnClearUser;
    private javax.swing.JButton btnDeleteMovie;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnExitMovie1;
    private javax.swing.JButton btnUpdateMovie;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JComboBox<String> cmbBillboardStatus;
    private javax.swing.JComboBox<String> cmbClassification;
    private javax.swing.JComboBox<String> cmbGenre;
    private javax.swing.JComboBox<String> cmbRoomStatus;
    private javax.swing.JComboBox<String> cmbScheduleStatus;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> cmbStatusUser;
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblDurationValidation;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tblBillboard;
    private javax.swing.JTable tblMovie;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtBillboardId;
    private javax.swing.JTextField txtBillboardMovie;
    private javax.swing.JTextField txtBillboardSearch;
    private javax.swing.JPanel txtClassification;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtMovieName;
    private javax.swing.JTextField txtNameUser;
    private javax.swing.JTextField txtPassUser;
    private javax.swing.JTextField txtProducer;
    private javax.swing.JTextField txtRoomId;
    private javax.swing.JTextField txtRoomNumber;
    private javax.swing.JTextField txtRoomSearch;
    private javax.swing.JTextField txtSearchMovie;
    private javax.swing.JTextField txtSearchUser;
    // End of variables declaration//GEN-END:variables
}
