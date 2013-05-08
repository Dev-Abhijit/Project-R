
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
object startproject extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[MyData],String,List[Book],Form[Project],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(recent_threads: List[MyData], userName: String, books: List[Book], myProjectForm: Form[Project]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.99*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("Home Page")/*6.19*/{_display_(Seq[Any](format.raw/*6.20*/("""
<div class="home-link">
<a href=""""),_display_(Seq[Any](/*8.11*/routes/*8.17*/.Application.home(userName))),format.raw/*8.44*/("""">My Home</a>
</div>
<div class="myread">
<h3 id="myread-h3">My Recent Reads</h3>
    <ul class="myread-ul">
        """),_display_(Seq[Any](/*13.10*/for(recent_thread <- recent_threads) yield /*13.46*/{_display_(Seq[Any](format.raw/*13.47*/("""

            <li class="read">
                """),_display_(Seq[Any](/*16.18*/recent_thread/*16.31*/.thread.header)),format.raw/*16.45*/("""
            </li>
        """)))})),format.raw/*18.10*/("""
    </ul>
<h3>My Collaborations</h3>
<h3>My Libraries</h3>
<div class="sidebar-library">
<div class="sidebar-shelf">
<ul>
"""),_display_(Seq[Any](/*25.2*/books/*25.7*/.zipWithIndex.map/*25.24*/{/*26.2*/case (book, i) =>/*26.19*/ {_display_(Seq[Any](format.raw/*26.21*/("""
<li class="book"""),_display_(Seq[Any](/*27.17*/i)),format.raw/*27.18*/("""">
<div  class="book">
"""),_display_(Seq[Any](/*29.2*/if(book.thread.header.length() > 25)/*29.38*/{_display_(Seq[Any](format.raw/*29.39*/("""

"""),_display_(Seq[Any](/*31.2*/book/*31.6*/.thread.header.substring(0,25))),format.raw/*31.36*/("""..
""")))}/*32.3*/else/*32.8*/{_display_(Seq[Any](format.raw/*32.9*/("""
"""),_display_(Seq[Any](/*33.2*/book/*33.6*/.thread.header)),format.raw/*33.20*/("""
""")))})),format.raw/*34.2*/("""
</div>
</li>
""")))}})),format.raw/*38.2*/("""
</ul>
<div class="shelf-stand">&nbsp;</div>
</div>
</div>
</div>
""")))}/*44.2*/{_display_(Seq[Any](format.raw/*44.3*/("""
	<div class="start-home">

		<div class="drop-shadow lifted">
		<div class="start-text-form">
    	"""),_display_(Seq[Any](/*49.7*/helper/*49.13*/.form(action = routes.Start.submitProject(userName))/*49.65*/ {_display_(Seq[Any](format.raw/*49.67*/("""

        <fieldset>
            <legend>Start A Collaborative Project</legend>

            """),_display_(Seq[Any](/*54.14*/inputText(
                myProjectForm("title"),
                '_label -> "Title",
                '_help -> "Please choose a title for your project.",
                '_error -> myProjectForm.globalError,
                'size -> 80
            ))),format.raw/*60.14*/("""

            """),_display_(Seq[Any](/*62.14*/inputText(
                myProjectForm("tagline"), '_label -> "Tagline",
                '_help -> "Write a catchy tagline to describe the project", 'size -> 110

            ))),format.raw/*66.14*/("""

        </fieldset>

        <input type="submit" class="" value="Submit">
        """)))})),format.raw/*71.10*/("""
		</div>
		</div>
    </div>
""")))}/*75.2*/{_display_(Seq[Any](format.raw/*75.3*/("""
	<div class="right-content">
	<a href=""""),_display_(Seq[Any](/*77.12*/routes/*77.18*/.Start.index(userName))),format.raw/*77.40*/("""" class="button-side">Start Thread</a>
	<a href=""""),_display_(Seq[Any](/*78.12*/routes/*78.18*/.Start.startNewProject(userName))),format.raw/*78.50*/("""" class="button-side">Start Collaboration</a>
	<a href="" class="button-y">Yelp!</a>
	</div>
""")))})))}
    }
    
    def render(recent_threads:List[MyData],userName:String,books:List[Book],myProjectForm:Form[Project]) = apply(recent_threads,userName,books,myProjectForm)
    
    def f:((List[MyData],String,List[Book],Form[Project]) => play.api.templates.Html) = (recent_threads,userName,books,myProjectForm) => apply(recent_threads,userName,books,myProjectForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 18 19:03:58 IST 2013
                    SOURCE: C:/saptarshi_work/Project/Ripplect/app/views/startproject.scala.html
                    HASH: bb30c7339663469016f18506f12164cc7f21e4ba
                    MATRIX: 800->1|990->98|1018->117|1055->120|1080->137|1118->138|1188->173|1202->179|1250->206|1404->324|1456->360|1495->361|1580->410|1602->423|1638->437|1698->465|1857->589|1870->594|1896->611|1905->614|1931->631|1971->633|2024->650|2047->651|2106->675|2151->711|2190->712|2228->715|2240->719|2292->749|2314->754|2326->759|2364->760|2401->762|2413->766|2449->780|2482->782|2529->799|2614->866|2652->867|2788->968|2803->974|2864->1026|2904->1028|3034->1122|3307->1373|3358->1388|3558->1566|3676->1652|3725->1683|3763->1684|3840->1725|3855->1731|3899->1753|3985->1803|4000->1809|4054->1841
                    LINES: 27->1|31->1|33->4|35->6|35->6|35->6|37->8|37->8|37->8|42->13|42->13|42->13|45->16|45->16|45->16|47->18|54->25|54->25|54->25|54->26|54->26|54->26|55->27|55->27|57->29|57->29|57->29|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|62->34|65->38|71->44|71->44|76->49|76->49|76->49|76->49|81->54|87->60|89->62|93->66|98->71|102->75|102->75|104->77|104->77|104->77|105->78|105->78|105->78
                    -- GENERATED --
                */
            