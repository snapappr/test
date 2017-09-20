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
@RequestMapping("/rest/br")
public class UserStockRestController
{

    @Autowired
    private UserStockDao userStockDao;


    

    @RequestMapping(value = "/p/{deviceid}", method = RequestMethod.POST)
    public ResponseEntity<UserStock> updateMember(@PathVariable("deviceid") String devId, 
    		@RequestBody UserStock userStock) {

       // cars.stream().forEach(c -> c.setMiles(c.getMiles() + 100));
    	userStockDao.register(userStock);
    	
       // return "redirect:/";
        
        // TODO: call persistence layer to update
        return new ResponseEntity<UserStock>(userStock, HttpStatus.OK);
    }
    


    @RequestMapping(value = "/lp/{sessid}/d{deviceid}", method = RequestMethod.POST)
    public ResponseEntity <List<UserStock>> updateMember(
    		@PathVariable("sessid") String sessId,
    		@PathVariable("deviceid") String devId, 
    		@RequestBody List<UserStock> userStocks) {

    	
    	if ((!devId.trim().equals(""))&&(sessId.equals(Utility.md5(devId))))
    	{
    		userStockDao.removeByAccountDeviceId(userStocks.get(0).getAccountName(),userStocks.get(0).getDeviceId());
    			
	    	for (int i = 0; i < userStocks.size(); i++) {
	    		userStockDao.register(userStocks.get(i));
			}
	    	
	    	
	       // return "redirect:/";
	        
	        // TODO: call persistence layer to update
	        return new ResponseEntity <List<UserStock>>(userStocks, HttpStatus.OK);
    	}
    	else return null;
    }


    @RequestMapping(value = "/r/a{accountid}/d{deviceid}", method = RequestMethod.GET)
    public ResponseEntity <List<UserStock>> retrieve(@PathVariable("deviceid") String devId, 
    		@PathVariable("accountid") String accountId) {
        // TODO: call persistence layer to update
        return new ResponseEntity <List<UserStock>>(userStockDao.findByAccountDeviceId(accountId, devId), HttpStatus.OK);
    }


    @RequestMapping(value = "/t{tryid}/{sessid}/a{accountid}/d{deviceid}", method = RequestMethod.GET)
    @ResponseBody
    public String retrieve(@PathVariable("sessid") String sessId, @PathVariable("deviceid") String devId, 
    		@PathVariable("accountid") String accountId, @PathVariable("tryid") String tryId) {
    	try {
    		return userStockDao.removeByAccountDeviceId("fd","fd")+" ";
    	}
    	catch (Exception e)
    	{
    		return "Exception :" + e.getMessage();
    	}
//    	return Utility.md5(accountId+"or"+devId);

    }
    
    @RequestMapping(value = "/r/{sessid}/a{accountid}/d{deviceid}", method = RequestMethod.GET)
    public ResponseEntity <List<UserStock>> retrieve(@PathVariable("sessid") String sessId, @PathVariable("deviceid") String devId, 
    		@PathVariable("accountid") String accountId) {
    	 if ((!sessId.trim().equals("")) && (sessId.equals(Utility.md5(accountId+"or"+devId))))
    			 return new ResponseEntity <List<UserStock>>(userStockDao.findByAccountDeviceId(accountId, devId), HttpStatus.OK);
    	 else return null;
    }
}
