package controller;

import java.awt.event.*;

import javax.swing.JOptionPane;

import model.User;
import view.LoginFrame;
import view.RegistrationFrame;


public class RegistrationController implements ActionListener {
	
	RegistrationFrame registrationframe;
	
	public RegistrationController(RegistrationFrame rf) {
		this.registrationframe=rf;
	}

	public void actionPerformed(ActionEvent ae) {
				if(ae.getSource()==registrationframe.getBtSubmit())
        {
	      // System.out.println("Submit");
					String uname=registrationframe.getTxtuname().getText();
					String password=registrationframe.getTxtpassword().getText();
					String city=registrationframe.getTxtcity().getText();
				//	System.out.println(uname+" "+password+" "+city);
					if(uname.trim().isEmpty()&&password.trim().isEmpty())
					{
						if(city.trim().isEmpty())
						JOptionPane.showMessageDialog(registrationframe, "Please Enter Valid Data !");
					}
					else
					{
					User u1=new User();
					
					u1.setUname(uname);
					u1.setPassword(password);
					u1.setCity(city);
					
					db.DAO d1=new db.DAO();
					
					
					
					if(d1.insert(u1))
					{
												
						
						JOptionPane.showMessageDialog(registrationframe, "Sucessfully Inserted !");
						registrationframe.dispose();
						new LoginFrame();
						}
											

					}
        }
					
				
					        
				if(ae.getSource()==registrationframe.getBtClear())
				{
					registrationframe.getTxtuname().setText(null);
					registrationframe.getTxtpassword().setText(null);
					registrationframe.getTxtcity().setText(null);
				}
				

	}
	
}
