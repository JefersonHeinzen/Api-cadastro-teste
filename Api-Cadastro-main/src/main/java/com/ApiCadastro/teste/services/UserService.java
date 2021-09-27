package com.ApiCadastro.teste.services;

import com.ApiCadastro.teste.dto.UserDTO;
import com.ApiCadastro.teste.dto.UserInsertDTO;
import com.ApiCadastro.teste.services.exceptions.ServiceException;
import com.ApiCadastro.teste.entities.User;
import com.ApiCadastro.teste.repositories.UserRepository;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public List<UserDTO> findAll() {
		List<User> list = userRepository.findAll();
		return list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
	} 
	
	public UserDTO insert(UserInsertDTO dto) {
		User user = userRepository.findByEmail(dto.getEmail());
		if (user != null) {
			throw new ServiceException("Email já existe");

		}
		User obj = new User();
		obj.setCnpj(obj.getCnpj());
		obj.setName(dto.getName());
		obj.setEmail(dto.getEmail());
		obj.setPassword(passwordEncoder.encode(dto.getPassword()));
		
		obj = userRepository.save(obj);
		
		return new UserDTO(obj);
	}

	@PutMapping(value="/{id}")
	public ResponseEntity update(@PathVariable("id") long id,
								 @RequestBody User user) {
		return userRepository.findById(id)
				.map(record -> {
					record.setName(user.getName());
					record.setEmail(user.getEmail());
					User updated = userRepository.save(record);
					return ResponseEntity.ok().body(updated);
				}).orElse(ResponseEntity.notFound().build());

	}
	@DeleteMapping(path ={"/{id}"})
	public ResponseEntity <?> delete(@PathVariable long id) {
		return userRepository.findById(id)
				.map(record -> {
					userRepository.deleteById(id);
					return ResponseEntity.ok().build();
				}).orElse(ResponseEntity.notFound().build());
	}


	private Optional<User> verifyIfExists (Long id) {
		return userRepository.findById(id);
	}
}
