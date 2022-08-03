package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import db.MyNullPointerException;
import view.HomePageFrame;

public class HomePageController implements ActionListener {
	HomePageFrame homepageframe;
	
	String connect="adb connect";
	String disconnect="adb disconnect";
	String devices="adb devices";
	
	

	public HomePageController(HomePageFrame hpf) {
		this.homepageframe=hpf;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		
		

				
		
		if(ae.getSource()==homepageframe.getBtconnect())
		{
			String ip=homepageframe.getTxtip().getText();
			System.out.println("connect");
			String cmd="cmd /c start cmd.exe /k \""+connect +"\"";
			try {
				Runtime.getRuntime().exec(cmd +" "+ ip );
				Thread.sleep(2000);
				Runtime.getRuntime().exec("taskkill /f  /im cmd.exe");
			
			
			} 
					catch (IOException | InterruptedException e) {
			    
				e.printStackTrace();
			}
			
		}
		
		if(ae.getSource()==homepageframe.getBtdisconnect())
		{
			String ip=homepageframe.getTxtip().getText();
			System.out.println("disconnect");
			
			String cmd="cmd /c start cmd.exe /k \""+disconnect +"\"";
			
			
			try {
				Runtime.getRuntime().exec(cmd +" "+ ip );
				Thread.sleep(2000);
				Runtime.getRuntime().exec("taskkill /f  /im cmd.exe");
			
			
			} 
					catch (IOException | InterruptedException e) {
			    
				e.printStackTrace();
			}
			
			
		}
		//if(ae.getSource()==loginframe.getBtlogin())
		if(ae.getSource()==homepageframe.getBtdevices())
		{
			String ip=homepageframe.getTxtip().getText();
			System.out.println("show devices");
			String cmd="cmd /c start cmd.exe /k \""+devices +"\"";
			
			
			try {
				Runtime.getRuntime().exec(cmd);
				Thread.sleep(5000);
				Runtime.getRuntime().exec("taskkill /f  /im cmd.exe");
			
			
			} 
					catch (IOException | InterruptedException e) {
			    
				e.printStackTrace();
			}
			
		}
				
	}


}
