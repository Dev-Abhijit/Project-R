package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class Library_meta extends Model {

  public Long userId;

  @Id
  public Long Id;

  public String name;

  public String detail;

  public Book book;

  public static Finder<Long,Library_meta> find = new Finder<Long,Library_meta>(
    Long.class, Library_meta.class
  );

public static List<Library_meta> all()
{
  return find.all();
}

public static Library_meta getById(Long id)
{
  return find.byId(id);
}

public static List<Library_meta> getAllByUserName(String userName)
{
  return find.where().eq("userId", User.getIdByUsername(userName)).order("Id").findList();
}


public static void saveNew(Long userId, Library_meta newShelf)
{
	newShelf.userId = userId;
	newShelf.save();
}

}