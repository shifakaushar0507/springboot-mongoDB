/**
 * 
 */
package com.sk.SpringMongodb.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author shifa kaushar
 *
 */

@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NonNull
	 private Integer sno;
    
    @NonNull
	 private String sname;
	 private String sadd;
	 private Float sfee;
	 
	 
	


	@Override
	public String toString() {
		return "StudentDTO [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", sfee=" + sfee + "]";
	}


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
	

}
