package com.opokaynow.barber_client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opokaynow.barber_client.entity.Cliente;

public interface ClientRepository extends JpaRepository<Cliente,Long>{

}
