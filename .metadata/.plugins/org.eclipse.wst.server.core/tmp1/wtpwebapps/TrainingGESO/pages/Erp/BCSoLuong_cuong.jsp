<%@page import="geso.erp.beans.report.Ireport"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<% Ireport obj = (Ireport)session.getAttribute("obj"); %>

<% String userId = (String) session.getAttribute("userId");  %>
<% String userTen = (String) session.getAttribute("userTen");  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Diageo - Project</title>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK rel="stylesheet" type="text/css" media="print"
	href="../css/impression.css">
<LINK rel="stylesheet" href="../css/main.css" type="text/css">
<LINK rel="stylesheet" href="../css/datepicker.css" type="text/css">

<script language="javascript" src="../scripts/datepicker.js"></script>
<link href="../css/jquery-ui.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../scripts/Timepicker/jquery.min.js"></script>
<script type="text/javascript"
	src="../scripts/Timepicker/jquery-ui.min.js"></script>
<script type="text/javascript" src="../scripts/phanTrang.js"></script>
<script type="text/javascript" src="../scripts/dropdowncontent.js"></script>

<script type="text/javascript" src="../scripts/jquery.min.1.7.js"></script>
<link href="../css/jquery-ui.css" rel="stylesheet" type="text/css" />
<script src="../scripts/ui/jquery.ui.core.js" type="text/javascript"></script>
<script src="../scripts/ui/jquery.ui.widget.js" type="text/javascript"></script>
<script src="../scripts/ui/jquery.ui.datepicker.js"
	type="text/javascript"></script>
<script type="text/javascript">
		$(document).ready(function() {		
				$( ".days" ).datepicker({			    
						changeMonth: true,
						changeYear: true				
				});            
	        }); 		
			
	</script>

<script type="text/javascript" src="..scripts/jquery-1.js"></script>
<link type="text/css" rel="stylesheet" href="../css/mybutton.css">
<script type="text/javascript">
        $(document).ready(function(){
            $(".button").hover(function(){
                $(".button img")
                .animate({top:"-10px"}, 200).animate({top:"-4px"}, 200) // first jump
                .animate({top:"-7px"}, 100).animate({top:"-4px"}, 100) // second jump
                .animate({top:"-6px"}, 100).animate({top:"-4px"}, 100); // the last jump
            });
        }); 
		$(document).ready(function(){
            $(".button2").hover(function(){
                $(".button2 img")
                .animate({top:"-10px"}, 200).animate({top:"-4px"}, 200) // first jump
                .animate({top:"-7px"}, 100).animate({top:"-4px"}, 100) // second jump
                .animate({top:"-6px"}, 100).animate({top:"-4px"}, 100); // the last jump
            });
        }); 
		$(document).ready(function(){
            $(".button3").hover(function(){
                $(".button3 img")
                .animate({top:"-10px"}, 200).animate({top:"-4px"}, 200) // first jump
                .animate({top:"-7px"}, 100).animate({top:"-4px"}, 100) // second jump
                .animate({top:"-6px"}, 100).animate({top:"-4px"}, 100); // the last jump
            });
        }); 
    </script>
