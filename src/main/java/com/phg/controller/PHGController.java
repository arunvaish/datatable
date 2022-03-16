package com.phg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phg.helper.Constent;
import com.phg.mode.es.Metadata;
import com.phg.model.DataManager;
import com.phg.model.DataTableFilter;
import com.phg.model.Master;
import com.phg.service.ClinicalService;
import com.phg.service.MasterService;
import com.phg.service.es.MetaSearchService;

@Controller
public class PHGController {
	
	private ClinicalService clinicalService;
	
	private MasterService masterService;
	
	private MetaSearchService metaSearchService;
	
	@Autowired
	public PHGController(ClinicalService clinicalService , MasterService masterService, MetaSearchService metaSearchService) {
		this.clinicalService = clinicalService;
		this.masterService = masterService;
		this.metaSearchService = metaSearchService;
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
		Metadata fetch = null;
		switch (col) {
		case 0:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_MASTER_1);
			if(fetch != null) {
				result = fetch.getMaster1().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = masterService.searchByMid1(key);
			}
			break;
		
		case 1:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_MASTER_2);
			System.out.println(fetch);
			if(fetch != null) {
				result = fetch.getMaster2().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = masterService.searchByMid2(key);
			}
			break;
			
		case 2:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_MASTER_3);
			if(fetch != null) {
				result = fetch.getMaster3().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = masterService.searchByMid3(key);
			}
			break;
			
		case 3:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_MASTER_4);
			if(fetch != null) {
				result = fetch.getMaster4().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = masterService.searchByMid4(key);
			}
			break;
			
		case 4:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_MASTER_5);
			if(fetch != null) {
				result = fetch.getMaster5().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = masterService.searchByMid5(key);
			}
			break;
			
		case 5:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_1);
			if(fetch != null) {
				result = fetch.getClinical1().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic1(key);
			}
			break;
			
		case 6:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_2);
			if(fetch != null) {
				result = fetch.getClinical2().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic2(key);
			}
			break;
			
		case 7:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_3);
			if(fetch != null) {
				result = fetch.getClinical3().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic3(key);
			}
			break;
			
		case 8:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_4);
			if(fetch != null) {
				result = fetch.getClinical4().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic4(key);
			}
			break;
			
		case 9:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_5);
			if(fetch != null) {
				result = fetch.getClinical5().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic5(key);
			}
			break;
			
		case 10:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_6);
			if(fetch != null) {
				result = fetch.getClinical6().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic6(key);
			}
			break;
			
		case 11:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_7);
			if(fetch != null) {
				result = fetch.getClinical7().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic7(key);
			}
			break;
			
		case 12:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_8);
			if(fetch != null) {
				result = fetch.getClinical8().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic8(key);
			}
			break;
			
		case 13:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_9);
			if(fetch != null) {
				result = fetch.getClinical9().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic9(key);
			}
			break;
			
		case 14:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_10);
			if(fetch != null) {
				result = fetch.getClinical10().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic10(key);
			}
			break;
			
		case 15:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_11);
			if(fetch != null) {
				result = fetch.getClinical11().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic11(key);
			}
			break;
			
		case 16:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_12);
			if(fetch != null) {
				result = fetch.getClinical12().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic12(key);
			}
			break;
			
		case 17:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_13);
			if(fetch != null) {
				result = fetch.getClinical13().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic13(key);
			}
			break;
			
		case 18:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_14);
			if(fetch != null) {
				result = fetch.getClinical14().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic14(key);
			}
			break;
			
		case 19:
			fetch = metaSearchService.fetch(Constent.ES_INDEX_CLINIC_15);
			if(fetch != null) {
				result = fetch.getClinical15().stream()
					      .filter(str -> str.toLowerCase().trim().contains(key.toLowerCase()))
					      .collect(Collectors.toList());
			} else {
				result = clinicalService.searchByClinic15(key);
			}
			break;

		default:
			break;
		}
		return result;
	}
}
