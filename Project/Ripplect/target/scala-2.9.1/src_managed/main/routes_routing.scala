// @SOURCE:C:/saptarshi_work/Project/Ripplect/conf/routes
// @HASH:0efe8573d1418fb2ea7f6ad75c69832af9afd670
// @DATE:Mon Feb 18 19:03:57 IST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_login0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Application_authenticate1 = Route("POST", PathPattern(List(StaticPart("/"))))
                    

// @LINE:8
val controllers_Application_signIn2 = Route("POST", PathPattern(List(StaticPart("/home"))))
                    

// @LINE:9
val controllers_Application_home3 = Route("GET", PathPattern(List(StaticPart("/home/"),DynamicPart("userName", """[^/]+"""))))
                    

// @LINE:10
val controllers_Application_addRead4 = Route("POST", PathPattern(List(StaticPart("/home/"),DynamicPart("articleId", """[^/]+"""))))
                    

// @LINE:11
val controllers_Application_addToMyLib5 = Route("POST", PathPattern(List(StaticPart("/thread/"),DynamicPart("articleId", """[^/]+"""))))
                    

// @LINE:12
val controllers_Application_threadContent6 = Route("GET", PathPattern(List(StaticPart("/thread/"),DynamicPart("articleId", """[^/]+"""))))
                    

// @LINE:13
val controllers_Start_index7 = Route("GET", PathPattern(List(StaticPart("/start"))))
                    

// @LINE:14
val controllers_Start_startNewProject8 = Route("GET", PathPattern(List(StaticPart("/startproject"))))
                    

// @LINE:15
val controllers_Start_submitProject9 = Route("POST", PathPattern(List(StaticPart("/startproject"))))
                    

// @LINE:16
val controllers_Start_submit10 = Route("POST", PathPattern(List(StaticPart("/start/"),DynamicPart("typeId", """[^/]+"""))))
                    

// @LINE:17
val controllers_Application_libHome11 = Route("GET", PathPattern(List(StaticPart("/lib"))))
                    

// @LINE:18
val controllers_Application_createShelf12 = Route("POST", PathPattern(List(StaticPart("/lib"))))
                    

// @LINE:19
val controllers_Application_opinionHome13 = Route("GET", PathPattern(List(StaticPart("/opinion/"),DynamicPart("username", """[^/]+"""))))
                    

// @LINE:20
val controllers_Application_submitOpinion14 = Route("POST", PathPattern(List(StaticPart("/opinion/"))))
                    

// @LINE:21
val controllers_Application_submitDisagree15 = Route("GET", PathPattern(List(StaticPart("/opiniondisagree/"),DynamicPart("userName", """[^/]+"""),StaticPart(","),DynamicPart("opId", """[^/]+"""))))
                    

// @LINE:22
val controllers_Application_submitAgree16 = Route("GET", PathPattern(List(StaticPart("/opinionagree/"),DynamicPart("userName", """[^/]+"""),StaticPart(","),DynamicPart("opId", """[^/]+"""))))
                    

// @LINE:23
val controllers_Application_opinionSingle17 = Route("GET", PathPattern(List(StaticPart("/opinionsingle/"),DynamicPart("opId", """[^/]+"""))))
                    

// @LINE:24
val controllers_Application_test18 = Route("GET", PathPattern(List(StaticPart("/test"))))
                    

