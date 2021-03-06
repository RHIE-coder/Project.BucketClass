package com.pap.bucketclass.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * role table : 역할 목록
 */
@Entity
@Table(name = "role")
public class Role implements Serializable {
	
	//Primary Key
	@Id
	@Column(name = "role_id", nullable = false)
	private String roleId;
	
	//역할 이름
	@Column(name = "role_name", nullable = false)
	private String roleName;
	/*********************************************************************************/
	/*
	 * role -- [role_privilege] -- privilege
	 */
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "role_privilege",
			joinColumns = @JoinColumn(name = "role_id"),
			inverseJoinColumns = @JoinColumn(name = "privilege_id")
			)
	private Set<Privilege> privileges = new HashSet<>();
	
	/*
	 * role -- [member_role] -- member
	 */
	@JsonBackReference
    @ManyToMany(mappedBy = "roles")
    private Set<Member> member = new HashSet<>();
    /*********************************************************************************/
	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}

	public Set<Member> getMember() {
		return member;
	}

	public void setMember(Set<Member> member) {
		this.member = member;
	}
	
}
