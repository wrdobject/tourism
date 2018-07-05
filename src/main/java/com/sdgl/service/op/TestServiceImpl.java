package com.sdgl.service.op;


import com.sdgl.mapper.op.TestMapper;
import com.sdgl.pojo.op.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public dept get() {
        return testMapper.get();
    }
}
