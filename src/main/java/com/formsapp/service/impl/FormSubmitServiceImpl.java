package com.formsapp.service.impl;

import com.formsapp.dto.SubmitDTO;
import com.formsapp.entity.FormSubmit;
import com.formsapp.mapper.SubmitMapper;
import com.formsapp.repository.FormSubmitRepository;
import com.formsapp.service.FormSubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormSubmitServiceImpl implements FormSubmitService {

    @Autowired
    private FormSubmitRepository formSubmitRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean addSubmit(SubmitDTO submitDto) {
        FormSubmit formSubmit = SubmitMapper.dtoToEntity(submitDto);
        if (formSubmit.getAnswers() != null) {
            formSubmit.getAnswers().forEach((answer) -> answer.setFormSubmit(formSubmit));
        }
        FormSubmit save = formSubmitRepository.save(formSubmit);
        return save.getSubId() != null;
    }

}
