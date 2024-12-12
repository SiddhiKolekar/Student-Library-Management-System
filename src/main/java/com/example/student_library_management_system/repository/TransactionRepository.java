package com.example.student_library_management_system.repository;

import com.example.student_library_management_system.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //it does the database operation
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
