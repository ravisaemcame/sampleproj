package com.example.demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
		@Id
		private int userid;
		private String username;
		private String email;
		public User(int userid, String username, String email) {
			super();
			this.userid = userid;
			this.username = username;
			this.email = email;
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		

}
