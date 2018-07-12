package com.sdgl.service.onefei;

import com.sdgl.mapper.onefei.DjsTeMapper;
import com.sdgl.pojo.onefei.DjsTeExample;
import com.sdgl.pojo.onefei.TeamAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UntitledServiceImpl implements  UntitledService {

    @Autowired
    private DjsTeMapper djsTeMapper;

    @Override
    public TeamAll selectTeamAll(Integer id) {
        return djsTeMapper.selectTeamAll(id);
    }
}
