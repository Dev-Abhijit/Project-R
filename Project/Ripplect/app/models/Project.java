package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class Project extends Model {
  @Id
  public Long id;

  public String title;

  public String tagline;

  public static Finder<Long,Project> find = new Finder<Long,Project>(
    Long.class, Project.class
  );

public static List<Project> all()
{
  return find.order().desc("id").setMaxRows(4).findList();
}

public static void saveNew(Project newProject)
{
	newProject.save();
}


}