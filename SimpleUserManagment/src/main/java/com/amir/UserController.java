	package com.amir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

		@Autowired
		private UserRepo userRepo;

		@RequestMapping("/")  
		public String home()
		{
			return "home";
		}
		@RequestMapping("/reg")
		public String userRegPage()
		{
			return "userreg";
		}
		@RequestMapping("/save")
		public String userRegister(@RequestParam int id,
				@RequestParam String name,
				@RequestParam String password,User user ,Model model)
		{
			User users=userRepo.save(user);
			return "sucess";
		}
		@RequestMapping("/views")
		public String viewAllUsers(Model model)
		{
		    model.addAttribute("users",userRepo.findAll());
			return "/viewUsers";
		}
		@RequestMapping("/delete/{id}")
		public String deleteUser(@PathVariable int id)
		{
			userRepo.deleteById(id);
			return "redirect:/viewUsers";  
		}
		// Retrieves existing Record and update 
		 @RequestMapping(value="/edit/{id}")    
		    public String edit(@PathVariable int id, Model m){    
		        User user=userRepo.findById(id).get();    
		        m.addAttribute("command",user);  
		        return "edituser";    
		    }   
		 /* It updates model object. */    
		    @RequestMapping(value="/edit",method=RequestMethod.GET)    
		    public String editsave(@RequestParam String name,
		    @RequestParam String password, User user,Model model){    
		     userRepo.save(user);    
		     return "redirect:/viewUsers";    
		    }    
	}
		

	

