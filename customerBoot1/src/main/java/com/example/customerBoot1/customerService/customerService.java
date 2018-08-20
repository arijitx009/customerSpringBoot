package com.example.customerBoot1.customerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.customerBoot1.CustomerPojo.CustomerPojo;

@Service
public class customerService {
	
	private List<CustomerPojo> customer=new ArrayList<>(Arrays.asList(
			
			
			new CustomerPojo(100,"Arijit","biswas@gmail.com","Paris"),
			new CustomerPojo(101,"Arif","ahmed@gmail.com","NewYork"),
			new CustomerPojo(102,"Souvik","dutta@gmail.com","Manhattan")
			
			
			));
			

	
	public List<CustomerPojo> getAllNames()
	{
		return customer;
	}
	
	public CustomerPojo getCustomer(int id)
	{
		return customer.stream().filter(c -> c.getCustomerId()==id).findFirst().get();
	}
	public void addCustomer(CustomerPojo cp)
	{
		customer.add(cp);
	}
	public void updateCustomer(int id,CustomerPojo cp)
	{
		for(int i=0;i< customer.size();i++)
		{
			CustomerPojo c=customer.get(i);
			if(c.getCustomerId()==id)
			{
				customer.set(i, cp);
				return;
			}
		}
	}
	public void deleteCustomer(int id)
	{
		customer.removeIf(c -> c.getCustomerId()==id);
	}

}
