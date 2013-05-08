
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
object logintemplate extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""
<!DOCTYPE html>

<html>
    <head>

        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/stylesheet.css"))),format.raw/*8.100*/("""">
        <script src=""""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*9.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/style-functions.js"))),format.raw/*10.73*/("""" type="text/javascript"></script>
    </head>
    <body>
	<div class="header">
	</div><!--header-->
	<div class="main">
	<div class="header-text">Ripplect</div>
    <section class="content">"""),_display_(Seq[Any](/*17.31*/content)),format.raw/*17.38*/("""</section>

	</div><!--main -->
    </body>

</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 18 19:03:58 IST 2013
                    SOURCE: C:/saptarshi_work/Project/Ripplect/app/views/logintemplate.scala.html
                    HASH: 9eb1765fbfb0b1b423b39258a1429dbb0bbc90b5
                    MATRIX: 768->1|875->31|963->84|989->89|1086->151|1100->157|1162->197|1222->222|1236->228|1302->273|1395->330|1410->336|1476->380|1704->572|1733->579
                    LINES: 27->1|30->1|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|46->17|46->17
                    -- GENERATED --
                */
            