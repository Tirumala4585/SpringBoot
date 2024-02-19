package spring.SpringDemo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapplication.bankservices.BankService;
import com.bankapplication.model.Bank;

@RestController
@RequestMapping("/api/bank")	
public class Demo {
	    private BankService bankservices;
	    public Demo(BankService bankservices) {
	    	super();
	    	this.bankservices=bankservices;
	    }

    @PostMapping()
    public ResponseEntity<Bank> saveBank(@RequestBody Bank bank){
    	
    	return new ResponseEntity<Bank>(bankservices.saveBank(bank),HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<Bank> getBankById(@PathVariable("id") int user_id){
		return new ResponseEntity<Bank>(bankservices.getBankById(user_id), HttpStatus.OK);
	}
	

}
