/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizz;

import javax.swing.JOptionPane;


public class quizzFrame extends javax.swing.JFrame {

    int angka = 1;
    int Angka = 0;
    String jawaban = "";
    String betul = "";
    String welcome;
    String name;
    int benar = 0;
    int salah = 0;
    int Score = 0;
   //Easy 
    String qEasy1 []={"What's the highest mountain in the world?", "A. Mount Everest", "B. Mount Bromo", "C. Mount Kilimanjaro", "D. Olympus Mons"  };
    String qEasy2 []={"How many days in a year?", "A. 364", "B. 366", "C. 365", "D. 400"  };
    String qEasy3 []={"In which country can you find the Eiffel Tower?", "A. Paris", "B. France", "C. USA", "D. Indonesia"  };
    String qEasy4 []={"How many players are in a football team", "A. 12", "B. 5", "C. 10", "D. 11"  };
    String qEasy5 []={"Which animal is known as the ‘Ship of the Desert?", "A. Sand cat", "B. Camel", "C. Arabian oryx", "D. Scorpions"  };
    //A, C, B, D, B
    
    //medium
    String qmedium1 []={"Which American State is called the 'Golden State'?", "A. me", "B. you", "C. California", "D. them"  };
    String qmedium2 []={"What is the capital of Finland?", "A. Stockholm", "B. Oslo", "C. Helsinki", "D. Copenhagen"  };
    String qmedium3 []={"What’s the national flower of Japan?", "A. Cherry blossom", "B. Erica", "C. Lilac", "D. Sunflowers"  };
    String qmedium4 []={"Name the best-selling book series of the 21st century?", "A. The Hobbit", "B. Harry Potter", "C. The Hunger Games", "D. Naruto"  };
    String qmedium5 []={"What city do The Beatles come from?", "A. Manchester", "B. London", "C. Liverpool", "D. Derby"  };
    //C, C, A, B, C
    
    //hard
    String qhard1 []={"Who has won the most Academy Awards?", "A. Katharine Hepburn", "B. Leonardo DiCaprio", "C. Will Smith", "D. Michael Kahn"  };
    String qhard2 []={"People with Alektorophobia are afraid of?", "A. Cow", "B. Chickens", "C. Bird", "D. Fish"  };
    String qhard3 []={"When Napoleon experienced defeat at Waterloo in what year?", "A. 1816", "B. 1817", "C. 1814", "D. 1815"  };
    String qhard4 []={"Where is the driest place on Earth?", "A. Atacama Desert", "B. Aoulef", "C. Wadi Halfa", "D. Sahara"  };
    String qhard5 []={"What is the world’s oldest and currently inhabited city?", "A. Faiyum", "B. Athens", "C.  Jericho", "D. Jerusalem"  };
    // A, B, D, A, C
    
  private void mainMenu() {
  
            panelExit.setVisible(false);
            panelEnterName.setVisible(false);
            panelLevel.setVisible(false);
            panelMenu.setVisible(true);
            panelEasy.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
  }
  
  private void playAgain() {
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMenu.setVisible(false);
            
  }
            
