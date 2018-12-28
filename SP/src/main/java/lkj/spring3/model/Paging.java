package lkj.spring3.model;

import java.sql.Date;

public class Paging {
	private long seq;
	private String subject;
	private Date rDate;
	
	public Paging() {}
	public Paging(long seq, String subject, Date rDate) {
		this.seq = seq;
		this.subject = subject;
		this.rDate = rDate;
	}
	
	public long getSeq() {
		return seq;
	}
	public void setSeq(long seq) {
		this.seq = seq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Date getrDate() {
		return rDate;
	}
	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}
	@Override
	public String toString() {
		return "Paging=? subject : "+subject+" , rDate : "+rDate;
	}
}
