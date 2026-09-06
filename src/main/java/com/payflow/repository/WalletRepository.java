package com.payflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payflow.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {

}