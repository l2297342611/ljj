package com.lj.neusoft.util;

import java.io.FileInputStream;
import java.sql.*;
import java.util.List;
import java.util.Properties;

public abstract class  ConnectionFactory<T> {

	private static String db_driver = null;
	private static String url = null;
	private static String user = null;
	private static String password = null;
	private static Connection connection =null;
	private static PreparedStatement pStatement = null;
	private static ResultSet rs = null;
	
	//注册驱动 获取连接
	static {
		try {
			Properties properties = new Properties();
			FileInputStream input = new FileInputStream("./src/main/resources/db.porperties");
			properties.load(input);
			
			db_driver = properties.getProperty("db_driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			
			Class.forName(db_driver);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
		public static Connection getConnection(){
			try {
				connection = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {

				e.printStackTrace();
			}
			return connection;
		}
		
	//设置参数
		public void setPram(PreparedStatement pStatement,Object[] object) throws Exception{
			if(null != object){
				for(int i = 0;i<object.length;i++){
					pStatement.setObject(i+1, object[i]);
				}
			}
		}
		
		//更新
		public int executeUpdate(String sql,Object object[]){
			 connection = ConnectionFactory.getConnection();
		
			try {
				pStatement = connection.prepareStatement(sql);
				this.setPram(pStatement,object);
				int rs = pStatement.executeUpdate();
				return rs;
			} catch (Exception e) {

				e.printStackTrace();
			}finally {
				try {
					closeConnection();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			return 0;	
		}
		
		//查询
		public List<T> executeQurey(String sql, Object[] objects) {
			 connection = ConnectionFactory.getConnection();
			 
			try {
				pStatement = connection.prepareStatement(sql);
				this.setPram(pStatement, objects);
				rs = pStatement.executeQuery();
			    return rsToList(rs);
				
			} catch (Exception e) {

				e.printStackTrace();
			}finally {
				try {
					closeConnection();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			return null;
		}

		//rs转换为集合
		public abstract  List<T> rsToList(ResultSet rs);
	
		//关闭资源
		public static void closeConnection() throws SQLException {
	        if(null != rs)
	            rs.close();
	        if(null != pStatement)
	           pStatement.close();
	        if(null != connection)
	            connection.close();
	    }
}
