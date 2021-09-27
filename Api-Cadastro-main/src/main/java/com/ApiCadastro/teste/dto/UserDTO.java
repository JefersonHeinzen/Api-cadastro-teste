package com.ApiCadastro.teste.dto;

import com.ApiCadastro.teste.entities.User;

public class UserDTO {

	private Long id;
	private String name;
	private String email;
	private String cnpj;

	public UserDTO() {
	}

	public UserDTO(Long id, String name, String email,String cnpj) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;

		this.cnpj = cnpj;
	}

	public UserDTO(User entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.email = entity.getEmail();
		this.cnpj = entity.getCnpj();
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}