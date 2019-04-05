package com.capgemini.spring.organization.model;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.PropertySource;

	@Component
	@PropertySource("dbconfig.properties")
	public class Organization {

	@Value("100")
	private int orgId;

	@Value("Capgemini")
	private String orgName;

	@Value("2000")
	private double marketPrice;

	@Value("{'${listDirectors}'}")
	private List<String> directors;

	@Value("{'${setBranches}'}")
	private Set<String> branches;

	@Value("#{${valuesMap}}")
	private Map<String, String> branchWiseHead;

	@Value("${ipAddr}")
	private Properties ipAddresses;

	@Value("${dbName},${username},${password}")
	private Properties databaseDetails;

	@Autowired
	private Address address;

	@Override
	public String toString(){
		return "Orgnization Id:" +orgId+ "\n"
			+"Organization name:" +orgName+ "\n"
			+"Market Price:" +marketPrice+ "\n"
			+"Address:"+address+ "\n"
			+"Directors:" +directors+ "\n"
			+"Branches:" +branches+ "\n"
			+"Branch Wise Head:" +branchWiseHead+ "\n"
			+"IpAddresses:" +ipAddresses+ "\n"
			+"Database Details:" +databaseDetails;

	}
	
	public String show()
	{
		return address.toString();
	}
}