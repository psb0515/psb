import java.sql.*;

public class Main {

    public static void main(String[] args)
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("oracle.jdbc.driver.OracleDriver를 찾을 수 없습니다.");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }finally{
            System.out.println("성공!!");
        }
        String DB_URL = "jdbc:oracle:thin:@175.117.169.207:1521:SOULDB";
        String DB_USER = "c##psb";
        String DB_PASSWORD = "psb";

        Connection conn = null;
        try {
            // 데이터베이스의 연결을 설정한다.
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        } catch ( Exception e ) {
            e.printStackTrace();
        }

        if(conn != null)
            System.out.println("연결성공");
        else
            System.out.println("연결실패");
    }
}
ㅅㄷㄴ
c vcxv