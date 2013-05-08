
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
object library extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template5[List[MyData],String,List[Project],List[List[Book]],Form[Library_meta],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(recent_threads: List[MyData], userName: String, projects: List[Project], library: List[List[Book]], myLibForm: Form[Library_meta]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.133*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("My Library")/*6.20*/{_display_(Seq[Any](format.raw/*6.21*/("""
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
	<h3>My Library</h3>
	"""),_display_(Seq[Any](/*56.3*/for(books <- library) yield /*56.24*/{_display_(Seq[Any](format.raw/*56.25*/("""
	<div class="lib-home">

	<ul class="lib-home-content-ul">

	"""),_display_(Seq[Any](/*61.3*/books/*61.8*/.zipWithIndex.map/*61.25*/{/*62.3*/case (book, i) =>/*62.20*/ {_display_(Seq[Any](format.raw/*62.22*/("""
	 """),_display_(Seq[Any](/*63.4*/if(i < 1)/*63.13*/{_display_(Seq[Any](format.raw/*63.14*/("""
	 <h4>"""),_display_(Seq[Any](/*64.8*/book/*64.12*/.shelf_Id.name)),format.raw/*64.26*/("""</h4>
	 """)))})),format.raw/*65.4*/("""
	 """),_display_(Seq[Any](/*66.4*/if(i < 2)/*66.13*/{_display_(Seq[Any](format.raw/*66.14*/("""

	<li>
	<div  class="book">

	"""),_display_(Seq[Any](/*71.3*/if(book.thread.header.length() > 30)/*71.39*/{_display_(Seq[Any](format.raw/*71.40*/("""

	"""),_display_(Seq[Any](/*73.3*/book/*73.7*/.thread.header.substring(0,30))),format.raw/*73.37*/("""..
	""")))}/*74.4*/else/*74.9*/{_display_(Seq[Any](format.raw/*74.10*/("""
	"""),_display_(Seq[Any](/*75.3*/book/*75.7*/.thread.header)),format.raw/*75.21*/("""
	""")))})),format.raw/*76.3*/("""
	</div>
	 <div class="drop-shadow">
	 	"""),_display_(Seq[Any](/*79.5*/book/*79.9*/.thread.excerpt)),format.raw/*79.24*/("""
		"""),_display_(Seq[Any](/*80.4*/if(book.thread.image_loc != null)/*80.37*/{_display_(Seq[Any](format.raw/*80.38*/("""
		<img src="""),_display_(Seq[Any](/*81.13*/routes/*81.19*/.Assets.at(book.thread.image_loc))),format.raw/*81.52*/(""" width="100%">
		""")))})),format.raw/*82.4*/("""
	 </div>
	 </li>
	 """)))}/*85.5*/else/*85.10*/{_display_(Seq[Any](format.raw/*85.11*/("""
	 <li class="mylib-header-li">
	 <div class="mylib-book"""),_display_(Seq[Any](/*87.26*/i)),format.raw/*87.27*/("""">
	"""),_display_(Seq[Any](/*88.3*/if(book.thread.header.length() > 45)/*88.39*/{_display_(Seq[Any](format.raw/*88.40*/("""

	"""),_display_(Seq[Any](/*90.3*/book/*90.7*/.thread.header.substring(0,45))),format.raw/*90.37*/("""..
	""")))}/*91.4*/else/*91.9*/{_display_(Seq[Any](format.raw/*91.10*/("""
	"""),_display_(Seq[Any](/*92.3*/book/*92.7*/.thread.header)),format.raw/*92.21*/("""
	""")))})),format.raw/*93.3*/("""
	<br/>
	<span class="mylib-author">
	"""),_display_(Seq[Any](/*96.3*/book/*96.7*/.thread.user.getName())),format.raw/*96.29*/("""
	</span>
	 </li>
	 """)))})),format.raw/*99.4*/("""
	""")))}})),format.raw/*101.3*/("""
	</ul>
<div class="mylib-stand">&nbsp;</div>
<div style="clear:both;width:10px;">&nbsp;</div>
""")))})),format.raw/*105.2*/("""

		<div class="start-text-form">
    	"""),_display_(Seq[Any](/*108.7*/helper/*108.13*/.form(action = routes.Application.createShelf(userName))/*108.69*/ {_display_(Seq[Any](format.raw/*108.71*/("""

        <fieldset>
            <legend>Librarian's Desk</legend>

		<input type="text" name="name" size="40">
        <input type="submit" class="" value="Create a New Shelf">

        </fieldset>
        <br/><br/>
        """)))})),format.raw/*118.10*/("""
		</div>
	</div>



""")))}/*124.2*/{_display_(Seq[Any](format.raw/*124.3*/("""
	<div class="right-content">
	<a href=""""),_display_(Seq[Any](/*126.12*/routes/*126.18*/.Start.index(userName))),format.raw/*126.40*/("""" class="button-side">Start Thread</a>
	<a href=""""),_display_(Seq[Any](/*127.12*/routes/*127.18*/.Start.startNewProject(userName))),format.raw/*127.50*/("""" class="button-side">Start Collaboration</a>
	<a href="" class="button-y">Yelp!</a>
	</div>
""")))})))}
    }
    
    def render(recent_threads:List[MyData],userName:String,projects:List[Project],library:List[List[Book]],myLibForm:Form[Library_meta]) = apply(recent_threads,userName,projects,library,myLibForm)
    
    def f:((List[MyData],String,List[Project],List[List[Book]],Form[Library_meta]) => play.api.templates.Html) = (recent_threads,userName,projects,library,myLibForm) => apply(recent_threads,userName,projects,library,myLibForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 18 19:03:58 IST 2013
                    SOURCE: C:/saptarshi_work/Project/Ripplect/app/views/library.scala.html
                    HASH: 1c7753a305d793f0064cf560bfb4961620ac3996
                    MATRIX: 820->1|1045->132|1073->151|1110->154|1136->172|1174->173|1244->208|1258->214|1306->241|1460->359|1512->395|1551->396|1636->445|1658->458|1694->472|1754->500|1912->623|1949->644|1988->645|2105->727|2118->732|2144->749|2153->752|2179->769|2219->771|2272->788|2295->789|2354->813|2399->849|2438->850|2476->853|2488->857|2540->887|2562->892|2574->897|2612->898|2649->900|2661->904|2697->918|2730->920|2777->937|2872->1001|2945->1038|2960->1044|3012->1074|3072->1116|3110->1117|3197->1169|3234->1190|3273->1191|3371->1254|3384->1259|3410->1276|3419->1280|3445->1297|3485->1299|3524->1303|3542->1312|3581->1313|3624->1321|3637->1325|3673->1339|3713->1348|3752->1352|3770->1361|3809->1362|3876->1394|3921->1430|3960->1431|3999->1435|4011->1439|4063->1469|4086->1475|4098->1480|4137->1481|4175->1484|4187->1488|4223->1502|4257->1505|4333->1546|4345->1550|4382->1565|4421->1569|4463->1602|4502->1603|4551->1616|4566->1622|4621->1655|4670->1673|4709->1695|4722->1700|4761->1701|4854->1758|4877->1759|4917->1764|4962->1800|5001->1801|5040->1805|5052->1809|5104->1839|5127->1845|5139->1850|5178->1851|5216->1854|5228->1858|5264->1872|5298->1875|5372->1914|5384->1918|5428->1940|5480->1961|5516->1967|5644->2063|5720->2103|5736->2109|5802->2165|5843->2167|6103->2394|6144->2416|6183->2417|6261->2458|6277->2464|6322->2486|6409->2536|6425->2542|6480->2574
                    LINES: 27->1|31->1|33->4|35->6|35->6|35->6|37->8|37->8|37->8|42->13|42->13|42->13|45->16|45->16|45->16|47->18|52->23|52->23|52->23|56->27|56->27|56->27|56->28|56->28|56->28|57->29|57->29|59->31|59->31|59->31|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|67->40|76->49|77->50|77->50|77->50|80->53|80->53|83->56|83->56|83->56|88->61|88->61|88->61|88->62|88->62|88->62|89->63|89->63|89->63|90->64|90->64|90->64|91->65|92->66|92->66|92->66|97->71|97->71|97->71|99->73|99->73|99->73|100->74|100->74|100->74|101->75|101->75|101->75|102->76|105->79|105->79|105->79|106->80|106->80|106->80|107->81|107->81|107->81|108->82|111->85|111->85|111->85|113->87|113->87|114->88|114->88|114->88|116->90|116->90|116->90|117->91|117->91|117->91|118->92|118->92|118->92|119->93|122->96|122->96|122->96|125->99|126->101|130->105|133->108|133->108|133->108|133->108|143->118|149->124|149->124|151->126|151->126|151->126|152->127|152->127|152->127
                    -- GENERATED --
                */
            