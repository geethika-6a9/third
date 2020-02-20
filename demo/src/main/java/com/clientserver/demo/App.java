package com.clientserver.demo;
package epam.third;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="ex" width=400 height=200>
</applet>*/
public class ex extends Applet implements ActionListener
{
float si,ci,c;
Button b1,b2;
Label l1,l2,l3,l4;
TextField t1,t2,t3,t4;
public void init()
{
setBackground(Color.white);
setForeground(Color.black);
l1=new Label("PRINCIPAL");
t1=new TextField(10);
l2=new Label("TIME");
t2=new TextField(10);
l3=new Label("RATE");
t3=new TextField(10);
l4=new Label("NO.OF TIMES INTEREST APPLIED");
t4=new TextField(10);
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(t4);
b1=new Button("SIMPLE INTEREST");
add(b1);
b1.addActionListener(this);
b2=new Button("COMPOUND INTEREST");
add(b2);
b2.addActionListener(this);

}
public  void actionPerformed(ActionEvent e)
{
int p=Integer.parseInt(t1.getText().trim());
int t=Integer.parseInt(t2.getText().trim());
int r=Integer.parseInt(t3.getText().trim());
String action = e.getActionCommand();
if(action.equals("SIMPLE INTEREST"))
	si=(p*t*r)/100;
	
else if(action.equals("COMPOUND INTEREST"))
{
	int n=Integer.parseInt(t4.getText().trim());
	c=(1+r/n)^(n*t);
	ci=c*p;
}
repaint();

}
public void paint(Graphics g)
{
Font font=new Font("Constantia",Font.ITALIC,30);
g.setFont(font);
g.drawString("THE SIMPLE INTEREST IS "+si,40,100);
g.drawString("THE COMPOUND INTEREST IS "+ci,100,160);
}
}