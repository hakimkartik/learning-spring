package com.kartik.lil.learningspring.data.repository;

import com.kartik.lil.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by kartik.hakim on 25/09/20
 */

@Repository
public interface RoomRepository extends CrudRepository<Room,Long> {
}
