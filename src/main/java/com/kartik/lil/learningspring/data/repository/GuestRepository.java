package com.kartik.lil.learningspring.data.repository;

import com.kartik.lil.learningspring.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kartik.hakim on 27/09/20
 */
@Repository
public interface GuestRepository extends CrudRepository<Guest,Long> {
}
