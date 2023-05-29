package lk.ccs.model;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class Customer {
    private Integer cno;
    private String cname;
    private Float billAmount;
    private String[] items;
    private List<String> qualifications;
    private Set<Long> phoneNumbers;
    private Map<String,Object> idDetails;
    private Company company;
}
