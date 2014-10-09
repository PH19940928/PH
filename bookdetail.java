package ac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class bookdetail  {
	   private String ISBN;
	   private String Title;
	   private String AuthorID;
	   private String Publisher;
	   private String PublishDate;
	   private String Price;
	public String execute() {
	      String ret = "error";
	      Connection conn = null;

	      try {
	         String URL = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_phtushusousuo";
	         Class.forName("com.mysql.jdbc.Driver");
	         conn = DriverManager.getConnection(URL, "kzzl1z1wk2", "4zhhwj2m4lhky320mj4kz1y1xhx0m54iyl125xxk");
	         String sql = "SELECT * FROM book WHERE";
	         sql+=" Title = ?";
	         PreparedStatement ds = conn.prepareStatement(sql);
	         ds.setString(1, Title);
	         System.out.println(Title);
	         ResultSet rs = ds.executeQuery();
	         while (rs.next()) {
	        	 ISBN = rs.getString(1);
	        	 System.out.println(ISBN);
	        	 Title = rs.getString(2);
	        	 System.out.println(Title);
	        	 Publisher = rs.getString(4);
	        	 System.out.println(Publisher);
	        	 PublishDate = rs.getString(5);
	        	 System.out.println(PublishDate);
	        	 Price = rs.getString(6);
	        	 System.out.println(Price); 
	         } 
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
	      ret = "success";
	      return ret;
	   }

	   public String getISBN() {
	      return ISBN;
	   }

	   public void setISBN(String ISBN) {
	      this.ISBN = ISBN;
	   }

	   public String getTitle() {
	      return Title;
	   }

	   public void setTitle(String Title) {
	      this.Title = Title;
	    }

	   public String getAuthorID() {
	      return AuthorID;
	 }

	   public void setAuthorID(String AuthorID) {
	      this.AuthorID = AuthorID;
	   }
	   public String getPublisher() {
		      return Publisher;
		   }

		   public void setPublisher(String Publisher) {
		      this.Publisher = Publisher;
		   }
		   public String getPublishDate() {
			      return PublishDate;
			   }

			   public void setPublishDate(String PublishDate) {
			      this.PublishDate = PublishDate;
			   }
			   public String getPrice() {
				      return Price;
				   }

				   public void setPrice(String Price) {
				      this.Price = Price;
				   }
				  
	}
