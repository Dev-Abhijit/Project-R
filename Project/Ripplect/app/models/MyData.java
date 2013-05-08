package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class MyData extends Model {

  public Long userid;

  @Id
  public Long seqId;

  @ManyToOne
  @JoinColumn(name="Post_thread_id")
  public Post_thread thread;


  public static Finder<Long,MyData> find = new Finder<Long,MyData>(
    Long.class, MyData.class
  );

public static List<MyData> all()
{
  return find.all();
}

public static List<MyData> allThreads(Long Id)
{
  return find.where()
    .eq("userid", Id)
    .order().desc("seqId")
    .fetch("thread")
    .setMaxRows(4)
    .findList();
}

  public static void read(MyData mydata, Long userId, Long articleId) {

	  List<MyData> lmydata= find.where().eq("userid", userId).eq("thread",Post_thread.getById(articleId)).findList();
	  for(MyData data : lmydata)
	  {
		  find.ref(data.seqId).delete();
	  }

	  mydata.userid=userId;
	  mydata.thread=Post_thread.getById(articleId);
	  mydata.save();
  }


}