import java.awt.*;
import java.awt.event.*;

Class Calculator extends ActionListener
[
	Frame f = new Frmae();
	Label l1= new Label();
	Label l2= new Label();
	Label l3= new Label();
	
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	
	Button b1 = new Button("Add");
	Button b2 = new Button("Add");
	Button b3 = new Button("Add");
	Button b4 = new Button("Add");
	Button b5 = new Button("Add");
	
	Calculator()
	{
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,140,100,20);
		l3.setBounds(50,180,100,20);
		
		t1.setBounds(200,100,100,20);
		t2.setBounds(200,140,100,20);
		t3.setBounds(200,180,100,20);
		
		b1.setBounds(50,250,50,20);
		b2.setBounds(110,250,50,20);
		b3.setBounds(170,250,50,20);
		b4.setBounds(230,250,50,20);
		b5.setBounds(290,250,50,20);
		
		f.add(l1);
        f.add(l2);
        f.add(l3);
        
        f.add(t1);
        f.add(t2);
        f.add(t3);
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
		
		b1.ActionListener(this);
		b2.ActionListener(this);
		b3.ActionListener(this);
		b4.ActionListener(this);
		b5.ActionListener(new ActionListener(){
			public void actionPerformed(ActionListener e)
			{
				System.exit(0);
			}
		});
		f1.setLayout(null);
		f1.setVisible(true);
        f1.setSize(400,350);
	}
	public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        
        if(e.getSource()==b1)
        {
            t3.setText(String.valueOf(n1+n2));
        }
            
        if(e.getSource()==b2)
        {
            t3.setText(String.valueOf(n1-n2));
        }
        
        if(e.getSource()==b3)
        {
            t3.setText(String.valueOf(n1*n2));
        }
        
        if(e.getSource()==b4)
        {
            t3.setText(String.valueOf(n1/n2));
        }
        
        if(e.getSource()==b5)
        {
            System.exit(0);
        }
    }
    
    public static void main(String...s)
    {
        new Calculator();
    }
]