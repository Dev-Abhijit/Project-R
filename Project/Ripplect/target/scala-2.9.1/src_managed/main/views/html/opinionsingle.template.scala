
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
object opinionsingle extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,Form[OpinionDetails],List[String],OpinionObj,List[OpinionObj],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(userName : String, myOpinionForm: Form[OpinionDetails], visb: List[String], opinionobj: OpinionObj, opDetails : List[OpinionObj]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.132*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("Opinion")/*6.17*/{_display_(Seq[Any](format.raw/*6.18*/("""
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

	<div class="op-stats">
	<div class="op-agree">
	"""),_display_(Seq[Any](/*62.3*/opinionobj/*62.13*/.countAgree)),format.raw/*62.24*/("""
	</div><!--op-agree-->
	<div class="op-disagree">
	"""),_display_(Seq[Any](/*65.3*/opinionobj/*65.13*/.countDisagree)),format.raw/*65.27*/("""
	</div><!--op-disagree-->
	</div><!--op-stats -->
    <div class="opn-main">
    <div class="op-cont">
	<div class="opinion-single-det lifted">

		<h4 class="op-sub">"""),_display_(Seq[Any](/*72.23*/opinionobj/*72.33*/.opiniondetails.subject)),format.raw/*72.56*/("""</h4>
		"""),_display_(Seq[Any](/*73.4*/if(opinionobj.opiniondetails.media != null)/*73.47*/{_display_(Seq[Any](format.raw/*73.48*/("""
		<img src="""),_display_(Seq[Any](/*74.13*/routes/*74.19*/.Assets.at(opinionobj.opiniondetails.media))),format.raw/*74.62*/(""" width="100%">
		""")))})),format.raw/*75.4*/("""
		<div class="rpp-by">rippl'd by <b>"""),_display_(Seq[Any](/*76.38*/opinionobj/*76.48*/.opiniondetails.user.getName())),format.raw/*76.78*/("""</b></div>

		<h4 class="op-meta-data">"""),_display_(Seq[Any](/*78.29*/opinionobj/*78.39*/.opiniondetails.category)),format.raw/*78.63*/("""</h4>
	</div>
    </div>
	<div class="op-agree">

	</div><!--op-agree-->
	<div class="op-disagree">

	</div><!--op-disagree-->
	<div style="clear:both"></div>

	<div id="op-ripp">
	Have similar opinion? <br/>
	<input type="button" value="Ripplect here!" name='button-ripp' class="button-ripp">
	</div>
	<!-- modal content -->
	<div id="op-ripp-content">
		<h3>Get an Opinion</h3>
		"""),_display_(Seq[Any](/*96.4*/helper/*96.10*/.form(action = routes.Application.submitOpinion(userName), 'enctype -> "multipart/form-data")/*96.103*/ {_display_(Seq[Any](format.raw/*96.105*/("""

            """),_display_(Seq[Any](/*98.14*/inputText(
                myOpinionForm("subject"),
                '_label -> "",
                '_error -> myOpinionForm.globalError,
                'size -> 50,
                'class -> "input-stnd"
            ))),format.raw/*104.14*/("""

            """),_display_(Seq[Any](/*106.14*/inputFile(
                myOpinionForm("inputfile"),
                '_label -> "",
                '_error -> myOpinionForm.globalError
            ))),format.raw/*110.14*/("""

            """),_display_(Seq[Any](/*112.14*/inputText(
                myOpinionForm("interest"),
                '_label -> "",
                '_error -> myOpinionForm.globalError,
                'size -> 25,
                'readonly -> "readonly",
                'placeholder -> opinionobj.opiniondetails.category
            ))),format.raw/*119.14*/("""

            """),_display_(Seq[Any](/*121.14*/inputText(
                myOpinionForm("visibility"),
                '_label -> "",
                '_error -> myOpinionForm.globalError,
                'size -> 25,
                'readonly -> "readonly",
                'placeholder -> opinionobj.opiniondetails.visibility,
                '_help -> ""
            ))),format.raw/*129.14*/("""
            """),_display_(Seq[Any](/*130.14*/checkbox(
                myOpinionForm("Geography"),
                '_label -> None,
                '_text -> "Restrict to Geography",
                '_showConstraints -> false
            ))),format.raw/*135.14*/("""

            <input type="submit" value="Publish My Expression" class="button-stnd" id="opinion-submit">

		""")))})),format.raw/*139.4*/("""

	</div>



	</div><!--opn-main-->


    </div><!-- content-home -->

""")))}/*150.2*/{_display_(Seq[Any](format.raw/*150.3*/("""
	<div id="opinion-modal">
	<input type='button' value='Ripplect My Expression' name='button-side' class='button-side'/>

	</div>
	<!-- modal content -->
	<div id="opinion-modal-content">
		<h3>Get an Opinion</h3>
		"""),_display_(Seq[Any](/*158.4*/helper/*158.10*/.form(action = routes.Application.submitOpinion(userName), 'enctype -> "multipart/form-data")/*158.103*/ {_display_(Seq[Any](format.raw/*158.105*/("""

            """),_display_(Seq[Any](/*160.14*/inputText(
                myOpinionForm("subject"),
                '_label -> "",
                '_error -> myOpinionForm.globalError,
                'size -> 50,
                'class -> "input-stnd"
            ))),format.raw/*166.14*/("""

            """),_display_(Seq[Any](/*168.14*/inputFile(
                myOpinionForm("inputfile"),
                '_label -> "",
                '_error -> myOpinionForm.globalError
            ))),format.raw/*172.14*/("""

           """),_display_(Seq[Any](/*174.13*/select(
                myOpinionForm("interest"),
                options = options(Interests.list),
                '_default -> "Choose the Interest Category",
                '_label -> "",
                '_help -> ""
            ))),format.raw/*180.14*/("""
           """),_display_(Seq[Any](/*181.13*/select(
                myOpinionForm("visibility"),
                options = options(visb),
                '_default -> "Choose the Visibility",
                '_label -> "",
                '_help -> ""
            ))),format.raw/*187.14*/("""
            """),_display_(Seq[Any](/*188.14*/checkbox(
                myOpinionForm("Geography"),
                '_label -> None,
                '_text -> "Restrict to Geography",
                '_showConstraints -> false
            ))),format.raw/*193.14*/("""
		<input type="submit" value="Publish My Expression" class="button-stnd" id="opinion-submit">
		""")))})),format.raw/*195.4*/("""

	</div>
	<!-- preload the images -->
	<div style='display:none'>
		<img src="""),_display_(Seq[Any](/*200.13*/routes/*200.19*/.Assets.at("images/x.png"))),format.raw/*200.45*/(""" alt="">
	</div>
""")))})))}
    }
    
    def render(userName:String,myOpinionForm:Form[OpinionDetails],visb:List[String],opinionobj:OpinionObj,opDetails:List[OpinionObj]) = apply(userName,myOpinionForm,visb,opinionobj,opDetails)
    
    def f:((String,Form[OpinionDetails],List[String],OpinionObj,List[OpinionObj]) => play.api.templates.Html) = (userName,myOpinionForm,visb,opinionobj,opDetails) => apply(userName,myOpinionForm,visb,opinionobj,opDetails)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 18 19:03:58 IST 2013
                    SOURCE: C:/saptarshi_work/Project/Ripplect/app/views/opinionsingle.scala.html
                    HASH: bea4e8f4ab75634440d54de870c2b3a211239ff8
                    MATRIX: 825->1|1049->131|1077->150|1114->153|1137->168|1175->169|1245->204|1259->210|1314->244|1459->354|1489->362|1620->458|1662->484|1701->485|1738->487|1796->536|1836->538|1912->579|1929->587|1990->626|2059->660|2096->688|2135->689|2162->699|2174->704|2212->705|2255->717|2320->747|2337->755|2370->766|2411->771|2428->779|2464->793|2497->809|2509->814|2547->815|2623->856|2640->864|2685->887|2752->919|2789->947|2828->948|2855->958|2867->963|2905->964|2948->976|3013->1006|3030->1014|3063->1025|3104->1030|3121->1038|3157->1052|3203->1067|3237->1070|3270->1085|3308->1086|3423->1166|3442->1176|3475->1187|3563->1240|3582->1250|3618->1264|3822->1432|3841->1442|3886->1465|3930->1474|3982->1517|4021->1518|4070->1531|4085->1537|4150->1580|4199->1598|4273->1636|4292->1646|4344->1676|4420->1716|4439->1726|4485->1750|4903->2133|4918->2139|5021->2232|5062->2234|5113->2249|5355->2468|5407->2483|5582->2635|5634->2650|5946->2939|5998->2954|6344->3277|6395->3291|6612->3485|6754->3595|6845->3667|6884->3668|7137->3885|7153->3891|7257->3984|7299->3986|7351->4001|7593->4220|7645->4235|7820->4387|7871->4401|8130->4637|8180->4650|8424->4871|8475->4885|8692->5079|8822->5177|8938->5256|8954->5262|9003->5288
                    LINES: 27->1|31->1|33->4|35->6|35->6|35->6|37->8|37->8|37->8|42->13|42->13|48->19|48->19|48->19|49->20|49->20|49->20|52->23|52->23|52->23|55->26|55->26|55->26|57->28|57->28|57->28|59->30|62->33|62->33|62->33|62->33|62->33|62->33|65->36|65->36|65->36|68->39|68->39|68->39|71->42|71->42|71->42|73->44|73->44|73->44|75->46|78->49|78->49|78->49|78->49|78->49|78->49|81->52|83->54|86->57|86->57|91->62|91->62|91->62|94->65|94->65|94->65|101->72|101->72|101->72|102->73|102->73|102->73|103->74|103->74|103->74|104->75|105->76|105->76|105->76|107->78|107->78|107->78|125->96|125->96|125->96|125->96|127->98|133->104|135->106|139->110|141->112|148->119|150->121|158->129|159->130|164->135|168->139|179->150|179->150|187->158|187->158|187->158|187->158|189->160|195->166|197->168|201->172|203->174|209->180|210->181|216->187|217->188|222->193|224->195|229->200|229->200|229->200
                    -- GENERATED --
                */
            