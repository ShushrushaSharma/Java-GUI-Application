
/**
 * Write a description of class TransportGUI here.
 *
 * @author (Shushrusha Sharma)
 * @version (7/15/2022)
 */

//importing components form java package
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//implementing Actionlistener interface
public class TransportGUI implements ActionListener
{
    //creating instance variables
    private JFrame frame,frame1,frame2;
    private JPanel panel, panel1,panel2,panel3,panel4;
    private JButton button1, button2, button3, button4, button5, button6, button7,button8,button9,button10,button11,
    button12,button13;
    private JTextField field1,field2,field3,field4,field5,field6,field7,field8,field9,field10,field11,field12,
    field13,field14,field15,field16,field17,field18,field19,field20,field21,field22,field23,field24,field25,field26;
    private JLabel header,header1,header2,header3,header4,header5,header6,header7,header8,header9, header10,
    header11,header12;
    private Font f1,f2;
    private JComboBox box1,box2,box3;
    
    /* creating arraylist of vehicle class to add the object of
     * AutoRikshaw Class and Electric Scotter Class
     */
    ArrayList <Vehicle> al = new ArrayList<Vehicle>();
    
    //creating methods with no return type
    public void GUI_1()
    {
        // creating JFrame
        frame = new JFrame();
        frame.setLayout(null);
        frame.setTitle("Transport GUI");
        frame.setBounds(500,100,400,400);
        
        // creating JPanel
        panel= new JPanel();
        panel.setBounds(0,0,500,500);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        
        //creating JLabel for adding header in GUI_1
        header = new JLabel();
        header.setText("Transport GUI!!");
        header.setBounds(90,30,200,100);
        panel.add(header);
        
        //creating JButton to move into Autorickshaw JFrame
        button1 = new JButton();
        button1.setBounds(90,130,200,70);
        button1.setText("AUTO-RICKSHAW");
        button1.addActionListener(this);
        panel.add(button1);
        
        //creating JButton to move into Electricscotter JFrame
        button2 = new JButton();
        button2.setBounds(90,230,200,70);
        button2.setText("ELECTRIC SCOTTER");
        button2.addActionListener(this);
        panel.add(button2);
        
        //Adding fonts
        f1= new Font("Times New Roman",Font.PLAIN,30);
        header.setFont(f1);
    

        //adding JPanel into JFrame
        frame.add(panel);
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    public void GUI_2()
    {
        //creating JFrame
        frame1 = new JFrame();
        frame1.setLayout(null);
        frame1.setTitle("AutoRickshaw");
        frame1.setBounds(100,100,1300,700);
        
        //creating JPanel for adding an autorickshaw
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(30,35,600,600);
        Color color= new Color(204,204,204);
        panel1.setBackground(color);
        
        //creating JLabel for adding header
        header = new JLabel();
        header.setText("Add an AutoRickshaw!!");
        header.setBounds(150,0,300,80);
        panel1.add(header);
        
        //creating JLabel for indicating JTextFields
        header1= new JLabel();
        header1.setText("Vehicle ID:");
        header1.setBounds(80,80,200,50);
        panel1.add(header1);
        
        header2= new JLabel();
        header2.setText("Vehicle Name:");
        header2.setBounds(80,130,200,50);
        panel1.add(header2);
        
        header3= new JLabel();
        header3.setText("Vehicle Weight:");
        header3.setBounds(80,180,200,50);
        panel1.add(header3);
        
        header4= new JLabel();
        header4.setText("Vehicle Color:");
        header4.setBounds(80,230,200,50);
        panel1.add(header4);
        
        header5= new JLabel();
        header5.setText("Vehicle Speed:");
        header5.setBounds(80,280,200,50);
        panel1.add(header5);
        
        header6= new JLabel();
        header6.setText("Engine Displacement:");
        header6.setBounds(80,330,200,50);
        panel1.add(header6);
        
        header7= new JLabel();
        header7.setText("Torque:");
        header7.setBounds(80,380,200,50);
        panel1.add(header7);
        
        header8= new JLabel();
        header8.setText("Fuel Tank Capacity:");
        header8.setBounds(80,430,200,50);
        panel1.add(header8);
        
        header9= new JLabel();
        header9.setText("Ground Clearence:");
        header9.setBounds(80,480,200,50);
        panel1.add(header9);
        
        
        //Adding fonts to JLabels
        f1= new Font("Times New Roman",Font.PLAIN,30);
        header.setFont(f1);
        panel1.add(header);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header1.setFont(f2);
        panel1.add(header1);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header2.setFont(f2);
        panel1.add(header2);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header3.setFont(f2);
        panel1.add(header3);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header4.setFont(f2);
        panel1.add(header4);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header5.setFont(f2);
        panel1.add(header5);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header6.setFont(f2);
        panel1.add(header6);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header7.setFont(f2);
        panel1.add(header7);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header8.setFont(f2);
        panel1.add(header8);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header9.setFont(f2);
        panel1.add(header9);
        
        //creating JTextFields
        field1 = new JTextField();
        field1.setBounds(280, 90, 220, 35);
        field1.setBorder(null);
        panel1.add(field1);
        
        field2 = new JTextField();
        field2.setBounds(280, 140, 220, 35);
        field2.setBorder(null);
        panel1.add(field2);
        
        field3 = new JTextField();
        field3.setBounds(280, 190, 220, 35);
        field3.setBorder(null);
        panel1.add(field3);
        
        field4 = new JTextField();
        field4.setBounds(280, 240, 220, 35);
        field4.setBorder(null);
        panel1.add(field4);
        
        field5 = new JTextField();
        field5.setBounds(280, 290, 220, 35);
        field5.setBorder(null);
        panel1.add(field5);
        
        field6 = new JTextField();
        field6.setBounds(280, 340, 220, 35);
        field6.setBorder(null);
        panel1.add(field6);
        
        field7 = new JTextField();
        field7.setBounds(280, 390, 220, 35);
        field7.setBorder(null);
        panel1.add(field7);
        
        field8 = new JTextField(); 
        field8.setBounds(280, 440, 220, 35);
        field8.setBorder(null);
        panel1.add(field8);
        
        field9 = new JTextField();
        field9.setBounds(280, 490, 220, 35);
        field9.setBorder(null);
        panel1.add(field9);
        
        //creating a JButton 
        button3= new JButton("ADD");
        button3.setBounds(330,540,100,35);
        button3.addActionListener(this);
        button3.setForeground(Color.blue);
        panel1.add(button3);
        
        //creating JPanel for booking an autorickshaw
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(660,35,600,600);
        Color color1= new Color(204,204,204);
        panel2.setBackground(color1);
        
        //creating JLabel for adding header
        header = new JLabel();
        header.setText("Book an AutoRickshaw!!");
        header.setBounds(150,0,350,80);
        panel2.add(header);
        
        //creating JLabel for indicating JTextFields
        header1= new JLabel();
        header1.setText("Vehicle ID:");
        header1.setBounds(80,80,200,50);
        panel2.add(header1);
        
        header2= new JLabel();
        header2.setText("Booked Date:");
        header2.setBounds(80,130,200,50);
        panel2.add(header2);
        
        header3= new JLabel();
        header3.setText("Charge Amount:");
        header3.setBounds(80,180,200,50);
        panel2.add(header3);
        
        header4= new JLabel();
        header4.setText("No of seats:");
        header4.setBounds(80,230,200,50);
        panel2.add(header4);
        
        //Adding fonts
        f1= new Font("Times New Roman",Font.PLAIN,30);
        header.setFont(f1);
        panel2.add(header);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header1.setFont(f1);
        panel2.add(header1);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header2.setFont(f1);
        panel2.add(header2);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header3.setFont(f1);
        panel2.add(header3);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header4.setFont(f1);
        panel2.add(header4);
        
        //creating JTextFields
        field10 = new JTextField();
        field10.setBounds(280, 90, 220, 35);
        field10.setBorder(null);
        panel2.add(field10);
        
        field11 = new JTextField();
        field11.setBounds(280, 190, 220, 35);
        field11.setBorder(null);
        panel2.add(field11);
        
        field12 = new JTextField();
        field12.setBounds(280, 240, 220, 35);
        field12.setBorder(null);
        panel2.add(field12);
        
        //creating JComboBox for booked date
        String[] Years2= {"January","Feburary", "March", "April", "May", "June", "July","August","September",
        "October","November","December"};
        box1 = new JComboBox (Years2);
        box1.setBounds(230,140,100,30);
        panel2.add(box1);
        
        String[] Years1= {"2000","2001","2002","2003", "2004", "2005", "2006", "2007", "2008","2009","2011","2012",
        "2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
        box2 = new JComboBox (Years1);
        box2.setBounds(340,140,100,30);
        panel2.add(box2);
        
        String[] Years3= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14", "15", "16", "17", "18",
        "19","20","21","22","23","24","25","26","27","28","29","30"};
        box3 = new JComboBox (Years3);
        box3.setBounds(450,140,100,30);
        panel2.add(box3);
        
        //creating a JButton 
        button4= new JButton("BOOK");
        button4.setBounds(330,290,100,35);
        button4.setForeground(Color.blue);
        button4.addActionListener(this);
        panel2.add(button4);
        
        button5= new JButton("DISPLAY");
        button5.setBounds(100,380,200,35);
        button5.setForeground(Color.blue);
        button5.addActionListener(this);
        panel2.add(button5);
        
        button6= new JButton("CLEAR");
        button6.setBounds(320,380,200,35);
        button6.setForeground(Color.red);
        button6.addActionListener(this);
        panel2.add(button6);
        
        button7= new JButton("GO BACK");
        button7.setBounds(220,440,200,35);
        button7.addActionListener(this);
        panel2.add(button7);
        
        //adding JPanel into JFrame
        frame1.add(panel1);
        frame1.add(panel2);
        frame1.setVisible(true);
        frame1.setResizable(false);
    }
    
    public void GUI_3()
    {
        //creating JFrame
        frame2 = new JFrame();
        frame2.setBounds(100,50,1300,750);
        frame2.setLayout(null);
        frame2.setTitle("Electric Scotter");
        
        //creating JPanel for adding an electric scotter
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(30,35,600,650);
        Color color= new Color(204,204,204);
        panel3.setBackground(color);
        
        //creating JLabel for adding header
        header = new JLabel();
        header.setText("Add an Electric Scotter!!");
        header.setBounds(150,0,350,80);
        panel3.add(header);
        
        //creating JLabel for indicating JTextFields
        header1= new JLabel();
        header1.setText("Vehicle ID:");
        header1.setBounds(80,80,200,50);
        panel3.add(header1);
        
        header2= new JLabel();
        header2.setText("Vehicle Name:");
        header2.setBounds(80,130,200,50);
        panel3.add(header2);
        
        header3= new JLabel();
        header3.setText("Vehicle Weight:");
        header3.setBounds(80,180,200,50);
        panel3.add(header3);
        
        header4= new JLabel();
        header4.setText("Vehicle Color:");
        header4.setBounds(80,230,200,50);
        panel3.add(header4);
        
        header5= new JLabel();
        header5.setText("Vehicle Speed:");
        header5.setBounds(80,280,200,50);
        panel3.add(header5);
        
        header6= new JLabel();
        header6.setText("Battery Capacity:");
        header6.setBounds(80,330,200,50);
        panel3.add(header6);
        
        //Adding fonts
        f1= new Font("Times New Roman",Font.PLAIN,30);
        header.setFont(f1);
        panel3.add(header);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header1.setFont(f2);
        panel3.add(header1);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header2.setFont(f2);
        panel3.add(header2);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header3.setFont(f2);
        panel3.add(header3);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header4.setFont(f2);
        panel3.add(header4);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header5.setFont(f2);
        panel3.add(header5);
        
        f2= new Font("Times New Roman",Font.PLAIN,20);
        header6.setFont(f2);
        panel3.add(header6);
        
        //creating JTextFields
        field13 = new JTextField();
        field13.setBounds(280, 90, 220, 35);
        field13.setBorder(null);
        panel3.add(field13);
        
        field14 = new JTextField();
        field14.setBounds(280, 140, 220, 35);
        field14.setBorder(null);
        panel3.add(field14);
        
        field15 = new JTextField();
        field15.setBounds(280, 190, 220, 35);
        field15.setBorder(null);
        panel3.add(field15);
        
        field16 = new JTextField();
        field16.setBounds(280, 240, 220, 35);
        field16.setBorder(null);
        panel3.add(field16);
        
        field17 = new JTextField();
        field17.setBounds(280, 290, 220, 35);
        field17.setBorder(null);
        panel3.add(field17);
        
        field18 = new JTextField();
        field18.setBounds(280, 340, 220, 35);
        field18.setBorder(null);
        panel3.add(field18);
        
        //creating a JButton 
        button8= new JButton("ADD");
        button8.setBounds(330,400,100,35);
        button8.addActionListener(this);
        button8.setForeground(Color.blue);
        panel3.add(button8);
        
        button9= new JButton("DISPLAY");
        button9.setBounds(90,470,200,35);
        button9.setForeground(Color.blue);
        button9.addActionListener(this);
        panel3.add(button9);
        
        button10= new JButton("CLEAR");
        button10.setBounds(310,470,200,35);
        button10.setForeground(Color.red);
        button10.addActionListener(this);
        panel3.add(button10);
        
        button11= new JButton("GO BACK");
        button11.setBounds(220,530,200,35);
        button11.addActionListener(this);
        panel3.add(button11);
        
        //creating JPanel for purchasing an electricscotter
        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(660,35,600,650);
        Color color1= new Color(204,204,204);
        panel4.setBackground(color1);
        
        //creating JLabel for adding header
        header = new JLabel();
        header.setText("Purchase an Electric Scotter!!");
        header.setBounds(130,0,400,80);
        panel4.add(header);
        
        //creating JLabel for indicating JTextFields
        header1= new JLabel();
        header1.setText("Vehicle ID:");
        header1.setBounds(80,80,200,50);
        panel4.add(header1);
        
        header2= new JLabel();
        header2.setText("Brand:");
        header2.setBounds(80,130,200,50);
        panel4.add(header2);
        
        header3= new JLabel();
        header3.setText("Price:");
        header3.setBounds(80,180,200,50);
        panel4.add(header3);
        
        header4= new JLabel();
        header4.setText("Charging Time:");
        header4.setBounds(80,230,200,50);
        panel4.add(header4);
        
        header5= new JLabel();
        header5.setText("Mileage:");
        header5.setBounds(80,280,200,50);
        panel4.add(header5);
        
        header6= new JLabel();
        header6.setText("Range:");
        header6.setBounds(80,330,200,50);
        panel4.add(header6);
        
        //adding fonts to Jlabel
        f1= new Font("Times New Roman",Font.PLAIN,30);
        header.setFont(f1);
        panel4.add(header);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header1.setFont(f1);
        panel4.add(header1);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header2.setFont(f1);
        panel4.add(header2);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header3.setFont(f1);
        panel4.add(header3);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header4.setFont(f1);
        panel4.add(header4);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header5.setFont(f1);
        panel4.add(header5);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header6.setFont(f1);
        panel4.add(header6);
        
        //Creating a JTextField
        field19 = new JTextField();
        field19.setBounds(280, 90, 220, 35);
        field19.setBorder(null);
        panel4.add(field19);
        
        field20 = new JTextField();
        field20.setBounds(280, 140, 220, 35);
        field20.setBorder(null);
        panel4.add(field20);
        
        field21 = new JTextField();
        field21.setBounds(280, 190, 220, 35);
        field21.setBorder(null);
        panel4.add(field21);
        
        field22 = new JTextField();
        field22.setBounds(280, 240, 220, 35);
        field22.setBorder(null);
        panel4.add(field22);
        
        field23 = new JTextField();
        field23.setBounds(280, 290, 220, 35);
        field23.setBorder(null);
        panel4.add(field23);
        
        field24 = new JTextField();
        field24.setBounds(280, 340, 220, 35);
        field24.setBorder(null);
        panel4.add(field24);
        
        //creating a JButton 
        button12= new JButton("Purchase");
        button12.setBounds(330,400,100,35);
        button12.addActionListener(this);
        button12.setForeground(Color.blue);
        panel4.add(button12);
        
        //creating JLabel for adding header
        header10 = new JLabel();
        header10.setText("Sell an Electric Scotter!!");
        header10.setBounds(130,430,400,80);
        panel4.add(header10);
        
        header11 = new JLabel();
        header11.setText("Vehicle ID:");
        header11.setBounds(80,480,400,80);
        panel4.add(header11);
        
        header12 = new JLabel();
        header12.setText("Price:");
        header12.setBounds(80,530,400,80);
        panel4.add(header12);
        
        //adding fonts to Jlabel
        f1= new Font("Times New Roman",Font.PLAIN,30);
        header10.setFont(f1);
        panel4.add(header);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header11.setFont(f1);
        panel4.add(header11);
        
        f1= new Font("Times New Roman",Font.PLAIN,20);
        header12.setFont(f1);
        panel4.add(header12);
        
        field25 = new JTextField();
        field25.setBounds(280, 500, 220, 35);
        field25.setBorder(null);
        panel4.add(field25);
        
        field26 = new JTextField();
        field26.setBounds(280, 550, 220, 35);
        field26.setBorder(null);
        panel4.add(field26);
        
        //creating a JButton 
        button13= new JButton("Sell");
        button13.setBounds(330,600,100,35);
        button13.setForeground(Color.blue);
        button13.addActionListener(this);
        panel4.add(button13);

        //adding JPanel into JFrame
        frame2.add(panel3);
        frame2.add(panel4);
        frame2.setVisible(true);
        frame2.setResizable(false);
    }
    
    /* creaing an actionPeformed method to provide particular
     * action events to the buttons when it is clicked....
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button1)
        {
            //calling a method to display GUI of AutoRikshaw 
            this.GUI_2();
        }
        
        else if(e.getSource() == button2)
        {
            //calling a method to display GUI of Electric Scooter
            this.GUI_3();
        }
        
        else if(e.getSource() == button7)
        {
            //calling a method to display the first part of GUI
            this.GUI_1();
        }
        
        else if(e.getSource() == button11)
        {
            //calling a method to display the first part of GUI
            this.GUI_1();
        }
        
        //for adding AutoRikshaw
        else if(e.getSource() == button3)
        {
            //declearing variable
            boolean b1= false;
            //handling exception using try and catch
            try
            {
                /* Here the getText method returns the value in string, we are converting string to int using wrappers class to
                 * return the value in int of some particular the variables in Auto Rikshaw class...
                 */
                int a= Integer.parseInt(field1.getText()); 
                String b= (field2.getText());
                String c= (field3.getText());
                String d= (field4.getText());
                String f= (field5.getText());
                int g= Integer.parseInt(field6.getText());
                String h= (field7.getText());
                int i= Integer.parseInt(field8.getText());
                String j= (field9.getText());
                
                //for-each loop to enter into arraylist
                for(Vehicle V_obj:al)
                {
                    //using instanceof method to check the object
                    if(V_obj instanceof AutoRickshaw)
                    {
                        b1=true;
                    }
                }
                 
                if(b1==false)
                {
                    //creating object of class AutoRikshaw
                    AutoRickshaw obj= new AutoRickshaw(a,b,d,c,f,g,h,i,j);
                    //adding object to the arraylist of vehicle class
                    al.add(obj);
                    
                    //message dialog
                    JOptionPane.showMessageDialog(panel1,"Object is added to Arraylist!");
                }
                
                else if(b1==true)
                {
                   JOptionPane.showMessageDialog(panel1," The Object is Already Added to Arraylist!!");
                }
                
            }
            catch(NumberFormatException num)
            {
                //message dialog
                JOptionPane.showMessageDialog(panel1,"Exception is handled!");
            }
        }
        
        //for adding Electric Scotter
        else if(e.getSource() == button8)
        {
            boolean b2= false;
            //handling exception using try and catch
            try
            {
                /* Here the getText method returns the value in string, we are converting string to int using wrappers class to
                 * to return the value in int of some particular the variables in add section of Auto Rikshaw class...
                 */
                int a= Integer.parseInt(field13.getText());
                String b= (field14.getText());
                String c= (field15.getText());
                String d= (field16.getText());
                String f= (field17.getText());
                int g= Integer.parseInt(field18.getText());
                
                //for-each loop to enter into arraylist
                for(Vehicle V_obj:al)
                {
                    //checking object
                    if(V_obj instanceof ElectricScotter)
                    {
                        b2=true;
                    }
                }
                
                if(b2==false)
                {
                    
                    //creating object of class Electric Scooter
                    ElectricScotter obj1 = new ElectricScotter(a,b,d,c,f,g);
                    //adding object to the arraylist of vehicle class
                    al.add(obj1);
                    
                    //message dialog
                    JOptionPane.showMessageDialog(panel3,"Object is added to Arraylist!");
                }
                
                else if(b2=true)
                {
                    JOptionPane.showMessageDialog(panel3,"Object is Already added to Arraylist!");
                }
            }
            catch(NumberFormatException num)
            {
                //message dialog
                JOptionPane.showMessageDialog(panel3,"Exception is handled!");
            }
        }
        
        //for booking AutoRikshaw
        else if(e.getSource() == button4)
        {
            try
            {
                //returning the element selected in JCombobox
                String mon =box1.getSelectedItem().toString();
                String year=box2.getSelectedItem().toString();
                String date=box3.getSelectedItem().toString();
                String booked_date = year + mon + date;
                
                /* Here the getText method returns the value in string, we are converting string to int using wrappers class to
                * to return the value in int of some particular the variables in add section of Auto Rikshaw class...
                */
                int vehicle_id= Integer.parseInt(field10.getText());
                int charge_amount= Integer.parseInt(field11.getText());
                int seats= Integer.parseInt(field12.getText());
                boolean isbooked=false;
            
                //creating for each loop to enter into arraylist
                for (Vehicle V_obj:al)
                {
                    //using instanceof method to check the object
                    if(V_obj instanceof AutoRickshaw)
                    {
                        //using downcasting for AutoRikshaw Class
                        AutoRickshaw obj= (AutoRickshaw) V_obj;
                        
                        //comparing the input of vehicleID with the existing VehicleID
                        if(obj.getVehicleID()==vehicle_id)
                        {
                            //information dialog along with bookeddate, chargeamount and number of seats
                            JOptionPane.showMessageDialog(panel2,"The VehicleID is valid!"+"\n The booked date is: "
                            + booked_date + "\n The numberofseats are: "+ seats+ "\n The chargeamount is: "
                            + charge_amount);
                                
                            //calling method to bookAutoRikshaw
                            if(obj.getisbooked()==true)
                            {
                                //message dialog
                                JOptionPane.showMessageDialog(panel2,"The AutoRikshaw is already booked");
                                break;
                            }
                                
                            else 
                            {
                                obj.bookAutoRikshaw(booked_date,charge_amount,seats);
                                //message dialog
                                JOptionPane.showMessageDialog(panel2,"The AutoRikshaw is booked");
                                break;
                            }
                        }
                        else
                        {
                            //message dialog
                            JOptionPane.showMessageDialog(panel2,"The VehicleID is not valid!");
                        }
                            
                    }
                }
            }
            catch(NumberFormatException num)
            {
                //message dialog
                JOptionPane.showMessageDialog(panel2,"Exception is handled!");
            }
        }
        
        //for purchasing electric scooter
        else if (e.getSource()== button12)
        {   
            //handling exception
            try
            {
                //returing the element selected in JCombobox
                int vehicle_id = Integer.parseInt(field19.getText());
                String brand = (field20.getText());
                int price = Integer.parseInt(field21.getText());
                String charging = (field22.getText());
                String mileage = (field23.getText());
                int range = Integer.parseInt(field24.getText());
                
                //creating for each loop to enter into arraylist
                for (Vehicle V_obj:al)
                {
                    //using instanceof method to check the object
                    if(V_obj instanceof ElectricScotter)
                    {
                        //downcasting 
                        ElectricScotter obj1= (ElectricScotter) V_obj;
                        
                        //comparing the input of vehicleID with the existing VehicleID
                        if(obj1.getVehicleID()==vehicle_id)
                        {
                            //information dialog along with brand,price,chargingtime, mileage and range
                            JOptionPane.showMessageDialog(panel2,"The VehicleID is valid! "+"\n The brand is: "+ 
                            brand + "\n The price is: "+ price+ "\n The charging time is: "+ charging+
                            "\n The mileage is: "+ mileage+ "\n The Range is: "+ range);
                            
                            //calling method to purchase Electric Scotter
                            if(obj1.gethaspurchased()==true)
                            {
                                //message dialog
                                JOptionPane.showMessageDialog(panel4,"The Electric Scotter is already purchased");
                                break;
                            }
                            else 
                            {
                                obj1.purchase(price,range,charging,mileage,brand);
                                //message dialog
                                JOptionPane.showMessageDialog(panel4,"The Electric Scotter is purchased");
                                break;
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(panel2,"The VehicleID is not valid! ");
                        }
                    }
                }
            }
            catch(NumberFormatException num)
            {
                //message dialog
                JOptionPane.showMessageDialog(panel2,"Exception is handled!");
            }
        }
        
        //for selling Electric Scotter
        else if(e.getSource()== button13)
        {
            //handling exception
            try
            {
                //returing the element selected in JCombobox
                int vehicle_id = Integer.parseInt(field25.getText());
                int price = Integer.parseInt(field26.getText());
                
                //creating for each loop to enter into arraylist
                for (Vehicle V_obj:al)
                {
                    //using instanceof method to check the object
                    if(V_obj instanceof ElectricScotter)
                    {
                        //downcasting
                        ElectricScotter obj1= (ElectricScotter) V_obj;
                        
                        //comparing the input of vehicleID with the existing VehicleID
                        if(obj1.getVehicleID()==vehicle_id)
                        {
                            JOptionPane.showMessageDialog(panel2,"The VehicleID is valid! "+"\n The price is: "
                            +price);
                            
                            //calling method to sell Electric Scotter
                            if(obj1.gethassold()==true)
                            {
                                //message dialog
                                JOptionPane.showMessageDialog(panel4,"The Electric Scotter is already sold");
                                break;
                            }
                            
                            else 
                            {
                                obj1.sell(price);
                                //message dialog
                                JOptionPane.showMessageDialog(panel4,"The Electric Scotter is sold");
                                break;
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(panel2,"The VehicleID is not valid!");
                        }
                    }
                } 
            }
            catch(NumberFormatException num)
            {
                //message dialog
                JOptionPane.showMessageDialog(panel4,"Exception is handled!");
            }
        }
        
        
        //clearing inputs of textfield of AutoRickshaw 
        else if(e.getSource() == button6)
        {
            field1.setText("");
            field2.setText("");
            field3.setText("");
            field4.setText("");
            field5.setText("");
            field6.setText("");
            field7.setText("");
            field8.setText("");
            field9.setText("");
            field10.setText("");
            field11.setText("");
            field12.setText("");
            //for JComboBox
            box1.setSelectedItem("January");
            box2.setSelectedItem("2000");
            box3.setSelectedItem("1");
        }

        //clearing inputs of textfield of Electric Scooter 
        else if(e.getSource() == button10)
        {
            field13.setText("");
            field14.setText("");
            field15.setText("");
            field16.setText("");
            field17.setText("");
            field18.setText("");
            field19.setText("");
            field20.setText("");
            field21.setText("");
            field22.setText("");
            field23.setText("");
            field24.setText("");
            field25.setText("");
            field26.setText("");
        }
        
        //display of AutoRikshaw Class
        else if(e.getSource() == button5)
        {
            //checking if the arrarlist is empty or not
            if(al.isEmpty())
            {
                //message dialog
                JOptionPane.showMessageDialog(frame2,"The Arraylist is empty");
            }
            
            else
            {
                for(Vehicle V_obj:al)
                {
                    //using instanceof method to check the object
                    if(V_obj instanceof AutoRickshaw)
                    {
                        AutoRickshaw obj= (AutoRickshaw) V_obj;
                        obj.display();
                    }
                }
            }
        }
        
        //display of Electric Scooter Class
        else if(e.getSource() == button9)
        {
            //checks if the arraylist is empty or not
            if(al.isEmpty())
            {
                //message dialog
                JOptionPane.showMessageDialog(frame2,"The Arraylist is empty");
            }
            
            else
            {
                //using for each loop to enter into arraylist
                for(Vehicle V_obj:al)
                {
                    //using instanceof method to check the object
                    if(V_obj instanceof ElectricScotter)
                    {
                        ElectricScotter obj1= (ElectricScotter) V_obj;
                        obj1.display();
                    }
                }
            }
        }
    }
    
    //main method
    public static void main(String args[])
    {
        TransportGUI T_obj = new TransportGUI();
        T_obj.GUI_1();
    }

}
