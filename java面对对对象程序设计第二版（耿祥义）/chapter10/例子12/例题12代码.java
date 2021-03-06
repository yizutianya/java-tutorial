Example10_12.java 
p public class Example10_12 {
   public static void main(String args[]) {
      Win win = new Win();
      win.setTitle("输入序列号");
      win.setBounds(10,10,460,360);
   }
}
Win.java
import java.awt.*;
import javax.swing.*;
public class Win extends JFrame {
   JTextField text[]=new JTextField[3];
   Police police; 
   JButton b;
   Win() {
      setLayout(new FlowLayout());
      police = new Police();
      for(int i=0;i<3;i++) {
         text[i] = new JTextField(7);
         text[i].addKeyListener(police);  //监视键盘事件
         text[i].addFocusListener(police);
         add(text[i]);
      }
      b = new JButton("确定");
      add(b);
      text[0].requestFocusInWindow();
      setVisible(true); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 
Police.java
import java.awt.event.*;
import javax.swing.*;
public class Police implements KeyListener,FocusListener  {
    public void keyPressed(KeyEvent e) {
      JTextField t = (JTextField)e.getSource();
      if(t.getCaretPosition()>=6)
         t.transferFocus(); 
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void focusGained(FocusEvent e) {
      JTextField text=(JTextField)e.getSource();
      text.setText(null); 
    }
    public void focusLost(FocusEvent e){}
}