// @LINE:25
val controllers_Application_user19 = Route("GET", PathPattern(List(StaticPart("/test/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:29
val controllers_Assets_at20 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.login()"""),("""POST""","""/""","""controllers.Application.authenticate()"""),("""POST""","""/home""","""controllers.Application.signIn()"""),("""GET""","""/home/$userName<[^/]+>""","""controllers.Application.home(userName:String)"""),("""POST""","""/home/$articleId<[^/]+>""","""controllers.Application.addRead(userName:String, articleId:Long)"""),("""POST""","""/thread/$articleId<[^/]+>""","""controllers.Application.addToMyLib(userName:String, articleId:Long)"""),("""GET""","""/thread/$articleId<[^/]+>""","""controllers.Application.threadContent(userName:String, articleId:Long)"""),("""GET""","""/start""","""controllers.Start.index(userName:String)"""),("""GET""","""/startproject""","""controllers.Start.startNewProject(userName:String)"""),("""POST""","""/startproject""","""controllers.Start.submitProject(userName:String)"""),("""POST""","""/start/$typeId<[^/]+>""","""controllers.Start.submit(userName:String, typeId:String)"""),("""GET""","""/lib""","""controllers.Application.libHome(username:String)"""),("""POST""","""/lib""","""controllers.Application.createShelf(username:String)"""),("""GET""","""/opinion/$username<[^/]+>""","""controllers.Application.opinionHome(username:String)"""),("""POST""","""/opinion/""","""controllers.Application.submitOpinion(userName:String)"""),("""GET""","""/opiniondisagree/$userName<[^/]+>,$opId<[^/]+>""","""controllers.Application.submitDisagree(userName:String, opId:Long)"""),("""GET""","""/opinionagree/$userName<[^/]+>,$opId<[^/]+>""","""controllers.Application.submitAgree(userName:String, opId:Long)"""),("""GET""","""/opinionsingle/$opId<[^/]+>""","""controllers.Application.opinionSingle(opId:Long, userName:String)"""),("""GET""","""/test""","""controllers.Application.test()"""),("""GET""","""/test/$id<[^/]+>""","""controllers.Application.user(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_login0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil))
   }
}
                    

// @LINE:7
case controllers_Application_authenticate1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_signIn2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.signIn(), HandlerDef(this, "controllers.Application", "signIn", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_home3(params) => {
   call(params.fromPath[String]("userName", None)) { (userName) =>
        invokeHandler(_root_.controllers.Application.home(userName), HandlerDef(this, "controllers.Application", "home", Seq(classOf[String])))
   }
}
                    

// @LINE:10
case controllers_Application_addRead4(params) => {
   call(params.fromQuery[String]("userName", None), params.fromPath[Long]("articleId", None)) { (userName, articleId) =>
        invokeHandler(_root_.controllers.Application.addRead(userName, articleId), HandlerDef(this, "controllers.Application", "addRead", Seq(classOf[String], classOf[Long])))
   }
}
                    

// @LINE:11
case controllers_Application_addToMyLib5(params) => {
   call(params.fromQuery[String]("userName", None), params.fromPath[Long]("articleId", None)) { (userName, articleId) =>
        invokeHandler(_root_.controllers.Application.addToMyLib(userName, articleId), HandlerDef(this, "controllers.Application", "addToMyLib", Seq(classOf[String], classOf[Long])))
   }
}
                    

// @LINE:12
case controllers_Application_threadContent6(params) => {
   call(params.fromQuery[String]("userName", None), params.fromPath[Long]("articleId", None)) { (userName, articleId) =>
        invokeHandler(_root_.controllers.Application.threadContent(userName, articleId), HandlerDef(this, "controllers.Application", "threadContent", Seq(classOf[String], classOf[Long])))
   }
}
                    

// @LINE:13
case controllers_Start_index7(params) => {
   call(params.fromQuery[String]("userName", None)) { (userName) =>
        invokeHandler(_root_.controllers.Start.index(userName), HandlerDef(this, "controllers.Start", "index", Seq(classOf[String])))
   }
}
                    

// @LINE:14
case controllers_Start_startNewProject8(params) => {
   call(params.fromQuery[String]("userName", None)) { (userName) =>
        invokeHandler(_root_.controllers.Start.startNewProject(userName), HandlerDef(this, "controllers.Start", "startNewProject", Seq(classOf[String])))
   }
}
                    

// @LINE:15
case controllers_Start_submitProject9(params) => {
   call(params.fromQuery[String]("userName", None)) { (userName) =>
        invokeHandler(_root_.controllers.Start.submitProject(userName), HandlerDef(this, "controllers.Start", "submitProject", Seq(classOf[String])))
   }
}
                    

// @LINE:16
case controllers_Start_submit10(params) => {
   call(params.fromQuery[String]("userName", None), params.fromPath[String]("typeId", None)) { (userName, typeId) =>
        invokeHandler(_root_.controllers.Start.submit(userName, typeId), HandlerDef(this, "controllers.Start", "submit", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:17
case controllers_Application_libHome11(params) => {
   call(params.fromQuery[String]("username", None)) { (username) =>
        invokeHandler(_root_.controllers.Application.libHome(username), HandlerDef(this, "controllers.Application", "libHome", Seq(classOf[String])))
   }
}
                    

// @LINE:18
case controllers_Application_createShelf12(params) => {
   call(params.fromQuery[String]("username", None)) { (username) =>
        invokeHandler(_root_.controllers.Application.createShelf(username), HandlerDef(this, "controllers.Application", "createShelf", Seq(classOf[String])))
   }
}
                    

// @LINE:19
case controllers_Application_opinionHome13(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(_root_.controllers.Application.opinionHome(username), HandlerDef(this, "controllers.Application", "opinionHome", Seq(classOf[String])))
   }
}
                    

// @LINE:20
case controllers_Application_submitOpinion14(params) => {
   call(params.fromQuery[String]("userName", None)) { (userName) =>
        invokeHandler(_root_.controllers.Application.submitOpinion(userName), HandlerDef(this, "controllers.Application", "submitOpinion", Seq(classOf[String])))
   }
}
                    

// @LINE:21
case controllers_Application_submitDisagree15(params) => {
   call(params.fromPath[String]("userName", None), params.fromPath[Long]("opId", None)) { (userName, opId) =>
        invokeHandler(_root_.controllers.Application.submitDisagree(userName, opId), HandlerDef(this, "controllers.Application", "submitDisagree", Seq(classOf[String], classOf[Long])))
   }
}
                    

// @LINE:22
case controllers_Application_submitAgree16(params) => {
   call(params.fromPath[String]("userName", None), params.fromPath[Long]("opId", None)) { (userName, opId) =>
        invokeHandler(_root_.controllers.Application.submitAgree(userName, opId), HandlerDef(this, "controllers.Application", "submitAgree", Seq(classOf[String], classOf[Long])))
   }
}
                    

// @LINE:23
case controllers_Application_opinionSingle17(params) => {
   call(params.fromPath[Long]("opId", None), params.fromQuery[String]("userName", None)) { (opId, userName) =>
        invokeHandler(_root_.controllers.Application.opinionSingle(opId, userName), HandlerDef(this, "controllers.Application", "opinionSingle", Seq(classOf[Long], classOf[String])))
   }
}
                    

// @LINE:24
case controllers_Application_test18(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.test(), HandlerDef(this, "controllers.Application", "test", Nil))
   }
}
                    

// @LINE:25
case controllers_Application_user19(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.user(id), HandlerDef(this, "controllers.Application", "user", Seq(classOf[Long])))
   }
}
                    

// @LINE:29
case controllers_Assets_at20(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                