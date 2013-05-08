
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template6[List[Post_thread],Form[MyData],List[MyData],String,List[Project],List[List[Book]],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(post_threads: List[Post_thread], myreadForm: Form[MyData], recent_threads: List[MyData], userName: String, projects: List[Project], library: List[List[Book]]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.161*/("""

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
<h3 id="mycollab-h3">My Collaborations</h3>
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
""")))}/*53.2*/{_display_(Seq[Any](format.raw/*53.3*/("""
	<div class="content-home">

	<div class="top-section">
	<input type="text"></input> with <input type="text"></input> <input type="button" value="Ripplect" class="button"></input>

	<input type="button" value="New Content" class="button"></input>
	</div>

    <ul>
        """),_display_(Seq[Any](/*63.10*/for(post_thread <- post_threads) yield /*63.42*/{_display_(Seq[Any](format.raw/*63.43*/("""

            <li>

            <div class="drop-shadow lifted" onClick="document.getElementById("""),_display_(Seq[Any](/*67.79*/post_thread/*67.90*/.id)),format.raw/*67.93*/(""").click()">

                <h4>"""),_display_(Seq[Any](/*69.22*/post_thread/*69.33*/.header)),format.raw/*69.40*/("""</h4>
                """),_display_(Seq[Any](/*70.18*/if(post_thread.image_loc != null)/*70.51*/{_display_(Seq[Any](format.raw/*70.52*/("""
                <img src="""),_display_(Seq[Any](/*71.27*/routes/*71.33*/.Assets.at(post_thread.image_loc))),format.raw/*71.66*/(""" width="100%">
                """)))})),format.raw/*72.18*/("""
                <p>"""),_display_(Seq[Any](/*73.21*/post_thread/*73.32*/.excerpt)),format.raw/*73.40*/("""</p>
                <h4>by """),_display_(Seq[Any](/*74.25*/post_thread/*74.36*/.user.name)),format.raw/*74.46*/("""</h4>
                """),_display_(Seq[Any](/*75.18*/form(routes.Application.addRead(userName, post_thread.id))/*75.76*/ {_display_(Seq[Any](format.raw/*75.78*/("""
                    <input id =""""),_display_(Seq[Any](/*76.34*/post_thread/*76.45*/.id)),format.raw/*76.48*/("""" type="button" onClick="submit()" style="visibility:hidden">
                """)))})),format.raw/*77.18*/("""
            </div>
            </li>
        """)))})),format.raw/*80.10*/("""
    </ul>

    <div class="project-list">

    <ul>
    """),_display_(Seq[Any](/*86.6*/for(project <- projects) yield /*86.30*/{_display_(Seq[Any](format.raw/*86.31*/("""
    <li class="project-single">
    """),_display_(Seq[Any](/*88.6*/project/*88.13*/.title)),format.raw/*88.19*/("""
    <span class="grp-desc">"""),_display_(Seq[Any](/*89.29*/project/*89.36*/.tagline)),format.raw/*89.44*/("""</span>
    <p class="grp-memb">30 Supporters</p>
    </li>
	""")))})),format.raw/*92.3*/("""
    </ul>

    </div>
    </div>

""")))}/*98.2*/{_display_(Seq[Any](format.raw/*98.3*/("""
	<div class="right-content">
	<a href="" class="button-y">Yelp!</a>
	</div>
""")))})))}
    }
    
    def render(post_threads:List[Post_thread],myreadForm:Form[MyData],recent_threads:List[MyData],userName:String,projects:List[Project],library:List[List[Book]]) = apply(post_threads,myreadForm,recent_threads,userName,projects,library)
    
    def f:((List[Post_thread],Form[MyData],List[MyData],String,List[Project],List[List[Book]]) => play.api.templates.Html) = (post_threads,myreadForm,recent_threads,userName,projects,library) => apply(post_threads,myreadForm,recent_threads,userName,projects,library)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 18 19:03:57 IST 2013
                    SOURCE: C:/saptarshi_work/Project/Ripplect/app/views/index.scala.html
                    HASH: 4f2b002c24aeb5ec5bb6817b584fa0f52e42c402
                    MATRIX: 830->1|1083->160|1111->179|1148->182|1173->199|1211->200|1281->235|1295->241|1343->268|1497->386|1549->422|1588->423|1673->472|1695->485|1731->499|1791->527|1949->650|1986->671|2025->672|2142->754|2155->759|2181->776|2190->779|2216->796|2256->798|2309->815|2332->816|2391->840|2436->876|2475->877|2513->880|2525->884|2577->914|2599->919|2611->924|2649->925|2686->927|2698->931|2734->945|2767->947|2814->964|2909->1028|2982->1065|2997->1071|3049->1101|3109->1143|3147->1144|3458->1419|3506->1451|3545->1452|3679->1550|3699->1561|3724->1564|3794->1598|3814->1609|3843->1616|3902->1639|3944->1672|3983->1673|4046->1700|4061->1706|4116->1739|4180->1771|4237->1792|4257->1803|4287->1811|4352->1840|4372->1851|4404->1861|4463->1884|4530->1942|4570->1944|4640->1978|4660->1989|4685->1992|4796->2071|4875->2118|4968->2176|5008->2200|5047->2201|5120->2239|5136->2246|5164->2252|5229->2281|5245->2288|5275->2296|5368->2358|5422->2394|5460->2395
                    LINES: 27->1|31->1|33->4|35->6|35->6|35->6|37->8|37->8|37->8|42->13|42->13|42->13|45->16|45->16|45->16|47->18|52->23|52->23|52->23|56->27|56->27|56->27|56->28|56->28|56->28|57->29|57->29|59->31|59->31|59->31|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|67->40|76->49|77->50|77->50|77->50|80->53|80->53|90->63|90->63|90->63|94->67|94->67|94->67|96->69|96->69|96->69|97->70|97->70|97->70|98->71|98->71|98->71|99->72|100->73|100->73|100->73|101->74|101->74|101->74|102->75|102->75|102->75|103->76|103->76|103->76|104->77|107->80|113->86|113->86|113->86|115->88|115->88|115->88|116->89|116->89|116->89|119->92|125->98|125->98
                    -- GENERATED --
                */
            