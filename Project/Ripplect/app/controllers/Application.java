package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.*;
import java.io.*;

import views.html.*;
import models.*;

import java.util.*;

public class Application extends Controller {


public long userId;
public static Result index() {
  return ok("Hello World");
}

  public static Result login() {
  return ok(
    views.html.login.render(myLoginForm, mySignInForm)
  );
  }

  public static Result home(String username) {
  return ok(
    views.html.index.render(Post_thread.all(User.getById(User.getIdByUsername(username)).interest),myreadForm,MyData.allThreads(User.getIdByUsername(username)), username, Project.all(), Book.allBooksGrouped(User.getIdByUsername(username)))
  );
  }

  public static Result threadContent(String userName, Long articleId) {
  return ok(
    thread.render(
	Post_thread.getById(articleId),
    myreadForm,
    MyData.allThreads(User.getIdByUsername(userName)),
    userName,
    Book.allBooks(User.getIdByUsername(userName)),
    Book.allBooksGrouped(User.getIdByUsername(userName)),
    Library_meta.getAllByUserName(userName),
    Matrix.getMatrixContent(articleId, new ArrayList<Long>()))
  );
  }

  public static Result libHome(String username) {
  return ok(
    views.html.library.render(MyData.allThreads(User.getIdByUsername(username)), username, Project.all(), Book.allBooksGrouped(User.getIdByUsername(username)), libShelfForm)
  );
  }

  public static Result addRead(String userName, Long articleId)
  {
	    Form<MyData> filledForm = myreadForm.bindFromRequest();
	    MyData.read(filledForm.get(),User.getIdByUsername(userName), articleId);

  return redirect(
    controllers.routes.Application.threadContent(userName, articleId)
  );
  }


  public static Result addToMyLib(String userName, Long articleId)
  {
	    Form<Book> filledForm = myLibForm.bindFromRequest();
	    Book.add(Long.valueOf(filledForm.field("shelf_Id").value()),User.getIdByUsername(userName), articleId);

  return redirect(
    controllers.routes.Application.threadContent(userName, articleId)
  );
  }

    public static Result createShelf(String userName)
    {
  	    Form<Library_meta> filledForm = libShelfForm.bindFromRequest();

  	    Library_meta.saveNew(User.getIdByUsername(userName),filledForm.get());
  return ok(
    views.html.library.render(MyData.allThreads(User.getIdByUsername(userName)), userName, Project.all(), Book.allBooksGrouped(User.getIdByUsername(userName)),libShelfForm)
    );
    }


  public static Result authenticate() {
	  Form<User> filledForm = myLoginForm.bindFromRequest();
	  Long userId = User.getIdByUsername(filledForm.field("username").value());

	  if(User.validate(filledForm.field("username").value(),filledForm.field("password").value()))
	  {
		  return opinionHome(filledForm.field("username").value());
		  
	  }
	  else if(!filledForm.field("password").valueOr("").isEmpty() && !filledForm.field("username").valueOr("").isEmpty())
	  {
		  filledForm.reject("username","Oops! Wrong credentials");
	  }
	  
	  if(filledForm.hasErrors()) {
		  return badRequest(login.render(filledForm, mySignInForm));
	  } else {
		  return opinionHome(filledForm.field("username").value());    }
  }

