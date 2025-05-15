package com.jobportal.service;

import com.jobportal.dto.JobDTO;
import com.jobportal.exception.JobPortalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface JobService {

    JobDTO postJob(JobDTO jobDTO) throws Exception;

    List<JobDTO> getAlljobs();

    JobDTO getJob(Long id) throws JobPortalException;
}
