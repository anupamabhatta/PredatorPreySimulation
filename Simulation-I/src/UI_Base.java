
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
* Author: Anupama Bhatta
* Date:   03/12/2019
* Description: Method that acts as base for UI.
*/

public class UI_Base extends javax.swing.JFrame 
{
    public UI_Base(String sBG, int iWidth, int iHeight) {
        
            sBG = "/images/bugsBG.jpg";
            
            setBG(sBG);
            
            setBorder();
            
            setResizable(false);
            
            setPosition(iWidth, iHeight); //puts the form in the middle of the screen
            
            setAlwaysOnTop(true);
          
            initComponents(); 
            
    }
       
    /***
     * Method that puts the border around the form.
     * 
     */
    final void setBorder()
    {
        getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.PINK));
    }
   
    /***
     * 
     * @param sImageName - image name that needs to go as the background of the form
     */
    private void setBG(String sBG)
    {
         setContentPane(new JLabel(new ImageIcon(getClass().getResource(sBG))));// set background image
    }
   
    /**
     * Method that puts the form in the middle of the screen
     */
    private void setPosition(int x, int y)
    {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((dimension.getWidth() - getWidth()) / 4);
        y = (int) ((dimension.getHeight() - getHeight()) / 4);
        setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuMainBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        itemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setText("File");

        itemExit.setText("Exit");
        itemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExitActionPerformed(evt);
            }
        });
        fileMenu.add(itemExit);

        menuMainBar.add(fileMenu);

        setJMenuBar(menuMainBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemExitActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem itemExit;
    private javax.swing.JMenuBar menuMainBar;
    // End of variables declaration//GEN-END:variables
}
