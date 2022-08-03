package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.User;
import view.HomePageFrame;
import view.LoginFrame;
import view.RegistrationFrame;

public class LoginController implements ActionListener {
	
	LoginFrame loginframe;
	public LoginController(LoginFrame lf) {
		this.loginframe=lf;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==loginframe.getBtlogin())
        {
	      
					String uname=loginframe.getTxtuname().getText();
					String password=loginframe.getTxtpassword().getText();
					
					User u1=new User();
					u1.setUname(uname);
					u1.setPassword(password);
					 db.DAO d1=new db.DAO();
					 if(u1==null)
						{
							JOptionPane.showConfirmDialog(loginframe, "Please Enter data !");
							
						}
					u1= d1.validate(u1);
					
					
					if(u1!=null)
					{
						new HomePageFrame();
						loginframe.dispose();
					}
					else
					{
						loginframe.dispose();
						new LoginFrame();
					}
					
					
					
        }
		else if(ae.getSource()==loginframe.getBtClear())
				{
			loginframe.getTxtuname().setText(null);
			loginframe.getTxtpassword().setText(null);
					
				}
		else	if(ae.getSource()==loginframe.getBtnewRegistration())
				{
			       loginframe.dispose();
					new RegistrationFrame(); 
				}
				else
				{
					System.out.println("Something went wrong");
				}
		
	}

}
