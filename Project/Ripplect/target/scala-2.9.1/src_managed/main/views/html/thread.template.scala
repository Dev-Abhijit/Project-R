
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
object thread extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template8[Post_thread,Form[MyData],List[MyData],String,List[Book],List[List[Book]],List[Library_meta],List[Post_thread],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(post_thread: Post_thread, myreadForm: Form[MyData], recent_threads: List[MyData], userName: String, books: List[Book], library: List[List[Book]], libs : List[Library_meta], contMatrix : List[Post_thread]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.207*/("""

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
<h3>My Libraries</h3><div class="sidebar-lib-home">
"""),_display_(Seq[Any](/*22.2*/for(books <- library) yield /*22.23*/{_display_(Seq[Any](format.raw/*22.24*/("""
<div class="sidebar-library">
<div class="sidebar-shelf">
<ul class="mylib-ul">
"""),_display_(Seq[Any](/*26.2*/books/*26.7*/.zipWithIndex.map/*26.24*/{/*27.2*/case (book, i) =>/*27.19*/ {_display_(Seq[Any](format.raw/*27.21*/("""
<li class="book"""),_display_(Seq[Any](/*28.17*/i)),format.raw/*28.18*/("""">
<div  class="book">
"""),_display_(Seq[Any](/*30.2*/if(book.thread.header.length() > 25)/*30.38*/{_display_(Seq[Any](format.raw/*30.39*/("""

"""),_display_(Seq[Any](/*32.2*/book/*32.6*/.thread.header.substring(0,25))),format.raw/*32.36*/("""..
""")))}/*33.3*/else/*33.8*/{_display_(Seq[Any](format.raw/*33.9*/("""
"""),_display_(Seq[Any](/*34.2*/book/*34.6*/.thread.header)),format.raw/*34.20*/("""
""")))})),format.raw/*35.2*/("""
</div>
</li>
""")))}})),format.raw/*39.2*/("""
</ul>
<div class="shelf-stand">&nbsp;</div>



</div>
</div>

""")))})),format.raw/*48.2*/("""
<div class="lib-home-link"><a href="""),_display_(Seq[Any](/*49.37*/routes/*49.43*/.Application.libHome(userName))),format.raw/*49.73*/(""">Library Home >></a></div>
</div>
</div>

""")))}/*53.2*/{_display_(Seq[Any](format.raw/*53.3*/("""
	<div class="content-home">
		<div class="wrap">

		<h4>"""),_display_(Seq[Any](/*57.8*/post_thread/*57.19*/.header)),format.raw/*57.26*/("""</h4>

		<div class="content-two-col">


		<div class="first-para">
		<p>
		"""),_display_(Seq[Any](/*64.4*/post_thread/*64.15*/.excerpt)),format.raw/*64.23*/("""
		</p>
		</div>
		"""),_display_(Seq[Any](/*67.4*/if(post_thread.image_loc != null)/*67.37*/{_display_(Seq[Any](format.raw/*67.38*/("""
		<center>
		<img src="""),_display_(Seq[Any](/*69.13*/routes/*69.19*/.Assets.at(post_thread.image_loc))),format.raw/*69.52*/(""" width="300">
		</center>
		""")))})),format.raw/*71.4*/("""
		"""),_display_(Seq[Any](/*72.4*/if(post_thread.content == null)/*72.35*/ {_display_(Seq[Any](format.raw/*72.37*/("""
			Sorry, No content entered!
		""")))}/*74.5*/else/*74.10*/{_display_(Seq[Any](format.raw/*74.11*/("""
		"""),_display_(Seq[Any](/*75.4*/Html(post_thread.content))),format.raw/*75.29*/("""
		""")))})),format.raw/*76.4*/("""

		</div>


		</div>
        """),_display_(Seq[Any](/*82.10*/helper/*82.16*/.form(action = routes.Application.addToMyLib(userName, post_thread.id))/*82.87*/ {_display_(Seq[Any](format.raw/*82.89*/("""
		<fieldset>
           <legend>Librarian's Desk</legend>
           <select name="shelf_Id" onChange="submit()">
           <option value="">Add to Library</option>
           """),_display_(Seq[Any](/*87.13*/for(lib <- libs) yield /*87.29*/{_display_(Seq[Any](format.raw/*87.30*/("""
                 <option value=""""),_display_(Seq[Any](/*88.34*/lib/*88.37*/.Id)),format.raw/*88.40*/("""">"""),_display_(Seq[Any](/*88.43*/lib/*88.46*/.name)),format.raw/*88.51*/("""</option>
           """)))})),format.raw/*89.13*/("""
           </select>
           <div id='basic-modal'>
			<input type='button' name='basic' value='Ripplect' class="basic"/>
			</div>

			<!-- modal content -->
			<div id="basic-modal-content">
				<h3>Choose a content to Ripplect it!</h3>
				<div class="myripplect">
				<ul>
				<h4>From the recent reads</h4>
					"""),_display_(Seq[Any](/*101.7*/for(recent_thread <- recent_threads) yield /*101.43*/{_display_(Seq[Any](format.raw/*101.44*/("""

						<li class="read">
							"""),_display_(Seq[Any](/*104.9*/recent_thread/*104.22*/.thread.header)),format.raw/*104.36*/("""
						</li>
					""")))})),format.raw/*106.7*/("""
				</ul>
				</div>

				<div class="myripplect">
					<h4>From my library</h3>
					<ul>
					"""),_display_(Seq[Any](/*113.7*/for(books <- library) yield /*113.28*/{_display_(Seq[Any](format.raw/*113.29*/("""
					"""),_display_(Seq[Any](/*114.7*/for(book <- books) yield /*114.25*/{_display_(Seq[Any](format.raw/*114.26*/("""
					<li class="read">
					"""),_display_(Seq[Any](/*116.7*/book/*116.11*/.thread.header)),format.raw/*116.25*/("""
					""")))})),format.raw/*117.7*/("""
					</li>
					""")))})),format.raw/*119.7*/("""
					</ul>
				</div>

			</div>

			<!-- preload the images -->
			<div style='display:none'>
				<img src="""),_display_(Seq[Any](/*127.15*/routes/*127.21*/.Assets.at("images/x.png"))),format.raw/*127.47*/(""" alt="">
			</div>
		</fieldset>


        """)))})),format.raw/*132.10*/("""
        <ul class="cont-matrix">
        """),_display_(Seq[Any](/*134.10*/for(cont <- contMatrix) yield /*134.33*/{_display_(Seq[Any](format.raw/*134.34*/("""
            <li class="matrix-li">
            <div class="drop-shadow lifted" onClick="document.getElementById("""),_display_(Seq[Any](/*136.79*/post_thread/*136.90*/.id)),format.raw/*136.93*/(""").click()">

                <h4>"""),_display_(Seq[Any](/*138.22*/cont/*138.26*/.header)),format.raw/*138.33*/("""</h4>
                """),_display_(Seq[Any](/*139.18*/if(cont.image_loc != null)/*139.44*/{_display_(Seq[Any](format.raw/*139.45*/("""
                <img src="""),_display_(Seq[Any](/*140.27*/routes/*140.33*/.Assets.at(cont.image_loc))),format.raw/*140.59*/(""" width="100%">
                """)))}/*141.19*/else/*141.24*/{_display_(Seq[Any](format.raw/*141.25*/("""
                <p>"""),_display_(Seq[Any](/*142.21*/cont/*142.25*/.excerpt)),format.raw/*142.33*/("""</p>
                """)))})),format.raw/*143.18*/("""
                """),_display_(Seq[Any](/*144.18*/form(routes.Application.addRead(userName, cont.id))/*144.69*/ {_display_(Seq[Any](format.raw/*144.71*/("""
                    <input id =""""),_display_(Seq[Any](/*145.34*/post_thread/*145.45*/.id)),format.raw/*145.48*/("""" type="button" onClick="submit()" style="visibility:hidden">
                """)))})),format.raw/*146.18*/("""
            </div>
            </li>
        """)))})),format.raw/*149.10*/("""
        </ul>

    </div>

""")))}/*154.2*/{_display_(Seq[Any](format.raw/*154.3*/("""
<h3>Testing</h3>
""")))})))}
    }
    
    def render(post_thread:Post_thread,myreadForm:Form[MyData],recent_threads:List[MyData],userName:String,books:List[Book],library:List[List[Book]],libs:List[Library_meta],contMatrix:List[Post_thread]) = apply(post_thread,myreadForm,recent_threads,userName,books,library,libs,contMatrix)
    
    def f:((Post_thread,Form[MyData],List[MyData],String,List[Book],List[List[Book]],List[Library_meta],List[Post_thread]) => play.api.templates.Html) = (post_thread,myreadForm,recent_threads,userName,books,library,libs,contMatrix) => apply(post_thread,myreadForm,recent_threads,userName,books,library,libs,contMatrix)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 18 19:03:58 IST 2013
                    SOURCE: C:/saptarshi_work/Project/Ripplect/app/views/thread.scala.html
                    HASH: ac081547ada899e1cb6beb45fa45afa7cd9c4155
                    MATRIX: 859->1|1158->206|1186->225|1223->228|1248->245|1286->246|1356->281|1370->287|1418->314|1572->432|1624->468|1663->469|1748->518|1770->531|1806->545|1866->573|1992->664|2029->685|2068->686|2185->768|2198->773|2224->790|2233->793|2259->810|2299->812|2352->829|2375->830|2434->854|2479->890|2518->891|2556->894|2568->898|2620->928|2642->933|2654->938|2692->939|2729->941|2741->945|2777->959|2810->961|2857->978|2952->1042|3025->1079|3040->1085|3092->1115|3153->1158|3191->1159|3284->1217|3304->1228|3333->1235|3445->1312|3465->1323|3495->1331|3550->1351|3592->1384|3631->1385|3691->1409|3706->1415|3761->1448|3821->1477|3860->1481|3900->1512|3940->1514|3992->1549|4005->1554|4044->1555|4083->1559|4130->1584|4165->1588|4232->1619|4247->1625|4327->1696|4367->1698|4582->1877|4614->1893|4653->1894|4723->1928|4735->1931|4760->1934|4799->1937|4811->1940|4838->1945|4892->1967|5250->2289|5303->2325|5343->2326|5413->2360|5436->2373|5473->2387|5524->2406|5658->2504|5696->2525|5736->2526|5779->2533|5814->2551|5854->2552|5920->2582|5934->2586|5971->2600|6010->2607|6060->2625|6207->2735|6223->2741|6272->2767|6349->2811|6429->2854|6469->2877|6509->2878|6660->2992|6681->3003|6707->3006|6778->3040|6792->3044|6822->3051|6882->3074|6918->3100|6958->3101|7022->3128|7038->3134|7087->3160|7139->3193|7153->3198|7193->3199|7251->3220|7265->3224|7296->3232|7351->3254|7406->3272|7467->3323|7508->3325|7579->3359|7600->3370|7626->3373|7738->3452|7818->3499|7866->3528|7905->3529
                    LINES: 27->1|31->1|33->4|35->6|35->6|35->6|37->8|37->8|37->8|42->13|42->13|42->13|45->16|45->16|45->16|47->18|51->22|51->22|51->22|55->26|55->26|55->26|55->27|55->27|55->27|56->28|56->28|58->30|58->30|58->30|60->32|60->32|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|66->39|75->48|76->49|76->49|76->49|80->53|80->53|84->57|84->57|84->57|91->64|91->64|91->64|94->67|94->67|94->67|96->69|96->69|96->69|98->71|99->72|99->72|99->72|101->74|101->74|101->74|102->75|102->75|103->76|109->82|109->82|109->82|109->82|114->87|114->87|114->87|115->88|115->88|115->88|115->88|115->88|115->88|116->89|128->101|128->101|128->101|131->104|131->104|131->104|133->106|140->113|140->113|140->113|141->114|141->114|141->114|143->116|143->116|143->116|144->117|146->119|154->127|154->127|154->127|159->132|161->134|161->134|161->134|163->136|163->136|163->136|165->138|165->138|165->138|166->139|166->139|166->139|167->140|167->140|167->140|168->141|168->141|168->141|169->142|169->142|169->142|170->143|171->144|171->144|171->144|172->145|172->145|172->145|173->146|176->149|181->154|181->154
                    -- GENERATED --
                */
            