package kz.nurdev.fraud.service;

import kz.nurdev.fraud.model.FraudCheckHistory;
import kz.nurdev.fraud.repository.FraudCheckRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckRepository fraudCheckRepository;

    public boolean isFraudulentCustomer(Integer customerId){
        fraudCheckRepository.save(FraudCheckHistory.builder()
                .customerId(customerId)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build());

        return false;
    }

}
