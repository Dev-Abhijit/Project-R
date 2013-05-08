package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;
import models.Library_meta;

@Entity
public class Book extends Model {

  public Long userId;

  @Id
  public Long Id;

  @ManyToOne
  @JoinColumn(name="Post_thread_id")
  public Post_thread thread;

  @ManyToOne
  @JoinColumn(name="Library_meta_Id")
  public Library_meta shelf_Id;


  public static Finder<Long,Book> find = new Finder<Long,Book>(
    Long.class, Book.class
  );

public static List<Book> all()
{
  return find.all();
}

public static List<Book> allBooks(Long userId)
{
  return find.where()
    .eq("userId", userId)
    .order().desc("Id")
    .fetch("thread")
    .setMaxRows(8)
    .findList();
}

public static List<List<Book>> allBooksGrouped(Long userId)
{
  List<List<Book>> Books = new ArrayList<List<Book>>();
  List<Book> myBooks = new ArrayList<Book>();
  List<Book> otherBooks = new ArrayList<Book>();
  List<Book> allBooks = new ArrayList<Book>();
  List<Library_meta> allShelf = new ArrayList<Library_meta>();

  allShelf = Library_meta.find.where()
  			 .eq("userId", userId).findList();


  for(Library_meta shelf: allShelf)
  {
	    allBooks = find
	      .fetch("thread")
	      .fetch("shelf_Id")
	      .where()
	      .eq("userId", userId)
	      .eq("shelf_Id.Id",shelf.Id)
	      .order().desc("Id")
	      .setMaxRows(8)
          .findList();

      if(allBooks.size() > 0)
      {

  	  	Books.add(allBooks);
  	  }
  }


  return Books;
}

  public static void add(Long shelfId, Long userId, Long articleId) {

	  List<Book> lmybook= find.where().eq("user_id", userId).eq("thread",Post_thread.getById(articleId)).findList();
	  for(Book data : lmybook)
	  {
		  find.ref(data.Id).delete();
	  }
	  Book myLibBook = new Book();
	  myLibBook.userId=userId;
	  myLibBook.thread=Post_thread.getById(articleId);
	  myLibBook.shelf_Id= Library_meta.getById(shelfId);
	  myLibBook.save();
  }


}