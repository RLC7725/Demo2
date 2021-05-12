import java.awt.*;
import java.applet.*;
import java.awt.event.*;		
public class AppCalculator extends Applet implements ActionListener
{
    TextField first, second,output;
    Button b1,b2,b3,b4;
    int a,b;
    public void init ()
    {
        Label p=new Label("first");
        Label q=new Label("second");
        Label r=new Label("result");
        first=new TextField(10);
        second=new TextField(10);
	
        output=new TextField(10);
        b1=new Button("b1");
        b2=new Button("b2");
        b3=new Button("b3");
        b4=new Button("b4");
        add(p);
        add(first);
        add(q);
        add(second);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(r);
        add(output);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
    }
    public void actionPerformed(ActionEvent e)
    {
     	       
        if(e.getSource()==b1)
        {
        	a=Integer.parseInt(first.getText());
        	b=Integer.parseInt(second.getText());
            int c=a+b;
           	String s= String.valueOf(c);
           	output.setText(s);
        }
        
        else if(e.getSource()==b2)
        {
        	a=Integer.parseInt(first.getText());
        	b=Integer.parseInt(second.getText());
            int c=a-b;
           	String s= String.valueOf(c);
           	output.setText(s);
        }
        
        else if(e.getSource()==b3)
        {
        	a=Integer.parseInt(first.getText());
        	b=Integer.parseInt(second.getText());
             int c=a*b;
           	String s= String.valueOf(c);
           	output.setText(s);
        }
        
        else if(e.getSource()==b4)
        {
        	a=Integer.parseInt(first.getText());
        	b=Integer.parseInt(second.getText());
             int c=a/b;
           	String s= String.valueOf(c);
           	output.setText(s);
        }
    }
    
}