  public static Result signIn()
  {
	  
	  Form<User> filledForm = mySignInForm.bindFromRequest();
	  User a=new User();
	  String hobby="";
	  List<User> la= User.all();
	  Long userId = User.getIdByUsername(filledForm.field("username").value());
	  if(!filledForm.field("password").valueOr("").isEmpty()) {
          if(!filledForm.field("password").valueOr("").equals(filledForm.field("repeatPassword").value())) {
              filledForm.reject("repeatPassword", "Password don't match");
          }
	  }
	  if(filledForm.hasErrors()) {
		  return badRequest(login.render(myLoginForm, filledForm));
	  } else {
		  if(filledForm.field("Film").value() != null &&  filledForm.field("Film").value().equals("true"))
		  {
			  if(hobby=="")
				{
					hobby="Film";
			    }
			    else
			    {
				  hobby =hobby+","+"Film";
			     }
		  }
		  if(filledForm.field("Music").value() != null &&  filledForm.field("Music").value().equals("true"))
		  {
			  if(hobby=="")
				{
					hobby="Music";
			    }
			    else
			    {
				  hobby =hobby+","+"Music";
			     }
		  }
		  if(filledForm.field("Photography").value() != null &&  filledForm.field("Photography").value().equals("true"))
		  {
			  if(hobby=="")
				{
					hobby="Photography";
			    }
			    else
			    {
				  hobby =hobby+","+"Photography";
			     }
		  }
		  if(filledForm.field("Technology").value() != null &&  filledForm.field("Technology").value().equals("true"))
		  {
			  if(hobby=="")
				{
					hobby="Technology";
			    }
			    else
			    {
				  hobby =hobby+","+"Technology";
			     }
		  }
		  if(filledForm.field("Travel").value() != null &&  filledForm.field("Travel").value().equals("true"))
		  {
			  if(hobby=="")
				{
					hobby="Travel";
			    }
			    else
			    {
				  hobby =hobby+","+"Travel";
			     }
		  }
		  if(filledForm.field("Cooking").value() != null &&  filledForm.field("Cooking").value().equals("true"))
		  {
			  if(hobby=="")
				{
					hobby="Cooking";
			    }
			    else
			    {
				  hobby =hobby+","+"Cooking";
			     }
		  }
		  if(filledForm.field("Sports").value() != null &&  filledForm.field("Sports").value().equals("true"))
		  {
			  if(hobby=="")
				{
					hobby="Sports";
			    }
			    else
			    {
				  hobby =hobby+","+"Sports";
			     }
		  }
		  if(filledForm.field("Painting").value() != null &&  filledForm.field("Painting").value().equals("true"))
		  {
			  if(hobby=="")
				{
					hobby="Painting";
			    }
			    else
			    {
				  hobby =hobby+","+"Painting";
			     }
		  }
		  if(filledForm.field("Dance").value() != null &&  filledForm.field("Dance").value().equals("true"))
		  {
			  if(hobby=="")
				{
					hobby="Dance";
			    }
			    else
			    {
				  hobby =hobby+","+"Dance";
			     }
		  }
		//  if(filledForm.field("Dance").value() != null &&  filledForm.field("Dance").value().equals("true"))
		  a.username = filledForm.field("username").value();
          a.password = filledForm.field("password").value();
      //   a.repeatPassword=filledForm.field("repeatPassword");
          a.interest=hobby;
          if(hobby==null || hobby=="")
          {
        	  return badRequest(login.render(myLoginForm, filledForm));
          }
          User.createNew(a);
          if(filledForm.field("Film").value() == null && filledForm.field("Music").value() == null && filledForm.field("Photography").value() == null && filledForm.field("Technology").value() == null && filledForm.field("Travel").value() == null && filledForm.field("Cooking").value() == null && filledForm.field("Sports").value() == null && filledForm.field("Painting").value() == null && filledForm.field("Dance").value() == null)
          {
        	  return badRequest(login.render(myLoginForm, filledForm));
          }
          return ok(
        		    views.html.index.render(Post_thread.all(),myreadForm,MyData.allThreads(userId),filledForm.field("username").value(), Project.all(), Book.allBooksGrouped(userId))
        		    );
	  }
  }
  


    public static Result opinionHome(String username) {

	List<String> visb = new ArrayList<String>();
	List<OpinionObj> opinionobj = new ArrayList<OpinionObj>();
	List<OpinionObj> opinionList = new ArrayList<OpinionObj>();

	for (OpinionDetails opd : OpinionDetails.all())
	{
		OpinionObj opo = new OpinionObj();
		opo.id = opd.id;
		opo.opiniondetails = opd;
		List<Opinion> opinions = Opinion.getUserVote(opd.id, User.getIdByUsername(username));

		if(opinions.size() > 0)
		{
			for(Opinion ops: opinions)
			{
			opo.vote = ops.value;
		    }

		}
		else
		{
			opo.vote = "n";
		}
		opinionobj.add(opo);
	}
	
	//This for loop provides values for the side bar, the opinions user participated
	for(OpinionDetails opList : OpinionDetails.getUserParticipated(User.getIdByUsername(username)))
	{
		OpinionObj opo = new OpinionObj();
		opo.id = opList.id;
		opo.opiniondetails = opList;
		List<Opinion> opinions = Opinion.getUserVote(opList.id, User.getIdByUsername(username));
		if(opinions.size() > 0)
		{	
			for(Opinion ops: opinions)
			{
			opo.vote = ops.value;
		    }
		}
		opo.countAgree = Opinion.getAgreeCount(opList.id);
		opo.countDisagree = Opinion.getDisagreeCount(opList.id);
		
		opinionList.add(opo);
	}
	visb.add("Take Opinion from my friends");
	visb.add("Take Opinion from public");
    return ok(views.html.opinion.render(username, form(OpinionDetails.class), visb, OpinionDetails.all(), opinionobj, opinionList));
  }

