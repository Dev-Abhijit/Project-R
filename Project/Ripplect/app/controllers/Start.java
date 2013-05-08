package controllers;

import play.*;
import play.mvc.*;
import play.data.*;

import views.html.*;
import models.*;

public class Start extends Controller {

public static Result index(String userName) {
  return ok(views.html.start.render(MyData.allThreads(User.getIdByUsername(userName)), userName, Book.allBooks(User.getIdByUsername(userName)), myThreadForm, Book.allBooksGrouped(User.getIdByUsername(userName))));
}
  public static Result submit(String userName, String typeId) {
	  Form<Post_thread> filledForm = myThreadForm.bindFromRequest();
	  String excerpt;

	  if(filledForm.field("content").value().length() > 150)
	  {
		 excerpt =  filledForm.field("content").value().substring(0,150);
	  }

	  else
	  {
		  excerpt =  filledForm.field("content").value();
	  }


	  Post_thread.saveNew(typeId,filledForm.get(), excerpt, User.getIdByUsername(userName));
  return ok(
    views.html.start.render(MyData.allThreads(User.getIdByUsername(userName)), userName, Book.allBooks(User.getIdByUsername(userName)), myThreadForm, Book.allBooksGrouped(User.getIdByUsername(userName)))
  );
  }

public static Result startNewProject(String userName) {
  return ok(views.html.startproject.render(MyData.allThreads(User.getIdByUsername(userName)), userName, Book.allBooks(User.getIdByUsername(userName)), myProjectForm));
}

  public static Result submitProject(String userName) {
	  Form<Project> filledForm = myProjectForm.bindFromRequest();

	  Project.saveNew(filledForm.get());
  return ok(
    views.html.index.render(Post_thread.all(),myreadForm,MyData.allThreads(User.getIdByUsername(userName)), userName, Project.all(), Book.allBooksGrouped(User.getIdByUsername(userName)))
  );
  }

  	static Form<Post_thread> myThreadForm = form(Post_thread.class);
    static Form<Project> myProjectForm = form(Project.class);
    static Form<MyData> myreadForm = form(MyData.class);
}