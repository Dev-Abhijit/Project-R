
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[User],Form[User],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(myLoginForm : Form[User], mySignInForm : Form[User]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/logintemplate("Login Page")/*6.29*/{_display_(Seq[Any](format.raw/*6.30*/("""
<div class="login-main">
<table width="100%">
<tr>
<td width="5%">
</td>
<td width="60%" valign="top">
<div class="login-form">
<div class="drop-shadow lifted">
<div class="login-wrapper">

<h3> Have an account?</h3>
"""),_display_(Seq[Any](/*18.2*/helper/*18.8*/.form(action = routes.Application.authenticate)/*18.55*/ {_display_(Seq[Any](format.raw/*18.57*/("""
<ul><li>
            """),_display_(Seq[Any](/*20.14*/inputText(
                myLoginForm("username"),
                '_label -> "Username",
                '_help -> "",
                '_error -> myLoginForm.globalError
            ))),format.raw/*25.14*/("""
            </li><li>
            """),_display_(Seq[Any](/*27.14*/inputPassword(
                myLoginForm("password"),
                '_label -> "Password",
                '_help -> ""
            ))),format.raw/*31.14*/("""
</li><li>
<input type="submit" value="Login" class="button-create">
</li></ul>
""")))})),format.raw/*35.2*/("""
</div>
</div>
<div class="drop-shadow-lifted">
<div class="signin-wrapper">

<h3> New user? Register here.</h3>
"""),_display_(Seq[Any](/*42.2*/helper/*42.8*/.form(action = routes.Application.signIn)/*42.49*/ {_display_(Seq[Any](format.raw/*42.51*/("""
            """),_display_(Seq[Any](/*43.14*/inputText(
                mySignInForm("username"),
                '_label -> "Username",
                '_help -> "Enter a valid email address"
            ))),format.raw/*47.14*/("""


            """),_display_(Seq[Any](/*50.14*/inputPassword(
                mySignInForm("password"),
                '_label -> "Password",
                '_help -> "A password must be at least 6 characters. "
            ))),format.raw/*54.14*/("""

            """),_display_(Seq[Any](/*56.14*/inputPassword(
                mySignInForm("repeatPassword"),
                '_label -> "Repeat Password",
                '_help -> "Please repeat your password again.",
                '_error -> mySignInForm.error("password")

                  ))),format.raw/*62.20*/("""
            <div id="hobbies-section">
           <div class="hobb" id="first">
              """),_display_(Seq[Any](/*65.16*/checkbox(field=mySignInForm("Film")))),format.raw/*65.52*/("""
            <img src=""""),_display_(Seq[Any](/*66.24*/routes/*66.30*/.Assets.at("images/movies.jpg"))),format.raw/*66.61*/("""">
            </div>
             <div class="hobb" id="second">
               """),_display_(Seq[Any](/*69.17*/checkbox(field=mySignInForm("Music")))),format.raw/*69.54*/("""
                <img src=""""),_display_(Seq[Any](/*70.28*/routes/*70.34*/.Assets.at("images/violin.jpg"))),format.raw/*70.65*/("""" width="150" height="150">
              </div>
              <div class="hobb" id="third">
               """),_display_(Seq[Any](/*73.17*/checkbox(field=mySignInForm("Photography")))),format.raw/*73.60*/("""
               <img src=""""),_display_(Seq[Any](/*74.27*/routes/*74.33*/.Assets.at("images/07_color.jpg"))),format.raw/*74.66*/("""" width="150" height="150">
               </div>
              <div class="hobb" id="fourth">
              """),_display_(Seq[Any](/*77.16*/checkbox(field=mySignInForm("Technology")))),format.raw/*77.58*/("""
             <img src=""""),_display_(Seq[Any](/*78.25*/routes/*78.31*/.Assets.at("images/10_techno.jpg"))),format.raw/*78.65*/("""" width="150" height="150">
             </div>
             <div class="hobb" id="fifth">
              """),_display_(Seq[Any](/*81.16*/checkbox(field=mySignInForm("Travel")))),format.raw/*81.54*/("""
            <img src=""""),_display_(Seq[Any](/*82.24*/routes/*82.30*/.Assets.at("images/11_travel.jpg"))),format.raw/*82.64*/("""" width="150" height="150">
            </div>
            <div class="hobb" id="sixth">
              """),_display_(Seq[Any](/*85.16*/checkbox(field=mySignInForm("Cooking")))),format.raw/*85.55*/("""
            <img src=""""),_display_(Seq[Any](/*86.24*/routes/*86.30*/.Assets.at("images/12_cook.jpg"))),format.raw/*86.62*/("""" width="150" height="150">
            </div>
            <div class="hobb" id="seventh">
              """),_display_(Seq[Any](/*89.16*/checkbox(field=mySignInForm("Sports")))),format.raw/*89.54*/("""
            <img src=""""),_display_(Seq[Any](/*90.24*/routes/*90.30*/.Assets.at("images/opinion/football_images.jpg"))),format.raw/*90.78*/("""" width="150" height="150">
            </div>
            <div class="hobb" id="eighth">
              """),_display_(Seq[Any](/*93.16*/checkbox(field=mySignInForm("Painting")))),format.raw/*93.56*/("""
            <img src=""""),_display_(Seq[Any](/*94.24*/routes/*94.30*/.Assets.at("images/13_paint.jpg"))),format.raw/*94.63*/("""" width="150" height="150">
            </div>
            <div class="hobb" id="ninth">
              """),_display_(Seq[Any](/*97.16*/checkbox(field=mySignInForm("Dance")))),format.raw/*97.53*/("""
            <img src=""""),_display_(Seq[Any](/*98.24*/routes/*98.30*/.Assets.at("images/14_dance.jpg"))),format.raw/*98.63*/("""" width="150" height="150">
            </div>
            </div>
<div id="thebutton">            
<input type="submit" value="Sign_In" class="button-create">
</div>
""")))})),format.raw/*104.2*/("""
</div>
</div>
</div>
</td>
""")))})),format.raw/*109.2*/("""
"""))}
    }
    
    def render(myLoginForm:Form[User],mySignInForm:Form[User]) = apply(myLoginForm,mySignInForm)
    
    def f:((Form[User],Form[User]) => play.api.templates.Html) = (myLoginForm,mySignInForm) => apply(myLoginForm,mySignInForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 21 19:05:35 IST 2013
                    SOURCE: C:/saptarshi_work/Project/Ripplect/app/views/login.scala.html
                    HASH: 9070751f150b6d80824d5614bd7d4538684d8ce7
                    MATRIX: 770->1|950->54|978->107|1014->109|1049->136|1087->137|1341->356|1355->362|1411->409|1451->411|1510->434|1717->619|1789->655|1948->792|2060->873|2209->987|2223->993|2273->1034|2313->1036|2363->1050|2546->1211|2598->1227|2800->1407|2851->1422|3124->1673|3256->1769|3314->1805|3374->1829|3389->1835|3442->1866|3560->1948|3619->1985|3683->2013|3698->2019|3751->2050|3896->2159|3961->2202|4024->2229|4039->2235|4094->2268|4240->2378|4304->2420|4365->2445|4380->2451|4436->2485|4578->2591|4638->2629|4698->2653|4713->2659|4769->2693|4909->2797|4970->2836|5030->2860|5045->2866|5099->2898|5241->3004|5301->3042|5361->3066|5376->3072|5446->3120|5587->3225|5649->3265|5709->3289|5724->3295|5779->3328|5919->3432|5978->3469|6038->3493|6053->3499|6108->3532|6307->3699|6368->3728
                    LINES: 27->1|33->1|35->5|36->6|36->6|36->6|48->18|48->18|48->18|48->18|50->20|55->25|57->27|61->31|65->35|72->42|72->42|72->42|72->42|73->43|77->47|80->50|84->54|86->56|92->62|95->65|95->65|96->66|96->66|96->66|99->69|99->69|100->70|100->70|100->70|103->73|103->73|104->74|104->74|104->74|107->77|107->77|108->78|108->78|108->78|111->81|111->81|112->82|112->82|112->82|115->85|115->85|116->86|116->86|116->86|119->89|119->89|120->90|120->90|120->90|123->93|123->93|124->94|124->94|124->94|127->97|127->97|128->98|128->98|128->98|134->104|139->109
                    -- GENERATED --
                */
            