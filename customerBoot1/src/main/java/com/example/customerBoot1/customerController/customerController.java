package com.example.customerBoot1.customerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerBoot1.CustomerPojo.CustomerPojo;
import com.example.customerBoot1.customerService.customerService;

@RestController
public class customerController {
	
	@Autowired
	private customerService cs;
	
	@RequestMapping("/customer")
	public List<CustomerPojo> getAllNames()
	{
		return cs.getAllNames();
	}
	@RequestMapping("/customer/{id}")
	public CustomerPojo getCustomer( @PathVariable int id)
	{
		return cs.getCustomer(id);
	}
	@RequestMapping(value="/customer",method=RequestMethod.POST)
	public void addCustomer(@RequestBody CustomerPojo cp)
	{
		cs.addCustomer(cp);
	}
	
	@RequestMapping(value="/customer/{id}",method=RequestMethod.PUT)
	
		public void updateCustomer(@PathVariable int id,@RequestBody CustomerPojo cp)
		{
			cs.updateCustomer(id, cp);
		}
	@RequestMapping(value="/customer/{id}",method=RequestMethod.DELETE)
	
	public void deleteCustomer(@PathVariable int id)
	{
		cs.deleteCustomer(id);
	}
	
	}
	


