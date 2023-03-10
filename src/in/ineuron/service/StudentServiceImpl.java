package in.ineuron.service;

import in.ineuron.dao.IStudentDao;
import in.ineuron.dto.Student;
import in.ineuron.factory.StudentDaoFactory;

public class StudentServiceImpl implements IStudentService
{
	private IStudentDao studentDao;

	@Override
	public String save(Student student)
	{
		// C8: recieving student Object from the controller to servcie
		System.out.println("Student Object reached inside StudentServiceImpl  - CREATE");

		// C9: Object creation of StudentDaoImpl
		studentDao = StudentDaoFactory.getStudentDao();

		// C10: passing student object to DAO layer
		return studentDao.save(student);
	}

	@Override
	public Student findById(Integer sid)
	{
		System.out.println("StudentServiceImpl.findById() .......\n");

		studentDao = StudentDaoFactory.getStudentDao();

		return studentDao.findById(sid);
	}

	@Override
	public String updateById(Student student)
	{
		System.out.println("StudentServiceImpl.updateById(student)..........\n");
		studentDao = StudentDaoFactory.getStudentDao();

		return studentDao.updateById(student);
	}

	@Override
	public String deleteById(Integer sid)
	{
		// : recieving sid from the controller to servcie

		// Object creation of StudentDaoImpl
		studentDao = StudentDaoFactory.getStudentDao();

		// passing sid to DAO layer
		return studentDao.deleteById(sid);

	}

}
