package com.soroko.cktex.repository;

import com.soroko.cktex.entity.Number;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yuriy.soroko
 */
@Repository
public interface Repository implements JpaRepository<Integer, Number> {

}
