import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MovieTaquilla extends JFrame implements ActionListener, ItemListener
{
    String str,loc,ar,ns;
	    ImageIcon i,i1,i2,i3,i4,i5;
  JButton l = new JButton();
       JRadioButton small = new JRadioButton("Morning"), 
    medium = new JRadioButton("Day"),
      large = new JRadioButton("Evening"), 
      thick = new JRadioButton("Night");
  JButton book = new JButton("BOOK NOW");
    ButtonGroup sizeGroup = new ButtonGroup();
    TextField tf= new TextField(2);
    Choice ch = new Choice();
    JButton l1 = new JButton();
		JButton l2 = new JButton();
        JButton l3 = new JButton();
        JButton l4 = new JButton();
        JButton l5 = new JButton();

  JTextField name = new JTextField(20), phone = new JTextField(10), address = new JTextField(20);
  JTextField t = new JTextField(10);


  JButton b = new JButton("SUBMIT");//, closeButton = new JButton("Close");
Choice c1 = new Choice();
	Choice c2 = new Choice();
	Label la ;
	Label la1 = new Label("Select the District");
	Label la2 = new Label("Select the Area");
	Panel p = new Panel();
	Frame j = new Frame("LOCATION");
	
    Button b1 =new Button("PROCEED");
  public MovieTaquilla() 
  {
      JFrame j = new JFrame("REGISTRATION");
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    j.setResizable(false);

    JPanel panel1 = new JPanel();
    panel1.setLayout(new GridBagLayout());
    
    Font f1 = new Font("Times New Roman", Font.BOLD , 32);
    Font f2 = new Font("Times New Roman", Font.ITALIC , 32); 
    JLabel la1 = new JLabel("Name:");
    JLabel la2 = new JLabel("Phone:");
    JLabel la3 = new JLabel("Email-ID:");
    la1.setFont(f1);
    la2.setFont(f1);
    la3.setFont(f1);
    name.setFont(f2);
    phone.setFont(f2);
    address.setFont(f2);
    b.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC , 32));

    addItem(panel1, la1, 0, 0, 1, 1, GridBagConstraints.EAST);
    addItem(panel1, la2, 0, 1, 1, 1, GridBagConstraints.EAST);
    addItem(panel1, la3, 0, 2, 1, 1, GridBagConstraints.EAST);

    addItem(panel1, name, 1, 0, 2, 1, GridBagConstraints.WEST);
    addItem(panel1, phone, 1, 1, 1, 1, GridBagConstraints.WEST);
    addItem(panel1, address, 1, 2, 2, 1, GridBagConstraints.WEST);

    panel1.setBackground(Color.pink);
    t.setEditable(false);
    addItem(panel1, t, 1, 3, 1, 1, GridBagConstraints.NORTH);
    t.setBackground(Color.cyan);
    
    addItem(panel1, b, 2, 3, 1, 1, GridBagConstraints.NORTH);
    b.addActionListener(this);

    j.add(panel1);
    j.pack();
    j.setVisible(true);
    b1.addActionListener(this);
    l.addActionListener(this);
    l1.addActionListener(this);
    l2.addActionListener(this);
    l3.addActionListener(this);
    l4.addActionListener(this);
    l5.addActionListener(this);
    book.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e) 
	{
	    if(e.getSource()==b) 
	    {
	    str = name.getText();
		t.setText("You were registered");
		Frame j1 = new Frame("LOCATION");
		j1.setResizable(false);
	    p.setLayout(new GridBagLayout());
		j1.setBackground(Color.cyan);
		Font f = new Font("Times New Roman",Font.BOLD, 30);
		la = new Label("Dear, " +str);
		la.setFont(f);
		la1.setFont(f);
		la2.setFont(f);
		c1.setFont(f);
		c2.setFont(f);
		b1.setFont(f);
		c1.add("AHMEDABAD");
		c1.add("BARODA");
		c1.add("BHARUCH");
		c1.add("GANDHINAGAR");
		c1.add("SURAT");
		c2.add("Select District");
		p.add(la);
		addItem(p, la1, 0, 0, 1, 1, GridBagConstraints.EAST);
		addItem(p, la1, 0, 1, 1, 1, GridBagConstraints.EAST);
		addItem(p, la2, 0, 2, 1, 1, GridBagConstraints.EAST);
		addItem(p, c1, 1, 1, 1, 1, GridBagConstraints.WEST);
		addItem(p, c2, 1, 2, 1, 1, GridBagConstraints.WEST); 
		c1.addItemListener(this);
		c2.addItemListener(this);
		j1.add(p);
    j1.setSize(750,400);
    j1.setVisible(true);
    addItem(p, b1, 2, 3, 1, 1, GridBagConstraints.NORTH);
}
else if(e.getSource()==b1)
{
    loc = c1.getSelectedItem();
    ar = c2.getSelectedItem();
    Frame f = new Frame("NOW SHOWING");
	    f.setLayout(new GridLayout(2,3));
	    f.setResizable(false);
	   
        i= new ImageIcon("pic.jpg");
		l.setIcon(i);
		l.setBackground(Color. GRAY);
		
        i1= new ImageIcon("pic1.jpg");
		l1.setIcon(i1);
		l1.setBackground(Color. GRAY);
		
        i2 = new ImageIcon("pic2.jpg");
		l2.setIcon(i2);
		l2.setBackground(Color. GRAY);
		
        i3 = new ImageIcon("pic3.jpg");
		l3.setIcon(i3);
		l3.setBackground(Color.GRAY);
		
        i4 = new ImageIcon("pic4.jpg");
		l4.setIcon(i4);
		l4.setBackground(Color. GRAY);
		
        i5 = new ImageIcon("pic5.jpg");
		l5.setIcon(i5);
		l5.setBackground(Color. GRAY);
		
		f.add(l);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.pack();
		f.setVisible(true);
}
else if(e.getSource() == book)
{
    JFrame bi = new JFrame("Bill");
    
    ns = ch.getSelectedItem();
    int num = Integer.parseInt(ns);
    float l = num * 370.0f ;
    float Total = l + (0.05f*l);
    bi.setResizable(false);
    Font f = new Font("Imprint MT Shadow",Font.BOLD, 30);
    Font f1 = new Font("Imprint MT Shadow",Font.PLAIN, 25);
    String[][] data = { 
            { "Each seat", "INR 370"}, 
            { "GST", "5%" } };
            String[] columnNames = { "Price", "Amount" }; 
            JTable j = new JTable(data, columnNames); 
    j.getColumnModel().getColumn(0).setPreferredWidth(250);
    j.getColumnModel().getColumn(1).setPreferredWidth(200);
    j.setRowHeight(50);
       // j.setBounds(300, 400, 400, 600);
    bi.setLayout( new GridBagLayout());
    
    JLabel t = new JLabel(str+", You have booked "+ns+" seat/s");
    JLabel t1 = new JLabel("in "+loc+" at "+ar);
    //JLabel t2 = new JLabel("GST : 5%");
    JLabel t3 = new JLabel("The Total bill including GST  is : "+Total);
    JLabel th = new JLabel("Thank You. ");
    JLabel th1 = new JLabel("Visit Us SOON ...!!! ");
    
    JLabel bl = new JLabel("Total Amount =>");
    addItem(bi, th, 0, 0, 1, 1, GridBagConstraints.SOUTH);
    addItem(bi, th1, 1, 0, 1, 1, GridBagConstraints.WEST);
    addItem(bi, t, 0, 1, 1, 1, GridBagConstraints.EAST);
    addItem(bi, t1, 1, 1, 1, 1, GridBagConstraints.WEST);
    addItem(bi, j, 0, 2, 1, 1, GridBagConstraints.NORTH);
    addItem(bi, t3, 0, 3, 1, 1, GridBagConstraints.WEST);
    
    th.setFont(f);
    th1.setFont(f);
    t.setFont(f1);
    t1.setFont(f1);
    t3.setFont(f1);
    j.setFont(f1);
    
    bi.pack();
	bi.setVisible(true);
}
else if(e.getSource()==l)
{
     JFrame in = new JFrame("INTERSTELLAR");
     in.setResizable(false);
    ImageIcon i= new ImageIcon("pic.jpg");
    JLabel be = new JLabel();
    in.setBackground(Color. GRAY);
    in.setLayout(new GridBagLayout());
		be.setIcon(i);
		Font fo = new Font("Times New Roman", Font.BOLD , 30);
		book.setFont(fo);
		JLabel le = new JLabel("INTERSTELLAR              ");
		le.setFont(fo);
		JLabel le1 = new JLabel("Imdb:8/10     Duration:2.5Hrs");
		le1.setFont(fo);
		
		addItem(in, be, 0, 0, 1, 10, GridBagConstraints.EAST);
		addItem(in, le, 1, 0, 6, 1, GridBagConstraints.WEST);
		addItem(in, le1, 1, 1, 6, 1, GridBagConstraints.WEST);
		in.pack();
		in.setVisible(true); 
		for (int j = 1; j< 21; j++)
		{
		    String st = Integer.toString(j);
           ch.add(st);
      }
		
	Box sizeBox = Box.createVerticalBox();
    sizeBox.add(new JLabel("Number of Seats"));
    sizeBox.add(ch);
    sizeBox.setBorder(BorderFactory.createTitledBorder("Seats"));
    addItem(in, sizeBox, 1, 3, 2, 3, GridBagConstraints.WEST);
    
    
    Box show = Box.createVerticalBox();
    sizeGroup.add(small);
    sizeGroup.add(medium);
    sizeGroup.add(large);
    sizeGroup.add(thick);
    show.add(small);
    show.add(medium);
    show.add(large);
    show.add(thick);
    show.setBorder(BorderFactory.createTitledBorder("Show Time"));
    addItem(in, show, 2, 3, 2, 3, GridBagConstraints.EAST);
    
    
    Box buttonBox = Box.createHorizontalBox();
    buttonBox.add(book);
    addItem(in, buttonBox, 1, 6, 2, 1, GridBagConstraints.NORTH);
}
else if(e.getSource()==l1)
{
     JFrame in = new JFrame("PASSENGERS");
     in.setResizable(false);
    ImageIcon i= new ImageIcon("pic1.jpg");
    JLabel be = new JLabel();
    in.setLayout(new GridBagLayout());
		be.setIcon(i);
		Font fo = new Font("Times New Roman", Font.BOLD , 30);
		book.setFont(fo);
		JLabel le = new JLabel("PASSENGERS              ");
		le.setFont(fo);
		JLabel le1 = new JLabel("Imdb:7/10     Duration:1Hr 56min");
		le1.setFont(fo);
		
		addItem(in, be, 0, 0, 1, 10, GridBagConstraints.EAST);
		addItem(in, le, 1, 0, 6, 1, GridBagConstraints.WEST);
		//addItem(in, new JLabel("Imdb:8/10"), 1, 1, 6, 1, GridBagConstraints.WEST);
		addItem(in, le1, 1, 1, 6, 1, GridBagConstraints.WEST);
		in.pack();
		in.setVisible(true); 
		for (int j = 1; j< 21; j++)
		{
		    String st = Integer.toString(j);
           ch.add(st);
      }
		
	Box sizeBox = Box.createVerticalBox();
    sizeBox.add(new JLabel("Number of Seats"));
    sizeBox.add(ch);
    sizeBox.setBorder(BorderFactory.createTitledBorder("Seats"));
    addItem(in, sizeBox, 1, 3, 2, 3, GridBagConstraints.WEST);
    
    Box show = Box.createVerticalBox();
    ButtonGroup sizeGroup = new ButtonGroup();
    sizeGroup.add(small);
    sizeGroup.add(medium);
    sizeGroup.add(large);
    sizeGroup.add(thick);
    show.add(small);
    show.add(medium);
    show.add(large);
    show.add(thick);
    show.setBorder(BorderFactory.createTitledBorder("Show Time"));
    addItem(in, show, 2, 3, 2, 3, GridBagConstraints.EAST);


    
    Box buttonBox = Box.createHorizontalBox();
    buttonBox.add(book);
    addItem(in, buttonBox, 1, 6, 2, 1, GridBagConstraints.NORTH);
}
else if(e.getSource()==l2)
{
     JFrame in = new JFrame("TITANIC");
     in.setResizable(false);
    ImageIcon i= new ImageIcon("pic2.jpg");
    JLabel be = new JLabel();
    in.setLayout(new GridBagLayout());
		be.setIcon(i);
		Font fo = new Font("Times New Roman", Font.BOLD , 30);
		book.setFont(fo);
		JLabel le = new JLabel("TITANIC                 ");
		le.setFont(fo);
		JLabel le1 = new JLabel("Imdb:7.8/10     Duration:3Hr 30min");
		le1.setFont(fo);
		
		addItem(in, be, 0, 0, 1, 10, GridBagConstraints.EAST);
		addItem(in, le, 1, 0, 6, 1, GridBagConstraints.WEST);
		//addItem(in, new JLabel("Imdb:8/10"), 1, 1, 6, 1, GridBagConstraints.WEST);
		addItem(in, le1, 1, 1, 6, 1, GridBagConstraints.WEST);
		in.pack();
		in.setVisible(true); 
		for (int j = 1; j< 21; j++)
		{
		    String st = Integer.toString(j);
           ch.add(st);
      }
		
	Box sizeBox = Box.createVerticalBox();
    sizeBox.add(new JLabel("Number of Seats"));
    sizeBox.add(ch);
    sizeBox.setBorder(BorderFactory.createTitledBorder("Seats"));
    addItem(in, sizeBox, 1, 3, 2, 3, GridBagConstraints.WEST);
    
    Box show = Box.createVerticalBox();
    ButtonGroup sizeGroup = new ButtonGroup();
    sizeGroup.add(small);
    sizeGroup.add(medium);
    sizeGroup.add(large);
    sizeGroup.add(thick);
    show.add(small);
    show.add(medium);
    show.add(large);
    show.add(thick);
    show.setBorder(BorderFactory.createTitledBorder("Show Time"));
    addItem(in, show, 2, 3, 2, 3, GridBagConstraints.EAST);


    
    Box buttonBox = Box.createHorizontalBox();
    buttonBox.add(book);
    addItem(in, buttonBox, 1, 6, 2, 1, GridBagConstraints.NORTH);
}
else if(e.getSource()==l3)
{
     JFrame in = new JFrame("THE NUN");
     in.setResizable(false);
    ImageIcon i= new ImageIcon("pic3.jpg");
    JLabel be = new JLabel();
    in.setLayout(new GridBagLayout());
		be.setIcon(i);
		Font fo = new Font("Times New Roman", Font.BOLD , 30);
		book.setFont(fo);
		JLabel le = new JLabel("THE NUN                ");
		le.setFont(fo);
		JLabel le1 = new JLabel("Imdb:5.3/10     Duration:1Hr 36min");
		le1.setFont(fo);
		
		addItem(in, be, 0, 0, 1, 10, GridBagConstraints.EAST);
		addItem(in, le, 1, 0, 6, 1, GridBagConstraints.WEST);
		//addItem(in, new JLabel("Imdb:8/10"), 1, 1, 6, 1, GridBagConstraints.WEST);
		addItem(in, le1, 1, 1, 6, 1, GridBagConstraints.WEST);
		in.pack();
		in.setVisible(true); 
		for (int j = 1; j< 21; j++)
		{
		    String st = Integer.toString(j);
           ch.add(st);
      }
		
	Box sizeBox = Box.createVerticalBox();
    sizeBox.add(new JLabel("Number of Seats"));
    sizeBox.add(ch);
    sizeBox.setBorder(BorderFactory.createTitledBorder("Seats"));
    addItem(in, sizeBox, 1, 3, 2, 3, GridBagConstraints.WEST);
    
    Box show = Box.createVerticalBox();
    ButtonGroup sizeGroup = new ButtonGroup();
    sizeGroup.add(small);
    sizeGroup.add(medium);
    sizeGroup.add(large);
    sizeGroup.add(thick);
    show.add(small);
    show.add(medium);
    show.add(large);
    show.add(thick);
    show.setBorder(BorderFactory.createTitledBorder("Show Time"));
    addItem(in, show, 2, 3, 2, 3, GridBagConstraints.EAST);


    
    Box buttonBox = Box.createHorizontalBox();
    buttonBox.add(book);
    addItem(in, buttonBox, 1, 6, 2, 1, GridBagConstraints.NORTH);
}
else if(e.getSource()==l4)
{
     JFrame in = new JFrame("THE CONJURING 2");
     in.setResizable(false);
    ImageIcon i= new ImageIcon("pic4.jpg");
    JLabel be = new JLabel();
    in.setLayout(new GridBagLayout());
		be.setIcon(i);
		Font fo = new Font("Times New Roman", Font.BOLD , 30);
		book.setFont(fo);
		JLabel le = new JLabel("THE CONJURING 2              ");
		le.setFont(fo);
		JLabel le1 = new JLabel("Imdb:7.3/10     Duration:2Hr 14min");
		le1.setFont(fo);
		
		addItem(in, be, 0, 0, 1, 10, GridBagConstraints.EAST);
		addItem(in, le, 1, 0, 6, 1, GridBagConstraints.WEST);
		//addItem(in, new JLabel("Imdb:8/10"), 1, 1, 6, 1, GridBagConstraints.WEST);
		addItem(in, le1, 1, 1, 6, 1, GridBagConstraints.WEST);
		in.pack();
		in.setVisible(true); 
		for (int j = 1; j< 21; j++)
		{
		    String st = Integer.toString(j);
           ch.add(st);
      }
		
	Box sizeBox = Box.createVerticalBox();
    sizeBox.add(new JLabel("Number of Seats"));
    sizeBox.add(ch);
    sizeBox.setBorder(BorderFactory.createTitledBorder("Seats"));
    addItem(in, sizeBox, 1, 3, 2, 3, GridBagConstraints.WEST);
    
    Box show = Box.createVerticalBox();
    ButtonGroup sizeGroup = new ButtonGroup();
    sizeGroup.add(small);
    sizeGroup.add(medium);
    sizeGroup.add(large);
    sizeGroup.add(thick);
    show.add(small);
    show.add(medium);
    show.add(large);
    show.add(thick);
    show.setBorder(BorderFactory.createTitledBorder("Show Time"));
    addItem(in, show, 2, 3, 2, 3, GridBagConstraints.EAST);


    
    Box buttonBox = Box.createHorizontalBox();
    buttonBox.add(book);
    addItem(in, buttonBox, 1, 6, 2, 1, GridBagConstraints.NORTH);
}
else if(e.getSource()==l5)
{
     JFrame in = new JFrame("INCEPTION");
     in.setResizable(false);
    ImageIcon i= new ImageIcon("pic5.jpg");
    JLabel be = new JLabel();
    in.setLayout(new GridBagLayout());
		be.setIcon(i);
		Font fo = new Font("Times New Roman", Font.BOLD , 30);
		book.setFont(fo);
		JLabel le = new JLabel("INCEPTION              ");
		le.setFont(fo);
		JLabel le1 = new JLabel("Imdb:8.8/10     Duration:2Hr 42min");
		le1.setFont(fo);
		
		addItem(in, be, 0, 0, 1, 10, GridBagConstraints.EAST);
		addItem(in, le, 1, 0, 6, 1, GridBagConstraints.WEST);
		//addItem(in, new JLabel("Imdb:8/10"), 1, 1, 6, 1, GridBagConstraints.WEST);
		addItem(in, le1, 1, 1, 6, 1, GridBagConstraints.WEST);
		in.pack();
		in.setVisible(true); 
		for (int j = 1; j< 21; j++)
		{
		    String st = Integer.toString(j);
           ch.add(st);
      }
		
	Box sizeBox = Box.createVerticalBox();
    sizeBox.add(new JLabel("Number of Seats"));
    sizeBox.add(ch);
    sizeBox.setBorder(BorderFactory.createTitledBorder("Seats"));
    addItem(in, sizeBox, 1, 3, 2, 3, GridBagConstraints.WEST);
    
    Box show = Box.createVerticalBox();
    ButtonGroup sizeGroup = new ButtonGroup();
    sizeGroup.add(small);
    sizeGroup.add(medium);
    sizeGroup.add(large);
    sizeGroup.add(thick);
    show.add(small);
    show.add(medium);
    show.add(large);
    show.add(thick);
    show.setBorder(BorderFactory.createTitledBorder("Show Time"));
    addItem(in, show, 2, 3, 2, 3, GridBagConstraints.EAST);


    
    Box buttonBox = Box.createHorizontalBox();
    buttonBox.add(book);
    addItem(in, buttonBox, 1, 6, 2, 1, GridBagConstraints.NORTH);
}
	}
