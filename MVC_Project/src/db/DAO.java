package db;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;


import model.User;
import view.LoginFrame;
import view.RegistrationFrame;

public class DAO 
{

	LoginFrame loginframe;
	RegistrationFrame rf;
	static User arr[];
	static int count;
	
	int flag=0;
	static
	{
		arr=new User[10];
		count=0;
	}
	
		

	public boolean insert(User u1) 
	{
		
		
		 if(count<10) {
		 
		 arr[count]=u1; 
		 count++;
		 flag=1; 
		 }
		 
		/*
		 * ArrayList a1=new ArrayList(); a1.add(name); a1.add(Password); a1.add(city);
		 */
		
		
		
		
		
		
	
	
	if(flag==1)
	{
				return true;
	}
	else
	{
				return false;
		
	}
	 }
	
	

	public User validate(User u1) {
		int flag=0;
		int i;
		try
		{
		for ( i = 0; i < arr.length; i++) 
		{
			
			
		
				if(arr[i]==null)
					throw new MyNullPointerException();
			if(u1.getUname().equals(arr[i].getUname())
					&& u1.getPassword().equals(arr[i].getPassword()))
			{
				u1.setCity(arr[i].getCity());
				flag=1;
				break;
			}
			}
							
			
			
			
			
		}
		catch(MyNullPointerException e)
		{
			JOptionPane.showMessageDialog(loginframe, "Please Enter User Name and Password Correct !");
		}

	
		if(flag==1)
		{
			return u1;
			
		}
		else
		{
			return null;
		}

		
		
			
	}

}
