package view;

import java.awt.*;
import java.awt.event.*;

import controller.MyWindowListener;
import controller.RegistrationController;


public class RegistrationFrame extends Frame 
{
	 Button btSubmit,btClear;
     TextField txtuname,txtpassword,txtcity;
     Label lbUname,lbpassword,lbcity;
     
     public RegistrationFrame() 
    {
    	  btSubmit=new Button("Submit");
    	  
          btClear=new Button("Clear");
          txtuname=new TextField(20);
          txtpassword=new TextField(20);
          txtcity=new TextField(20);
          lbUname=new Label("Enter the User Name");
          lbpassword=new Label("Enter the Password");
          lbcity=new Label("Enter the City Name");
          
          this.setVisible(true);
          this.setBounds(20, 180, 350, 350);
          txtpassword.setEchoChar('*');
          this.setTitle("Registration Form ");
          this.setLayout(new FlowLayout());
          this.setResizable(false);
          this.add(lbUname);
          this.add(txtuname);
          this.add(lbpassword);
          this.add(txtpassword);
          this.add(lbcity);
          this.add(txtcity);
          this.add(btSubmit);
          this.add(btClear);
          
          MyWindowListener mwl=new MyWindowListener(this);
          this.addWindowListener(mwl);
          //gui.addWindowListener(listener)
          
          RegistrationController rc=new RegistrationController(this);
          
          btSubmit.addActionListener(rc);
          btClear.addActionListener(rc);
    }

	public Button getBtSubmit() {
		return btSubmit;
	}

	public void setBtSubmit(Button btSubmit) {
		this.btSubmit = btSubmit;
	}

	public Button getBtClear() {
		return btClear;
	}

	public void setBtClear(Button btClear) {
		this.btClear = btClear;
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

	public TextField getTxtcity() {
		return txtcity;
	}

	public void setTxtcity(TextField txtcity) {
		this.txtcity = txtcity;
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

	public Label getLbcity() {
		return lbcity;
	}

	public void setLbcity(Label lbcity) {
		this.lbcity = lbcity;
	}

	
	}
     
    
     
    