public void itemStateChanged(ItemEvent e)
	{
	    if(e.getSource()==c1)
	    {
	    int i = c1.getSelectedIndex();
	    if(i == 0)
	    {
	        c2.removeAll();
	        c2.add("VED ARCADE");
	        c2.add("CARNIVAL");
	        addItem(p, c2, 1, 1, 1, 1, GridBagConstraints.WEST);
	       }
	      else if(i == 1)
	   {
	        c2.removeAll();
	        c2.add("EVA MALL");
	        c2.add("TAKSH ");
		addItem(p, c2, 1, 1, 1, 1, GridBagConstraints.WEST); 
	       }
	       else if(i == 2)
	    {
	        c2.removeAll();
	        c2.add("BLUECHIP ");
	        c2.add("INOX ");
	        addItem(p, c2, 1, 1, 1, 1, GridBagConstraints.WEST);
	       }
	       else if(i == 3)
	    {
	        c2.removeAll();
	        c2.add("CITY PLUS");
	        c2.add("MOTERA");
	        addItem(p, c2, 1, 1, 1, 1, GridBagConstraints.WEST);
	       }
	       else if(i == 4)
	    {
	        c2.removeAll();
	        c2.add("CINEPOLIS");
	        c2.add("IRIS MALL");
	        addItem(p, c2, 1, 1, 1, 1, GridBagConstraints.WEST);
	       }
	   }
	   }
  public void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int align) 
  {
    GridBagConstraints gc = new GridBagConstraints();
    gc.gridx = x;
    gc.gridy = y;
    gc.gridwidth = width;
    gc.gridheight = height;
    gc.weightx = 100.0;
    gc.weighty = 100.0;
    gc.insets = new Insets(5, 5, 5, 5);
    gc.anchor = align;
    gc.fill = GridBagConstraints.NONE;
    p.add(c, gc);
  }
  public void addItem(JFrame p, JComponent c, int x, int y, int width, int height, int align) 
  {
    GridBagConstraints gc = new GridBagConstraints();
    gc.gridx = x;
    gc.gridy = y;
    gc.gridwidth = width;
    gc.gridheight = height;
    gc.weightx = 100.0;
    gc.weighty = 100.0;
    gc.insets = new Insets(5, 5, 5, 5);
    gc.anchor = align;
    gc.fill = GridBagConstraints.NONE;
    p.add(c, gc);
  }
  public void addItem(Panel p, Component c, int x, int y, int width, int height, int align) 
  {
    GridBagConstraints gc = new GridBagConstraints();
    gc.gridx = x;
    gc.gridy = y;
    gc.gridwidth = width;
    gc.gridheight = height;
    gc.weightx = 100.0;
    gc.weighty = 100.0;
    gc.insets = new Insets(1, 1, 1, 1);
    gc.anchor = align;
    gc.fill = GridBagConstraints.NONE;
    p.add(c, gc);
  }
  public static void main(String[] args) 
  {
    MovieTaquilla m = new MovieTaquilla();
}
}
