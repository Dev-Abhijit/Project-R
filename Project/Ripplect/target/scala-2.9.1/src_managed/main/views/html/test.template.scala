
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
object test extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""

"""),_display_(Seq[Any](/*4.2*/main("Home Page")/*4.19*/{_display_(Seq[Any](format.raw/*4.20*/("""

""")))}/*6.2*/{_display_(Seq[Any](format.raw/*6.3*/("""


<div style="clear:both"/>
<br/><br/><br/><br/><br/><br/><br/>
<div class="result1" style="border: 1px solid black; padding: 5px;">not sent yet...</div>

<div id="items1">
    <a href=""""),_display_(Seq[Any](/*14.15*/routes/*14.21*/.Application.user(1))),format.raw/*14.41*/("""" onclick="return false;">Select user 1</a>
    <a href=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Application.user(2))),format.raw/*15.41*/("""" onclick="return false;">Select user 2</a>
    <a href=""""),_display_(Seq[Any](/*16.15*/routes/*16.21*/.Application.user(3))),format.raw/*16.41*/("""" onclick="return false;">Select user 3</a>
</div>


""")))}/*20.2*/{_display_(Seq[Any](format.raw/*20.3*/("""

""")))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 18 19:03:58 IST 2013
                    SOURCE: C:/saptarshi_work/Project/Ripplect/app/views/test.scala.html
                    HASH: 9af80361ed3bb21efe6195e931a4caa2a4e1a1ce
                    MATRIX: 835->18|874->23|899->40|937->41|959->46|996->47|1228->243|1243->249|1285->269|1380->328|1395->334|1437->354|1532->413|1547->419|1589->439|1665->497|1703->498
                    LINES: 31->2|33->4|33->4|33->4|35->6|35->6|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|49->20|49->20
                    -- GENERATED --
                */
            