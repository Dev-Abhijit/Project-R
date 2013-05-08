package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class OpinionDetails extends Model {
  @Id
  public Long id;
  @Required
  public String subject;
  @Required
  public String visibility;

  public String category;

  public String location;

  public String timestamp;

  public String media;

  @OneToOne
  @JoinColumn(name="User_UserId")
  public User user;

  public static Finder<Long,OpinionDetails> find = new Finder<Long,OpinionDetails>(
    Long.class, OpinionDetails.class
  );

public static List<OpinionDetails> all()
{
  return find.order().desc("id")
    .fetch("user")
    .setMaxRows(8)
    .findList();
}


public static OpinionDetails getById(Long id)
{
  return find.byId(id);
}

public static List<OpinionDetails> getUserParticipated(Long userId)
{
	List<Opinion> userOps = Opinion.getAllUserOpinion(userId);
	List<OpinionDetails> opDets;
	List<OpinionDetails> results = new ArrayList();

	for(Opinion op: userOps)
	{
		System.out.println("Id" + op.opiniondetails.id);
		opDets = find.where().eq("id",op.opiniondetails.id).order().desc("id").fetch("user").findList();
		System.out.println("opDets.size" + opDets.size());

        if(opDets.size() > 0)
        {

        results.add(opDets.get(0));
	    }
	}


  return results;
}

public static void saveNew(OpinionDetails newOpinion, String sub, String interest, String visb, String img, Long userId)
{
	newOpinion.subject = sub;
	newOpinion.category = interest;
	newOpinion.visibility = visb;
	if(img != null)
	{
	   newOpinion.media = "images/opinion/" + img;
    }
	newOpinion.user = User.getById(userId);
	newOpinion.save();
}


}