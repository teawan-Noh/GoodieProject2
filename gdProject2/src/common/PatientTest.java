package common;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;

import dao.board.NoticeDao;
import dao.board.NoticeDaoImpl;
import dao.user.PatientDao;
import dao.user.PatientDaoImpl;
import model.board.Notice;
import model.user.Patient;

public class PatientTest {
	
	public static void main(String[] args) {
		
		Connection connection = JDBCUtil.getConnection();
		JDBCUtil.close(null, null, connection);
		
		//PatientDao dao = new PatientDaoImpl();
		//Patient patient = new Patient();
		
		/*patient.setId("asdf");
		patient.setPw("12341234a!");
		patient.setNickname("환자1");
		patient.setName("이름1");
		patient.setTel("010-1111-1111");
		patient.setBirth("1998-04-14");
		patient.setGender("여");
		patient.setEmail("email1@email.com");
		patient.setPostcode(11111);
		patient.setAddress("서울");
		patient.setAddress2("강동구");
		
		dao.insert(patient);*/
		
		//System.out.println(dao.login("asdf", "12345"));
		
		
		/*Patient patient = new Patient();
		
		patient.setPw("12341234");
		patient.setNickname("환자1");
		patient.setTel("010-9999-9999");
		patient.setEmail("sampleemail@email.com");
		patient.setPostcode(11111);
		patient.setAddress("부천");
		patient.setAddress2("신중동");
		patient.setPcode(8);
		dao.update(patient);*/
		
		//System.out.println(dao.selectByPcode(8));
		
		//dao.delete(8);
		
		//System.out.println(dao.selectByPcode(8));
		
		NoticeDao ndao = new NoticeDaoImpl();
		Notice notice = new Notice();
		
		/*notice.setMcode(1);
		notice.setTitle("테스트용 제목입니다");
		notice.setContent("테스트용 내용입니다");
		
		ndao.insert(notice);*/
		
		/*notice.setTitle("테스트용 제목입니다222");
		notice.setContent("테스트용 내용입니다222");
		notice.setNcode(16);
		
		ndao.update(notice);*/
		
		List<HashMap<String,Object>> list = ndao.selectAll();
		
		for (HashMap<String,Object> hashMap : list) {
			System.out.println(hashMap.get("title"));
		}
		
			
			
		
		//System.out.println(ndao.selectByNcode(16));
		
		
		
		
		
		
		
	}

	
}