<SCRIPT language="javascript" type="text/javascript">
	 function confirmLogout()
	 {
	    if(confirm("B???n c?? mu???n ????ng xu???t?"))
	    {
			top.location.href = "home.jsp";
	    }
	    return
	 }
	 
	 function submitform()
	 { 
		 document.forms["erpDmhForm"].action.value = "submit";
	     document.forms["erpDmhForm"].submit();
	 }
	 
	 function locsanpham()
	 {   
		 document.forms["erpDmhForm"].action.value = "search";
	     document.forms["erpDmhForm"].submit();
	 }
	
	 function thongbao()
	 {
		 var tt = document.forms["erpDmhForm"].msg.value;
	 	 if(tt.length>0)
	     	alert(document.forms["erpDmhForm"].msg.value);
	 }
	 
	 function sellectAll()
	 {
		 var chkAll = document.getElementById("chkAll");
		 var spIds = document.getElementsByName("spIds");
		 
		 if(chkAll.checked)
		 {
			 for(i = 0; i < spIds.length; i++)
			 {
				 spIds.item(i).checked = true;
			 }
		 }
		 else
		 {
			 for(i = 0; i < spIds.length; i++)
			 {
				 spIds.item(i).checked = false;
			 }
		 }
	 }
	 
	 function sellectAll2()
	 {
		 var chkAll = document.getElementById("chkAll2");
		 var spIds = document.getElementsByName("clIds");
		 
		 if(chkAll.checked)
		 {
			 for(i = 0; i < spIds.length; i++)
			 {
				 spIds.item(i).checked = true;
			 }
		 }
		 else
		 {
			 for(i = 0; i < spIds.length; i++)
			 {
				 spIds.item(i).checked = false;
			 }
		 }
	 }
	 function sellectAll3()
	 {
		 var chkAll = document.getElementById("chkAll3");
		 var spIds = document.getElementsByName("ndxIds");
		 
		 if(chkAll.checked)
		 {
			 for(i = 0; i < spIds.length; i++)
			 {
				 spIds.item(i).checked = true;
			 }
		 }
		 else
		 {
			 for(i = 0; i < spIds.length; i++)
			 {
				 spIds.item(i).checked = false;
			 }
		 }
	 }
	</SCRIPT>
</head>
<body>
	<form name="erpDmhForm" method="post"
		action="../../ErpBCSoLuongSvl_cuong">
		<input type="hidden" name="userId" value="<%= userId %>"> <input
			type="hidden" name="userTen" value="<%= userTen %>"> <input
			type="hidden" name="action" value="1"> <input type="hidden"
			name="khoTen" id="khoTen" value="">

		<div id="main" style="width: 100%; padding-left: 2px">
			<div align="left" id="header" style="width: 100%; float: none">
				<div style="width: 60%; padding: 5px; float: left"
					class="tbnavigation">Qu???n l?? cung ???ng > B??o c??o > H??ng xu???t
					kho</div>
				<div align="right" style="padding: 5px" class="tbnavigation">
					Ch??o m???ng B???n
					<%= userTen %>
					&nbsp;
				</div>
			</div>
			<div align="left" style="width: 100%; float: none; clear: left">
				<fieldset>
					<legend class="legendtitle"> Th??ng b??o</legend>
					<textarea name="dataerror" style="width: 100%; color: red"
						readonly="readonly" rows="1" readonly="readonly"><%= obj.getMsg() %></textarea>
					<% obj.setMsg(""); %>
				</fieldset>
			</div>
			<div id="cotent" style="width: 100%; float: none">
				<div align="left"
					style="width: 100%; float: none; clear: left; font-size: 0.7em">
					<fieldset style="margin-top: 5px">
						<legend class="legendtitle"> Ti??u ch?? t??m ki???m</legend>
						<TABLE width="100%" cellpadding="6px" cellspacing="0px"
							style="margin-top: 5px">
							<TR>
								<TD class="plainlabel" width="15%">T??? ng??y</TD>
								<TD class="plainlabel"><input type="text" class="days"
									id="tungay" name="tungay" value="<%= obj.gettungay()%>"
									maxlength="10" /></TD>
							</TR>
							<TR>
								<TD class="plainlabel" width="15%">?????n ng??y</TD>
								<TD class="plainlabel"><input type="text" class="days"
									id="denngay" name="denngay" value="<%= obj.getdenngay() %>"
									maxlength="10" /></TD>
							</TR>


							<tr>
								<td colspan="2" class="plainlabel"><a class="button"
									href="javascript:submitform();"> <img style="top: -4px;"
										src="../images/button.png" alt=""> T???o b??o c??o
								</a></td>
							</tr>

						</TABLE>
				</div>
	</form>
</body>
<script type="text/javascript">
	dropdowncontent.init('spId', "right-bottom", 300, "click");
	dropdowncontent.init('clId', "right-bottom", 300, "click");
	dropdowncontent.init('ndxId', "right-bottom", 300, "click");
</script>
</html>

<%

try{
 
 
	session.setAttribute("obj", null) ; 
}catch(Exception er){
	
}
finally{
 
}

%>