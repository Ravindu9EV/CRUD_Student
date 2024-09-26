package edu.icet.crm.service.impl;

import edu.icet.crm.dao.guardian.GuardianDAO;
import edu.icet.crm.repository.guardian.GuardianRepository;
import edu.icet.crm.service.GuardianService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GuardianServiceImpl implements GuardianService {


    private final GuardianRepository repository;
    @Override
    public void addGuardian(GuardianDAO guardianDAO) {
        repository.save(guardianDAO);
    }
}