    public quizzFrame() {
        initComponents();
        
        txtQuest.setText(""+qEasy1[0]);
        A.setText(""+qEasy1[1]);
        B.setText(""+qEasy1[2]);
        C.setText(""+qEasy1[3]);
        D.setText(""+qEasy1[4]);
        txtNumber.setText(""+angka);
        
        txtQuest1.setText(""+qmedium1[0]);
        A1.setText(""+qmedium1[1]);
        B1.setText(""+qmedium1[2]);
        C1.setText(""+qmedium1[3]);
        D1.setText(""+qmedium1[4]);
        txtNumber1.setText(""+angka);
        
        txtQuest2.setText(""+qhard1[0]);
        A2.setText(""+qhard1[1]);
        B2.setText(""+qhard1[2]);
        C2.setText(""+qhard1[3]);
        D2.setText(""+qhard1[4]);
        txtNumber1.setText(""+angka);
    }
    public void clear() {
        btnG.clearSelection();
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnG = new javax.swing.ButtonGroup();
        panelEnterName = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGO = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        panelMenu = new javax.swing.JPanel();
        btnPlayGame = new javax.swing.JButton();
        btnExitGame = new javax.swing.JButton();
        panelLevel = new javax.swing.JPanel();
        btnEASY = new javax.swing.JButton();
        btnMEDIUM = new javax.swing.JButton();
        btnHARD = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelEasy = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        txtNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuest = new javax.swing.JTextArea();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        panelMedium = new javax.swing.JPanel();
        txtNumber1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtQuest1 = new javax.swing.JTextArea();
        A1 = new javax.swing.JRadioButton();
        B1 = new javax.swing.JRadioButton();
        C1 = new javax.swing.JRadioButton();
        btnNext1 = new javax.swing.JButton();
        D1 = new javax.swing.JRadioButton();
        panelHard = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtQuest2 = new javax.swing.JTextArea();
        txtNumber2 = new javax.swing.JTextField();
        btnNext2 = new javax.swing.JButton();
        B2 = new javax.swing.JRadioButton();
        C2 = new javax.swing.JRadioButton();
        D2 = new javax.swing.JRadioButton();
        A2 = new javax.swing.JRadioButton();
        panelExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JButton();
        txtPlayagain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel1.setText("Welcome to English Grammar Quizz!");

        jLabel2.setText("Enter your name");

        btnGO.setText("GO");
        btnGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGOActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEnterNameLayout = new javax.swing.GroupLayout(panelEnterName);
        panelEnterName.setLayout(panelEnterNameLayout);
        panelEnterNameLayout.setHorizontalGroup(
            panelEnterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnterNameLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnGO)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnterNameLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(panelEnterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnterNameLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnterNameLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(panelEnterNameLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelEnterNameLayout.setVerticalGroup(
            panelEnterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnterNameLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnGO)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        getContentPane().add(panelEnterName, "card2");

        btnPlayGame.setText("PLAY GAME");
        btnPlayGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayGameActionPerformed(evt);
            }
        });

