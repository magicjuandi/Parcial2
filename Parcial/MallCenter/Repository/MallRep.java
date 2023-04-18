package com.Parcial.MallCenter.Repository;

import java.io.IOException;
import java.util.List;

import com.Parcial.MallCenter.Model.MallCenter;

public interface MallRep {
    MallCenter findbyid(int id);
    List<MallCenter> findAll()throws IOException, ClassNotFoundException;
    void save(MallCenter mallCenter)throws IOException;
    void update(MallCenter mallCenter)throws IOException;
    void delete(MallCenter mallCenter)throws IOException;
}
