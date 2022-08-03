package view;

import java.awt.*;
import java.awt.event.*;

import controller.LoginController;
import controller.MyWindowListener;


public class LoginFrame extends Frame 
{
	
	Button btlogin,btClear,btnewRegistration;
    TextField txtuname,txtpassword;
    Label lbUname,lbpassword;
    
    public LoginFrame()
    {
    	 btlogin=new Button("login");
   	     btnewRegistration=new Button("New Registration");
         btClear=new Button("Clear");
         txtuname=new TextField(20);
         txtpassword=new TextField(20);
         lbUname=new Label("Enter the User Name");
         lbpassword=new Label("Enter the Password");
         this.setVisible(true);
         this.setBounds(20, 180, 350, 350);
         txtpassword.setEchoChar('*');
         this.setTitle("Login Form ");
         this.setLayout(new FlowLayout());
         this.setResizable(false);
         
         this.add(lbUname);
         this.add(txtuname);
         this.add(lbpassword);
         this.add(txtpassword);
         this.add(btnewRegistration);
         this.add(btlogin);
         this.add(btClear);
         
         MyWindowListener mwl=new MyWindowListener(this);
         this.addWindowListener(mwl);
         //gui.addWindowListener(listener)
         
         LoginController lc=new LoginController(this);
         
         btlogin.addActionListener(lc);
         btnewRegistration.addActionListener(lc);
         btClear.addActionListener(lc);
	}

	public Button getBtlogin() {
		return btlogin;
	}

	public void setBtlogin(Button btlogin) {
		this.btlogin = btlogin;
	}

	public Button getBtClear() {
		return btClear;
	}

	public void setBtClear(Button btClear) {
		this.btClear = btClear;
	}

	public Button getBtnewRegistration() {
		return btnewRegistration;
	}

	public void setBtnewRegistration(Button btnewRegistration) {
		this.btnewRegistration = btnewRegistration;
	}

	public TextField getTxtuname() {
		return txtuname;
	}

	public void setTxtuname(TextField txtuname) {
		this.txtuname = txtuname;
	}

	public TextField getTxtpassword() {
		return txtpassword;
	}

	public void setTxtpassword(TextField txtpassword) {
		this.txtpassword = txtpassword;
	}

	public Label getLbUname() {
		return lbUname;
	}

	public void setLbUname(Label lbUname) {
		this.lbUname = lbUname;
	}

	public Label getLbpassword() {
		return lbpassword;
	}

	public void setLbpassword(Label lbpassword) {
		this.lbpassword = lbpassword;
	}

	

}
