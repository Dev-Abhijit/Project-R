package models;

import java.util.*;
import play.db.ebean.*;
import javax.validation.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class User extends Model {
  @Id
  @OneToOne(optional=true, mappedBy="user")
  public Long userId;

  public String name;

  @Required
  @Email
  public String username;
  @Required
  public String password;


  public String interest;

  public static Finder<Long,User> find = new Finder<Long,User>(
    Long.class, User.class
  );

public static List<User> all()
{
  return find.all();
}
public static User getById(Long id)
{
  return find.byId(id);
}

public static Long getIdByUsername(String usrname)
{
  List<User> userData =  find.where().eq("username", usrname).findList();
    for(User user:userData)
    {
		return user.userId;
	}

	return null;
}

public static boolean validate(String username, String usrPassword)
{
	if(username == null || usrPassword == null || username == "" || usrPassword == "")
	{
		return false;
	}
  List<User> userData = find.where()
    .eq("username", username)
    .findList();
    for(User user:userData)
    {
		if(user.password.equals(usrPassword))
		{
			return true;
		}
	}

	return false;
}

public static void createNew(User user)
{
	user.name = user.username;
	user.save();
}

public String getUsername()
{
	return username;

}

public String getName()
{
	return name;

}

public void setUsername(String user_name)
{
	username = user_name;
}
public Long getUserId()
{
	return userId;

}
public void setUserId(Long userid)
{
	userId = userid;
}

public String getPassword()
{
	return password;

}

public void setPassword(String passwd)
{
	password = passwd;
}


}