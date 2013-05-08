// @SOURCE:C:/saptarshi_work/Project/Ripplect/conf/routes
// @HASH:0efe8573d1418fb2ea7f6ad75c69832af9afd670
// @DATE:Mon Feb 18 19:03:57 IST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseStart {
    


 
// @LINE:13
def index(userName:String) = {
   Call("GET", "/start" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
}
                                                        
 
// @LINE:16
def submit(userName:String, typeId:String) = {
   Call("POST", "/start/" + implicitly[PathBindable[String]].unbind("typeId", typeId) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
}
                                                        
 
// @LINE:14
def startNewProject(userName:String) = {
   Call("GET", "/startproject" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
}
                                                        
 
// @LINE:15
def submitProject(userName:String) = {
   Call("POST", "/startproject" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
}
                                                        

                      
    
}
                            

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:8
def signIn() = {
   Call("POST", "/home")
}
                                                        
 
// @LINE:18
def createShelf(username:String) = {
   Call("POST", "/lib" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("username", username)))))
}
                                                        
 
// @LINE:20
def submitOpinion(userName:String) = {
   Call("POST", "/opinion/" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
}
                                                        
 
// @LINE:23
def opinionSingle(opId:Long, userName:String) = {
   Call("GET", "/opinionsingle/" + implicitly[PathBindable[Long]].unbind("opId", opId) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
}
                                                        
 
// @LINE:6
def login() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:17
def libHome(username:String) = {
   Call("GET", "/lib" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("username", username)))))
}
                                                        
 
// @LINE:9
def home(userName:String) = {
   Call("GET", "/home/" + implicitly[PathBindable[String]].unbind("userName", userName))
}
                                                        
 
// @LINE:12
def threadContent(userName:String, articleId:Long) = {
   Call("GET", "/thread/" + implicitly[PathBindable[Long]].unbind("articleId", articleId) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
}
                                                        
 
// @LINE:25
def user(id:Long) = {
   Call("GET", "/test/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:11
def addToMyLib(userName:String, articleId:Long) = {
   Call("POST", "/thread/" + implicitly[PathBindable[Long]].unbind("articleId", articleId) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
}
                                                        
 
// @LINE:21
def submitDisagree(userName:String, opId:Long) = {
   Call("GET", "/opiniondisagree/" + implicitly[PathBindable[String]].unbind("userName", userName) + "," + implicitly[PathBindable[Long]].unbind("opId", opId))
}
                                                        
 
// @LINE:22
def submitAgree(userName:String, opId:Long) = {
   Call("GET", "/opinionagree/" + implicitly[PathBindable[String]].unbind("userName", userName) + "," + implicitly[PathBindable[Long]].unbind("opId", opId))
}
                                                        
 
// @LINE:24
def test() = {
   Call("GET", "/test")
}
                                                        
 
// @LINE:19
def opinionHome(username:String) = {
   Call("GET", "/opinion/" + implicitly[PathBindable[String]].unbind("username", username))
}
                                                        
 
// @LINE:10
def addRead(userName:String, articleId:Long) = {
   Call("POST", "/home/" + implicitly[PathBindable[Long]].unbind("articleId", articleId) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("userName", userName)))))
}
                                                        
 
// @LINE:7
def authenticate() = {
   Call("POST", "/")
}
                                                        

                      
    
}
                            

