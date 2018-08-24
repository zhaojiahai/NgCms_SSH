package com.inspur.cmis.dao;

import com.inspur.cmis.entity.PmClassEntity;

/**
 * Created by LiuLiHao on 2018/8/16 21:44.
 * 描述： Pm类别
 * 作者： LiuLiHao
 */
public interface PmClassDao extends BaseDao<PmClassEntity>{

    int deleteAll(String deletes);
}
