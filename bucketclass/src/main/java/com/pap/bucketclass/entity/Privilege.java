package com.pap.bucketclass.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * privilege table : 권한 목록
 */
@Entity
@Table(name = "privilege")
public class Privilege implements GrantedAuthority, Serializable{

	//Primary Key
	@Id
	@Column(name = "privilege_id", nullable = false)
	private String privilegeId;
	
	//권한 이름
	@Column(name = "privilege_name", nullable = false)
	private String privilegeName;
	/*********************************************************************************/
	/*
	 * privilege -- [role_privilege] -- role
	 */
	@JsonIgnore
    @ManyToMany(mappedBy = "privileges")
    private Set<Role> roles = new HashSet<>();
	/*********************************************************************************/
	public String getPrivilegeId() {
		return privilegeId;
	}

	public void setPrivilegeId(String privilegeId) {
		this.privilegeId = privilegeId;
	}

	public String getPrivilegeName() {
		return privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String getAuthority() {
		return getPrivilegeName();
	}
	
}