// @LINE:29
class ReverseAssets {
    


 
// @LINE:29
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseStart {
    


 
// @LINE:13
def index = JavascriptReverseRoute(
   "controllers.Start.index",
   """
      function(userName) {
      return _wA({method:"GET", url:"/start" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName)])})
      }
   """
)
                                                        
 
// @LINE:16
def submit = JavascriptReverseRoute(
   "controllers.Start.submit",
   """
      function(userName,typeId) {
      return _wA({method:"POST", url:"/start/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("typeId", typeId) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName)])})
      }
   """
)
                                                        
 
// @LINE:14
def startNewProject = JavascriptReverseRoute(
   "controllers.Start.startNewProject",
   """
      function(userName) {
      return _wA({method:"GET", url:"/startproject" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName)])})
      }
   """
)
                                                        
 
// @LINE:15
def submitProject = JavascriptReverseRoute(
   "controllers.Start.submitProject",
   """
      function(userName) {
      return _wA({method:"POST", url:"/startproject" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName)])})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:8
def signIn = JavascriptReverseRoute(
   "controllers.Application.signIn",
   """
      function() {
      return _wA({method:"POST", url:"/home"})
      }
   """
)
                                                        
 
// @LINE:18
def createShelf = JavascriptReverseRoute(
   "controllers.Application.createShelf",
   """
      function(username) {
      return _wA({method:"POST", url:"/lib" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username)])})
      }
   """
)
                                                        
 
// @LINE:20
def submitOpinion = JavascriptReverseRoute(
   "controllers.Application.submitOpinion",
   """
      function(userName) {
      return _wA({method:"POST", url:"/opinion/" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName)])})
      }
   """
)
                                                        
 
// @LINE:23
def opinionSingle = JavascriptReverseRoute(
   "controllers.Application.opinionSingle",
   """
      function(opId,userName) {
      return _wA({method:"GET", url:"/opinionsingle/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("opId", opId) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName)])})
      }
   """
)
                                                        
 
// @LINE:6
def login = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:17
def libHome = JavascriptReverseRoute(
   "controllers.Application.libHome",
   """
      function(username) {
      return _wA({method:"GET", url:"/lib" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username)])})
      }
   """
)
                                                        
 
// @LINE:9
def home = JavascriptReverseRoute(
   "controllers.Application.home",
   """
      function(userName) {
      return _wA({method:"GET", url:"/home/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", userName)})
      }
   """
)
                                                        
 
// @LINE:12
def threadContent = JavascriptReverseRoute(
   "controllers.Application.threadContent",
   """
      function(userName,articleId) {
      return _wA({method:"GET", url:"/thread/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("articleId", articleId) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName)])})
      }
   """
)
                                                        
 
// @LINE:25
def user = JavascriptReverseRoute(
   "controllers.Application.user",
   """
      function(id) {
      return _wA({method:"GET", url:"/test/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:11
def addToMyLib = JavascriptReverseRoute(
   "controllers.Application.addToMyLib",
   """
      function(userName,articleId) {
      return _wA({method:"POST", url:"/thread/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("articleId", articleId) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName)])})
      }
   """
)
                                                        
 
// @LINE:21
def submitDisagree = JavascriptReverseRoute(
   "controllers.Application.submitDisagree",
   """
      function(userName,opId) {
      return _wA({method:"GET", url:"/opiniondisagree/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", userName) + "," + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("opId", opId)})
      }
   """
)
                                                        
 
// @LINE:22
def submitAgree = JavascriptReverseRoute(
   "controllers.Application.submitAgree",
   """
      function(userName,opId) {
      return _wA({method:"GET", url:"/opinionagree/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userName", userName) + "," + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("opId", opId)})
      }
   """
)
                                                        
 
// @LINE:24
def test = JavascriptReverseRoute(
   "controllers.Application.test",
   """
      function() {
      return _wA({method:"GET", url:"/test"})
      }
   """
)
                                                        
 
// @LINE:19
def opinionHome = JavascriptReverseRoute(
   "controllers.Application.opinionHome",
   """
      function(username) {
      return _wA({method:"GET", url:"/opinion/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", username)})
      }
   """
)
                                                        
 
// @LINE:10
def addRead = JavascriptReverseRoute(
   "controllers.Application.addRead",
   """
      function(userName,articleId) {
      return _wA({method:"POST", url:"/home/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("articleId", articleId) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userName", userName)])})
      }
   """
)
                                                        
 
// @LINE:7
def authenticate = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:29
class ReverseAssets {
    


 
// @LINE:29
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:29
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
class ReverseStart {
    


 
// @LINE:13
def index(userName:String) = new play.api.mvc.HandlerRef(
   controllers.Start.index(userName), HandlerDef(this, "controllers.Start", "index", Seq(classOf[String]))
)
                              
 
// @LINE:16
def submit(userName:String, typeId:String) = new play.api.mvc.HandlerRef(
   controllers.Start.submit(userName, typeId), HandlerDef(this, "controllers.Start", "submit", Seq(classOf[String], classOf[String]))
)
                              
 
// @LINE:14
def startNewProject(userName:String) = new play.api.mvc.HandlerRef(
   controllers.Start.startNewProject(userName), HandlerDef(this, "controllers.Start", "startNewProject", Seq(classOf[String]))
)
                              
 
// @LINE:15
def submitProject(userName:String) = new play.api.mvc.HandlerRef(
   controllers.Start.submitProject(userName), HandlerDef(this, "controllers.Start", "submitProject", Seq(classOf[String]))
)
                              

                      
    
}
                            

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:8
def signIn() = new play.api.mvc.HandlerRef(
   controllers.Application.signIn(), HandlerDef(this, "controllers.Application", "signIn", Seq())
)
                              
 
// @LINE:18
def createShelf(username:String) = new play.api.mvc.HandlerRef(
   controllers.Application.createShelf(username), HandlerDef(this, "controllers.Application", "createShelf", Seq(classOf[String]))
)
                              
 
// @LINE:20
def submitOpinion(userName:String) = new play.api.mvc.HandlerRef(
   controllers.Application.submitOpinion(userName), HandlerDef(this, "controllers.Application", "submitOpinion", Seq(classOf[String]))
)
                              
 
// @LINE:23
def opinionSingle(opId:Long, userName:String) = new play.api.mvc.HandlerRef(
   controllers.Application.opinionSingle(opId, userName), HandlerDef(this, "controllers.Application", "opinionSingle", Seq(classOf[Long], classOf[String]))
)
                              
 
// @LINE:6
def login() = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq())
)
                              
 
// @LINE:17
def libHome(username:String) = new play.api.mvc.HandlerRef(
   controllers.Application.libHome(username), HandlerDef(this, "controllers.Application", "libHome", Seq(classOf[String]))
)
                              
 
// @LINE:9
def home(userName:String) = new play.api.mvc.HandlerRef(
   controllers.Application.home(userName), HandlerDef(this, "controllers.Application", "home", Seq(classOf[String]))
)
                              
 
// @LINE:12
def threadContent(userName:String, articleId:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.threadContent(userName, articleId), HandlerDef(this, "controllers.Application", "threadContent", Seq(classOf[String], classOf[Long]))
)
                              
 
// @LINE:25
def user(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.user(id), HandlerDef(this, "controllers.Application", "user", Seq(classOf[Long]))
)
                              
 
// @LINE:11
def addToMyLib(userName:String, articleId:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.addToMyLib(userName, articleId), HandlerDef(this, "controllers.Application", "addToMyLib", Seq(classOf[String], classOf[Long]))
)
                              
 
// @LINE:21
def submitDisagree(userName:String, opId:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.submitDisagree(userName, opId), HandlerDef(this, "controllers.Application", "submitDisagree", Seq(classOf[String], classOf[Long]))
)
                              
 
// @LINE:22
def submitAgree(userName:String, opId:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.submitAgree(userName, opId), HandlerDef(this, "controllers.Application", "submitAgree", Seq(classOf[String], classOf[Long]))
)
                              
 
// @LINE:24
def test() = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this, "controllers.Application", "test", Seq())
)
                              
 
// @LINE:19
def opinionHome(username:String) = new play.api.mvc.HandlerRef(
   controllers.Application.opinionHome(username), HandlerDef(this, "controllers.Application", "opinionHome", Seq(classOf[String]))
)
                              
 
// @LINE:10
def addRead(userName:String, articleId:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.addRead(userName, articleId), HandlerDef(this, "controllers.Application", "addRead", Seq(classOf[String], classOf[Long]))
)
                              
 
// @LINE:7
def authenticate() = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq())
)
                              

                      
    
}
                            

// @LINE:29
class ReverseAssets {
    


 
// @LINE:29
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                