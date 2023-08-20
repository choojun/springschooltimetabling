package edu.tarumt.choojun.schooltimetabling.persistence;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import edu.tarumt.choojun.schooltimetabling.domain.Lesson;

public interface LessonRepository extends CrudRepository<Lesson, Long>, PagingAndSortingRepository<Lesson, Long>
{

	@Override
	List<Lesson> findAll();

}
