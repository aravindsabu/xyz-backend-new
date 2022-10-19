package com.nestdigital.xyzbaclkendnew.app.dao;

import com.nestdigital.xyzbaclkendnew.app.model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {
}
