
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;

/**
 * Name: Anupama Bhatta
 * Date: 03/12/2019
 * Description: A Java application that has a simulation form which displays the grid 
 * with the default number of prey and predator critters.
 */

public class UI_Grid extends UI_Base 
{
    private World world;
    private int cellSize;
    private int worldSize;
    private int flyCount;
    private int spiderCount;
    
    public UI_Grid(int worldSize, int flyCount, int spiderCount) {
        super("bugsBG.jpg", 1200, 1200); 
        
        initComponents();
        this.setLocationRelativeTo(null); // centers the screen
        
        initGrid(worldSize, flyCount, spiderCount);

        // put random files and spiders
        world.setRandomOrganisms("fly", flyCount);
        world.setRandomOrganisms("spider", spiderCount);
        displayWorldInGrid(world);
                 
        repaint(); // repaint the form
        
        // setting defualt spinner values
        worldSizeSpinner.setValue(worldSize);
        flyCountSpinner.setValue(flyCount);
        spiderCountSpinner.setValue(spiderCount); 
    
        setText();       
        setPanelSize();
    }

    public UI_Grid(){
        this(15,5,4);
    }
    
    void initGrid(int wsize, int countFly, int countSpider) 
    {
        world = new World(wsize);
        this.worldSize = wsize;
    }
      
    void displayWorldInGrid(World world) // method that displays the world
    {
        int worldSize = world.worldSize;
        for (int row = 0; row < worldSize; row++) // loops through the array of organisms and represent them as a label
        {
            for (int col = 0; col < worldSize; col++)
            {
                Cell cell = new Cell(row, col, world.grid[row][col]);
                cell.setBorder(BorderFactory.createEtchedBorder());
                worldPanel.add(cell);
            }
        }
    }  
        
    public void setText()
    {
        lblLoader.setVisible(false);
        lblHeader.setText("Predator-Prey Simulation");
        bttonStep.setText("STEP");
        initialValuesLabel.setText("Initial Values");
        layeredPaneFlyCount.setText("Fly Count: ");
        layeredPaneWorldSize.setText("World Size: ");
        layeredPaneSpiderCount.setText("Spider Count: ");
        bttonInitialize.setText("Initialize");
        lblStepsCompleted.setText("Steps Completed: ");
        lblEmptySpace.setText("Empty Space Count: ");
        lblFlyCount.setText("Fly Count: ");
        lblSpiderCount.setText("Spider Count: ");
    }
            