  public static Result submitOpinion(String userName)
  {
	List<String> visb = new ArrayList();
	List<OpinionObj> opinionobj = new ArrayList();
	List<OpinionObj> opinionList = new ArrayList<OpinionObj>();


	  visb.add("Take Opinion from my friends");
	  visb.add("Take Opinion from public");

	  Form<OpinionDetails> filledForm = myOpinionForm.bindFromRequest();
      MultipartFormData body = request().body().asMultipartFormData();

      FilePart resourceFile = body.getFile("inputfile");
      String FileName = null;
      if(resourceFile != null)
      {
      String contentType = resourceFile.getContentType();
      File file = resourceFile.getFile();

      FileName = resourceFile.getFilename();

      //Copy the image file
    	try{


    	    File copyfile =new File(FileName);

    	    InputStream inStream = new FileInputStream(file);
    	    OutputStream outStream = new FileOutputStream("public/images/opinion/" + copyfile);

    	    byte[] buffer = new byte[1024];

    	    int length;
    	    //copy the file content in bytes
    	    while ((length = inStream.read(buffer)) > 0){

    	    	outStream.write(buffer, 0, length);

    	    }

    	    inStream.close();
    	    outStream.close();

    	}
    	catch(IOException e){
    		e.printStackTrace();
    	}

	 }

	 OpinionDetails.saveNew(filledForm.get(),
	                        filledForm.field("subject").value(),
	                        filledForm.field("interest").value(),
	                        filledForm.field("visibility").value(),
	                        FileName,
	                        User.getIdByUsername(userName));

	for (OpinionDetails opd : OpinionDetails.all())
	{
		OpinionObj opo = new OpinionObj();
		opo.id = opd.id;
		opo.opiniondetails = opd;
		List<Opinion> opinions = Opinion.getUserVote(opd.id, User.getIdByUsername(userName));

		if(opinions.size() > 0)
		{
			for(Opinion ops: opinions)
			{
			opo.vote = ops.value;
		    }

		}
		else
		{
			opo.vote = "n";
		}

		opinionobj.add(opo);
	}
	for(OpinionDetails opList : OpinionDetails.getUserParticipated(User.getIdByUsername(userName)))
	{
		OpinionObj opo = new OpinionObj();
		opo.id = opList.id;
		opo.opiniondetails = opList;
		List<Opinion> opinions = Opinion.getUserVote(opList.id, User.getIdByUsername(userName));
		if(opinions.size() > 0)
		{
			for(Opinion ops: opinions)
			{
			opo.vote = ops.value;
		    }
		}	
		opo.countAgree = Opinion.getAgreeCount(opList.id);
		opo.countDisagree = Opinion.getDisagreeCount(opList.id);
		opinionList.add(opo);
	}
	
	return ok(
    views.html.opinion.render(userName, form(OpinionDetails.class), visb, OpinionDetails.all(), opinionobj, opinionList)
  );
  }


    public static Result submitAgree(String userName, Long opId){
		Opinion op = new Opinion();
		op.user = User.getById(User.getIdByUsername(userName));
		op.opiniondetails = OpinionDetails.getById(opId);
		op.value = "agree";
		Opinion.saveNew(op);
        return ok("You have Agreed!");
    }

    public static Result submitDisagree(String userName, Long opId){
		Opinion op = new Opinion();
		op.user = User.getById(User.getIdByUsername(userName));
		op.opiniondetails = OpinionDetails.getById(opId);
		op.value = "disagree";
		Opinion.saveNew(op);
        return ok("You have Disagreed!");
    }



    public static Result opinionSingle(Long opId, String userName)
    {
		List<String> visb = new ArrayList();
		List<OpinionObj> opinionList = new ArrayList<OpinionObj>();
		OpinionObj oObj = new OpinionObj();
		oObj.opiniondetails = OpinionDetails.getById(opId);
		List<Opinion> opinions = Opinion.getUserVote(opId, User.getIdByUsername(userName));

		if(opinions.size() > 0)
		{
			for(Opinion ops: opinions)
			{
			oObj.vote = ops.value;
		    }

		}
		else
		{
			oObj.vote = "n";
		}

		oObj.countAgree = Opinion.getAgreeCount(opId);
		oObj.countDisagree = Opinion.getDisagreeCount(opId);

		for(OpinionDetails opList : OpinionDetails.getUserParticipated(User.getIdByUsername(userName)))
		{
			OpinionObj opo = new OpinionObj();
			opo.id = opList.id;
			opo.opiniondetails = opList;
			List<Opinion> opns = Opinion.getUserVote(opList.id, User.getIdByUsername(userName));
			if(opns.size() > 0)
			{
				for(Opinion ops: opns)
				{
				opo.vote = ops.value;
			    }
			}	
			opo.countAgree = Opinion.getAgreeCount(opList.id);
			opo.countDisagree = Opinion.getDisagreeCount(opList.id);
			opinionList.add(opo);
		}	
		
		visb.add("Take Opinion from my friends");
	    visb.add("Take Opinion from public");

	    
	    
	    return ok(
    	views.html.opinionsingle.render(userName, form(OpinionDetails.class), visb, oObj, opinionList)
  		);
	}


  public static Result test() {
  return ok(
    views.html.test.render()
  );
  }

    public static Result user(Long id){
        return ok("Play's controller told that you're about to get data for user no. "+id);
    }


  static Form<OpinionDetails> myOpinionForm = form(OpinionDetails.class);
  static Form<Opinion> myOpinionsForm = form(Opinion.class);
  static Form<MyData> myreadForm = form(MyData.class);
  static Form<Book> myLibForm = form(Book.class);
  static Form<User> myLoginForm = form(User.class);
  static Form<User> mySignInForm = form(User.class);
  static Form<Library_meta> libShelfForm = form(Library_meta.class);
}