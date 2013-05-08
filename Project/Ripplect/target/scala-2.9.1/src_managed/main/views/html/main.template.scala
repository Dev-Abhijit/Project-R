
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Html,Html,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(sidebar: Html)(content: Html)(rightcontent: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.67*/("""

<!DOCTYPE html>

<html>
    <head>

        <title>"""),_display_(Seq[Any](/*8.17*/title)),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/stylesheet.css"))),format.raw/*9.100*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/style-functions.js"))),format.raw/*11.73*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/tinymce/jscripts/tiny_mce/tiny_mce.js"))),format.raw/*12.92*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/basic-dialog/js/jquery.simplemodal.js"))),format.raw/*13.92*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/basic-dialog/js/basic.js"))),format.raw/*14.79*/("""" type="text/javascript"></script>
		<script type="text/javascript">
		tinyMCE.init("""),format.raw("""{"""),format.raw/*16.17*/("""
				mode : "textareas"
		"""),format.raw("""}"""),format.raw/*18.4*/(""");
		</script>
    </head>
    <body>
	<div class="header">
	<div style="float:right;padding-right:20px;">Welcome, User</div>
	</div><!--header-->
	<div class="main">
	<div class="header-text">Ripplect</div>
	<div class="sidebar">
    <section class="sidebar">"""),_display_(Seq[Any](/*28.31*/sidebar)),format.raw/*28.38*/("""</section>
    </div>

    <section class="content">"""),_display_(Seq[Any](/*31.31*/content)),format.raw/*31.38*/("""</section>

    <section class="rightcontent">"""),_display_(Seq[Any](/*33.36*/rightcontent)),format.raw/*33.48*/("""</section>

	</div><!--main -->
    </body>

</html>
"""))}
    }
    
    def render(title:String,sidebar:Html,content:Html,rightcontent:Html) = apply(title)(sidebar)(content)(rightcontent)
    
    def f:((String) => (Html) => (Html) => (Html) => play.api.templates.Html) = (title) => (sidebar) => (content) => (rightcontent) => apply(title)(sidebar)(content)(rightcontent)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 18 19:03:58 IST 2013
                    SOURCE: C:/saptarshi_work/Project/Ripplect/app/views/main.scala.html
                    HASH: 0c87dd3bf5f7084bcddac40a0831b04024d97993
                    MATRIX: 769->1|911->66|1000->120|1026->125|1123->187|1137->193|1199->233|1260->258|1275->264|1342->309|1435->366|1450->372|1516->416|1609->473|1624->479|1709->542|1802->599|1817->605|1902->668|1995->725|2010->731|2082->781|2214->866|2287->893|2584->1154|2613->1161|2702->1214|2731->1221|2814->1268|2848->1280
                    LINES: 27->1|30->1|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|45->16|47->18|57->28|57->28|60->31|60->31|62->33|62->33
                    -- GENERATED --
                */
            