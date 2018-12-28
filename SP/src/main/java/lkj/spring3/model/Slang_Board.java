package lkj.spring3.model;

import java.sql.Date;

public class Slang_Board {
	private long seq;
	private String title;
	private String writer;
	private String email;
	private String pwd;
	private String f_oname;
	private String f_savename;
	private long f_size;
	private Date rdate;
	private long rcount;
	
	public Slang_Board(){}
	public Slang_Board(long seq, String title, String writer, String email, String pwd, String f_oname,
			String f_savename, long f_size, Date rdate, long rcount) {
		super();
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.email = email;
		this.pwd = pwd;
		this.f_oname = f_oname;
		this.f_savename = f_savename;
		this.f_size = f_size;
		this.rdate = rdate;
		this.rcount = rcount;
	}
	public long getSeq() {
		return seq;
	}
	public void setSeq(long seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getF_oname() {
		return f_oname;
	}
	public void setF_oname(String f_oname) {
		this.f_oname = f_oname;
	}
	public String getF_savename() {
		return f_savename;
	}
	public void setF_savename(String f_savename) {
		this.f_savename = f_savename;
	}
	public long getF_size() {
		return f_size;
	}
	public void setF_size(long f_size) {
		this.f_size = f_size;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	public long getRcount() {
		return rcount;
	}
	public void setRcount(long rcount) {
		this.rcount = rcount;
	}
	
}
