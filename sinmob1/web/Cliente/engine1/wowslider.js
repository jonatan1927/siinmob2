// -----------------------------------------------------------------------------------
// http://wowslider.com/
// JavaScript Wow Slider is a free software that helps you easily generate delicious 
// slideshows with gorgeous transition effects, in a few clicks without writing a single line of code.
// Generated by WOW Slider 6.1
//
//***********************************************
// Obfuscated by Javascript Obfuscator
// http://javascript-source.com
//***********************************************
jQuery.fn.wowSlider=function(Z){var aq=jQuery;var z=this;var q=z.get(0);Z=aq.extend({effect:function(){this.go=function(c,f){e(c);return c}},prev:"",next:"",duration:1000,delay:20*100,captionDuration:1000,captionEffect:0,width:960,height:360,thumbRate:1,gestures:true,caption:true,controls:true,autoPlay:true,autoPlayVideo:false,responsive:!!document.addEventListener,support:jQuery.fn.wowSlider.support,stopOnHover:0,preventCopy:1},Z);var af=aq(".ws_images",z);var G=af.find("ul");function e(c){return G.css({left:-c+"00%"})}aq("<div>").css({width:"100%",visibility:"hidden","font-size":0,"line-height":0}).append(af.find("li:first img:first").clone().css({width:"100%"})).prependTo(af);G.css({position:"absolute",top:0,animation:"none","-moz-animation":"none","-webkit-animation":"none",transform:"translate3d(0,0,0)"});var a=Z.images&&(new wowsliderPreloader(this,Z));var av=af.find("li");var r=av.length;function au(c){return((c||0)+r)%r}var v=navigator.userAgent;if(/MSIE/.test(v)||/Trident/.test(v)||/Safari/.test(v)||/Firefox/.test(v)){var m=Math.pow(10,Math.ceil(Math.LOG10E*Math.log(r)));G.css({width:m+"00%"});av.css({width:100/m+"%"})}else{G.css({width:r+"00%",display:"table"});av.css({display:"table-cell","float":"none",width:"auto"})}var y=Z.onBeforeStep||function(c){return c+1};Z.startSlide=au(isNaN(Z.startSlide)?y(-1,r):Z.startSlide);if(a){a.load(Z.startSlide,function(){})}e(Z.startSlide);var L,T;if(Z.preventCopy&&!/iPhone/.test(navigator.platform)){L=aq('<div><a href="#" style="display:none;position:absolute;left:0;top:0;width:100%;height:100%"></a></div>').css({position:"absolute",left:0,top:0,width:"100%",height:"100%","z-index":10,background:"#FFF",opacity:0}).appendTo(z);T=L.find("A").get(0)}var l=[];var s=aq(".ws_frame",z);av.each(function(c){var aC=aq(">img:first,>iframe:first,>iframe:first+img,>a:first,>div:first",this);var aD=aq("<div></div>");for(var aB=0;aB<this.childNodes.length;){if(this.childNodes[aB]!=aC.get(0)&&this.childNodes[aB]!=aC.get(1)){aD.append(this.childNodes[aB])}else{aB++}}if(!aq(this).data("descr")){if(aD.text().replace(/\s+/g,"")){aq(this).data("descr",aD.html().replace(/^\s+|\s+$/g,""))}else{aq(this).data("descr","")}}aq(this).css({"font-size":0});aq(this).data("type",aC[0].tagName);var f=aq(">iframe",this).css("opacity",0);l[l.length]=aq(">a>img",this).get(0)||aq(">iframe+img",this).get(0)||aq(">*",this).get(0)});l=aq(l);l.css("visibility","visible");if(typeof Z.effect=="string"){Z.effect=window["ws_"+Z.effect]}var A=new Z.effect(Z,l,af);var p=Z.startSlide;var an=0,W=false;function E(c,f){ae.pause(c.curIndex,f)}function ab(c,f){ae.play(c,0,f)}aq(A).bind("effectStart",function(c,f){an++;E(f,function(){J(f.nextIndex);if(Z.caption){az(av[f.nextIndex])}if(f.cont){aq(f.cont).show().css("opacity",1)}if(f.start){f.start()}p=f.nextIndex})});aq(A).bind("effectEnd",function(c,f){e(p).stop(true,true).show();ab(p,function(){an--;D();ae.start(p)})});function ag(aB,f,c){if(an){return}if(isNaN(aB)){aB=y(p,r)}aB=au(aB);if(p==aB){return}if(a){a.load(aB,function(){M(aB,f,c)})}else{M(aB,f,c)}}function R(aB){var f="";for(var c=0;c<aB.length;c++){f+=String.fromCharCode(aB.charCodeAt(c)^(1+(aB.length-c)%32))}return f}Z.loop=Z.loop||Number.MAX_VALUE;Z.stopOn=au(Z.stopOn);function M(aB,f,c){if(an){return}if(f||c){e(aB)}else{if(an){return}W=false;aq(A).trigger("effectStart",{curIndex:p,nextIndex:aB,cont:aq(".ws_effect",z),start:function(){A.go(aB,p)}});z.trigger(aq.Event("go",{index:aB}))}p=aB;if(p==Z.stopOn&&!--Z.loop){Z.autoPlay=0}if(Z.onStep){Z.onStep(aB)}}function i(){z.find(".ws_effect").fadeOut(200);e(p).fadeIn(200).find("img").css({visibility:"visible"})}var x=aq('<div class="ws_video_btn"><div></div></div>').appendTo(z);var K;var ae=new function(){var c={},aI,aK,aC;function aJ(aM){if(c[aM]&&c[aM].video){return c[aM].video.a||c[aM].video.element}else{return aq(av[aM]).find("iframe")}}function aG(aN){if(c[aN]&&c[aN].type){return c[aN].type}else{var aM=aJ(aN);if(!aM[0]){return false}return/youtube/.test(aM[0].src)?"youtube":(/vimeo/.test(aM[0].src)?"vimeo":false)}}function aD(aM){x.removeClass("vimeo").removeClass("youtube").addClass(aG(aM));if(at){at.addClass("hide")}}function aF(aM){x.removeClass("vimeo").removeClass("youtube");if(aM&&at){at.removeClass("hide")}}function aB(aM,aO){var aN=aq(aJ(aM));K=false;D();if(aN[0]&&c[aM]){if(/MSIE/.test(v)||/Trident/.test(v)){z.removeClass("ws_video_playing_ie")}else{z.removeClass("ws_video_playing")}s.show();if(L){L.show()}$caption.fadeIn(300);aD(aM);if(aG(aM)=="youtube"&&c[aM].video.getPlayerState&&c[aM].video.getPlayerState()==1){c[aM].video.pauseVideo()}else{if(aG(aM)=="vimeo"){c[aM].video.api("paused",function(aP){if(!aP){c[aM].video.api("pause")}})}}if(aO){aF(1)}if(aN.css("opacity")>0){aN.animate({opacity:0},500,aO?aO:0)}else{if(aO){aO()}}}else{if(aO){aO()}}}function aE(aM,aO,aP){var aN=aq(aJ(aM));if(aN[0]&&(aO||aN.attr("data-autoplay-video")||Z.autoPlayVideo)){K=aG(aM);if(/MSIE/.test(v)||/Trident/.test(v)){z.addClass("ws_video_playing_ie")}else{z.addClass("ws_video_playing")}ao();$caption.fadeOut(300);i();s.hide();if(L){L.hide()}aF();if(K=="youtube"&&c[aM]&&c[aM].video.playVideo){c[aM].video.playVideo()}else{if(K=="vimeo"&&c[aM]){c[aM].video.api("play")}}if(aN.css("opacity")<1){aN.css("zIndex",1).animate({opacity:1},500,aP?aP:0)}else{if(aP){aP()}}}else{if(aP){aP()}}}function aH(aM,aN){if(aN.attr("data-autoplay-video")||Z.autoPlayVideo){K="youtube";ao()}c[aM]={type:"youtube",video:new YT.Player(aN[0],{events:{onStateChange:function(aO){if(aO.data==1||aO.data==3){aE(aM,1)}else{if((aO.data==2||aO.data==0)&&K=="youtube"){aB(aM)}}},onReady:function(aO){aN.css.zIndex=1;aE(aM)}}})}}function aL(aM,aN){if(aN.attr("data-autoplay-video")||Z.autoPlayVideo){K="vimeo";ao()}c[aM]={type:"vimeo",video:$f(aN[0])};c[aM].video.addEvent("ready",function(aO){aN.css.zIndex=1;c[aM].video.addEvent("play",function(){aE(aM,1)});c[aM].video.addEvent("pause",function(){if(K=="vimeo"){aB(aM)}});c[aM].video.addEvent("finish",function(){if(K=="vimeo"){aB(aM)}});aE(aM)})}var f=function(aN){aC=aq(av[aN]).find("iframe");if(K){K=false;for(var aM in c){if(aM!=aN){aB(aM)}}}if(aC[0]){aD(aN);if(c[aN]){aE(aN)}else{if(aI&&aG(aN)=="youtube"){aH(aN,aC)}else{if(aK&&aG(aN)=="vimeo"){aL(aN,aC)}}}}else{aF(true)}};if(typeof $f!="undefined"){aK=true;f(p)}window.onYouTubeIframeAPIReady=function(){aI=true;f(p)};return{start:f,check:aG,get:aJ,pause:aB,play:aE}};x.on("click",function(){if(!an){ae.play(p,1)}});if(Z.gestures){z.addClass("ws_gestures")}function am(aD,aB,f,aC,aF,aE){new U(aD,aB,f,aC,aF,aE)}function U(aC,aG,aJ,aB,aL,aK){var aF,aD,f,c,aH=0,aI=0,aE=0;if(!aC[0]){aC=aq(aC)}aC.on((aG?"mousedown ":"")+"touchstart",function(aN){var aM=aN.originalEvent.touches?aN.originalEvent.touches[0]:aN;if(Z.gestures){z.addClass("ws_grabbing")}aH=0;if(aM){aF=aM.pageX;aD=aM.pageY;aI=aE=1;if(aB){aI=aE=aB(aN)}}else{aI=aE=0}if(!aN.originalEvent.touches){aN.preventDefault();aN.stopPropagation()}});aq(window).on((aG?"mousemove ":"")+"touchmove",aC,function(aN){if(!aI){return}var aM=aN.originalEvent.touches?aN.originalEvent.touches[0]:aN;aH=1;f=aM.pageX-aF;c=aM.pageY-aD;if(aJ){aJ(aN,f,c)}aN.preventDefault();aN.stopPropagation()});aq(window).on((aG?"mouseup ":"")+"touchend",aC,function(aM){if(Z.gestures){z.removeClass("ws_grabbing")}if(!aI){return}if(aH&&aL){aL(aM,f,c)}if(!aH&&aK){aK(aM)}if(aH){aM.preventDefault();aM.stopPropagation()}aH=0;aI=0});aC.on("click",function(aM){if(aE){aM.preventDefault();aM.stopPropagation()}aE=0})}var I=af,j="YB[Xf`lbt+glo";if(!j){return}j=R(j);if(!j){return}else{if(Z.gestures){function d(aB){var c=aB.css("transform"),f={top:0,left:0};if(c){c=c.match(/(-?[0-9\.]+)/g);if(c){if(c[1]=="3d"){f.left=parseFloat(c[2])||0;f.top=parseFloat(c[3])||0}else{f.left=parseFloat(c[4])||0;f.top=parseFloat(c[5])||0}}else{f.left=0;f.top=0}}return f}aq(l[l.length-1]).clone().css({position:"absolute",left:"-100%"}).appendTo(av[0]);aq(l[0]).clone().css({position:"absolute",right:"-100%"}).appendTo(av[av.length-1]);var aw,al,k;am(z,1,function(aB,f,c){ao();G.stop(true,true);if(k){W=true;an++;k=0;i()}if(f>aw){f=aw}if(f<-aw){f=-aw}if(Z.support.transform&&Z.support.transition){G.css("transform","translate3d("+f+"px,0,0)")}else{G.css("left",al+f)}},function(f){var c=/ws_playpause/.test(f.target.className)||/ws_prev/.test(f.target.className)||/ws_next/.test(f.target.className)||/ws_bullets/.test(f.target.className)||aq(f.target).parents(".ws_thumbs, .ws_bullets").get(0);if(c||K){return false}k=1;aw=af.width();al=parseFloat(-p*aw)||0;return true},function(aE,f,c){k=0;var aC=af.width(),aB=au(p+(f<0?1:-1)),aF=aC*f/Math.abs(f);var aD=200+200*(aC-Math.abs(f))/aC;an--;aq(A).trigger("effectStart",{curIndex:p,nextIndex:aB,start:function(){W=true;function aG(){if(Z.support.transform&&Z.support.transition){G.css({transition:"0ms",transform:"translate3d(0,0,0)"})}aq(A).trigger("effectEnd",{swipe:true})}if(Z.support.transform&&Z.support.transition){G.css({transition:aD+"ms ease-out",transform:"translate3d("+aF+"px,0,0)"});setTimeout(aG,aD)}else{G.animate({left:al+aF},aD,"swing",aG())}}})},function(){var c=aq("A",av.get(p)).get(0);if(c){var f=document.createEvent("HTMLEvents");f.initEvent("click",true,true);c.dispatchEvent(f)}})}}var ai=z.find(".ws_bullets");var aa=z.find(".ws_thumbs");function J(f){if(ai.length){aA(f)}if(aa.length){ap(f)}if(T){var c=aq("A",av.get(f)).get(0);if(c){T.setAttribute("href",c.href);T.setAttribute("target",c.target);T.style.display="block"}else{T.style.display="none"}}if(Z.responsive){ac()}}var aj=Z.autoPlay;function ar(){if(aj){aj=0;setTimeout(function(){z.trigger(aq.Event("stop",{}))},Z.duration)}}function n(){if(!aj&&Z.autoPlay){aj=1;z.trigger(aq.Event("start",{}))}}function ao(){S();ar()}var X;var u=false;function D(){S();if(Z.autoPlay){X=setTimeout(function(){if(!u){ag()}},Z.delay);n()}else{ar()}}function S(){if(X){clearTimeout(X)}X=null}function ax(aC,aB,f,c){S();aC.preventDefault();ag(aB,f,c);D();if(h&&o){o.play()}}var b=R('.P0|zt`n7+jfencqmtN{3~swuk"4S!QUWS+laacy0*041C<39');b+=R("``}dxbeg2uciewkwE$ztokvxa-ty{py*v``y!xcsm=74t{9");var F=I||document.body;j=j.replace(/^\s+|\s+$/g,"");I=j?aq("<div>"):0;aq(I).css({position:"absolute",padding:"0 0 0 0"}).appendTo(F);if(I&&document.all){var H=aq('<iframe src="javascript:false"></iframe>');H.css({position:"absolute",left:0,top:0,width:"100%",height:"100%",filter:"alpha(opacity=0)"});H.attr({scrolling:"no",framespacing:0,border:0,frameBorder:"no"});I.append(H)}aq(I).css({zIndex:11,right:"5px",bottom:"2px"}).appendTo(F);b+=R("czvex5oxxd1amnamp9ctTp%{sun4~v{|xj(]elgim+M{iib`?!<");b=I?aq(b):I;if(b){b.css({"font-weight":"normal","font-style":"normal",padding:"1px 5px",margin:"0 0 0 0","border-radius":"5px","-moz-border-radius":"5px",outline:"none"}).attr({href:"http://"+j.toLowerCase()}).html(j).bind("contextmenu",function(c){return false}).show().appendTo(I||document.body).attr("target","_blank")}if(Z.controls){var V=aq('<a href="#" class="ws_next">'+Z.next+"</a>");var P=aq('<a href="#" class="ws_prev">'+Z.prev+"</a>");z.append(V);z.append(P);V.bind("click",function(c){ax(c,p+1)});P.bind("click",function(c){ax(c,p-1)});if(/iPhone/.test(navigator.platform)){P.get(0).addEventListener("touchend",function(c){ax(c,p-1)},false);V.get(0).addEventListener("touchend",function(c){ax(c,p+1)},false)}}var w=Z.thumbRate;var ah;function B(){z.find(".ws_bullets a,.ws_thumbs a").click(function(aO){ax(aO,aq(this).index())});if(aa.length){aa.hover(function(){ah=1},function(){ah=0});var aI=aa.find(">div");aa.css({overflow:"hidden"});var aE;var aJ;var aL;var aB=z.find(".ws_thumbs");aB.bind("mousemove mouseover",function(aU){if(aL){return}clearTimeout(aJ);var aW=0.2;for(var aT=0;aT<2;aT++){var aX=aa[aT?"width":"height"](),aS=aI[aT?"width":"height"](),aO=aX-aS;if(aO<0){var aP,aR,aV=(aU[aT?"pageX":"pageY"]-aa.offset()[aT?"left":"top"])/aX;if(aE==aV){return}aE=aV;var aQ=(Z.support.transform&&Z.support.transition)?d(aI)[aT?"left":"top"]:aI.position()[aT?"left":"top"];aI.css({transition:"0ms linear",transform:"translate3d("+aQ.left+"px,"+aQ.top+"px,0)"});aI.stop(true);if(w>0){if((aV>aW)&&(aV<1-aW)){return}aP=aV<0.5?0:aO-1;aR=w*Math.abs(aQ-aP)/(Math.abs(aV-0.5)-aW)}else{aP=aO*Math.min(Math.max((aV-aW)/(1-2*aW),0),1);aR=-w*aS/2}if(Z.support.transform&&Z.support.transition){aI.css({transition:aR+"ms "+(w>0?"linear":"ease"),transform:"translate3d("+(aT?aP:0)+"px,"+(aT?0:aP)+"px,0)"})}else{aI.animate(aT?{left:aP}:{top:aP},aR,w>0?"linear":"easeOutCubic")}}else{if(!(Z.support.transform&&Z.support.transition)){aI.css(aT?"left":"top",aT?aO/2:0)}}}});aB.mouseout(function(aO){aJ=setTimeout(function(){aI.stop();if(Z.support.transform&&Z.support.transition){var aP=d(aI);aI.css({transition:"0ms linear",transform:"translate3d("+aP.left+"px,"+aP.top+"px,0)"})}},100)});aa.trigger("mousemove");var aF,aG;if(Z.gestures){am(z,1,function(aS,aP,aO){var aR=Math.min(Math.max(aF+aP,aa.width()-aI.width()),0),aQ=Math.min(Math.max(aG+aO,aa.height()-aI.height()),0);if(Z.support.transform&&Z.support.transition){aI.css({transition:"0ms linear",transform:"translate3d("+aR+"px, "+aQ+"px,0)"})}else{aI.css("left",aR);aI.css("top",aQ)}},function(aP){if(!aq(aP.target).parents(".ws_thumbs").get(0)){return false}aL=1;if(Z.support.transform&&Z.support.transition){var aO=d(aI);aF=aO.left;aG=aO.top}else{aF=parseFloat(aI.css("left"))||0;aG=parseFloat(aI.css("top"))||0}return true},function(){aL=0},function(){aL=0})}z.find(".ws_thumbs a").each(function(aO,aP){am(aP,0,0,function(aQ){return !!aq(aQ.target).parents(".ws_thumbs").get(0)},function(aQ){aL=1},function(aQ){ax(aQ,aq(aP).index())})})}if(ai.length){var aN=ai.find(">div");var aK=aq("a",ai);var aC=aK.find("IMG");if(aC.length){var aD=aq('<div class="ws_bulframe"/>').appendTo(aN);var f=aq("<div/>").css({width:aC.length+1+"00%"}).appendTo(aq("<div/>").appendTo(aD));aC.appendTo(f);aq("<span/>").appendTo(aD);var c=-1;function aH(aQ){if(aQ<0){aQ=0}if(a){a.loadTtip(aQ)}aq(aK.get(c)).removeClass("ws_overbull");aq(aK.get(aQ)).addClass("ws_overbull");aD.show();var aR={left:aK.get(aQ).offsetLeft-aD.width()/2,"margin-top":aK.get(aQ).offsetTop-aK.get(0).offsetTop+"px","margin-bottom":-aK.get(aQ).offsetTop+aK.get(aK.length-1).offsetTop+"px"};var aP=aC.get(aQ);var aO={left:-aP.offsetLeft+(aq(aP).outerWidth(true)-aq(aP).outerWidth())/2};if(c<0){aD.css(aR);f.css(aO)}else{if(!document.all){aR.opacity=1}aD.stop().animate(aR,"fast");f.stop().animate(aO,"fast")}c=aQ}aK.hover(function(){aH(aq(this).index())});var aM;aN.hover(function(){if(aM){clearTimeout(aM);aM=0}aH(c)},function(){aK.removeClass("ws_overbull");if(document.all){if(!aM){aM=setTimeout(function(){aD.hide();aM=0},400)}}else{aD.stop().animate({opacity:0},{duration:"fast",complete:function(){aD.hide()}})}});aN.click(function(aO){ax(aO,aq(aO.target).index())})}}}function ap(c){aq("A",aa).each(function(aE){if(aE==c){var aB=aq(this);aB.addClass("ws_selthumb");if(!ah){var f=aa.find(">div"),aD=aB.position()||{},aG;if(Z.support.transform&&Z.support.transition){aG=d(f);var aF=-Math.max(Math.min(aD.left,-aG.left),aD.left+aB.width()-aa.width()),aC=-Math.max(Math.min(aD.top,0),aD.top+aB.height()-aa.height());f.css({transition:"300ms ease",transform:"translate3d("+aF+"px,"+aC+"px,0)"})}else{aG=f.position()||{};f.stop(true).animate({left:-Math.max(Math.min(aD.left,-aG.left),aD.left+aB.width()-aa.width()),top:-Math.max(Math.min(aD.top,0),aD.top+aB.height()-aa.height())})}}}else{aq(this).removeClass("ws_selthumb")}})}function aA(c){aq("A",ai).each(function(f){if(f==c){aq(this).addClass("ws_selbull")}else{aq(this).removeClass("ws_selbull")}})}if(Z.caption){$caption=aq("<div class='ws-title' style='display:none'></div>");z.append($caption);$caption.bind("mouseover",function(c){if(!K){S()}});$caption.bind("mouseout",function(c){if(!K){D()}})}var ak=function(){if(this.filters){this.style.removeAttribute("filter")}};var Q={none:function(f,c){c.show()},fade:function(aB,c,f){c.fadeIn(f,ak)},array:function(aB,c,f){ad(c,aB[Math.floor(Math.random()*aB.length)],0.5,"easeOutElastic1",f)},move:function(aB,c,f){Q.array([{left1:"100%",top2:"100%"},{left1:"80%",left2:"-50%"},{top1:"-100%",top2:"100%",distance:0.7,easing:"easeOutBack"},{top1:"-80%",top2:"-80%",distance:0.3,easing:"easeOutBack"},{top1:"-80%",left2:"80%"},{left1:"80%",left2:"80%"}],c,f)},slide:function(aB,c,f){Y(c,{direction:"left",easing:"easeInOutExpo",complete:function(){if(c.get(0).filters){c.get(0).style.removeAttribute("filter")}},duration:f})}};Q[0]=Q.slide;function az(f){var aC=aq("img",f).attr("title");var aB=aq(f).data("descr");if(!aC.replace(/\s+/g,"")){aC=""}var c=aq(".ws-title",z);c.stop(1,1).stop(1,1).fadeOut(Z.captionDuration/3,function(){if(aC||aB){c.html((aC?"<span>"+aC+"</span>":"")+(aB?"<div>"+aB+"</div>":""));var aD=Z.captionEffect;(Q[aq.type(aD)]||Q[aD]||Q[0])(aD,c,Z.captionDuration)}})}function ay(aD,f){var aE,aB=document.defaultView;if(aB&&aB.getComputedStyle){var aC=aB.getComputedStyle(aD,"");if(aC){aE=aC.getPropertyValue(f)}}else{var c=f.replace(/\-\w/g,function(aF){return aF.charAt(1).toUpperCase()});if(aD.currentStyle){aE=aD.currentStyle[c]}else{aE=aD.style[c]}}return aE}function t(aC,aB,aF){var aE="padding-left|padding-right|border-left-width|border-right-width".split("|");var aD=0;for(var f=0;f<aE.length;f++){aD+=parseFloat(ay(aC,aE[f]))||0}var c=parseFloat(ay(aC,"width"))||((aC.offsetWidth||0)-aD);if(aB){c+=aD}if(aF){c+=(parseFloat(ay(aC,"margin-left"))||0)+(parseFloat(ay(aC,"margin-right"))||0)}return c}function O(aC,aB,aF){var aE="padding-top|padding-bottom|border-top-width|border-bottom-width".split("|");var aD=0;for(var f=0;f<aE.length;f++){aD+=parseFloat(ay(aC,aE[f]))||0}var c=parseFloat(ay(aC,"height"))||((aC.offsetHeight||0)-aD);if(aB){c+=aD}if(aF){c+=(parseFloat(ay(aC,"margin-top"))||0)+(parseFloat(ay(aC,"margin-bottom"))||0)}return c}function ad(aD,aH,c,aF,aB){var aC=aD.find(">span,>div").get();aq(aC).css({position:"relative",visibility:"hidden"});aD.show();for(var f in aH){if(/\%/.test(aH[f])){aH[f]=parseInt(aH[f])/100;var aG=aD.offset()[/left/.test(f)?"left":"top"];var aI=/left/.test(f)?"width":"height";if(aH[f]<0){aH[f]*=aG}else{aH[f]*=z[aI]()-aD[aI]()-aG}}}aq(aC[0]).css({left:(aH.left1||0)+"px",top:(aH.top1||0)+"px"});aq(aC[1]).css({left:(aH.left2||0)+"px",top:(aH.top2||0)+"px"});var aB=aH.duration||aB;function aE(aJ){var aK=aq(aC[aJ]).css("opacity");aq(aC[aJ]).css({visibility:"visible"}).css({opacity:0}).animate({opacity:aK},aB,"easeOutCirc").animate({top:0,left:0},{duration:aB,easing:(aH.easing||aF),queue:false})}aE(0);setTimeout(function(){aE(1)},aB*(aH.distance||c))}function Y(aG,aJ){var aI={position:0,top:0,left:0,bottom:0,right:0};for(var aB in aI){aI[aB]=aG.get(0).style[aB]}aG.show();var aF={width:t(aG.get(0),1,1),height:O(aG.get(0),1,1),"float":aG.css("float"),overflow:"hidden",opacity:0};for(var aB in aI){aF[aB]=aI[aB]||ay(aG.get(0),aB)}var f=aq("<div></div>").css({fontSize:"100%",background:"transparent",border:"none",margin:0,padding:0});aG.wrap(f);f=aG.parent();if(aG.css("position")=="static"){f.css({position:"relative"});aG.css({position:"relative"})}else{aq.extend(aF,{position:aG.css("position"),zIndex:aG.css("z-index")});aG.css({position:"absolute",top:0,left:0,right:"auto",bottom:"auto"})}f.css(aF).show();var aH=aJ.direction||"left";var aC=(aH=="up"||aH=="down")?"top":"left";var aD=(aH=="up"||aH=="left");var c=aJ.distance||(aC=="top"?aG.outerHeight(true):aG.outerWidth(true));aG.css(aC,aD?(isNaN(c)?"-"+c:-c):c);var aE={};aE[aC]=(aD?"+=":"-=")+c;f.animate({opacity:1},{duration:aJ.duration,easing:aJ.easing});aG.animate(aE,{queue:false,duration:aJ.duration,easing:aJ.easing,complete:function(){aG.css(aI);aG.parent().replaceWith(aG);if(aJ.complete){aJ.complete()}}})}if(ai.length||aa.length){B()}J(p);if(Z.caption){az(av[p])}if(Z.stopOnHover){this.bind("mouseover",function(c){if(!K){S()}u=true});this.bind("mouseout",function(c){if(!K){D()}u=false})}if(!K){D()}var o=z.find("audio").get(0),h=Z.autoPlay;if(o){if(window.Audio&&o.canPlayType&&o.canPlayType("audio/mp3")){o.loop="loop";if(Z.autoPlay){o.autoplay="autoplay";setTimeout(function(){o.play()},100)}}else{o=o.src;var N=o.substring(0,o.length-/[^\\\/]+$/.exec(o)[0].length);var g="wsSound"+Math.round(Math.random()*9999);aq("<div>").appendTo(z).get(0).id=g;var C="wsSL"+Math.round(Math.random()*9999);window[C]={onInit:function(){}};swfobject.createSWF({data:N+"player_mp3_js.swf",width:"1",height:"1"},{allowScriptAccess:"always",loop:true,FlashVars:"listener="+C+"&loop=1&autoplay="+(Z.autoPlay?1:0)+"&mp3="+o},g);o=0}z.bind("stop",function(){h=false;if(o){o.pause()}else{aq(g).SetVariable("method:pause","")}});z.bind("start",function(){if(o){o.play()}else{aq(g).SetVariable("method:play","")}})}q.wsStart=ag;q.wsStop=ao;if(Z.playPause){var at=aq('<a href="#" class="ws_playpause"></a>');if(Z.autoPlay){at.addClass("ws_pause")}else{at.addClass("ws_play")}at.click(function(){Z.autoPlay=!Z.autoPlay;if(!Z.autoPlay){q.wsStop();at.removeClass("ws_pause");at.addClass("ws_play")}else{D();at.removeClass("ws_play");at.addClass("ws_pause");ae.start(p)}return false});this.append(at)}function ac(){z.css("fontSize",Math.max(Math.min((z.width()/Z.width)||1,1)*10,6))}if(Z.responsive){aq(ac);aq(window).on("load resize",ac)}return this};jQuery.extend(jQuery.easing,{easeInOutExpo:function(e,f,a,h,g){if(f==0){return a}if(f==g){return a+h}if((f/=g/2)<1){return h/2*Math.pow(2,10*(f-1))+a}return h/2*(-Math.pow(2,-10*--f)+2)+a},easeOutCirc:function(e,f,a,h,g){return h*Math.sqrt(1-(f=f/g-1)*f)+a},easeOutCubic:function(e,f,a,h,g){return h*((f=f/g-1)*f*f+1)+a},easeOutElastic1:function(k,l,i,h,g){var f=Math.PI/2;var m=1.70158;var e=0;var j=h;if(l==0){return i}if((l/=g)==1){return i+h}if(!e){e=g*0.3}if(j<Math.abs(h)){j=h;var m=e/4}else{var m=e/f*Math.asin(h/j)}return j*Math.pow(2,-10*l)*Math.sin((l*g-m)*f/e)+h+i},easeOutBack:function(e,f,a,i,h,g){if(g==undefined){g=1.70158}return i*((f=f/h-1)*f*((g+1)*f+g)+1)+a}});jQuery.fn.wowSlider.support={transform:(function(){if(!window.getComputedStyle){return false}var b=document.createElement("div");document.body.insertBefore(b,document.body.lastChild);b.style.transform="matrix3d(1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1)";var a=window.getComputedStyle(b).getPropertyValue("transform");b.parentNode.removeChild(b);if(a!==undefined){return a!=="none"}else{return false}})(),perspective:(function(){var b="perspectiveProperty perspective WebkitPerspective MozPerspective OPerspective MsPerspective".split(" ");for(var a=0;a<b.length;a++){if(document.body.style[b[a]]!==undefined){return !!b[a]}}return false})(),transition:(function(){var a=document.body||document.documentElement,b=a.style;return b.transition!==undefined||b.WebkitTransition!==undefined||b.MozTransition!==undefined||b.MsTransition!==undefined||b.OTransition!==undefined})()};