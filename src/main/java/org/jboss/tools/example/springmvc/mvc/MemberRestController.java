package org.jboss.tools.example.springmvc.mvc;

import java.util.List;

import javax.validation.Valid;

import org.jboss.tools.example.common.Utility;
import org.jboss.tools.example.springmvc.domain.Member;
import org.jboss.tools.example.springmvc.domain.UserStock;
import org.jboss.tools.example.springmvc.repo.MemberDao;
import org.jboss.tools.example.springmvc.repo.UserStockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/members")
public class MemberRestController
{

    @Autowired
    private MemberDao memberDao;

    @RequestMapping(method=RequestMethod.GET, produces="application/json")
    public @ResponseBody List<Member> listAllMembers()
    {
        return memberDao.findAllOrderedByName();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET, produces="application/json")
    public @ResponseBody Member lookupMemberById(@PathVariable("id") Long id)
    {
        return memberDao.findById(id);
    }
    

    @RequestMapping(value = "/p{hash_deviceid}", method = RequestMethod.POST)
    public ResponseEntity<Member> updateMember(@RequestBody Member newMember,
    		@PathVariable("hash_deviceid") String devId
    		) {

       // cars.stream().forEach(c -> c.setMiles(c.getMiles() + 100));
    	
    	if ((!devId.trim().equals(""))&&(devId.equals(Utility.md5(newMember.getDeviceId()))))
    	{
        	memberDao.register(newMember);
    	}
    	
       // return "redirect:/";
        
        // TODO: call persistence layer to update
        return new ResponseEntity<Member>(newMember, HttpStatus.OK);
    }
    

    
    
    @RequestMapping(value = "/postM/{id}", method = RequestMethod.GET)
    public String updateMember(@PathVariable("id") String newMember) {

       // cars.stream().forEach(c -> c.setMiles(c.getMiles() + 100));
//    	memberDao.register(newMember);
        return "redirect:/";
        
        // TODO: call persistence layer to update
//        return new ResponseEntity<UserStock>>(newMember, HttpStatus.OK);
    }
    

}
