//Bowei Liang
//May 31,2018
//COEN280: ORACLE datebase
//Project: OracleDB + JDBC + JAVAX UI


import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.*;

public class netbeanUI extends javax.swing.JFrame {

    jdbc hw3;
    List<String> VB1;
    Connection con1;
    Boolean busAndOr = true;

    public netbeanUI() throws SQLException, ClassNotFoundException {

        hw3 = new jdbc();
        con1 = hw3.openConnection();
        VB1 = hw3.execute(con1, hw3.column1(con1));
        initComponents();
    }



    @SuppressWarnings("unchecked")
    //mostly Self-Generated code from Netbean except:
    //add 28 main categories from main category display
    //add default date to all the dateChoosers
    private void initComponents() {

        header = new javax.swing.JPanel();
        busBut = new javax.swing.JButton();
        userBut = new javax.swing.JButton();
        Main = new javax.swing.JPanel();
        Business = new javax.swing.JPanel();
        busPanel1 = new javax.swing.JPanel();
        mainCatLabel = new javax.swing.JLabel();
        mainCatSPanel = new javax.swing.JScrollPane();
        mainCat = new javax.swing.JPanel();
        subCatSPanel = new javax.swing.JScrollPane();
        subCat = new javax.swing.JPanel();
        attrSPanel = new javax.swing.JScrollPane();
        attr = new javax.swing.JPanel();
        subCatLabel = new javax.swing.JLabel();
        attrLabel = new javax.swing.JLabel();
        busPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        busTable1 = new javax.swing.JTable();
        busPanel3 = new javax.swing.JPanel();
        review_3 = new javax.swing.JPanel();
        fromDate = new com.toedter.calendar.JDateChooser();
        toDate = new com.toedter.calendar.JDateChooser();
        From = new javax.swing.JLabel();
        From1 = new javax.swing.JLabel();
        From5 = new javax.swing.JLabel();
        star_3 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        starCondition = new javax.swing.JComboBox<>();
        starValue = new java.awt.TextField();
        From2 = new javax.swing.JLabel();
        From3 = new javax.swing.JLabel();
        number_3 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        numCondition = new javax.swing.JComboBox<>();
        numValue = new java.awt.TextField();
        From7 = new javax.swing.JLabel();
        From4 = new javax.swing.JLabel();
        busCB3 = new javax.swing.JComboBox<>();
        busPanel4 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrolPane8 = new javax.swing.JScrollPane();
        busTable2 = new javax.swing.JTable();
        busPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        busTextArea1 = new javax.swing.JTextArea();
        busButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        User = new javax.swing.JPanel();
        userPanel1 = new javax.swing.JPanel();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        userCB2 = new javax.swing.JComboBox<>();
        userCB3 = new javax.swing.JComboBox<>();
        userCB4 = new javax.swing.JComboBox<>();
        userCB5 = new javax.swing.JComboBox<>();
        userCB6 = new javax.swing.JComboBox<>();
        userValue2 = new javax.swing.JTextField();
        userValue3 = new javax.swing.JTextField();
        userValue4 = new javax.swing.JTextField();
        userValue5 = new javax.swing.JTextField();
        label15 = new java.awt.Label();
        label16 = new java.awt.Label();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        userPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        userTable1 = new javax.swing.JTable();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        userPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userQuery = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        query_textarea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        userPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        userTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        userButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        header.setBackground(new java.awt.Color(255, 255, 255));

        busBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus_40.jpg"))); // NOI18N
        busBut.setSize(new java.awt.Dimension(50, 50));
        busBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busButMouseClicked(evt);
            }
        });
        busBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busButActionPerformed(evt);
            }
        });

        userBut.setBackground(new java.awt.Color(255, 255, 255));
        userBut.setForeground(new java.awt.Color(255, 255, 255));
        userBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_40.jpg"))); // NOI18N
        userBut.setSize(new java.awt.Dimension(50, 50));
        userBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userButMouseClicked(evt);
            }
        });
        userBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
                headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(busBut, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(headerLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(userBut, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        headerLayout.setVerticalGroup(
                headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(busBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(headerLayout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(userBut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(455, Short.MAX_VALUE)))
        );

        Main.setBackground(new java.awt.Color(35, 90, 224));
        Main.setLayout(new java.awt.CardLayout());

        Business.setBackground(new java.awt.Color(102, 146, 255));

        busPanel1.setBackground(new java.awt.Color(102, 146, 255));

        mainCatLabel.setFont(new java.awt.Font("PingFang HK", 1, 18)); // NOI18N
        mainCatLabel.setForeground(new java.awt.Color(255, 255, 255));
        mainCatLabel.setText("Main Category");

        mainCat.setLayout(new javax.swing.BoxLayout(mainCat, javax.swing.BoxLayout.Y_AXIS));
        mainCatSPanel.setViewportView(mainCat);

        subCat.setLayout(new javax.swing.BoxLayout(subCat, javax.swing.BoxLayout.Y_AXIS));
        subCatSPanel.setViewportView(subCat);

        attr.setLayout(new javax.swing.BoxLayout(attr, javax.swing.BoxLayout.Y_AXIS));
        attrSPanel.setViewportView(attr);

        subCatLabel.setFont(new java.awt.Font("PingFang HK", 1, 18)); // NOI18N
        subCatLabel.setForeground(new java.awt.Color(255, 255, 255));
        subCatLabel.setText("Attribute");

        attrLabel.setFont(new java.awt.Font("PingFang HK", 1, 18)); // NOI18N
        attrLabel.setForeground(new java.awt.Color(255, 255, 255));
        attrLabel.setText("Sub Category");

        javax.swing.GroupLayout busPanel1Layout = new javax.swing.GroupLayout(busPanel1);
        busPanel1.setLayout(busPanel1Layout);
        busPanel1Layout.setHorizontalGroup(
                busPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, busPanel1Layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addGroup(busPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mainCatLabel)
                                        .addComponent(mainCatSPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(busPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(subCatSPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(attrLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(busPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(subCatLabel)
                                        .addGroup(busPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(attrSPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        busPanel1Layout.setVerticalGroup(
                busPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(busPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(busPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mainCatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(subCatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(attrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(busPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(mainCatSPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(attrSPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(subCatSPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 6, Short.MAX_VALUE))
        );

        busPanel2.setBackground(new java.awt.Color(102, 146, 255));

        jScrollPane5.setBackground(new java.awt.Color(102, 146, 255));

        jPanel5.setBackground(new java.awt.Color(102, 146, 255));

        jScrollPane6.setBackground(new java.awt.Color(102, 146, 255));

        busTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Business", "City", "States", "Stars"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        busTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                busTable1MousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(busTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel5);

        javax.swing.GroupLayout busPanel2Layout = new javax.swing.GroupLayout(busPanel2);
        busPanel2.setLayout(busPanel2Layout);
        busPanel2Layout.setHorizontalGroup(
                busPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        busPanel2Layout.setVerticalGroup(
                busPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, busPanel2Layout.createSequentialGroup()
                                .addGap(0, 15, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        busPanel3.setBackground(new java.awt.Color(102, 146, 255));

        review_3.setBackground(new java.awt.Color(102, 146, 255));

        fromDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fromDatePropertyChange(evt);
            }
        });

        toDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                toDatePropertyChange(evt);
            }
        });

        From.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        From.setForeground(new java.awt.Color(255, 255, 255));
        From.setText("From:");

        From1.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        From1.setForeground(new java.awt.Color(255, 255, 255));
        From1.setText("To:");

        From5.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        From5.setForeground(new java.awt.Color(255, 255, 255));
        From5.setText("Review:");

        javax.swing.GroupLayout review_3Layout = new javax.swing.GroupLayout(review_3);
        review_3.setLayout(review_3Layout);
        review_3Layout.setHorizontalGroup(
                review_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(review_3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(review_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(review_3Layout.createSequentialGroup()
                                                .addComponent(From5)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(review_3Layout.createSequentialGroup()
                                                .addGroup(review_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(From)
                                                        .addComponent(From1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(review_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(toDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(fromDate, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        review_3Layout.setVerticalGroup(
                review_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(review_3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(From5)
                                .addGap(33, 33, 33)
                                .addGroup(review_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(From))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(review_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(From1))
                                .addGap(14, 14, 14))
        );

        star_3.setBackground(new java.awt.Color(102, 146, 255));

        label2.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Stars:");

        starCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", "=" }));
        starCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starConditionActionPerformed(evt);
            }
        });

        starValue.setBackground(new java.awt.Color(102, 146, 255));
        starValue.setForeground(new java.awt.Color(255, 255, 255));
        starValue.setText("0");
        starValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starValueActionPerformed(evt);
            }
        });
        starValue.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                starValuePropertyChange(evt);
            }
        });

        From2.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        From2.setForeground(new java.awt.Color(255, 255, 255));
        From2.setText("Condition:");

        From3.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        From3.setForeground(new java.awt.Color(255, 255, 255));
        From3.setText("value:");

        javax.swing.GroupLayout star_3Layout = new javax.swing.GroupLayout(star_3);
        star_3.setLayout(star_3Layout);
        star_3Layout.setHorizontalGroup(
                star_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(star_3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(star_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(star_3Layout.createSequentialGroup()
                                                .addComponent(From3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(starValue, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(star_3Layout.createSequentialGroup()
                                                .addComponent(From2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(starCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        star_3Layout.setVerticalGroup(
                star_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(star_3Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(star_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(From2)
                                        .addComponent(starCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(star_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(From3)
                                        .addComponent(starValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        number_3.setBackground(new java.awt.Color(102, 146, 255));

        label3.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Number of Votes:");

        numCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", "=" }));
        numCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numConditionActionPerformed(evt);
            }
        });

        numValue.setBackground(new java.awt.Color(102, 146, 255));
        numValue.setForeground(new java.awt.Color(255, 255, 255));
        numValue.setText("0");
        numValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numValueActionPerformed(evt);
            }
        });
        numValue.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                numValuePropertyChange(evt);
            }
        });

        From7.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        From7.setForeground(new java.awt.Color(255, 255, 255));
        From7.setText("value:");

        From4.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        From4.setForeground(new java.awt.Color(255, 255, 255));
        From4.setText("Condition:");

        javax.swing.GroupLayout number_3Layout = new javax.swing.GroupLayout(number_3);
        number_3.setLayout(number_3Layout);
        number_3Layout.setHorizontalGroup(
                number_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(number_3Layout.createSequentialGroup()
                                .addComponent(From7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(number_3Layout.createSequentialGroup()
                                .addGroup(number_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(number_3Layout.createSequentialGroup()
                                                .addComponent(From4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        number_3Layout.setVerticalGroup(
                number_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(number_3Layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(number_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(From4)
                                        .addComponent(numCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(number_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(From7)
                                        .addComponent(numValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        busCB3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AND", "OR" }));
        busCB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busCB3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout busPanel3Layout = new javax.swing.GroupLayout(busPanel3);
        busPanel3.setLayout(busPanel3Layout);
        busPanel3Layout.setHorizontalGroup(
                busPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(busPanel3Layout.createSequentialGroup()
                                .addGroup(busPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(review_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(busPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(busCB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(star_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        busPanel3Layout.setVerticalGroup(
                busPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(busPanel3Layout.createSequentialGroup()
                                .addGroup(busPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(busPanel3Layout.createSequentialGroup()
                                                .addComponent(review_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(busCB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(number_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(star_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        busPanel4.setBackground(new java.awt.Color(102, 146, 255));

        jScrollPane9.setBackground(new java.awt.Color(102, 146, 255));

        jPanel6.setBackground(new java.awt.Color(102, 146, 255));

        busTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "User", "Stars"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrolPane8.setViewportView(busTable2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 425, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jScrolPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 355, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jScrolPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(10, Short.MAX_VALUE)))
        );

        jScrollPane9.setViewportView(jPanel6);

        javax.swing.GroupLayout busPanel4Layout = new javax.swing.GroupLayout(busPanel4);
        busPanel4.setLayout(busPanel4Layout);
        busPanel4Layout.setHorizontalGroup(
                busPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, busPanel4Layout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        busPanel4Layout.setVerticalGroup(
                busPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(busPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 14, Short.MAX_VALUE))
        );

        busPanel5.setBackground(new java.awt.Color(102, 146, 255));

        busTextArea1.setColumns(20);
        busTextArea1.setRows(5);
        busTextArea1.setText("Query Display here");
        jScrollPane4.setViewportView(busTextArea1);

        busButton1.setLabel("Execute Query");
        busButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                busButton1MousePressed(evt);
            }
        });
        busButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout busPanel5Layout = new javax.swing.GroupLayout(busPanel5);
        busPanel5.setLayout(busPanel5Layout);
        busPanel5Layout.setHorizontalGroup(
                busPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(busPanel5Layout.createSequentialGroup()
                                .addGroup(busPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(busPanel5Layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(busPanel5Layout.createSequentialGroup()
                                                .addGap(243, 243, 243)
                                                .addComponent(busButton1)))
                                .addContainerGap(34, Short.MAX_VALUE))
        );
        busPanel5Layout.setVerticalGroup(
                busPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(busPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busButton1)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("double click on business to show reviews:");

        javax.swing.GroupLayout BusinessLayout = new javax.swing.GroupLayout(Business);
        Business.setLayout(BusinessLayout);
        BusinessLayout.setHorizontalGroup(
                BusinessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BusinessLayout.createSequentialGroup()
                                .addGroup(BusinessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(busPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(busPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(BusinessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(busPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(BusinessLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(BusinessLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(busPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(448, Short.MAX_VALUE))
                        .addGroup(BusinessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BusinessLayout.createSequentialGroup()
                                        .addGap(597, 597, 597)
                                        .addComponent(busPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BusinessLayout.setVerticalGroup(
                BusinessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BusinessLayout.createSequentialGroup()
                                .addGroup(BusinessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BusinessLayout.createSequentialGroup()
                                                .addComponent(busPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(busPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(BusinessLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(busPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                        .addGroup(BusinessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(BusinessLayout.createSequentialGroup()
                                        .addGap(412, 412, 412)
                                        .addComponent(busPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Main.add(Business, "card3");

        User.setBackground(new java.awt.Color(102, 146, 255));

        userPanel1.setBackground(new java.awt.Color(102, 146, 255));

        label4.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("USERS:");

        label5.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Member Since:");

        label6.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Review Count:");

        label7.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Number of Votes:");

        label8.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Number of Friends");

        label10.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText("Values:");

        label11.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setText("Values:");

        label12.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setText("Values:");

        label13.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setText("Values:");

        userCB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AND", "OR" }));
        userCB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCB2ActionPerformed(evt);
            }
        });

        userCB3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", "=" }));
        userCB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCB3ActionPerformed(evt);
            }
        });

        userCB4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", "=" }));
        userCB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCB4ActionPerformed(evt);
            }
        });

        userCB5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", "=" }));
        userCB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCB5ActionPerformed(evt);
            }
        });

        userCB6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ">", "<", "=", " " }));
        userCB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCB6ActionPerformed(evt);
            }
        });

        userValue2.setText("0");

        userValue3.setText("0");

        userValue4.setText("0");

        userValue5.setText("0");

        label15.setForeground(new java.awt.Color(255, 255, 255));
        label15.setText("Select AND/OR");

        label16.setFont(new java.awt.Font("PingFang HK", 0, 14)); // NOI18N
        label16.setForeground(new java.awt.Color(255, 255, 255));
        label16.setText("Average Stars:");

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDateChooser1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout userPanel1Layout = new javax.swing.GroupLayout(userPanel1);
        userPanel1.setLayout(userPanel1Layout);
        userPanel1Layout.setHorizontalGroup(
                userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userPanel1Layout.createSequentialGroup()
                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(userPanel1Layout.createSequentialGroup()
                                                .addGap(225, 225, 225)
                                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(userPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(userPanel1Layout.createSequentialGroup()
                                                                .addGap(41, 41, 41)
                                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(userCB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(userPanel1Layout.createSequentialGroup()
                                                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(userCB6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(userCB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(userCB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(userCB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(67, 67, 67)
                                                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(userValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(userValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(userValue5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(userValue4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                        .addGroup(userPanel1Layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userPanel1Layout.setVerticalGroup(
                userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(userPanel1Layout.createSequentialGroup()
                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userCB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userCB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(30, 30, 30)
                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userCB5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(userCB6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(userPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userValue2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userValue3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userValue4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userValue5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(22, 22, 22)
                                .addGroup(userPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userCB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(39, Short.MAX_VALUE))
        );

        userPanel2.setBackground(new java.awt.Color(102, 146, 255));

        userTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "User", "member since", "Average Star"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTable1MousePressed(evt);
            }
        });
        jScrollPane10.setViewportView(userTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel3);

        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Users");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Double Click User to Show Reviews");

        javax.swing.GroupLayout userPanel2Layout = new javax.swing.GroupLayout(userPanel2);
        userPanel2.setLayout(userPanel2Layout);
        userPanel2Layout.setHorizontalGroup(
                userPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(userPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userPanel2Layout.setVerticalGroup(
                userPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userPanel2Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        userPanel3.setBackground(new java.awt.Color(102, 146, 255));

        query_textarea.setColumns(20);
        query_textarea.setRows(5);
        jScrollPane2.setViewportView(query_textarea);

        javax.swing.GroupLayout userQueryLayout = new javax.swing.GroupLayout(userQuery);
        userQuery.setLayout(userQueryLayout);
        userQueryLayout.setHorizontalGroup(
                userQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userQueryLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        userQueryLayout.setVerticalGroup(
                userQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userQueryLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(userQuery);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Query For User :");

        javax.swing.GroupLayout userPanel3Layout = new javax.swing.GroupLayout(userPanel3);
        userPanel3.setLayout(userPanel3Layout);
        userPanel3Layout.setHorizontalGroup(
                userPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(11, Short.MAX_VALUE))
                        .addGroup(userPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        userPanel3Layout.setVerticalGroup(
                userPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userPanel4.setBackground(new java.awt.Color(102, 146, 255));

        userTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Buiness", "stars"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(userTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reviews");

        javax.swing.GroupLayout userPanel4Layout = new javax.swing.GroupLayout(userPanel4);
        userPanel4.setLayout(userPanel4Layout);
        userPanel4Layout.setHorizontalGroup(
                userPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(userPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        userPanel4Layout.setVerticalGroup(
                userPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userButton1.setLabel("Execute Query");
        userButton1.setName(""); // NOI18N
        userButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserLayout = new javax.swing.GroupLayout(User);
        User.setLayout(UserLayout);
        UserLayout.setHorizontalGroup(
                UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(UserLayout.createSequentialGroup()
                                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(UserLayout.createSequentialGroup()
                                                .addGap(165, 165, 165)
                                                .addComponent(userButton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(userPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26))
        );
        UserLayout.setVerticalGroup(
                UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(UserLayout.createSequentialGroup()
                                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(UserLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(userPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(userPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserLayout.createSequentialGroup()
                                                .addComponent(userPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(userPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(userButton1)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        Main.add(User, "card2");

        jMenu2.setText("Close");
        jMenu2.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu2MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


        //initialize the 28 main categories
        for (String i : VB1) {
            javax.swing.JCheckBox temp = new javax.swing.JCheckBox(i);
            temp.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    try {
                        selectMain(evt);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

            });
            mainCat.add(temp);
        }
        //set default date for user
        String date1 = "2000-01-01";
        String date2 = "2018-01-01";

        try {
            java.util.Date sdf1 = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
            java.util.Date sdf2 = new SimpleDateFormat("yyyy-MM-dd").parse(date2);
            fromDate.setDate(sdf1);
            toDate.setDate(sdf2);
            jDateChooser1.setDate(sdf1);
        } catch (ParseException e) {

        }
        pack();
    }

    //------------------------------------------------BUSINESS------------------------------------------------

    // <editor-fold defaultstate="collapsed" desc="Business">
    String currentView;//BUS1, BUS2, BUS3
    String busQuery;    // Query for JDBC display Business table
    //detects selections from main Categories
    private void selectMain(java.awt.event.ActionEvent evt) throws SQLException{
        clearPanel(subCat);
        clearPanel(attr);

        List<String> list = new ArrayList<>();

        for (Component c : mainCat.getComponents()) {
            if (c instanceof javax.swing.JCheckBox && ((JCheckBox) c).isSelected()) {
                javax.swing.JCheckBox temp1 = (javax.swing.JCheckBox) c;
                list.add(temp1.getText());
            }
        }
        String bus_query = hw3.BUS1(con1, list, busAndOr);
        busTextArea1.setText(bus_query);

        String query = hw3.column2(con1, list, busAndOr);
        for (String i : hw3.execute(con1, query)) {
            javax.swing.JCheckBox temp2 = new javax.swing.JCheckBox(i);
            temp2.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    try {
                        selectSub(evt);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

            });
            subCat.add(temp2);
        }
        subCat.updateUI();
        currentView = list.size() == 0 ? "":"BUS1";
    }

    //detects selections from sub Categories
    private void selectSub(java.awt.event.ActionEvent evt) throws SQLException{
        clearPanel(attr);
        List<String> list = new ArrayList<>();

        for (Component c : subCat.getComponents()) {
            if (c instanceof javax.swing.JCheckBox && ((JCheckBox) c).isSelected()) {
                javax.swing.JCheckBox temp1 = (javax.swing.JCheckBox) c;
                list.add(temp1.getText());
            }
        }
        String bus_query = hw3.BUS2(con1, list, busAndOr);
        busTextArea1.setText(bus_query);
        String query = hw3.column3(con1, list, busAndOr);

        for (String i : hw3.execute(con1, query)) {
            javax.swing.JCheckBox temp2 = new javax.swing.JCheckBox(i);
            temp2.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt) {

                    try {
                        selectAttr(evt);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

            });
            attr.add(temp2);
        }
        attr.updateUI();
        currentView = list.size() == 0 ? "BUS1":"BUS2";

    }

    //detects selections from Attributes
    private void selectAttr(java.awt.event.ActionEvent evt) throws SQLException{

        List<String> list = new ArrayList<>();

        for (Component c : attr.getComponents()) {
            if (c instanceof javax.swing.JCheckBox && ((JCheckBox) c).isSelected()) {
                javax.swing.JCheckBox temp1 = (javax.swing.JCheckBox) c;
                list.add(temp1.getText());
            }
        }
        String bus_query = hw3.BUS3(con1, list, busAndOr);
        busTextArea1.setText(bus_query);
        busTextArea1.updateUI();
        attr.updateUI();
        currentView = list.size() == 0 ? "BUS2":"BUS3";

    }

    //input BUS1/BUS2/BUS3, clear business table and updates it
    private void showBusTable(String bus) throws SQLException{

        clearTable(busTable1);
        if (bus.equals("")) return;;
        String[] columns = {"Business", "City", "State", "Stars!!!"};

        busQuery = hw3.busTable(con1, bus);
        Object[][] data = hw3.tableDisplay(con1, busQuery);
        DefaultTableModel model = new DefaultTableModel(data, columns);
        busTable1.setModel(model);
        busTable1.revalidate();
        busTable1.updateUI();



    }
    //execute showBusTable
    private void busButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {

            showBusTable(currentView);
        } catch (SQLException e) {

        }
    }

    //execute selectMain
    // change global variable busAndOR
    private void busCB3ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            selectMain(evt);
        } catch(SQLException E) {

        }

        clearTable(busTable1);
        clearTable(busTable2);
        busAndOr = busCB3.getSelectedItem().toString().equals("AND")? true : false;


    }

    private void busButton1MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
//        System.out.println("I am clicked");
//        try {

//            busRevQuery
//            Object[][] data = hw3.tableDisplay(con1, busRevQuery);
//            String[] columns = {"User", "Stars!!!"};
//
//            busTable2.removeAll();
//
//            DefaultTableModel model = new DefaultTableModel(data, columns);
//            busTable2.setModel(model);
//            busTable2.revalidate();
//            busTable2.updateUI();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }
    private void busTable1MousePressed(java.awt.event.MouseEvent evt) {
        JTable table =(JTable) evt.getSource();
        Point point = evt.getPoint();
        int row = table.rowAtPoint(point);
        if (evt.getClickCount() == 2 && table.getSelectedRow() != -1) {
            try {
                busRevTableDisplay(table.getSelectedRow());
            } catch(SQLException E) {

            }

        }
    }
    private void busRevTableDisplay(int index) throws SQLException{
        Object[] arr =  hw3.tableDisplayFirstColumn(con1, busQuery);


        busTable2.removeAll();
        String[] columns = {"User Name", "Stars!!!", "text"};
        DateFormat df = new SimpleDateFormat("MM-dd-YYYY");
        String fromDateStr = df.format(fromDate.getDate());
        String toDateStr = df.format(toDate.getDate());
        String starConditionStr = starCondition.getSelectedItem().toString();
        int starValueInt = Integer.valueOf(starValue.getText());
        String voteConditionStr = numCondition.getSelectedItem().toString();
        Double voteValueDou = Double.valueOf(numValue.getText());


        String query = hw3.busReviewScene(con1, true, arr[index].toString(),
                fromDateStr, toDateStr, starConditionStr, starValueInt,
                voteConditionStr, voteValueDou);
        Object[][] data = hw3.tableDisplay(con1, query);
        DefaultTableModel model = new DefaultTableModel(data, columns);
        busTable2.setModel(model);
        busTable2.revalidate();
        busTable2.updateUI();
    }

    // </editor-fold>
    //------------------------------------------------USER------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="User">


    String userTableQuery;

    /* execute button:
    ** collect all info from USER
    ** create query to update User Table
    */
    private void userButton1ActionPerformed(java.awt.event.ActionEvent evt) {
//        jDateChooser1.getDate();
        DateFormat df = new SimpleDateFormat("MM-dd-YYYY");
        String date = df.format(jDateChooser1.getDate());

        String AndOr = userCB2.getSelectedItem().toString();//AND OR
        Boolean andOr_bool = AndOr.equals("AND") ? true : false;
        String CB1 = userCB3.getSelectedItem().toString();// < > =
        String CB2 = userCB4.getSelectedItem().toString();// < > =
        String CB3 = userCB5.getSelectedItem().toString();// < > =
        String CB4 = userCB6.getSelectedItem().toString();// < > =

        int V1 = Integer.valueOf(userValue2.getText());//int
        int V2 = Integer.valueOf(userValue3.getText());//int
        Double V3 = Double.valueOf(userValue4.getText());//double
        int V4 = Integer.valueOf(userValue5.getText());//int

        try {
            userTable1.removeAll();

            userTableQuery = hw3.userTable(con1, andOr_bool, date, CB1, CB2, CB3, CB4, V1, V2, V3, V4);
            Object[][] data = hw3.tableDisplay(con1, userTableQuery);
            String[] columns = {"Names", "member since",  "Stars!!!"};
            query_textarea.setText(userTableQuery);
            DefaultTableModel model = new DefaultTableModel(data, columns);
            userTable1.setModel(model);
            userTable1.revalidate();
            userTable1.updateUI();

        } catch (SQLException e) {

        }



    }

    // show Review Table upon double click on User Table.
    private void userTable1MousePressed(java.awt.event.MouseEvent evt) {
        JTable table =(JTable) evt.getSource();
        Point point = evt.getPoint();
        int row = table.rowAtPoint(point);
        //Double Click
        if (evt.getClickCount() == 2 && table.getSelectedRow() != -1) {
            try {
                userRevTableDisplay(table.getSelectedRow());
            } catch(SQLException E) {

            }

        }

    }

    //From num of row selected---> get business_id from jdbc
    //Construct User Review Table
    private void userRevTableDisplay(int index) throws SQLException{
       Object[] arr =  hw3.tableDisplayFirstColumn(con1, userTableQuery);



        userTable2.removeAll();
        String[] columns = {"Business Name", "Stars!!!"};

        Object[][] data = hw3.userReviewScene(con1, arr[index].toString());
        DefaultTableModel model = new DefaultTableModel(data, columns);
        userTable2.setModel(model);
        userTable2.revalidate();
        userTable2.updateUI();

    }

    // </editor-fold>

    //my own functions:
    private void clearTable(JTable table) {
        table.removeAll();
        table.revalidate();
        table.updateUI();
    }
    private void clearPanel(JPanel panel) {
        panel.removeAll();
        panel.updateUI();
    }

    // <editor-fold defaultstate="collapsed" desc="Header">

    private void busButMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
//        jButton2.setBackground(Color.BLUE);
//        jButton2.setOpaque(true);
//        System.out.println("bus_but_clicked");
        User.setVisible(false);
        Business.setVisible(true);

    }
    private void userButMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
//        System.out.println("user_but_clicked");
        Business.setVisible(false);
        User.setVisible(true);

    }
    private void jMenu2MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
        // TODO add your handling code here:
        hw3.closeConnection(con1);
        System.exit(0);
    }
    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        hw3.closeConnection(con1);
        System.exit(0);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Useless">
    private void starValuePropertyChange(java.beans.PropertyChangeEvent evt) {
    }
    private void userTable1MouseClicked(java.awt.event.MouseEvent evt) {

    }
    private void numValuePropertyChange(java.beans.PropertyChangeEvent evt) {
        // TODO add your handling code here:
    }
    private void jDateChooser1MousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }



    private void busButActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void userButActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void numValueActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void starValueActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void userCB1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void userCB2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void userCB3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void userCB4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void userCB5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void userCB6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void starConditionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fromDatePropertyChange(java.beans.PropertyChangeEvent evt) {
        // TODO add your handling code here:\
    }

    private void toDatePropertyChange(java.beans.PropertyChangeEvent evt) {
        // TODO add your handling code here:
    }

    private void numConditionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

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
            java.util.logging.Logger.getLogger(netbeanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(netbeanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(netbeanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(netbeanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new netbeanUI().setVisible(true);
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel Business;
    private javax.swing.JLabel From;
    private javax.swing.JLabel From1;
    private javax.swing.JLabel From2;
    private javax.swing.JLabel From3;
    private javax.swing.JLabel From4;
    private javax.swing.JLabel From5;
    private javax.swing.JLabel From7;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel User;
    private javax.swing.JPanel attr;
    private javax.swing.JLabel attrLabel;
    private javax.swing.JScrollPane attrSPanel;
    private javax.swing.JButton busBut;
    private javax.swing.JButton busButton1;
    private javax.swing.JComboBox<String> busCB3;
    private javax.swing.JPanel busPanel1;
    private javax.swing.JPanel busPanel2;
    private javax.swing.JPanel busPanel3;
    private javax.swing.JPanel busPanel4;
    private javax.swing.JPanel busPanel5;
    private javax.swing.JTable busTable1;
    private javax.swing.JTable busTable2;
    private javax.swing.JTextArea busTextArea1;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JPanel header;

    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrolPane8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private javax.swing.JPanel mainCat;
    private javax.swing.JLabel mainCatLabel;
    private javax.swing.JScrollPane mainCatSPanel;
    private javax.swing.JComboBox<String> numCondition;
    private java.awt.TextField numValue;
    private javax.swing.JPanel number_3;
    private javax.swing.JTextArea query_textarea;
    private javax.swing.JPanel review_3;
    private javax.swing.JComboBox<String> starCondition;
    private java.awt.TextField starValue;
    private javax.swing.JPanel star_3;
    private javax.swing.JPanel subCat;
    private javax.swing.JLabel subCatLabel;
    private javax.swing.JScrollPane subCatSPanel;
    private com.toedter.calendar.JDateChooser toDate;
    private javax.swing.JButton userBut;
    private javax.swing.JButton userButton1;
    private javax.swing.JComboBox<String> userCB1;
    private javax.swing.JComboBox<String> userCB2;
    private javax.swing.JComboBox<String> userCB3;
    private javax.swing.JComboBox<String> userCB4;
    private javax.swing.JComboBox<String> userCB5;
    private javax.swing.JComboBox<String> userCB6;
    private javax.swing.JPanel userPanel1;
    private javax.swing.JPanel userPanel2;
    private javax.swing.JPanel userPanel3;
    private javax.swing.JPanel userPanel4;
    private javax.swing.JPanel userQuery;
    private javax.swing.JTable userTable1;
    private javax.swing.JTable userTable2;
    private javax.swing.JTextField userValue1;
    private javax.swing.JTextField userValue2;
    private javax.swing.JTextField userValue3;
    private javax.swing.JTextField userValue4;
    private javax.swing.JTextField userValue5;
    // End of variables declaration
    // </editor-fold>


}
