$(document).ready(function(){
$("#myread-h3").click(function(){
$(".myread-ul").slideToggle();
$(".myprofile-ul").hide();

  });

$("#myprofile-h3").click(function(){
	$(".myprofile-ul").slideToggle();
	$(".myread-ul").hide();

});
  
$("#mylib-h3").click(function(){
$(".sidebar-lib-home").slideToggle("slow","linear");
$(".myread-ul").hide("slow");

  });
  
$(".op-list").hover(function() {
$(this).find("span.op-cont").stop().animate({"opacity": "0.15"}, "slow");
$(this).find("span.op-vote").css('display', 'block');
}, function() {
$(this).find("span.op-cont").stop().animate({"opacity": "1"}, "slow");
$(this).find("span.op-vote").css('display', 'none');
}); 

$("img.grey").hover(
function() {
$(this).stop().animate({"opacity": "0"}, "slow");
},
function() {
$(this).stop().animate({"opacity": "1"}, "slow");
});   

$("li.matrix-li").hover(
function () {
$(this).css("width","200");
}, 
function () {
$(this).css("width","100");  
});


$("#items1 a").click(
            function () {
                $.get($(this).attr("href"), function (data) {
                    window.alert(data);
                });                
                return false;
            });

$("#agree-button a").click(
            function () {
            var agreeBut = $(this);
                $.get($(this).attr("href"), function (data) {
                    $(agreeBut).css('display', 'none');
                    $(agreeBut).parent().parent().parent().find("#disagree-button").css('display', 'none');
                    $(agreeBut).parent().parent().parent().find(".op-res-det").css("display","block");
                    $(agreeBut).parent().parent().parent().find(".op-res").html(data);
                     
                });
                return false;
            });


$("#disagree-button a").click(
            function () {
            var disagreeBut = $(this);
                $.get($(this).attr("href"), function (data) {
                    $(disagreeBut).css('display', 'none');
                    $(disagreeBut).parent().parent().parent().find("#agree-button").css('display', 'none');
                    $(disagreeBut).parent().parent().parent().find(".op-res-det").css("display","block");
                    $(disagreeBut).parent().parent().parent().find(".op-res").html(data);
                     
                });
                return false;
            });



})
