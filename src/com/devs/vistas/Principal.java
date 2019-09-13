
package com.devs.vistas;



import ds.desktop.notify.DesktopNotify;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import paneles.CambiaPanel;


public class Principal extends javax.swing.JFrame {

 
    int x, y;
   
    
    public Principal() {
        initComponents();
        //jmenubar();
     
         Animacion.Animacion.mover_izquierda(0, -264, 2, 2, pnlMenu);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(this);
        this.uno.setSelected(true);
        cargarconfiguraciones();
        new CambiaPanel(pnlPrincipal, new paneles.pnlHome());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpop1 = new rojeru_san.complementos.PopuMenu();
        jm1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        uno = new rsbuttom.RSButtonMetro();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tres = new rsbuttom.RSButtonMetro();
        dos = new rsbuttom.RSButtonMetro();
        cinco = new rsbuttom.RSButtonMetro();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ocho = new rsbuttom.RSButtonMetro();
        siete = new rsbuttom.RSButtonMetro();
        seis = new rsbuttom.RSButtonMetro();
        cuatro = new rsbuttom.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCTextField1 = new app.bolivia.swing.JCTextField();
        buttonHover1 = new rojeru_san.complementos.ButtonHover();
        pnlCentro = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jm1.setText("jMenuItem1");
        jpop1.add(jm1);
        jm1.getAccessibleContext().setAccessibleName("prueba");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        pnlMenu.setBackground(new java.awt.Color(239, 238, 244));
        pnlMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(239, 238, 244)));
        pnlMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMenuMouseExited(evt);
            }
        });

        uno.setForeground(new java.awt.Color(128, 128, 131));
        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        uno.setText("Inicio");
        uno.setColorHover(new java.awt.Color(0, 0, 0));
        uno.setColorNormal(new java.awt.Color(204, 204, 204));
        uno.setColorPressed(new java.awt.Color(204, 204, 204));
        uno.setColorTextNormal(new java.awt.Color(128, 128, 131));
        uno.setColorTextPressed(new java.awt.Color(128, 128, 131));
        uno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        uno.setIconTextGap(25);
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unoMousePressed(evt);
            }
        });
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(239, 238, 244));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 128, 131));
        jLabel1.setText("Informacion");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        tres.setBackground(new java.awt.Color(239, 238, 244));
        tres.setForeground(new java.awt.Color(128, 128, 131));
        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chat.png"))); // NOI18N
        tres.setText("Programacion");
        tres.setColorHover(new java.awt.Color(0, 0, 0));
        tres.setColorNormal(new java.awt.Color(239, 238, 244));
        tres.setColorPressed(new java.awt.Color(204, 204, 204));
        tres.setColorTextNormal(new java.awt.Color(128, 128, 131));
        tres.setColorTextPressed(new java.awt.Color(128, 128, 131));
        tres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tres.setIconTextGap(19);
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tresMousePressed(evt);
            }
        });
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(239, 238, 244));
        dos.setForeground(new java.awt.Color(128, 128, 131));
        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/collection.png"))); // NOI18N
        dos.setText("Administracion");
        dos.setColorHover(new java.awt.Color(0, 0, 0));
        dos.setColorNormal(new java.awt.Color(239, 238, 244));
        dos.setColorPressed(new java.awt.Color(204, 204, 204));
        dos.setColorTextNormal(new java.awt.Color(128, 128, 131));
        dos.setColorTextPressed(new java.awt.Color(128, 128, 131));
        dos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dos.setIconTextGap(25);
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dosMousePressed(evt);
            }
        });
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(239, 238, 244));
        cinco.setForeground(new java.awt.Color(128, 128, 131));
        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/market.png"))); // NOI18N
        cinco.setText("Empleados");
        cinco.setColorHover(new java.awt.Color(0, 0, 0));
        cinco.setColorNormal(new java.awt.Color(239, 238, 244));
        cinco.setColorPressed(new java.awt.Color(204, 204, 204));
        cinco.setColorTextNormal(new java.awt.Color(128, 128, 131));
        cinco.setColorTextPressed(new java.awt.Color(128, 128, 131));
        cinco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cinco.setIconTextGap(19);
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cincoMousePressed(evt);
            }
        });
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(239, 238, 244));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(128, 128, 131));
        jLabel3.setText("Ventas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        ocho.setBackground(new java.awt.Color(239, 238, 244));
        ocho.setForeground(new java.awt.Color(128, 128, 131));
        ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/web.png"))); // NOI18N
        ocho.setText("Categorias");
        ocho.setColorHover(new java.awt.Color(0, 0, 0));
        ocho.setColorNormal(new java.awt.Color(239, 238, 244));
        ocho.setColorPressed(new java.awt.Color(204, 204, 204));
        ocho.setColorTextNormal(new java.awt.Color(128, 128, 131));
        ocho.setColorTextPressed(new java.awt.Color(128, 128, 131));
        ocho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ocho.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ocho.setIconTextGap(19);
        ocho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ochoMousePressed(evt);
            }
        });
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(239, 238, 244));
        siete.setForeground(new java.awt.Color(128, 128, 131));
        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ios.png"))); // NOI18N
        siete.setText("A Cerca De");
        siete.setColorHover(new java.awt.Color(0, 0, 0));
        siete.setColorNormal(new java.awt.Color(239, 238, 244));
        siete.setColorPressed(new java.awt.Color(204, 204, 204));
        siete.setColorTextNormal(new java.awt.Color(128, 128, 131));
        siete.setColorTextPressed(new java.awt.Color(128, 128, 131));
        siete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        siete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        siete.setIconTextGap(19);
        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sieteMousePressed(evt);
            }
        });
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(239, 238, 244));
        seis.setForeground(new java.awt.Color(128, 128, 131));
        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/android.png"))); // NOI18N
        seis.setText("Planes");
        seis.setColorHover(new java.awt.Color(0, 0, 0));
        seis.setColorNormal(new java.awt.Color(239, 238, 244));
        seis.setColorPressed(new java.awt.Color(204, 204, 204));
        seis.setColorTextNormal(new java.awt.Color(128, 128, 131));
        seis.setColorTextPressed(new java.awt.Color(128, 128, 131));
        seis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seis.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        seis.setIconTextGap(25);
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                seisMousePressed(evt);
            }
        });
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(239, 238, 244));
        cuatro.setForeground(new java.awt.Color(128, 128, 131));
        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/feeedback.png"))); // NOI18N
        cuatro.setText("Planillas");
        cuatro.setColorHover(new java.awt.Color(0, 0, 0));
        cuatro.setColorNormal(new java.awt.Color(239, 238, 244));
        cuatro.setColorPressed(new java.awt.Color(204, 204, 204));
        cuatro.setColorTextNormal(new java.awt.Color(128, 128, 131));
        cuatro.setColorTextPressed(new java.awt.Color(128, 128, 131));
        cuatro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cuatro.setIconTextGap(19);
        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuatroMousePressed(evt);
            }
        });
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weighty = 8.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 1);
        jPanel1.add(pnlMenu, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema Recursos Humanos");

        jCTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jCTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jCTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jCTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCTextField1.setPhColor(new java.awt.Color(255, 255, 255));
        jCTextField1.setPlaceholder("SEARCH");

        buttonHover1.setBackground(new java.awt.Color(0, 0, 0));
        buttonHover1.setBorder(new javax.swing.border.MatteBorder(null));
        buttonHover1.setText("Iniciar Sesion");
        buttonHover1.setColorHover(new java.awt.Color(255, 255, 255));
        buttonHover1.setColorTextHover(new java.awt.Color(0, 0, 0));
        buttonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHover1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(buttonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.2;
        jPanel1.add(jPanel2, gridBagConstraints);

        pnlCentro.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(128, 128, 131));
        jLabel4.setText("Sistema RRHH 1.0 Lite");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(512, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(pnlPrincipal);

        javax.swing.GroupLayout pnlCentroLayout = new javax.swing.GroupLayout(pnlCentro);
        pnlCentro.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        pnlCentroLayout.setVerticalGroup(
            pnlCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentroLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(pnlCentro, gridBagConstraints);

        jMenu1.setText("Inicio");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Administracion");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Gerencia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Area");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Puestos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Contrato");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Planillas");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void cargarconfiguraciones(){
   
//    jLabel2.setText(configuracion.getNombresistema());
   // jLabel4.setText(configuracion.getNombresistema());
}



  
    
    
    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlHome());
        if(this.uno.isSelected()){
            this.uno.setColorNormal(new Color(204,204,204));
            this.uno.setColorHover(new Color(0,0,0));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(0,0,0));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(0,0,0));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(0,0,0));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(0,0,0));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(0,0,0));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(0,0,0));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(0,0,0));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(0,0,0));
            this.uno.setColorPressed(new Color(204,204,204));
        }
       
    }//GEN-LAST:event_unoActionPerformed

    private void unoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMousePressed
        this.uno.setSelected(true);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_unoMousePressed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlChat());
        if(this.tres.isSelected()){
            this.tres.setColorNormal(new Color(204,204,204));
            this.tres.setColorHover(new Color(0,0,0));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(0,0,0));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(0,0,0));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(0,0,0));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(0,0,0));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(0,0,0));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(0,0,0));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(0,0,0));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(0,0,0));
            this.tres.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_tresActionPerformed

    
    
    
    
    private void tresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(true);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
       
    }//GEN-LAST:event_tresMousePressed

    private void dosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(true);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_dosMousePressed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed

        new CambiaPanel(pnlPrincipal, new paneles.mipanel());
        if(this.dos.isSelected()){
            this.dos.setColorNormal(new Color(204,204,204));
            this.dos.setColorHover(new Color(0,0,0));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(0,0,0));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(0,0,0));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(0,0,0));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(0,0,0));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(0,0,0));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(0,0,0));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(0,0,0));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(0,0,0));
            this.dos.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_dosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int posicion = pnlMenu.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, pnlMenu);
        }else{
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, pnlMenu);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ochoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ochoMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(true);
    }//GEN-LAST:event_ochoMousePressed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlWeb());
        if(this.ocho.isSelected()){
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(0,0,0));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(0,0,0));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(0,0,0));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(0,0,0));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(0,0,0));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(0,0,0));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(0,0,0));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(204,204,204));
            this.ocho.setColorHover(new Color(0,0,0));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(0,0,0));
            this.ocho.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_ochoActionPerformed

    private void sieteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sieteMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(true);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_sieteMousePressed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlIOS());
        if(this.siete.isSelected()){
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(0,0,0));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(0,0,0));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(0,0,0));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(0,0,0));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(0,0,0));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(0,0,0));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(204,204,204));
            this.siete.setColorHover(new Color(0,0,0));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(0,0,0));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(0,0,0));
            this.siete.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_sieteActionPerformed

    private void seisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(false);
        this.seis.setSelected(true);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_seisMousePressed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlAndroid());
        if(this.seis.isSelected()){
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(0,0,0));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(0,0,0));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(0,0,0));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(0,0,0));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(0,0,0));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(204,204,204));
            this.seis.setColorHover(new Color(0,0,0));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(0,0,0));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(0,0,0));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(0,0,0));
            this.seis.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_seisActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlMarket());
        if(this.cinco.isSelected()){
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(0,0,0));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(0,0,0));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(0,0,0));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(0,0,0));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(204,204,204));
            this.cinco.setColorHover(new Color(0,0,0));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(0,0,0));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(0,0,0));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(0,0,0));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(0,0,0));
            this.cinco.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_cincoActionPerformed

    private void cincoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(false);
        this.cinco.setSelected(true);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_cincoMousePressed

    private void cuatroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMousePressed
        this.uno.setSelected(false);
        this.dos.setSelected(false);
        this.tres.setSelected(false);
        this.cuatro.setSelected(true);
        this.cinco.setSelected(false);
        this.seis.setSelected(false);
        this.siete.setSelected(false);
        this.ocho.setSelected(false);
    }//GEN-LAST:event_cuatroMousePressed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        new CambiaPanel(pnlPrincipal, new paneles.pnlFeeBack());
        if(this.cuatro.isSelected()){
            this.uno.setColorNormal(new Color(239,238,244));
            this.uno.setColorHover(new Color(0,0,0));
            this.uno.setColorPressed(new Color(204,204,204));
            
            this.dos.setColorNormal(new Color(239,238,244));
            this.dos.setColorHover(new Color(0,0,0));
            this.dos.setColorPressed(new Color(204,204,204));
            
            this.tres.setColorNormal(new Color(239,238,244));
            this.tres.setColorHover(new Color(0,0,0));
            this.tres.setColorPressed(new Color(204,204,204));
            
            this.cuatro.setColorNormal(new Color(204,204,204));
            this.cuatro.setColorHover(new Color(0,0,0));
            this.cuatro.setColorPressed(new Color(204,204,204));
            
            this.cinco.setColorNormal(new Color(239,238,244));
            this.cinco.setColorHover(new Color(0,0,0));
            this.cinco.setColorPressed(new Color(204,204,204));
            
            this.seis.setColorNormal(new Color(239,238,244));
            this.seis.setColorHover(new Color(0,0,0));
            this.seis.setColorPressed(new Color(204,204,204));
            
            this.siete.setColorNormal(new Color(239,238,244));
            this.siete.setColorHover(new Color(0,0,0));
            this.siete.setColorPressed(new Color(204,204,204));
            
            this.ocho.setColorNormal(new Color(239,238,244));
            this.ocho.setColorHover(new Color(0,0,0));
            this.ocho.setColorPressed(new Color(204,204,204));
        }else{
            this.cuatro.setColorNormal(new Color(239,238,244));
            this.cuatro.setColorHover(new Color(0,0,0));
            this.cuatro.setColorPressed(new Color(204,204,204));
        }
    }//GEN-LAST:event_cuatroActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void pnlMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenuMouseExited
 
           
           
    }//GEN-LAST:event_pnlMenuMouseExited

    private void buttonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHover1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHover1ActionPerformed

    private void pnlMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMenuMouseEntered
        
    }//GEN-LAST:event_pnlMenuMouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       
           
        
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        
    }//GEN-LAST:event_jButton1MouseExited

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       frmGerencia ger=new frmGerencia();
       ger.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmArea area=new frmArea();
        area.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       frmPuesto frm=new frmPuesto();
       frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new Principal().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.ButtonHover buttonHover1;
    private rsbuttom.RSButtonMetro cinco;
    private rsbuttom.RSButtonMetro cuatro;
    private rsbuttom.RSButtonMetro dos;
    private javax.swing.JButton jButton1;
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jm1;
    private rojeru_san.complementos.PopuMenu jpop1;
    private rsbuttom.RSButtonMetro ocho;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private rsbuttom.RSButtonMetro seis;
    private rsbuttom.RSButtonMetro siete;
    private rsbuttom.RSButtonMetro tres;
    private rsbuttom.RSButtonMetro uno;
    // End of variables declaration//GEN-END:variables
}
