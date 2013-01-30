$(function (){$("form").jqTransform({imgPath:'images/'});

$("ul.alertstab li").click(function() {
		$("ul.alertstab li").removeClass("active");
		$(this).addClass("active"); 
	});

$("ul.asli li h4 a.arrow").click(function() 
{
		$(this).parent().parent('li').toggleClass("active");
		$(this).toggleClass("active");  
		$("ul.asli li h5").toggleClass("active"); 
});

$("ul.asli li h4 a.arrow1").click(function() 
{
		$(this).parent().parent('li').toggleClass("active");
		$(this).toggleClass("active");  
		$("ul.asli li h5").toggleClass("active"); 
});

$("table.accountedit td a.arrow").click(function() 
{
		$(this).toggleClass("active");  
});
 

	});
function changeclass(openaccount_top)
{
	$("." + openaccount_top).toggleClass("openaccounts_expand"); 
}

function toggle(main,detail)
{
	$("#" + main+ " h3").toggleClass("expand");
	$("#" + detail).toggle();
	
	$("#" + main+ " h3.symbols_a").toggleClass("symbols_a_expand");
	
	$("#" + main+ " h4").toggleClass("expand_right");
	
	$("#" + main+ " h3.arrow_collapse").toggleClass("arrow_expand");
	$("#" + main+ " h3.leftpanelarrow_collapse").toggleClass("leftpanelarrow_expand");
}

function changemenuclass(clienttab,remindertab)
{
	$("#" + clienttab).toggleClass("selectedclienttab"); 
	$("#" + remindertab).toggleClass("selectedremindertab"); 
}
	
function showalerts()
{
	$('#alertswrapper').show(); 
	$('#messagewrapper').hide();
	$('#messagewrapper2').hide();
}

function showmessage()
{
	$('#alertswrapper').hide(); 
	$('#messagewrapper').show();
	$('#messagewrapper2').hide();
}	

function showmessage2()
{
	$('#alertswrapper').hide(); 
	$('#messagewrapper').hide();
	$('#messagewrapper2').show();
}	

function showalertspg1 ()
{
	$('.alerts_pg1').show();
	$('.alerts_pg2').hide();
	
	}
	
	function showalertspg2 ()
{
	$('.alerts_pg2').show();
	$('.alerts_pg1').hide();
	
	}
function showalertspg3 ()
{
	$('.alerts_pg2').show();
	$('.alerts_pg1').show();
	
	}	
	
function showmsgpg1 ()
{
	$('.message_pg1').show();
	$('.message_pg2').hide();
	}
function showmsgpg2 ()
{
	$('.message_pg2').show();
	$('.message_pg1').hide();
	}
	
	function showmsgpg3 ()
{
	$('.message_pg2').show();
	$('.message_pg1').show();
	}
	
	function togglemini(main,detail)
{	
	$("#" + main+ " a").toggleClass("miniexpand");
	$("#" + detail).toggle();		
}