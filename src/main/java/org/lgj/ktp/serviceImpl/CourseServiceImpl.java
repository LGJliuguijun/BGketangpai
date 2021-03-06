package org.lgj.ktp.serviceImpl;

import java.util.List;

import org.lgj.ktp.dao.CourseMapper;
import org.lgj.ktp.dto.EditCourseDTO;
import org.lgj.ktp.entity.Course;
import org.lgj.ktp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	CourseMapper courseMapper;

	@Override
	public boolean addCourse(Course course) {
		return courseMapper.addCourse(course) > 0;
	}

	@Override
	public Course getCourseById(String id) {
		return courseMapper.getCourseById(id);
	}

	@Override
	public List<Course> showCourse(String id) {
		return courseMapper.showCourse(id);
	}

	@Override
	public boolean editCourse(EditCourseDTO editCourseDTO) {
		return courseMapper.editCourse(editCourseDTO) > 0;
	}

	@Override
	public List<Course> getAllCourse(String teacherId) {
		return courseMapper.getAllCourse(teacherId);
	}

	@Override
	public List<String> getStuMember(String courseId) {
		return courseMapper.getStuMember(courseId);
	}

	@Override
	public List<String> getTeaMember(String courseId) {
		return courseMapper.getTeaMember(courseId);
	}

}
