package model;
// Generated 2017-6-27 10:42:03 by Hibernate Tools 3.6.0.Final

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private int userid;
	private int username;

	public User() {
	}

	public User(int userid, int username) {
		this.userid = userid;
		this.username = username;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getUsername() {
		return this.username;
	}

	public void setUsername(int username) {
		this.username = username;
	}

}
