import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.Math;


public class GUIHell extends JFrame {

   private JTextField jtfRandomNumber;
   private JTextField jtfBirth;
   private JTextField jtfRandomName;
   private JTextField jtfRandomLastName;
   private JTextField jtfEasyMode;
   private JSlider phoneNumberSlider;
   int rangeBirth;
   private JButton btnRandomise;
   private JButton btnName;
   private JButton btnLName;
   private JButton btnBirth;
   private JButton btnThatsMe;
   private Random rCharacter;
   private JMenu menuFromHell;
   private JMenuBar menuBarFromHell;
   private JMenuItem description;
   private JMenuItem help;
   private JMenuItem exit;
   int randomNum;
   // Static Ints needed for slider (Phone Number)
   static final int PHN_MIN = 000000000;
   static final int PHN_MAX = 999999999;

   public GUIHell() {
      // Sets Layout for GUIHell
      setLayout(new BorderLayout());

      // Menu for GUIHell
      JMenuBar menuBar = new JMenuBar();
      JMenu menu = new JMenu("File");
      JMenu subMenu1 = new JMenu("Help");
      JMenu subMenu2 = new JMenu("Help");
      JMenu subMenu3 = new JMenu("Help");
      JMenu subMenu4 = new JMenu("Help");
      JMenu subMenu5 = new JMenu("Help");
      JMenu subMenu6 = new JMenu("Help");
      JMenu subMenu7 = new JMenu("Help");
      JMenu subMenu8 = new JMenu("Help");
      JMenu subMenu9 = new JMenu("Help");
      JMenu subMenu10 = new JMenu("Help");
      JMenu subMenu11 = new JMenu("Help");
      menuBar.add(menu);
      JMenuItem description = new JMenuItem("Description");
      JMenuItem help = new JMenuItem("Help");
      JMenuItem exit = new JMenuItem("Exit");
      menu.add(description);
      menu.add(help);
      menu.add(subMenu1);
      subMenu1.add(subMenu2);
      subMenu2.add(subMenu3);
      subMenu3.add(subMenu4);
      subMenu4.add(subMenu5);
      subMenu5.add(subMenu6);
      subMenu6.add(subMenu7);
      subMenu7.add(subMenu8);
      subMenu8.add(subMenu9);
      subMenu9.add(subMenu10);
      subMenu10.add(subMenu11);
      subMenu11.add(help);
      menu.add(exit);
      setJMenuBar(menuBar);

      // Action listeners that give functionality to items in menu
      description.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null,
                  " It is quite simple all you need to do is enter your  Phone Number, Date of Birth and Name!");
         }
      });

      help.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "You are on your own :^)");
         }
      });
      exit.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "Gone so soon?");
            System.exit(0);
         }
      });

      // North panel - Label's and text fields
      JPanel jpTopDog = new JPanel();
      add(jpTopDog, BorderLayout.NORTH);
      jpTopDog.setBackground(
            new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
      jpTopDog.setLayout(new GridLayout(4, 0, 5, 5));

      JLabel lblPhoneNumber = new JLabel("Your Phone Number: ");
      lblPhoneNumber.setForeground(Color.white);
      lblPhoneNumber.setHorizontalAlignment(JLabel.LEFT);
      jpTopDog.add(lblPhoneNumber);

      JTextField jtfRandomNumber = new JTextField("");
      jpTopDog.add(jtfRandomNumber);

      JLabel lblBirth = new JLabel("Your Date Of Birth: ");
      lblBirth.setForeground(Color.pink);
      lblBirth.setHorizontalAlignment(JLabel.CENTER);
      jpTopDog.add(lblBirth);

      JTextField jtfBirth = new JTextField("");
      jpTopDog.add(jtfBirth);
      jtfBirth.setEditable(false);

      JLabel lblName = new JLabel("Your Name: ");
      lblName.setForeground(Color.gray);
      lblName.setHorizontalAlignment(JLabel.CENTER);
      jpTopDog.add(lblName);

      JTextField jtfRandomName = new JTextField("");
      jpTopDog.add(jtfRandomName);
      jtfRandomName.setEditable(false);

   

     

      // New JPanel for center
      JPanel jpCenter = new JPanel();
      jpCenter.setLayout(new GridLayout(0, 1, 5, 5));
      jpCenter.setBackground(
            new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
      jpCenter.setForeground(
            new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));

      add(jpCenter, BorderLayout.CENTER);

      // Creates a slider which can alter the number in the phone number textbox
      JSlider phoneNumberSlider = new JSlider(PHN_MIN, PHN_MAX);
      jpCenter.add(phoneNumberSlider);
      phoneNumberSlider.addChangeListener(
            new ChangeListener() {
               public void stateChanged(ChangeEvent ce) {
                  jtfRandomNumber.setText("+971" + phoneNumberSlider.getValue());
               }
            });

      JLabel lblEasyMode = new JLabel("Use the slider for your phone number");
      lblEasyMode.setForeground(Color.red);
      lblEasyMode.setHorizontalAlignment(JLabel.CENTER);
      jpCenter.add(lblEasyMode);


      JRadioButton jrbTermination = new JRadioButton("Terminator");


      jpCenter.add(jrbTermination);
      jrbTermination.setHorizontalAlignment(JRadioButton.CENTER);

      // Button thats me that prompts messages and exits upon click
      JButton btnThatsMe = new JButton("Thats me!");
      jpCenter.add(btnThatsMe);
      btnThatsMe.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "Thank you!");
            System.exit(0);
         }
      });


      jrbTermination.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
            System.exit(0);
         }
      });

      // New JPanel for south/buttons
      JPanel jpDownDog = new JPanel();
      jpDownDog.setLayout(new GridLayout(0, 2));
       jpDownDog.setBackground(new Color((int)(Math.random() * 255),
       (int)(Math.random() * 255), (int)(Math.random() * 255)));
      add(jpDownDog, BorderLayout.SOUTH);

      // Gives a random number when button Give my number is clicked //
      JButton btnRandomise = new JButton("Give my number");
      jpDownDog.add(btnRandomise);
      btnRandomise.addMouseListener(
            new MouseAdapter() {
               public void mouseClicked(MouseEvent me) {
                  jtfRandomNumber.setText("+971" + (int) (Math.random() * 1000000000));
               }
            });

      // Button and "formula" for random dates of birth between 1900 and 2100 //used google for this(line 203-223)
      btnBirth = new JButton("Give my Birth");
      // Integers for making date viable and excluding 0
      int minYear = 1900;
      int maxYear = 2100;
      int rangeYear = (maxYear - minYear) + 1;
      int minMonth = 1;
      int maxMonth = 12;
      int rangeMonth = (maxMonth - minMonth) + 1;
      int minDay = 1;
      int maxDay = 31;
      int rangeDay = (maxDay - minDay) + 1;
      jpDownDog.add(btnBirth);
      btnBirth.addMouseListener(
            new MouseAdapter() {
               public void mouseClicked(MouseEvent me) {
                  jtfBirth.setText(((int) (Math.random() * rangeDay) + minDay) + "/"
                        + ((int) (Math.random() * rangeMonth) + minMonth) + "/"
                        + ((int) (Math.random() * rangeYear) + minYear));
               }
            });

      // Button for "random" name generation
      btnName = new JButton("Give name");
      jpDownDog.add(btnName);
      btnName.addMouseListener(
            new MouseAdapter() {
               public void mouseClicked(MouseEvent me) {
                  String[] whoAreYou = { "Mohammad","Umar","Omar","Khalid","Yousef","Adam" };
                  int rName = (int) (Math.random() * whoAreYou.length);
                  jtfRandomName.setText(whoAreYou[rName]);
               }
            });

    
      // WindowListener used in the case of the user trying to exit the program dialog
      // pops up - works with JFrame.DO_NOTHING_ON_CLOSE
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
            
            JOptionPane.showMessageDialog(null, ":/");
         }
      });
   }// End of constructor

   public static void main(String args[]) {
      GUIHell hell = new GUIHell();
      hell.setTitle(
            "MY GUI FROM HELL");
      hell.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      hell.setLocation(900, 300);
      hell.setVisible(true);
      hell.pack();
   }// End of main
}// End of class GUIHells