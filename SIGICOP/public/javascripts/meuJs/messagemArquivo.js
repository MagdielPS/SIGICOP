/**
 * overhang.min.js Paul Krishnamurthy 2016
 * 
 * https://paulkr.com paul@paulkr.com
 */

$.fn.overhang=function(e){
function o(e,o){r.fadeOut(100),a.slideUp(c.speed,
function(){
	e&&c.callback(null!==o?n.data(o):"")})
}
var n=$(this),a=$("<div class='overhang' id='messagemArquivo'></div>"),r=$("<div class='overhang-overlay'></div>");
$(".overhang").remove(),
$(".overhang-overlay").remove();
var t={success:["#2ECC71","#27AE60"],error:["#E74C3C","#C0392B"],warn:["#E67E22","#D35400"],info:["#3498DB","#2980B9"],prompt:["#9B59B6","#8E44AD"],confirm:["#1ABC9C","#16A085"],"default":["#95A5A6","#7F8C8D"]},s={type:"success",custom:!1,message:"This is an overhang.js message!",textColor:"#FFFFFF",yesMessage:"Yes",noMessage:"No",yesColor:"#2ECC71",noColor:"#E74C3C",duration:1.5,speed:500,closeConfirm:!1,upper:!1,easing:"easeOutBounce",html:!1,overlay:!1,callback:function(){}},c=$.extend(s,e);c.type=c.type.toLowerCase();
var l=["success","error","warn","info","prompt","confirm"];-1===$.inArray(c.type,l)&&(c.type="default",console.log("You have entered invalid type name for an overhang message. Overhang resorted to the default theme.")),c.custom?(c.primary=e.primary||t["default"][0],c.accent=e.accent||t["default"][1]):(c.primary=t[c.type][0]||t["default"][0],c.accent=t[c.type][1]||t["default"][1]),("prompt"===c.type||"confirm"===c.type)&&(c.primary=e.primary||t[c.type][0],c.accent=e.accent||t[c.type][1],c.closeConfirm=!0),a.css("background-color",c.primary),a.css("border-bottom","6px solid "+c.accent);
var p=$("<span class='overhang-message'></span>");
p.css("color",c.textColor),c.html?p.html(c.message):p.text(c.upper?c.message.toUpperCase():c.message),a.append(p);
var i=$("<input class='overhang-prompt-field' />"),u=$("<button class='overhang-yes-option'>"+c.yesMessage+"</button>"),d=$("<button class='overhang-no-option'>"+c.noMessage+"</button>");
if(u.css("background-color",c.yesColor),d.css("background-color",c.noColor),c.closeConfirm){
var m=$("<span class='overhang-close'></span>");
m.css("color",c.accent),"confirm"!==c.type&&a.append(m)
}
if("prompt"===c.type?(a.append(i),n.data("overhangPrompt",null),i.keydown(function(e){13==e.keyCode&&(n.data("overhangPrompt",i.val()),o(!0,"overhangPrompt"))})):"confirm"===c.type&&(a.append(u),a.append(d),a.append(m),n.data("overhangConfirm",null),u.click(function(){n.data("overhangConfirm",!0),o(!0,"overhangConfirm")}),d.click(function(){n.data("overhangConfirm",!1),o(!0,"overhangConfirm")})),n.append(a),a.slideDown(c.speed,c.easing),c.overlay&&(c.overlayColor&&r.css("background-color",c.overlayColor),n.append(r)),c.closeConfirm&&!e.duration)m.click(function(){
	"propt"!==c.type&&"confirm"!==c.type?o(!0,null):o(!1,null)
			});
else if(c.closeConfirm&&e.duration){
var f=setTimeout(function(){a.slideUp(c.speed,function(){o(!0,null)})},1e3*c.duration);
m.click(function(){
	clearTimeout(f),"prompt"!==c.type&&"confirm"!==c.type?o(!0,null):o(!1,null)
})
}
else a.delay(1e3*c.duration).slideUp(c.speed,function(){o(!0,null)})};