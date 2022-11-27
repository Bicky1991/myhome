package com.myhome.service;

import com.myhome.entity.MyHome;
import com.myhome.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    HomeRepository homeRepository;

    public List<MyHome> getAll()
    {
        List<MyHome> homes =(List<MyHome>) homeRepository.findAll();
        return homes;
    }

    public MyHome createHome(MyHome myHome)
    {
        MyHome home = homeRepository.save(myHome);
        return home;
    }

    public MyHome updateHome( MyHome myHome,int homeId)
    {
            myHome = homeRepository.save(myHome);
            return myHome;
    }

    public void deleteHome(int homeId)
    {
        homeRepository.deleteById(homeId);
    }
}
