package com.soroko.cktex.repository;

import com.soroko.cktex.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yuriy.soroko
 */
@Repository
public interface DataRepository extends JpaRepository<Request, Integer> {

}
