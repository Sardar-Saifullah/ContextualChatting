import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TextEditor extends JFrame implements ActionListener{

 JTextArea textArea;
 JScrollPane scrollPane;
 JLabel fontLabel;
 JSpinner fontSizeSpinner;
 JButton ColorButton;
 JComboBox fontBox;
 JButton exit;

 TextEditor(){
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("Project OOP Final Saifullah & Raffay");
  this.setSize(500, 500);
  this.setLayout(new FlowLayout());
  this.setLocationRelativeTo(null);
     
  
  textArea = new JTextArea();
  textArea.setLineWrap(true);
  textArea.setWrapStyleWord(true);
  textArea.setFont(new Font("Arial",Font.PLAIN,20));
  
  scrollPane = new JScrollPane(textArea);
  scrollPane.setPreferredSize(new Dimension(450,450));
  scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
   
   exit = new JButton("EXIT");
  exit.setFocusable(false);
   exit.addActionListener(this);
   
  fontLabel = new JLabel("Font: ");
  
  fontSizeSpinner = new JSpinner();
  fontSizeSpinner.setPreferredSize(new Dimension(50,25));
  fontSizeSpinner.setValue(20);
 fontSizeSpinner.addChangeListener(new ChangeListener() {

   @Override
   public void stateChanged(ChangeEvent e) {
    
   textArea.setFont(new Font(textArea.getFont().getFamily(),Font.PLAIN,(int) fontSizeSpinner.getValue())); 
   }
   
  });
   
  ColorButton = new JButton("Color");
   ColorButton.setFocusable(false);
  ColorButton.addActionListener(this);
  
  String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
  
  fontBox = new JComboBox(fonts);
  fontBox.addActionListener(this);
  fontBox.setSelectedItem("Arial");
  
  this.add(exit);
  this.add(fontLabel);
  this.add(fontSizeSpinner);
  this.add(ColorButton);
  this.add(fontBox);
  this.add(scrollPane);
  this.setVisible(true);
  
 }
 
 @Override
 public void actionPerformed(ActionEvent e) {
  
  if(e.getSource()==ColorButton) {
   JColorChooser colorChooser = new JColorChooser();
   
   Color color = colorChooser.showDialog(null, "Choose a color", Color.black);
   
   textArea.setForeground(color);
  }
  
  if(e.getSource()==fontBox) {
   textArea.setFont(new Font((String)fontBox.getSelectedItem(),Font.PLAIN,textArea.getFont().getSize()));
  }
  
    if(e.getSource()==exit) {
   System.exit(0);
   
  }  
 }
}
