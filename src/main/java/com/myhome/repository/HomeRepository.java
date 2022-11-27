package com.myhome.repository;

import com.myhome.entity.MyHome;
import org.springframework.data.repository.CrudRepository;

public interface HomeRepository extends CrudRepository<MyHome,Integer> {

    public MyHome findByHomeNo(int homeNo);
}
