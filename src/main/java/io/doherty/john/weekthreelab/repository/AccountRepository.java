package io.doherty.john.weekthreelab.repository;

import io.doherty.john.weekthreelab.model.Account;
import io.doherty.john.weekthreelab.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query("select o from OrderDetail o where o.account.accountId = ?1")
    List<OrderDetail> getAllOrders(Long id);


}
