 package mage.client;

 import mage.client.game.GamePane;

 import javax.swing.*;
 import java.awt.*;
 import java.util.UUID;
 import java.util.concurrent.atomic.AtomicInteger;

 /**
  * GUI: basic class for all full screen frames/tabs (example: game pane, deck editor pane, card viewer, etc)
  *
  * @author BetaSteward_at_googlemail.com, JayDi85
  */
 public abstract class MagePane extends javax.swing.JLayeredPane {

     private String title = "no title set";
     protected final int createdOrder;

     private static final AtomicInteger createdOrderGenerator = new AtomicInteger();

     public MagePane() {
         this.createdOrder = createdOrderGenerator.incrementAndGet();
         initComponents();
     }

     public void changeGUISize() {
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getTitle() {
         return title;
     }

     public void hideFrame() {
         MageFrame.deactivate(this);
     }

     public void removeFrame() {
         KeyboardFocusManager.getCurrentKeyboardFocusManager().clearGlobalFocusOwner();
         MageFrame.deactivate(this);
         MageFrame.getDesktop().remove(this);
     }

     /**
      * Called on frame go to topmost (example: start new game, open deck editor, switched to another game)
      * Use it to load game/gui settings
      */
     public void activated() {
     }

     /**
      * Called on frame go from topmost to hidden (use it to save current gui/game settings)
      */
     public void deactivated() {
     }

     public void handleEvent(AWTEvent event) {
     }

     public Container getContentPane() {
         return this;
     }

     /**
      * GUI components sorting, e.g. in main menu switch panels
      */
     public int getSortOrder() {
         return this.createdOrder;
     }

     /**
      * For game panels only: return assigned table id
      */
     abstract public UUID getSortTableId();

     /**
      * Active table: game pane, deck editor in sideboarding mode, etc
      * Non active table: client side panes like card viewer, deck viewer, etc
      */
     abstract public boolean isActiveTable();

     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

         setBorder(null);

     }// </editor-fold>//GEN-END:initComponents

     // Variables declaration - do not modify//GEN-BEGIN:variables
     // End of variables declaration//GEN-END:variables
 }
