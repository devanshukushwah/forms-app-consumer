package com.formsapp.repository;

import com.formsapp.entity.FormSubmit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for interacting with the `FormSubmit` entity.
 * <p>
 * This interface extends {@link JpaRepository}, providing CRUD operations and custom query methods for the `FormSubmit` entity.
 * </p>
 */
@Repository
public interface FormSubmitRepository extends JpaRepository<FormSubmit, Long> {
}
