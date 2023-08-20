package edu.tarumt.choojun.schooltimetabling.persistence;

import java.util.List;

import edu.tarumt.choojun.schooltimetabling.domain.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import edu.tarumt.choojun.schooltimetabling.domain.Timeslot;

public interface TimeslotRepository extends CrudRepository<Timeslot, Long>, PagingAndSortingRepository<Timeslot, Long>
{

	@Override
	List<Timeslot> findAll();

}
