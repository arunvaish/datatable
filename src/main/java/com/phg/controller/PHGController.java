package com.phg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phg.model.DataManager;
import com.phg.model.DataTableFilter;
import com.phg.model.Master;
import com.phg.service.ClinicalService;
import com.phg.service.MasterService;

@Controller
public class PHGController {
	
	private ClinicalService clinicalService;
	
	private MasterService masterService;
	
	@Autowired
	public PHGController(ClinicalService clinicalService , MasterService masterService) {
		this.clinicalService = clinicalService;
		this.masterService = masterService;
	} 
	
	@RequestMapping(value = "/api/search/{col}/{key}" , method = RequestMethod.GET) 
	public ResponseEntity<List<String>> disVal(@PathVariable int col , @PathVariable String key) {	
		return new ResponseEntity<List<String>>(autoFillData(col, key), HttpStatus.OK);
	}

	@RequestMapping(value = "/masters" , method = RequestMethod.GET)
	public ResponseEntity<List<Master>> masters() {
		return new ResponseEntity<List<Master>>(masterService.findAll(), HttpStatus.OK);
	}
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String phgView() {
		return "phg";
	}
	
	
	@RequestMapping(value = "/records" , method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<DataManager> records(DataTableFilter filter) {
		DataManager dataManager = clinicalService.findClinicalList(filter);
		dataManager.setDraw(filter.getDraw());
		return new ResponseEntity<DataManager>(dataManager, HttpStatus.OK);
	}
	
	private List<String> autoFillData(int col, String key) {
		List<String> result = new ArrayList<String>();
		switch (col) {
		case 0:
			result = masterService.searchByMid1(key);
			break;
		
		case 1:
			result = masterService.searchByMid2(key);
			break;
			
		case 2:
			result = masterService.searchByMid3(key);
			break;
			
		case 3:
			result = masterService.searchByMid4(key);
			break;
			
		case 4:
			result = masterService.searchByMid5(key);
			break;
			
		case 5:
			result = clinicalService.searchByClinic1(key);
			break;
			
		case 6:
			result = clinicalService.searchByClinic2(key);
			break;
			
		case 7:
			result = clinicalService.searchByClinic3(key);
			break;
			
		case 8:
			result = clinicalService.searchByClinic14(key);
			break;
			
		case 9:
			result = clinicalService.searchByClinic15(key);
			break;
			
		case 10:
			result = clinicalService.searchByClinic6(key);
			break;
			
		case 11:
			result = clinicalService.searchByClinic7(key);
			break;
			
		case 12:
			result = clinicalService.searchByClinic8(key);
			break;
			
		case 13:
			result = clinicalService.searchByClinic9(key);
			break;
			
		case 14:
			result = clinicalService.searchByClinic10(key);
			break;
			
		case 15:
			result = clinicalService.searchByClinic11(key);
			break;
			
		case 16:
			result = clinicalService.searchByClinic12(key);
			break;
			
		case 17:
			result = clinicalService.searchByClinic13(key);
			break;
			
		case 18:
			result = clinicalService.searchByClinic14(key);
			break;
			
		case 19:
			result = clinicalService.searchByClinic15(key);
			break;

		default:
			break;
		}
		return result;
	}
}
