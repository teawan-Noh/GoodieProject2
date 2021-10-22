package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Patient;

public class PatientDaoImpl implements PatientDao{

	@Override
	public void insert(Patient patient) {
		Connection connection = null;
		PreparedStatement pStatement = null;

		try {
			connection = JDBCUtil.getConnection();
			pStatement = connection.prepareStatement(Sql.PATIENT_INSERT_SQL);

			pStatement.setString(1, patient.getId());
			pStatement.setString(2, patient.getPw());
			pStatement.setString(3, patient.getNickname());
			pStatement.setString(4, patient.getName());
			pStatement.setString(5, patient.getTel());
			pStatement.setString(6, patient.getBirth());
			pStatement.setString(7, patient.getGender());
			pStatement.setString(8, patient.getEmail());
			pStatement.setInt(9, patient.getPostcode());
			pStatement.setString(10, patient.getAddress());
			pStatement.setString(11, patient.getAddress2());

			pStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(null, pStatement, connection);
		}
		
	}

	@Override
	public int selectCntById(String id) {
		int cnt = 1;
		
		Connection connection = null;
		PreparedStatement pStatement = null;
		ResultSet resultSet = null;

		try {
			connection = JDBCUtil.getConnection();
			pStatement = connection.prepareStatement(Sql.PATIENT_SELECT_CNT_BY_ID_SQL);

			pStatement.setString(1, id);

			resultSet = pStatement.executeQuery();

			if (resultSet.next()) {
				cnt=resultSet.getInt("cnt");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(resultSet, pStatement, connection);
		}
		return cnt;
	}

	@Override
	public void update(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int pcode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Patient login(String id, String pw) {
		// TODO Auto-generated method stub
		return null;
	}

}