        btnExitGame.setText("EXIT GAME");
        btnExitGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlayGame)
                    .addComponent(btnExitGame))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnPlayGame)
                .addGap(30, 30, 30)
                .addComponent(btnExitGame)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        getContentPane().add(panelMenu, "card3");

        btnEASY.setText("EASY");
        btnEASY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEASYActionPerformed(evt);
            }
        });

        btnMEDIUM.setText("MEDIUM");
        btnMEDIUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMEDIUMActionPerformed(evt);
            }
        });

        btnHARD.setText("HARD");
        btnHARD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHARDActionPerformed(evt);
            }
        });

        jLabel3.setText("Choose level!");

        javax.swing.GroupLayout panelLevelLayout = new javax.swing.GroupLayout(panelLevel);
        panelLevel.setLayout(panelLevelLayout);
        panelLevelLayout.setHorizontalGroup(
            panelLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLevelLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(panelLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMEDIUM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEASY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHARD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        panelLevelLayout.setVerticalGroup(
            panelLevelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLevelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(btnEASY)
                .addGap(18, 18, 18)
                .addComponent(btnMEDIUM)
                .addGap(18, 18, 18)
                .addComponent(btnHARD)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        getContentPane().add(panelLevel, "card4");

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        txtNumber.setText("NO. ");
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        txtQuest.setColumns(20);
        txtQuest.setRows(5);
        jScrollPane1.setViewportView(txtQuest);

        btnG.add(A);
        A.setText("jRadioButton1");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        btnG.add(B);
        B.setText("jRadioButton2");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        btnG.add(C);
        C.setText("jRadioButton3");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        btnG.add(D);
        D.setText("jRadioButton4");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEasyLayout = new javax.swing.GroupLayout(panelEasy);
        panelEasy.setLayout(panelEasyLayout);
        panelEasyLayout.setHorizontalGroup(
            panelEasyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEasyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEasyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEasyLayout.createSequentialGroup()
                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEasyLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelEasyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEasyLayout.createSequentialGroup()
                                .addGroup(panelEasyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEasyLayout.createSequentialGroup()
                                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(129, 129, 129)
                                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(panelEasyLayout.createSequentialGroup()
                                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))))
        );
        panelEasyLayout.setVerticalGroup(
            panelEasyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEasyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEasyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A)
                    .addComponent(C))
                .addGap(18, 18, 18)
                .addGroup(panelEasyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B)
                    .addComponent(D))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addContainerGap())
        );

        jScrollPane1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(panelEasy, "card5");

        txtNumber1.setText("NO. ");
        txtNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber1ActionPerformed(evt);
            }
        });

        txtQuest1.setColumns(20);
        txtQuest1.setRows(5);
        jScrollPane2.setViewportView(txtQuest1);

        btnG.add(A1);
        A1.setText("jRadioButton1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        btnG.add(B1);
        B1.setText("jRadioButton2");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        btnG.add(C1);
        C1.setText("jRadioButton3");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        btnNext1.setText(">>");
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });

        btnG.add(D1);
        D1.setText("jRadioButton1");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMediumLayout = new javax.swing.GroupLayout(panelMedium);
        panelMedium.setLayout(panelMediumLayout);
        panelMediumLayout.setHorizontalGroup(
            panelMediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMediumLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelMediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMediumLayout.createSequentialGroup()
                        .addGroup(panelMediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMediumLayout.createSequentialGroup()
                                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMediumLayout.createSequentialGroup()
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(panelMediumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMediumLayout.setVerticalGroup(
            panelMediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMediumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1)
                    .addComponent(C1))
                .addGap(18, 18, 18)
                .addGroup(panelMediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1)
                    .addComponent(D1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnNext1)
                .addContainerGap())
        );

        getContentPane().add(panelMedium, "card6");

        txtQuest2.setColumns(20);
        txtQuest2.setRows(5);
        jScrollPane3.setViewportView(txtQuest2);

        txtNumber2.setText("NO. ");
        txtNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber2ActionPerformed(evt);
            }
        });

        btnNext2.setText(">>");
        btnNext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext2ActionPerformed(evt);
            }
        });

        btnG.add(B2);
        B2.setText("jRadioButton2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        btnG.add(C2);
        C2.setText("jRadioButton3");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        btnG.add(D2);
        D2.setText("jRadioButton4");
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        btnG.add(A2);
        A2.setText("jRadioButton1");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHardLayout = new javax.swing.GroupLayout(panelHard);
        panelHard.setLayout(panelHardLayout);
        panelHardLayout.setHorizontalGroup(
            panelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHardLayout.createSequentialGroup()
                .addGroup(panelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelHardLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHardLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHardLayout.createSequentialGroup()
                                .addGroup(panelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelHardLayout.createSequentialGroup()
                                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(134, 134, 134)
                                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 29, Short.MAX_VALUE))
                            .addGroup(panelHardLayout.createSequentialGroup()
                                .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))))
                .addContainerGap())
        );
        panelHardLayout.setVerticalGroup(
            panelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C2)
                    .addComponent(A2))
                .addGap(18, 18, 18)
                .addGroup(panelHardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B2)
                    .addComponent(D2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnNext2)
                .addContainerGap())
        );

        getContentPane().add(panelHard, "card7");

        txtExit.setText("EXIT GAME");
        txtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExitActionPerformed(evt);
            }
        });

        txtPlayagain.setText("PLAY AGAIN");
        txtPlayagain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayagainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelExitLayout = new javax.swing.GroupLayout(panelExit);
        panelExit.setLayout(panelExitLayout);
        panelExitLayout.setHorizontalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExitLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlayagain))
                .addGap(144, 144, 144))
        );
        panelExitLayout.setVerticalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExitLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(txtExit)
                .addGap(18, 18, 18)
                .addComponent(txtPlayagain)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        getContentPane().add(panelExit, "card8");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGOActionPerformed
        // TODO add your handling code here:
        panelEnterName.setVisible(false);
        panelEasy.setVisible(false);
        panelExit.setVisible(false);
        panelMenu.setVisible(true);        
    }//GEN-LAST:event_btnGOActionPerformed

    private void btnPlayGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayGameActionPerformed
        // TODO add your handling code here:
        panelEnterName.setVisible(false);
        panelEasy.setVisible(false);
        panelExit.setVisible(false);
        panelMenu.setVisible(false);
        panelLevel.setVisible(true);        
    }//GEN-LAST:event_btnPlayGameActionPerformed

    private void btnExitGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitGameActionPerformed
        // TODO add your handling code here:
        int exit;
        exit = JOptionPane.showOptionDialog(this,
            "Exit game?",
            "Exit",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (exit == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Thank you!");
            System.exit(0);
        }        
    }//GEN-LAST:event_btnExitGameActionPerformed

    private void btnEASYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEASYActionPerformed
        // TODO add your handling code here:
        panelEnterName.setVisible(false);
        panelEasy.setVisible(true);
        panelExit.setVisible(false);
        panelMenu.setVisible(false);
        panelLevel.setVisible(false);        
    }//GEN-LAST:event_btnEASYActionPerformed

    private void btnMEDIUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMEDIUMActionPerformed
        // TODO add your handling code here:
        panelEnterName.setVisible(false);
        panelEasy.setVisible(false);
        panelExit.setVisible(false);
        panelMenu.setVisible(false);
        panelLevel.setVisible(false);
        panelMedium.setVisible(true);        
    }//GEN-LAST:event_btnMEDIUMActionPerformed

    private void btnHARDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHARDActionPerformed
        // TODO add your handling code here:
        panelEnterName.setVisible(false);
        panelEasy.setVisible(false);
        panelExit.setVisible(false);
        panelMenu.setVisible(false);
        panelLevel.setVisible(false);
        panelMedium.setVisible(false);   
        panelHard.setVisible(true);
    }//GEN-LAST:event_btnHARDActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        Angka+=1; 
        angka+=1;
            txtQuest.setText(""+qEasy1[0]);
            A.setText(""+qEasy1[1]);
            B.setText(""+qEasy1[2]);
            C.setText(""+qEasy1[3]);
            D.setText(""+qEasy1[4]);
            txtNumber.setText(""+angka);
        
        if(Angka==1) {
            
            if(A.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            panelExit.setVisible(false);
            panelEasy.setVisible(true);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            txtQuest.setEditable(false);
            
        }if(angka == 2){
        
            txtQuest.setText(""+qEasy2[0]);
            A.setText(""+qEasy2[1]);
            B.setText(""+qEasy2[2]);
            C.setText(""+qEasy2[3]);
            D.setText(""+qEasy2[4]);
            txtNumber.setText(""+angka);
            
            panelExit.setVisible(false); //gak
            panelEasy.setVisible(true); //ya
            panelEnterName.setVisible(false); //gak
            panelMedium.setVisible(false); //gak
            panelHard.setVisible(false); //gak
            
        }if(Angka==2){
            if(C.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(true);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            txtQuest.setEditable(false);
            
        }if(angka == 3){
        
            txtQuest.setText(""+qEasy3[0]);
            A.setText(""+qEasy3[1]);
            B.setText(""+qEasy3[2]);
            C.setText(""+qEasy3[3]);
            D.setText(""+qEasy3[4]);
            txtNumber.setText(""+angka);
            
            
            panelExit.setVisible(false);
            panelEasy.setVisible(true);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            
        }if(Angka==3){
            if(B.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(true);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            
        }
        if(angka == 4){
        
            txtQuest.setText(""+qEasy4[0]);
            A.setText(""+qEasy4[1]);
            B.setText(""+qEasy4[2]);
            C.setText(""+qEasy4[3]);
            D.setText(""+qEasy4[4]);
            txtNumber.setText(""+angka);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(true);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            
        }if(Angka==4){
            if(D.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(true);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            
        }if(angka == 5){
        
            txtQuest.setText(""+qEasy5[0]);
            A.setText(""+qEasy5[1]);
            B.setText(""+qEasy5[2]);
            C.setText(""+qEasy5[3]);
            D.setText(""+qEasy5[4]);
            txtNumber.setText(""+angka);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(true);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            
        }if(Angka==5){
            if(B.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(true);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            
        }if(angka == 6){
        
            JOptionPane.showMessageDialog(null,"Score : "+ Score+"\n"+"Correct : "+ benar+"\n"+"False : "+ salah);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(true);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            
        }if(angka == 7){
        
            panelExit.setVisible(true);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            
        }    
            
            clear();                                             
    }//GEN-LAST:event_btnNextActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
        jawaban ="A";        
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
        jawaban ="B";        
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        jawaban ="C";        
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
        jawaban ="D";        
    }//GEN-LAST:event_DActionPerformed

    private void txtNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumber1ActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed
        // TODO add your handling code here:
       Angka+=1; 
        angka+=1;
        if(Angka==1) {
            txtQuest1.setText(""+qmedium1[0]);
            A1.setText(""+qmedium1[1]);
            B1.setText(""+qmedium1[2]);
            C1.setText(""+qmedium1[3]);
            D1.setText(""+qmedium1[4]);
            txtNumber1.setText("1"+angka);
        
        }if(Angka==1) {
            
            if(C1.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(true);
            panelHard.setVisible(false);
            
        }if(angka == 2){
        
            txtQuest1.setText(""+qmedium2[0]);
            A1.setText(""+qmedium2[1]);
            B1.setText(""+qmedium2[2]);
            C1.setText(""+qmedium2[3]);
            D1.setText(""+qmedium2[4]);
            txtNumber1.setText(""+angka);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(true);
            panelHard.setVisible(false);
            
        }if(Angka==2){
            if(C1.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(true);
            panelHard.setVisible(false);
            
        }if(angka == 3){
        
            txtQuest1.setText(""+qmedium3[0]);
            A1.setText(""+qmedium3[1]);
            B1.setText(""+qmedium3[2]);
            C1.setText(""+qmedium3[3]);
            D1.setText(""+qmedium3[4]);
            txtNumber1.setText(""+angka);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(true);
            panelHard.setVisible(false);
            
        }if(Angka==3){
            if(A1.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(true);
            panelHard.setVisible(false);
            
        }
        if(angka == 4){
        
            txtQuest1.setText(""+qmedium4[0]);
            A1.setText(""+qmedium4[1]);
            B1.setText(""+qmedium4[2]);
            C1.setText(""+qmedium4[3]);
            D1.setText(""+qmedium4[4]);
            txtNumber1.setText(""+angka);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(true);
            panelHard.setVisible(false);
            
        }if(Angka==4){
            if(B1.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(true);
            panelHard.setVisible(false);
            
        }if(angka == 5){
        
            txtQuest1.setText(""+qmedium5[0]);
            A1.setText(""+qmedium5[1]);
            B1.setText(""+qmedium5[2]);
            C1.setText(""+qmedium5[3]);
            D1.setText(""+qmedium5[4]);
            txtNumber1.setText(""+angka);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(true);
            panelHard.setVisible(false);
            
        }if(Angka==5){
            if(C1.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(true);
            panelHard.setVisible(false);
            
        }if(angka == 6){
        
            JOptionPane.showMessageDialog(null,"Score : "+ Score+"\n"+"Correct : "+ benar+"\n"+"False : "+ salah);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(true);
            panelHard.setVisible(false);
            
        }if(angka == 7){
        
            panelExit.setVisible(true);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            
        }    
            
            clear();        
    }//GEN-LAST:event_btnNext1ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        jawaban ="A";        
    }//GEN-LAST:event_A1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        jawaban ="b";        
    }//GEN-LAST:event_B1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        jawaban ="C";        
    }//GEN-LAST:event_C1ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
        jawaban ="D";        
    }//GEN-LAST:event_D1ActionPerformed

    private void txtNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumber2ActionPerformed

    private void btnNext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext2ActionPerformed
        // TODO add your handling code here:
       Angka+=1; 
        angka+=1;
        if(Angka==1) {
            txtQuest2.setText(""+qhard1[0]);
            A2.setText(""+qhard1[1]);
            B2.setText(""+qhard1[2]);
            C2.setText(""+qhard1[3]);
            D2.setText(""+qhard1[4]);
            txtNumber2.setText("1"+angka);
        
        }if(Angka==1) {
            
            if(A2.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(true);
            
        }if(angka == 2){
        
            txtQuest2.setText(""+qhard2[0]);
            A2.setText(""+qhard2[1]);
            B2.setText(""+qhard2[2]);
            C2.setText(""+qhard2[3]);
            D2.setText(""+qhard2[4]);
            txtNumber2.setText(""+angka);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(true);
            
        }if(Angka==2){
            if(B2.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(true);
            
        }if(angka == 3){
        
            txtQuest2.setText(""+qhard3[0]);
            A2.setText(""+qhard3[1]);
            B2.setText(""+qhard3[2]);
            C2.setText(""+qhard3[3]);
            D2.setText(""+qhard3[4]);
            txtNumber2.setText(""+angka);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(true);
            
        }if(Angka==3){
            if(D2.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(true);
            
        }
        if(angka == 4){
        
            txtQuest2.setText(""+qhard4[0]);
            A2.setText(""+qhard4[1]);
            B2.setText(""+qhard4[2]);
            C2.setText(""+qhard4[3]);
            D2.setText(""+qhard4[4]);
            txtNumber2.setText(""+angka);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(true);
            
        }if(Angka==4){
            if(A2.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(true);
            
        }if(angka == 5){
        
            txtQuest2.setText(""+qhard5[0]);
            A2.setText(""+qhard5[1]);
            B2.setText(""+qhard5[2]);
            C2.setText(""+qhard5[3]);
            D2.setText(""+qhard5[4]);
            txtNumber2.setText(""+angka);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(true);
            
        }if(Angka==5){
            if(C2.isSelected()){
                benar +=1;
                Score +=20;
            }else {
                salah +=1;
            }
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(true);
            
        }if(angka == 6){
        
            JOptionPane.showMessageDialog(null,"Score : "+ Score+"\n"+"Correct : "+ benar+"\n"+"False : "+ salah);
            
            panelExit.setVisible(false);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(true);
            
        }if(angka == 7){
        
            panelExit.setVisible(true);
            panelEasy.setVisible(false);
            panelEnterName.setVisible(false);
            panelMedium.setVisible(false);
            panelHard.setVisible(false);
            
        }    
            
            clear();                
    }//GEN-LAST:event_btnNext2ActionPerformed

    private void txtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExitActionPerformed
        // TODO add your handling code here:
        int exit;
        exit = JOptionPane.showOptionDialog(this,
                "Exit game?",
                "Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (exit == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "YOU DID GREAT!");
            System.exit(0);
        }        
    }//GEN-LAST:event_txtExitActionPerformed

    private void txtPlayagainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayagainActionPerformed
        // TODO add your handling code here:
        int playAgain;
        playAgain = JOptionPane.showOptionDialog(this,
                "play again?",
                "Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (playAgain == JOptionPane.YES_OPTION) {
            mainMenu();
        } 
    }//GEN-LAST:event_txtPlayagainActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        jawaban ="A";
    }//GEN-LAST:event_A2ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        jawaban ="B";
    }//GEN-LAST:event_B2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        jawaban ="C";
    }//GEN-LAST:event_C2ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        // TODO add your handling code here:
        jawaban ="D";
    }//GEN-LAST:event_D2ActionPerformed

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
            java.util.logging.Logger.getLogger(quizzFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quizzFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quizzFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quizzFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quizzFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton A1;
    private javax.swing.JRadioButton A2;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton B1;
    private javax.swing.JRadioButton B2;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton C1;
    private javax.swing.JRadioButton C2;
    private javax.swing.JRadioButton D;
    private javax.swing.JRadioButton D1;
    private javax.swing.JRadioButton D2;
    private javax.swing.JButton btnEASY;
    private javax.swing.JButton btnExitGame;
    private javax.swing.ButtonGroup btnG;
    private javax.swing.JButton btnGO;
    private javax.swing.JButton btnHARD;
    private javax.swing.JButton btnMEDIUM;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JButton btnNext2;
    private javax.swing.JButton btnPlayGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelEasy;
    private javax.swing.JPanel panelEnterName;
    private javax.swing.JPanel panelExit;
    private javax.swing.JPanel panelHard;
    private javax.swing.JPanel panelLevel;
    private javax.swing.JPanel panelMedium;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JButton txtExit;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JTextField txtNumber2;
    private javax.swing.JButton txtPlayagain;
    private javax.swing.JTextArea txtQuest;
    private javax.swing.JTextArea txtQuest1;
    private javax.swing.JTextArea txtQuest2;
    // End of variables declaration//GEN-END:variables
}
