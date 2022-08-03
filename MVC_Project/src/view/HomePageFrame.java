package view;

import java.awt.Button;
import java.awt.FlowLayout;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import controller.MyWindowListener;
import model.User;



public class HomePageFrame extends Frame {
	 Button btconnect,btdisconnect,btdevices;
     TextField txtip;
     Label lbip;
	
	public HomePageFrame() 
	{
		
     btconnect=new Button("Connect");
     btdisconnect=new Button("Disconnect");
     btdevices=new Button("Show Devices");
     txtip=new TextField(20);
     lbip=new Label("Enter the Device Ip");
		
		
		this.setVisible(true);
        this.setBounds(20, 180, 550, 550);
        this.setTitle("Device Testing Home Page ");
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        
        this.add(lbip);
        this.add(txtip);
        this.add(btconnect);
        this.add(btdisconnect);
        this.add(btdevices);
        
        MyWindowListener mwl=new MyWindowListener(this);
        this.addWindowListener(mwl);
        
        controller.HomePageController hc=new controller.HomePageController(this);
       
         btconnect.addActionListener(hc);
         btdisconnect.addActionListener(hc);
         btdevices.addActionListener(hc);
		
	}

	public Button getBtconnect() {
		return btconnect;
	}

	public void setBtconnect(Button btconnect) {
		this.btconnect = btconnect;
	}

	public Button getBtdisconnect() {
		return btdisconnect;
	}

	public void setBtdisconnect(Button btdisconnect) {
		this.btdisconnect = btdisconnect;
	}

	public Button getBtdevices() {
		return btdevices;
	}

	public void setBtdevices(Button btdevices) {
		this.btdevices = btdevices;
	}

	public TextField getTxtip() {
		return txtip;
	}

	public void setTxtip(TextField txtip) {
		this.txtip = txtip;
	}

	public Label getLbip() {
		return lbip;
	}

	public void setLbip(Label lbip) {
		this.lbip = lbip;
	}
	

}
