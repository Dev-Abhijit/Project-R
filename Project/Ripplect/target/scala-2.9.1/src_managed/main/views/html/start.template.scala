
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
object start extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template5[List[MyData],String,List[Book],Form[Post_thread],List[List[Book]],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(recent_threads: List[MyData], userName: String, books: List[Book], myThreadForm: Form[Post_thread], library: List[List[Book]]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.129*/("""

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
<h3 id="mylib-h3">My Libraries</h3>
<div class="sidebar-lib-home">
"""),_display_(Seq[Any](/*23.2*/for(books <- library) yield /*23.23*/{_display_(Seq[Any](format.raw/*23.24*/("""
<div class="sidebar-library">
<div class="sidebar-shelf">
<ul class="mylib-ul">
"""),_display_(Seq[Any](/*27.2*/books/*27.7*/.zipWithIndex.map/*27.24*/{/*28.2*/case (book, i) =>/*28.19*/ {_display_(Seq[Any](format.raw/*28.21*/("""
<li class="book"""),_display_(Seq[Any](/*29.17*/i)),format.raw/*29.18*/("""">
<div  class="book">
"""),_display_(Seq[Any](/*31.2*/if(book.thread.header.length() > 25)/*31.38*/{_display_(Seq[Any](format.raw/*31.39*/("""

"""),_display_(Seq[Any](/*33.2*/book/*33.6*/.thread.header.substring(0,25))),format.raw/*33.36*/("""..
""")))}/*34.3*/else/*34.8*/{_display_(Seq[Any](format.raw/*34.9*/("""
"""),_display_(Seq[Any](/*35.2*/book/*35.6*/.thread.header)),format.raw/*35.20*/("""
""")))})),format.raw/*36.2*/("""
</div>
</li>
""")))}})),format.raw/*40.2*/("""
</ul>
<div class="shelf-stand">&nbsp;</div>



</div>
</div>

""")))})),format.raw/*49.2*/("""
<div class="lib-home-link"><a href="""),_display_(Seq[Any](/*50.37*/routes/*50.43*/.Application.libHome(userName))),format.raw/*50.73*/(""">Library Home >></a></div>
</div>
</div>

""")))}/*54.2*/{_display_(Seq[Any](format.raw/*54.3*/("""
	<div class="start-home">

		<div class="drop-shadow lifted">
		<div class="start-text-form">
    	"""),_display_(Seq[Any](/*59.7*/helper/*59.13*/.form(action = routes.Start.submit(userName, "myThread"))/*59.70*/ {_display_(Seq[Any](format.raw/*59.72*/("""

        <fieldset>
            <legend>Start A Thread</legend>

            """),_display_(Seq[Any](/*64.14*/inputText(
                myThreadForm("header"),
                '_label -> "Header",
                '_help -> "Please choose a header for your thread.",
                '_error -> myThreadForm.globalError,
                'size -> 100
            ))),format.raw/*70.14*/("""

            """),_display_(Seq[Any](/*72.14*/textarea(
                myThreadForm("content"), '_label -> "Content",
                '_help -> "Write the main content.", 'cols -> 85,
                'rows -> 25

            ))),format.raw/*77.14*/("""

           """),_display_(Seq[Any](/*79.13*/select(
                myThreadForm("interest"),
                options = options(Interests.list),
                '_default -> "Choose the Interest Category",
                '_label -> "Interest",
                '_help -> ""
            ))),format.raw/*85.14*/("""

        </fieldset>

        <input type="submit" class="" value="Submit">
        """)))})),format.raw/*90.10*/("""
		</div>
		</div>
    </div>
""")))}/*94.2*/{_display_(Seq[Any](format.raw/*94.3*/("""
	<div class="right-content">
	<a href=""""),_display_(Seq[Any](/*96.12*/routes/*96.18*/.Start.index(userName))),format.raw/*96.40*/("""" class="button-side">Start Thread</a>
	<a href=""""),_display_(Seq[Any](/*97.12*/routes/*97.18*/.Start.startNewProject(userName))),format.raw/*97.50*/("""" class="button-side">Start Collaboration</a>
	<a href="" class="button-y">Yelp!</a>
	</div>
""")))})))}
    }
    
    def render(recent_threads:List[MyData],userName:String,books:List[Book],myThreadForm:Form[Post_thread],library:List[List[Book]]) = apply(recent_threads,userName,books,myThreadForm,library)
    
    def f:((List[MyData],String,List[Book],Form[Post_thread],List[List[Book]]) => play.api.templates.Html) = (recent_threads,userName,books,myThreadForm,library) => apply(recent_threads,userName,books,myThreadForm,library)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 18 19:03:58 IST 2013
                    SOURCE: C:/saptarshi_work/Project/Ripplect/app/views/start.scala.html
                    HASH: 5ef99a3e69ede1b8b45a0677f8e797dda6aea4ac
                    MATRIX: 814->1|1035->128|1063->147|1100->150|1125->167|1163->168|1233->203|1247->209|1295->236|1449->354|1501->390|1540->391|1625->440|1647->453|1683->467|1743->495|1884->601|1921->622|1960->623|2077->705|2090->710|2116->727|2125->730|2151->747|2191->749|2244->766|2267->767|2326->791|2371->827|2410->828|2448->831|2460->835|2512->865|2534->870|2546->875|2584->876|2621->878|2633->882|2669->896|2702->898|2749->915|2844->979|2917->1016|2932->1022|2984->1052|3045->1095|3083->1096|3219->1197|3234->1203|3300->1260|3340->1262|3455->1341|3729->1593|3780->1608|3983->1789|4033->1803|4298->2046|4416->2132|4465->2163|4503->2164|4580->2205|4595->2211|4639->2233|4725->2283|4740->2289|4794->2321
                    LINES: 27->1|31->1|33->4|35->6|35->6|35->6|37->8|37->8|37->8|42->13|42->13|42->13|45->16|45->16|45->16|47->18|52->23|52->23|52->23|56->27|56->27|56->27|56->28|56->28|56->28|57->29|57->29|59->31|59->31|59->31|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|67->40|76->49|77->50|77->50|77->50|81->54|81->54|86->59|86->59|86->59|86->59|91->64|97->70|99->72|104->77|106->79|112->85|117->90|121->94|121->94|123->96|123->96|123->96|124->97|124->97|124->97
                    -- GENERATED --
                */
            