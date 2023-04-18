package com.Parcial.MallCenter.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.Parcial.MallCenter.Model.MallCenter;

public class MallRepImp implements MallRep {

    private List<MallCenter> malls;

    public MallRepImp() throws IOException, ClassNotFoundException{
        malls = new ArrayList<>();
    }

    @Override
    public MallCenter findbyid(int id) {
        return malls.stream()
            .filter(mallCenter -> mallCenter.getId() == id)
            .findFirst()
            .orElse(null);
    }

    @Override
    public List<MallCenter> findAll() throws IOException, ClassNotFoundException {
        malls = (List<MallCenter>) MallSer.reader("mall.ax");
        return malls;
    }

    @Override
    public void save(MallCenter mallCenter) throws IOException {
        this.malls.add(mallCenter);
        MallSer.writer(this.malls, "mall.ax");
    }

    @Override
    public void update(MallCenter mallCenter) throws IOException {
        MallCenter oldmall = findbyid(mallCenter.getId());
        if(oldmall != null){
            malls.remove(oldmall);
            malls.add(mallCenter);
        }
        MallSer.writer(this.malls,"mall.ax");
    }

    @Override
    public void delete(MallCenter mallCenter) throws IOException {
        this.malls.remove(mallCenter);
        MallSer.writer(this.malls, "mall.ax");
    }
    
}
