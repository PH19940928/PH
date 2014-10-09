package ac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class deletebook  {
   private String Title;
   public String execute() {
      String ret = "error";
      Connection conn = null;

      try {
         String URL = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_phtushusousuo";
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(URL, "kzzl1z1wk2", "4zhhwj2m4lhky320mj4kz1y1xhx0m54iyl125xxk");
         String sql = "delete from book  where ";
         sql+=" Title = ?";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, Title);
         int rs = ps.executeUpdate();
         ret = "success";
         }
      catch (Exception e) {
        ret = "error";
     } 
       finally {
          if (conn != null) {
             try {
               conn.close();
             } 
             catch (Exception e) {
             }
          }
      }
      return ret;
   }
   public String getTitle() {
      return Title;
   }

   public void setTitle(String Title) {
      this.Title = Title;
    }

}