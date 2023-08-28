package com.Onlinesite.java.dao;

import com.Onlinesite.java.entity.OnlineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OnlineDao extends JpaRepository<OnlineEntity,Long> {
}