    public void setPanelSize()
    {
        worldPanel.setLayout(new GridLayout(worldSize,worldSize)); 
        topPanel.setPreferredSize(new Dimension(772, 50));
        bottomPanel.setPreferredSize(new Dimension(772, 40));
        leftPanel.setPreferredSize(new Dimension(30, 221));
        rightPanel.setPreferredSize(new Dimension(350, 661));
        worldPanel.setPreferredSize(new Dimension(300, 300));       
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        pnlContainer = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        txtFieldStep = new javax.swing.JTextField();
        bttonStep = new javax.swing.JButton();
        lblStepsCompleted = new javax.swing.JLabel();
        lblFlyCount = new javax.swing.JLabel();
        lblEmptySpace = new javax.swing.JLabel();
        lblSpiderCount = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        initialValuesLabel = new javax.swing.JLabel();
        layeredPaneFlyCount = new javax.swing.JLabel();
        layeredPaneWorldSize = new javax.swing.JLabel();
        layeredPaneSpiderCount = new javax.swing.JLabel();
        bttonInitialize = new javax.swing.JButton();
        flyCountSpinner = new javax.swing.JSpinner();
        worldSizeSpinner = new javax.swing.JSpinner();
        spiderCountSpinner = new javax.swing.JSpinner();
        lblLoader = new javax.swing.JLabel();
        worldPanel = new javax.swing.JPanel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 830));

        pnlContainer.setOpaque(false);
        pnlContainer.setPreferredSize(new java.awt.Dimension(900, 900));
        pnlContainer.setLayout(new java.awt.BorderLayout());

        topPanel.setPreferredSize(new java.awt.Dimension(10, 50));

        lblHeader.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(0, 102, 0));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("JLabel1");
        lblHeader.setToolTipText("");
        lblHeader.setOpaque(true);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlContainer.add(topPanel, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 958, Short.MAX_VALUE)
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlContainer.add(bottomPanel, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        pnlContainer.add(leftPanel, java.awt.BorderLayout.LINE_START);

        rightPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rightPanel.setPreferredSize(new java.awt.Dimension(300, 12));

        txtFieldStep.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        txtFieldStep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldStep.setText("1");
        txtFieldStep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldStepActionPerformed(evt);
            }
        });

        bttonStep.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        bttonStep.setText("jButton1");

        lblStepsCompleted.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblStepsCompleted.setForeground(new java.awt.Color(102, 102, 102));
        lblStepsCompleted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStepsCompleted.setText("jLabel1");

        lblFlyCount.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblFlyCount.setForeground(new java.awt.Color(102, 204, 0));
        lblFlyCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFlyCount.setText("jLabel1");

        lblEmptySpace.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblEmptySpace.setForeground(new java.awt.Color(0, 102, 204));
        lblEmptySpace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmptySpace.setText("jLabel1");

        lblSpiderCount.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblSpiderCount.setForeground(new java.awt.Color(204, 0, 0));
        lblSpiderCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSpiderCount.setText("jLabel1");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        initialValuesLabel.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        initialValuesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        initialValuesLabel.setText("jLabel1");

        layeredPaneFlyCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        layeredPaneFlyCount.setText("jLabel2");

        layeredPaneWorldSize.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        layeredPaneWorldSize.setText("jLabel2");

        layeredPaneSpiderCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        layeredPaneSpiderCount.setText("jLabel2");

        bttonInitialize.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        bttonInitialize.setText("jButton1");

        jLayeredPane1.setLayer(initialValuesLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(layeredPaneFlyCount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(layeredPaneWorldSize, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(layeredPaneSpiderCount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(bttonInitialize, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(flyCountSpinner, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(worldSizeSpinner, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(spiderCountSpinner, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(layeredPaneFlyCount, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flyCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(layeredPaneSpiderCount, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spiderCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(initialValuesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layeredPaneWorldSize, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(worldSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttonInitialize, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(initialValuesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(layeredPaneSpiderCount)
                                    .addComponent(spiderCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(layeredPaneFlyCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flyCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(layeredPaneWorldSize, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(worldSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bttonInitialize, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        lblLoader.setText("jLabel1");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addComponent(txtFieldStep, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bttonStep, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblFlyCount, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSpiderCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(rightPanelLayout.createSequentialGroup()
                                        .addComponent(lblLoader, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addComponent(lblStepsCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmptySpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLayeredPane1)))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldStep, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttonStep, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoader, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStepsCompleted, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lblEmptySpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFlyCount, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lblSpiderCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );

        pnlContainer.add(rightPanel, java.awt.BorderLayout.LINE_END);

        worldPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        worldPanel.setOpaque(false);
        worldPanel.setLayout(new java.awt.GridLayout(1, 0));
        pnlContainer.add(worldPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldStepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldStepActionPerformed

    }//GEN-LAST:event_txtFieldStepActionPerformed

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
            java.util.logging.Logger.getLogger(UI_Grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Grid().setVisible(true);
            }
        });
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton bttonInitialize;
    private javax.swing.JButton bttonStep;
    private javax.swing.JSpinner flyCountSpinner;
    private javax.swing.JLabel initialValuesLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel layeredPaneFlyCount;
    private javax.swing.JLabel layeredPaneSpiderCount;
    private javax.swing.JLabel layeredPaneWorldSize;
    private javax.swing.JLabel lblEmptySpace;
    private javax.swing.JLabel lblFlyCount;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblLoader;
    private javax.swing.JLabel lblSpiderCount;
    private javax.swing.JLabel lblStepsCompleted;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JSpinner spiderCountSpinner;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField txtFieldStep;
    private javax.swing.JPanel worldPanel;
    private javax.swing.JSpinner worldSizeSpinner;
    // End of variables declaration//GEN-END:variables
    
}
