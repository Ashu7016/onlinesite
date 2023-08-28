package com.Onlinesite.java.service;

import com.Onlinesite.java.dao.OnlineDao;
import com.Onlinesite.java.entity.OnlineEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class OnlineServiceImpl implements OnlineService {
        @Autowired
        private OnlineDao onlineDao;

        public OnlineServiceImpl(){

        }
        public OnlineServiceImpl(OnlineDao onlineDao){
            super();
            this.OnlineDao = onlineDao;
        }
}





