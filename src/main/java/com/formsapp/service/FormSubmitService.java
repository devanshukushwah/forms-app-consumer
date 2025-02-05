package com.formsapp.service;

import com.formsapp.dto.SubmitDTO;
import com.formsapp.entity.FormSubmit;

/**
 * Service interface for managing form submissions.
 * <p>
 * This interface defines methods for handling form submissions, including adding a new submission,
 * retrieving submissions by form ID or submission ID, and retrieving form responses.
 * </p>
 */
public interface FormSubmitService {

    /**
     * Adds a new form submission.
     *
     * @param formSubmit the {@link FormSubmit} entity containing the form submission data
     * @return {@code true} if the submission was successfully added, {@code false} otherwise
     */
    Boolean addSubmit(SubmitDTO submitDto);
}
