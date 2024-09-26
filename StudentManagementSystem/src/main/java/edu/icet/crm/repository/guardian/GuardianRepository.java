package edu.icet.crm.repository.guardian;

import edu.icet.crm.dao.guardian.GuardianDAO;
import org.springframework.data.repository.CrudRepository;

public interface GuardianRepository extends CrudRepository<GuardianDAO,Long> {

}
