
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
object opinion extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,Form[OpinionDetails],List[String],List[OpinionDetails],List[OpinionObj],List[OpinionObj],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(userName : String, myOpinionForm: Form[OpinionDetails], visb: List[String], opinion_details: List[OpinionDetails], opinionobj: List[OpinionObj], opDetails : List[OpinionObj]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.177*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("Home Page")/*6.19*/{_display_(Seq[Any](format.raw/*6.20*/("""
<div class="home-link">
<a href=""""),_display_(Seq[Any](/*8.11*/routes/*8.17*/.Application.opinionHome(userName))),format.raw/*8.51*/("""">My Home</a>
</div>
<div class="myprofile">
<h3 id="myprofile-h3">My Profile</h3>
<ul class="myprofile-ul">
"""),_display_(Seq[Any](/*13.2*/userName)),format.raw/*13.10*/("""
</ul>
</div>
<div class="myread">
<h3 id="myread-h3">My Opinions</h3>
 <ul class="myread-ul">
"""),_display_(Seq[Any](/*19.2*/for(opdetail <- opDetails) yield /*19.28*/{_display_(Seq[Any](format.raw/*19.29*/("""
"""),_display_(Seq[Any](/*20.2*/if(opdetail.opiniondetails.subject.length() > 85)/*20.51*/ {_display_(Seq[Any](format.raw/*20.53*/("""
<li class="read">
<div class="op-sub">
"""),_display_(Seq[Any](/*23.2*/opdetail/*23.10*/.opiniondetails.subject.substring(0,85))),format.raw/*23.49*/("""..
</div>
<div class="op-value">
"""),_display_(Seq[Any](/*26.2*/if(opdetail.vote == "agree")/*26.30*/{_display_(Seq[Any](format.raw/*26.31*/("""
Agreed
""")))}/*28.3*/else/*28.8*/{_display_(Seq[Any](format.raw/*28.9*/("""
Disagreed
""")))})),format.raw/*30.2*/("""
</div>
<div class="op-res">
"""),_display_(Seq[Any](/*33.2*/opdetail/*33.10*/.countAgree)),format.raw/*33.21*/(""" vs """),_display_(Seq[Any](/*33.26*/opdetail/*33.34*/.countDisagree)),format.raw/*33.48*/("""
</div>
</li>
""")))}/*36.3*/else/*36.8*/{_display_(Seq[Any](format.raw/*36.9*/("""
<li class="read">
<div class="op-sub">
"""),_display_(Seq[Any](/*39.2*/opdetail/*39.10*/.opiniondetails.subject)),format.raw/*39.33*/("""
</div>
<div class="op-value">
"""),_display_(Seq[Any](/*42.2*/if(opdetail.vote == "agree")/*42.30*/{_display_(Seq[Any](format.raw/*42.31*/("""
Agreed
""")))}/*44.3*/else/*44.8*/{_display_(Seq[Any](format.raw/*44.9*/("""
Disagreed
""")))})),format.raw/*46.2*/("""
</div>
<div class="op-res">
"""),_display_(Seq[Any](/*49.2*/opdetail/*49.10*/.countAgree)),format.raw/*49.21*/(""" vs """),_display_(Seq[Any](/*49.26*/opdetail/*49.34*/.countDisagree)),format.raw/*49.48*/("""
</div>
</li>
""")))})),format.raw/*52.2*/("""

""")))})),format.raw/*54.2*/("""
</ul>
</div>
""")))}/*57.2*/{_display_(Seq[Any](format.raw/*57.3*/("""
	<div class="content-home">
	<ul>
        """),_display_(Seq[Any](/*60.10*/for(opinion <- opinionobj) yield /*60.36*/{_display_(Seq[Any](format.raw/*60.37*/("""
            <li class="op-list">
            <span class="op-cont">
            <div class="drop-shadow lifted">

                <h4 class="op-sub">"""),_display_(Seq[Any](/*65.37*/opinion/*65.44*/.opiniondetails.subject)),format.raw/*65.67*/("""</h4>
                """),_display_(Seq[Any](/*66.18*/if(opinion.opiniondetails.media != null)/*66.58*/{_display_(Seq[Any](format.raw/*66.59*/("""
                <img src="""),_display_(Seq[Any](/*67.27*/routes/*67.33*/.Assets.at(opinion.opiniondetails.media))),format.raw/*67.73*/(""" width="100%">
                """)))})),format.raw/*68.18*/("""
                <h4 class="op-meta-data">rippl'd by """),_display_(Seq[Any](/*69.54*/opinion/*69.61*/.opiniondetails.user.getName())),format.raw/*69.91*/("""</h4>
                <h4 class="op-meta-data">"""),_display_(Seq[Any](/*70.43*/opinion/*70.50*/.opiniondetails.category)),format.raw/*70.74*/("""</h4>
            </div>
            </span>
            """),_display_(Seq[Any](/*73.14*/if(opinion.vote != "n")/*73.37*/{_display_(Seq[Any](format.raw/*73.38*/("""
            <span class="op-vote">
            """),_display_(Seq[Any](/*75.14*/if(opinion.vote == "agree")/*75.41*/{_display_(Seq[Any](format.raw/*75.42*/("""
            <div class="op-details">You have Agreed!
            <br/><br/>
            <a class="button-op" href=""""),_display_(Seq[Any](/*78.41*/routes/*78.47*/.Application.opinionSingle(opinion.id, userName))),format.raw/*78.95*/("""">View Details</a>
            </div>
            """)))}/*80.15*/else/*80.20*/{_display_(Seq[Any](format.raw/*80.21*/("""
            <div class="op-details">You have Disagreed!
            <br/><br/>
            <a class="button-op" href=""""),_display_(Seq[Any](/*83.41*/routes/*83.47*/.Application.opinionSingle(opinion.id, userName))),format.raw/*83.95*/("""">View Details</a>

            </div>
            """)))})),format.raw/*86.14*/("""
            </span>

            """)))}/*89.15*/else/*89.20*/{_display_(Seq[Any](format.raw/*89.21*/("""
            <span class="op-vote">

            <div id="agree-button">
            <a href=""""),_display_(Seq[Any](/*93.23*/routes/*93.29*/.Application.submitAgree(userName,opinion.id))),format.raw/*93.74*/("""" onclick="return false;" class="button-op">Agree?</a>
            </div>
            <div id="disagree-button">
            <a href=""""),_display_(Seq[Any](/*96.23*/routes/*96.29*/.Application.submitDisagree(userName,opinion.id))),format.raw/*96.77*/("""" onclick="return false;" class="button-op">Disagree?</a>
            </div>
            <div class="op-res">
            <br/><br/>

            </div>
            <div class="op-res-det">
			     <a class="button-op" href=""""),_display_(Seq[Any](/*103.37*/routes/*103.43*/.Application.opinionSingle(opinion.id, userName))),format.raw/*103.91*/("""">View Details</a>
			</div>
            </span>
            </li>
            """)))})),format.raw/*107.14*/("""
        """)))})),format.raw/*108.10*/("""
    </ul>


    </div><!-- content-home -->

""")))}/*114.2*/{_display_(Seq[Any](format.raw/*114.3*/("""
	<div id="opinion-modal">
	<input type='button' value='Ripplect My Expression' name='button-side' class='button-side'/>

	</div>
	<!-- modal content -->
	<div id="opinion-modal-content">
		<h3>Get an Opinion</h3>
		"""),_display_(Seq[Any](/*122.4*/helper/*122.10*/.form(action = routes.Application.submitOpinion(userName), 'enctype -> "multipart/form-data")/*122.103*/ {_display_(Seq[Any](format.raw/*122.105*/("""

            """),_display_(Seq[Any](/*124.14*/inputText(
                myOpinionForm("subject"),
                '_label -> "",
                '_error -> myOpinionForm.globalError,
                'size -> 50,
                'class -> "input-stnd"
            ))),format.raw/*130.14*/("""

            """),_display_(Seq[Any](/*132.14*/inputFile(
                myOpinionForm("inputfile"),
                '_label -> "",
                '_error -> myOpinionForm.globalError
            ))),format.raw/*136.14*/("""

           """),_display_(Seq[Any](/*138.13*/select(
                myOpinionForm("interest"),
                options = options(Interests.list),
                '_default -> "Choose the Interest Category",
                '_label -> "",
                '_help -> ""
            ))),format.raw/*144.14*/("""
           """),_display_(Seq[Any](/*145.13*/select(
                myOpinionForm("visibility"),
                options = options(visb),
                '_default -> "Choose the Visibility",
                '_label -> "",
                '_help -> ""
            ))),format.raw/*151.14*/("""
            """),_display_(Seq[Any](/*152.14*/checkbox(
                myOpinionForm("Geography"),
                '_label -> None,
                '_text -> "Restrict to Geography",
                '_showConstraints -> false
            ))),format.raw/*157.14*/("""
		<input type="submit" value="Publish My Expression" class="button-stnd" id="opinion-submit">
		""")))})),format.raw/*159.4*/("""

	</div>
	<!-- preload the images -->
	<div style='display:none'>
		<img src="""),_display_(Seq[Any](/*164.13*/routes/*164.19*/.Assets.at("images/x.png"))),format.raw/*164.45*/(""" alt="">
	</div>
""")))})))}
    }
    
    def render(userName:String,myOpinionForm:Form[OpinionDetails],visb:List[String],opinion_details:List[OpinionDetails],opinionobj:List[OpinionObj],opDetails:List[OpinionObj]) = apply(userName,myOpinionForm,visb,opinion_details,opinionobj,opDetails)
    
    def f:((String,Form[OpinionDetails],List[String],List[OpinionDetails],List[OpinionObj],List[OpinionObj]) => play.api.templates.Html) = (userName,myOpinionForm,visb,opinion_details,opinionobj,opDetails) => apply(userName,myOpinionForm,visb,opinion_details,opinionobj,opDetails)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 18 19:03:58 IST 2013
                    SOURCE: C:/saptarshi_work/Project/Ripplect/app/views/opinion.scala.html
                    HASH: 622f71f1b06bdb4d748022381da7f5eb8491145b
                    MATRIX: 846->1|1115->176|1143->195|1180->198|1205->215|1243->216|1313->251|1327->257|1382->291|1527->401|1557->409|1688->505|1730->531|1769->532|1806->534|1864->583|1904->585|1980->626|1997->634|2058->673|2127->707|2164->735|2203->736|2230->746|2242->751|2280->752|2323->764|2388->794|2405->802|2438->813|2479->818|2496->826|2532->840|2565->856|2577->861|2615->862|2691->903|2708->911|2753->934|2820->966|2857->994|2896->995|2923->1005|2935->1010|2973->1011|3016->1023|3081->1053|3098->1061|3131->1072|3172->1077|3189->1085|3225->1099|3271->1114|3305->1117|3338->1132|3376->1133|3456->1177|3498->1203|3537->1204|3724->1355|3740->1362|3785->1385|3844->1408|3893->1448|3932->1449|3995->1476|4010->1482|4072->1522|4136->1554|4226->1608|4242->1615|4294->1645|4378->1693|4394->1700|4440->1724|4534->1782|4566->1805|4605->1806|4690->1855|4726->1882|4765->1883|4918->2000|4933->2006|5003->2054|5073->2106|5086->2111|5125->2112|5281->2232|5296->2238|5366->2286|5450->2338|5504->2374|5517->2379|5556->2380|5687->2475|5702->2481|5769->2526|5940->2661|5955->2667|6025->2715|6288->2941|6304->2947|6375->2995|6488->3075|6531->3085|6597->3132|6636->3133|6889->3350|6905->3356|7009->3449|7051->3451|7103->3466|7345->3685|7397->3700|7572->3852|7623->3866|7882->4102|7932->4115|8176->4336|8227->4350|8444->4544|8574->4642|8690->4721|8706->4727|8755->4753
                    LINES: 27->1|31->1|33->4|35->6|35->6|35->6|37->8|37->8|37->8|42->13|42->13|48->19|48->19|48->19|49->20|49->20|49->20|52->23|52->23|52->23|55->26|55->26|55->26|57->28|57->28|57->28|59->30|62->33|62->33|62->33|62->33|62->33|62->33|65->36|65->36|65->36|68->39|68->39|68->39|71->42|71->42|71->42|73->44|73->44|73->44|75->46|78->49|78->49|78->49|78->49|78->49|78->49|81->52|83->54|86->57|86->57|89->60|89->60|89->60|94->65|94->65|94->65|95->66|95->66|95->66|96->67|96->67|96->67|97->68|98->69|98->69|98->69|99->70|99->70|99->70|102->73|102->73|102->73|104->75|104->75|104->75|107->78|107->78|107->78|109->80|109->80|109->80|112->83|112->83|112->83|115->86|118->89|118->89|118->89|122->93|122->93|122->93|125->96|125->96|125->96|132->103|132->103|132->103|136->107|137->108|143->114|143->114|151->122|151->122|151->122|151->122|153->124|159->130|161->132|165->136|167->138|173->144|174->145|180->151|181->152|186->157|188->159|193->164|193->164|193->164
                    -- GENERATED --
                */
            