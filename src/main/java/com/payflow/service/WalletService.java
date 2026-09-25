package com.payflow.service;

import org.springframework.stereotype.Service;

import com.payflow.entity.Wallet;
import com.payflow.repository.WalletRepository;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet findByUserId(Long userId) {
        return walletRepository.findByUserId(userId)
                .orElseThrow(() -> new IllegalArgumentException("Carteira não encontrada"));
    }
}