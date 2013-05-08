package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class Opinion extends Model {
  @Id
  public Long id;
  @Required
  public String value;

  public String timestamp;

  @OneToOne
  @JoinColumn(name="User_UserId")
  public User user;

  @OneToOne
  @JoinColumn(name="OpinionDetails_Id")
  public OpinionDetails opiniondetails;


  public static Finder<Long,Opinion> find = new Finder<Long,Opinion>(
    Long.class, Opinion.class
  );


public static void saveNew(Opinion op)
{
	op.save();
}

public static List<Opinion> getUserVote(Long opId, Long userId)
{
    List<Opinion> userOpinion = find.where()
    .eq("user.userId", userId)
    .eq("opiniondetails.id", opId)
    .findList();

    return userOpinion;
}

public static int getAgreeCount(Long opId)
{
    int countAgree = find.where()
    .eq("value", "agree")
    .eq("opiniondetails.id", opId)
    .findRowCount();

    return countAgree;
}

public static int getDisagreeCount(Long opId)
{
    int countDisagree = find.where()
    .eq("value", "disagree")
    .eq("opiniondetails.id", opId)
    .findRowCount();

    return countDisagree;
}

public static List<Opinion> getAllUserOpinion(Long userId)
{
     return find.where().eq("user.userId",userId).order().desc("id")
    .setMaxRows(10)
    .findList();
}



}