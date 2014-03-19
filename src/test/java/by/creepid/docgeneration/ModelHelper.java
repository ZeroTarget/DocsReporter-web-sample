package by.creepid.docgeneration;

import by.creepid.docgeneration.model.ConnectionType;
import by.creepid.docgeneration.model.FirmReg;

public final class ModelHelper {
	
	private ModelHelper(){
	}
	
	public static FirmReg createFirmRegSample(){
		FirmReg reg = new FirmReg();
		
		 reg.setType_connection(ConnectionType.offline);
		 reg.setGln("");
		 reg.setCompanyname("Unknown company"); 
		 reg.setLawtype("CEO");
		 reg.setStructural_affiliation("Some structural affiliation");
		 reg.setHeadorg("Mark James Black");
		 reg.setHeadorg_whereby_act("Some act");
		 reg.setEmployees_number("23");
		 reg.setLogo_file("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".getBytes());
		 reg.setDescription_activity("consult");
		 reg.setWeb_address("www.google.com");
		 reg.setPostcode("220123");
		 reg.setRegion(3l);
		 reg.setLocality("Some distinct");
		 reg.setStreet_type(4l);
		 reg.setStreet("Wall");
		 reg.setHouse_number("23");
		 reg.setCorps_number("2");
		 reg.setOffice_number("123");
		 reg.setService_bank("BelSwissBank");
		 reg.setService_bank_address("bank address, some street, some address");
		 reg.setCurrent_account("123567");
		 reg.setBank_code("567823");
		 reg.setUnp("456345463");
		 reg.setContact_name("John Tyler Green");
		 reg.setContact_position("Manager");
		 reg.setContact_phone("+375 17 260 92 29");
		 reg.setContact_email("coolmen@gmail.com");
		
		return reg;
	}
	

}