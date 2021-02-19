/**
 * 
 */
package com.sk.SpringMongodb.entity.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author shifa kaushar
 *
 */

@Document
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class StudentInfo {
	
	@NonNull
	   @Id
	private String id;
	
     @NonNull
  
	 private Integer sno;
     
     @NonNull
	 private String sname;
     
	 private String sadd;
	
	 private Float sfee;
	
	 
	 /**
	 * @return the sno
	 */
	public Integer getSno() {
		return sno;
	}
	/**
	 * @param sno the sno to set
	 */
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the sadd
	 */
	public String getSadd() {
		return sadd;
	}
	/**
	 * @param sadd the sadd to set
	 */
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	/**
	 * @return the sfee
	 */
	public Float getSfee() {
		return sfee;
	}
	/**
	 * @param sfee the sfee to set
	 */
	public void setSfee(Float sfee) {
		this.sfee = sfee;
	}
	@Override
	public String toString() {
		return "StudentInfo [sid=" + id + ", sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", sfee=" + sfee
				+ "]";
	}
	
	
}
