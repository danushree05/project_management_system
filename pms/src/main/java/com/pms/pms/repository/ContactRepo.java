// package com.pms.pms.repository;

// public class ContactRepo {
    
// }
package com.pms.pms.repository;

import com.pms.pms.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ContactRepo extends JpaRepository<Contact,Long> {
    // You can define custom query methods if needed
}
