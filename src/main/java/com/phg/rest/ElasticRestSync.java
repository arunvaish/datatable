package com.phg.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phg.helper.Constent;
import com.phg.mode.es.Metadata;
import com.phg.service.ClinicalService;
import com.phg.service.MasterService;
import com.phg.service.es.MetaSearchService;

@RestController
@RequestMapping(Constent.PATH_META)
public class ElasticRestSync {

	private ClinicalService clinicalService;

	private MasterService masterService;

	private MetaSearchService metaSearchService;
	
	@Autowired
	public ElasticRestSync(ClinicalService clinicalService, MasterService masterService, MetaSearchService metaSearchService) {
		this.clinicalService = clinicalService;
		this.masterService = masterService;
		this.metaSearchService = metaSearchService;
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_1)
	public ResponseEntity<Metadata>  saveClinic1() {
		List<String> clinical = clinicalService.getAllByClinic1();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_1);
		metadata.setClinical1(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_2)
	public ResponseEntity<Metadata>  saveClinic2() {
		List<String> clinical = clinicalService.getAllByClinic2();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_2);
		metadata.setClinical2(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_3)
	public ResponseEntity<Metadata>  saveClinic3() {
		List<String> clinical = clinicalService.getAllByClinic3();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_3);
		metadata.setClinical3(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_4)
	public ResponseEntity<Metadata>  saveClinic4() {
		List<String> clinical = clinicalService.getAllByClinic4();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_4);
		metadata.setClinical4(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_5)
	public ResponseEntity<Metadata>  saveClinic5() {
		List<String> clinical = clinicalService.getAllByClinic5();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_5);
		metadata.setClinical5(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_6)
	public ResponseEntity<Metadata>  saveClinic6() {
		List<String> clinical = clinicalService.getAllByClinic6();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_6);
		metadata.setClinical6(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_7)
	public ResponseEntity<Metadata>  saveClinic7() {
		List<String> clinical = clinicalService.getAllByClinic7();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_7);
		metadata.setClinical7(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_8)
	public ResponseEntity<Metadata>  saveClinic8() {
		List<String> clinical = clinicalService.getAllByClinic8();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_8);
		metadata.setClinical8(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_9)
	public ResponseEntity<Metadata>  saveClinic9() {
		List<String> clinical = clinicalService.getAllByClinic9();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_9);
		metadata.setClinical9(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_10)
	public ResponseEntity<Metadata>  saveClinic10() {
		List<String> clinical = clinicalService.getAllByClinic10();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_10);
		metadata.setClinical10(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_11)
	public ResponseEntity<Metadata>  saveClinic11() {
		List<String> clinical = clinicalService.getAllByClinic11();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_11);
		metadata.setClinical11(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_12)
	public ResponseEntity<Metadata>  saveClinic12() {
		List<String> clinical = clinicalService.getAllByClinic12();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_12);
		metadata.setClinical12(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_13)
	public ResponseEntity<Metadata>  saveClinic13() {
		List<String> clinical = clinicalService.getAllByClinic13();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_13);
		metadata.setClinical13(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_14)
	public ResponseEntity<Metadata>  saveClinic14() {
		List<String> clinical = clinicalService.getAllByClinic14();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_14);
		metadata.setClinical14(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_CLINIC_15)
	public ResponseEntity<Metadata>  saveClinic15() {
		List<String> clinical = clinicalService.getAllByClinic15();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_CLINIC_15);
		metadata.setClinical15(clinical);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_MASTER_1)
	public ResponseEntity<Metadata>  saveMaster1() {
		List<String> master = masterService.getAllByMid1();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_MASTER_1);
		metadata.setMaster1(master);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_MASTER_2)
	public ResponseEntity<Metadata>  saveMaster2() {
		List<String> master = masterService.getAllByMid2();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_MASTER_2);
		metadata.setMaster2(master);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_MASTER_3)
	public ResponseEntity<Metadata>  saveMaster3() {
		List<String> master = masterService.getAllByMid3();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_MASTER_3);
		metadata.setMaster3(master);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_MASTER_4)
	public ResponseEntity<Metadata>  saveMaster4() {
		List<String> master = masterService.getAllByMid4();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_MASTER_4);
		metadata.setMaster4(master);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
	
	@PostMapping(Constent.PATH_SYNC + Constent.PATH_SYNC_MASTER_5)
	public ResponseEntity<Metadata>  saveMaster5() {
		List<String> master = masterService.getAllByMid5();
		Metadata metadata = new Metadata();
		metadata.setId(Constent.ES_INDEX_MASTER_5);
		metadata.setMaster5(master);
		metaSearchService.save(metadata);
		return new ResponseEntity<Metadata>(metadata, HttpStatus.OK);
	}
}
