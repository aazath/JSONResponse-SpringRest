package lk.ccs.controller;

import lk.ccs.model.Company;
import lk.ccs.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @GetMapping("/report/{id}")
    public ResponseEntity<Customer>  getAllCustomer(@PathVariable Integer id){
        System.out.println("Customer data for the ID  "+id);
        Customer customer = new Customer();

        customer.setCno(id);
        customer.setCname("Aazath");
        customer.setBillAmount(5690.8F);
        customer.setItems(new String[]{"Banana","Sugar","Rice"});
        customer.setQualifications(List.of("O/L","A/L","BIT"));
        customer.setPhoneNumbers(Set.of(752861246L,767226676L,761255252L));
        customer.setIdDetails(Map.of("nic",198404902345L,  "pp","N894920457"));
        customer.setCompany(new Company("CCS","Kalmunai", 40));

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }


    @PostMapping("/save")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
        System.out.println(customer);
        Integer id = 19;
        String body ="Customer registered with the ID "+id;
        return new ResponseEntity<>(body,HttpStatus.OK);
    }
}
