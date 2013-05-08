package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class Post_thread extends Model {
  @Id
  public Long id;
  @Required
  public String header;

  public String excerpt;

  public String image_loc;

  public String author;

  public String interest;

  @Lob
  @Basic(fetch = FetchType.EAGER)
  public String content;

  public MyData mydata;

  public Book book;

  @OneToOne
  @JoinColumn(name="User_UserId")
  public User user;

  public static Finder<Long,Post_thread> find = new Finder<Long,Post_thread>(
    Long.class, Post_thread.class
  );

public static List<Post_thread> all()
{
  return find.order().desc("id")
    .fetch("user")
    .setMaxRows(8)
    .findList();
}

public static List<Post_thread> all(String usrInterest)
{
  return find.where().eq("interest",usrInterest).order().desc("id")
    .fetch("user")
    .setMaxRows(8)
    .findList();
}

public static Post_thread getById(Long id)
{
  return find.byId(id);
}

public String returnContent()
{
	return content;
}

public static void saveNew(String myThread, Post_thread newThread, String expt, Long userId)
{
	newThread.excerpt = expt + "...";
	newThread.user = User.getById(userId);
	newThread.save();
}
}