import java.awt.*;
import java.awt.event.*;

class nineb extends Frame implements ActionListener
{
	Label lstring1, lstring2;
	TextField tfstring1, tfstring2;
	Button submit;
	TextArea display;

	nineb()
	{
		lstring1 = new Label("String 1 (str1)");
		lstring2 = new Label("String 2 (str2)");

		tfstring1 = new TextField();
		tfstring2 = new TextField();

		submit = new Button("Perform Operations");

		display = new TextArea("", 2 , 100 , TextArea.SCROLLBARS_NONE);

		lstring1.setBounds(10, 40, 100, 20);
		tfstring1.setBounds(10, 65, 100, 20);

		lstring2.setBounds(120, 40, 100, 20);
		tfstring2.setBounds(120, 65, 100, 20);

		submit.setBounds(10, 90, 210, 30);

		display.setBounds(10, 130, 210, 100);
		display.setEditable(false);

		add(lstring1);
		add(lstring2);
		add(tfstring1);
		add(tfstring2);
		add(submit);
		add(display);

		submit.addActionListener(this);

		setTitle("String Operations");
		setSize(230,240);
		setLayout(null);
		setVisible(true);

		addWindowListener(new WindowAdapter()
		{  
            public void windowClosing(WindowEvent e)
            {  
                dispose();  
            }  
        });
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==submit)
		{
			String str1 = tfstring1.getText();
			String str2 = tfstring2.getText();


			StringBuilder sb = new StringBuilder(str2);  
			sb.reverse();

			String oper = " str1.concat(str2) = " + str1.concat(str2) + "n str1.toLowerCase() = " + str1.toLowerCase() + "n str2.toUpperCase() = " + str2.toUpperCase() + "n str2.trim() = " + str2.trim() + "n str2.replace(' ', '#') = " + str2.replace(' ', '#') + "n str2 reverse : " + sb;

			display.setText(oper);
		}
	}

	public static void main(String[] args)
	{
		new nineb();
	}
}