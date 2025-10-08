package com.learn.classPortal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.classPortal.entity.Event;
import com.learn.classPortal.projection.EventProjection;

@CrossOrigin
@RepositoryRestResource(path = "event" , excerptProjection = EventProjection.class)
public interface EventRepository extends JpaRepository<Event, Integer> {

}
