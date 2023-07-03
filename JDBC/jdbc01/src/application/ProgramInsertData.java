package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ProgramInsertData {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "INSERT INTO seller" +
                            "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
                            "VALUES" +
                            "(?, ?, ?, ?, ?)"//serve para colocar os valores posteriormente
            );

            st.setString(1, "Pedro");//primeira ? substituido pelo valor que eu passar
            st.setString(2, "pedro@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("18/11/2001").getTime()));
            st.setDouble(4, 3000);
            st.setInt(5, 4);

            st.executeUpdate();
            System.out.println("Update Done");
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.getMessage();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
