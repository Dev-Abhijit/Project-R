package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class Matrix extends Model {

  public Long primary_id;

  public Long secondary_id;

  public static Finder<Long,Matrix> find = new Finder<Long,Matrix>(
    Long.class, Matrix.class
  );

public static List<Long> getMatrix(Long Id,List<Long> recThreads )
{

	List<Long> threads = new ArrayList<Long>(recThreads);
	System.out.println("looping for" + Id);
    List<Matrix> allMatrix= find.where()
    .eq("primary_id", Id)
    .findList();

    for (Matrix matrix : allMatrix)
    {
		System.out.println(matrix.secondary_id);
		threads.add(matrix.secondary_id);
		threads = getMatrix(matrix.secondary_id, threads);
	}

	System.out.println("final size" + threads.size());
	return threads;
}


public static List<Post_thread> getMatrixContent(Long Id,List<Long> threads)
{
	List<Long> allThreads = getMatrix(Id, threads);
	List<Post_thread> matrixCont = new ArrayList<Post_thread>();

	for(Long threadId : allThreads)
	{
       matrixCont.add(Post_thread.getById(threadId));
	}

	return matrixCont;
}

}