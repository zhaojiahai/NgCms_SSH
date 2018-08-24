package com.inspur.cmis.service;

import com.inspur.cmis.entity.PmClassEntity;

import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/16 21:59.
 * 描述： Pm类别
 * 作者： LiuLiHao
 */
public interface PmClassService extends BaseService<PmClassEntity> {

    List<PmClassEntity> findAll();

    void deleteAll(String deletes);
}
