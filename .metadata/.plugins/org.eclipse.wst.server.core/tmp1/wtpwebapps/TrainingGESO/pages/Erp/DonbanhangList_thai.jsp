<%@page import="geso.erp.beans.donbanhang_thai.IDonbanhangList"%>
<%@page import="geso.erp.beans.donbanhang_thai.*"%>
<%@page import="geso.erp.beans.khachhang.IKhachhangList"%>
<%@page import="geso.dms.center.util.Utility"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="geso.erp.beans.donbanhang_thai.*"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.text.DecimalFormat"%>
<%@ page import="java.text.NumberFormat"%>
<%
	String userId = (String) session.getAttribute("userId");  
	String userTen = (String) session.getAttribute("userTen");  	
 
	  %>
<% IDonbanhangList obj = (IDonbanhangList)session.getAttribute("obj"); %>

<%
	ResultSet dataList = (ResultSet)obj.getDataList();
	ResultSet getListKH = (ResultSet) obj.getListKH();
	ResultSet rsTrangThai = obj.rsTrangThai();
%>
<% obj.setNextSplittings(); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SalesUp - Project</title>
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


<script type="text/javascript" src="../scripts/jquery.min.js"></script>
<script type="text/javascript" src="../scripts/speechbubbles.js"></script>
<script type="text/javascript" src="../scripts/dropdowncontent.js"></script>
<script type="text/javascript" src="../scripts/jquery.autocomplete.js"></script>


<script type="text/javascript" src="../scripts/jquery.js"></script>

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
<link href="../css/select2.css" rel="stylesheet" />
<script src="../scripts/select2.js"></script>
<script>
	     $(document).ready(function() { $("select").select2();  });	     
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
		 document.forms["DonBanHang"].action.value = "timkiem";
	    document.forms["DonBanHang"].submit();
	 }
	 function taomoi()
	 {   
		 
		document.forms["DonBanHang"].action.value = "taomoi";
	    document.forms["DonBanHang"].submit();
	 }
	 function print_pdf()
	 {   
		document.forms["DonBanHang"].action.value = "print";
	    document.forms["DonBanHang"].submit();
	 }
	 
	 
	 
	 function clearform()
	 {   
		 View('DonBanHang', 1, 'refresh');
	   
	    document.forms["DonBanHang"].trangthai.value = "";
	    document.forms["DonBanHang"].ma.value = "";

	    document.forms["DonBanHang"].submit();
	 } 
	 function thongbao()
	 {
		 var tt = document.forms["DonBanHang"].msg.value;
	 	 if(tt.length>0)
	     	alert(document.forms["DonBanHang"].msg.value);
	 }
	 

	 function processing(id,chuoi)
	 {
	 
 	    document.getElementById(id).innerHTML = "<a href='#'><img src='../images/waiting.gif' width = '20' height = '20' title='cho thuc hien..' border='0' longdesc='cho thuc hien..' style='border-style:outset'> Proc...</a>"; 		  
 	 	document.getElementById(id).href=chuoi;
 	 }
	 
	 function processing_hoantat(id,id_lydo)
	 {
		var lydo=document.getElementById(id_lydo).value;
		document.forms["DonBanHang"].action.value="hoantatphieu";
		
		document.forms["DonBanHang"].lydohoantat_.value =lydo;
		document.forms["DonBanHang"].idhoantat_.value =id;
	    document.forms["DonBanHang"].submit();
 	 }
	 
	</SCRIPT>
</head>
<body>
	<form name="DonBanHang" method="post"
		action="../../DonbanhangListSvl_thai">
		<input type="hidden" name="userId" value="<%=userId %>"> <input
			type="hidden" name="action" value="1"> <input type="hidden"
			name="crrApprSplitting" value="<%= obj.getCrrApprSplitting() %>">
		<input type="hidden" name="nxtApprSplitting"
			value="<%= obj.getNxtApprSplitting() %>">

		<script language="javascript" type="text/javascript">
    thongbao();
</script>

		<div id="main" style="width: 100%; padding-left: 2px">
			<div align="left" id="header" style="width: 100%; float: none">
				<div style="width: 70%; padding: 5px; float: left"
					class="tbnavigation">Danh s??ch ????n b??n h??ng</div>
				<div align="right" style="padding: 5px" class="tbnavigation">
					Ch??o m???ng B???n
					<%= userTen %>
					&nbsp;
				</div>
			</div>
			<div align="left" id="button"
				style="border: 1; width: 100%; height: 32px; padding: 1px; float: none"
				class="tbdarkrow">

				<TABLE border="0" cellpadding="0" cellspacing="0">
					<TR class="tbdarkrow">

						<TD width="40px" align="left"><span id="btnthem"> <A
								href="javascript:taomoi()"> <IMG src="../images/add32.png"
									title="T??m ki???m" alt="T??m ki???m" border="1px"
									style="border-style: outset; width: 25px; height: 25px"></A>
						</span></TD>


						<TD width="40px" align="left"><span id="btnthem"> <A
								href="javascript:submitform()"> <IMG
									src="../images/timkiem_e.png" title="T??m ki???m" alt="T??m ki???m"
									border="1px"
									style="border-style: outset; width: 25px; height: 25px"></A>
						</span></TD>

						<TD width="30px" align="left"><span id="btnUndo"> <A
								href="javascript:clearform()"> <IMG
									src="../images/convert.gif" title="Undo" alt="Undo"
									border="1px"
									style="border-style: outset; width: 25px; height: 25px"></A>
						</span></TD>



					</TR>
				</TABLE>


			</div>
			<div></div>
			<div id="cotent" style="width: 100%; float: none">


				<div align="left"
					style="width: 100%; float: none; clear: left; font-size: 0.7em">
					<fieldset>
						<legend>
							<span class="legendtitle"> ????n b??n h??ng </span>&nbsp;&nbsp;

						</legend>

						<LEGEND class="legendtitle">Ti??u ch?? t??m ki???m &nbsp;</LEGEND>
						<TABLE width="100%" cellpadding="6" cellspacing="0">
							<tr>
								<TD class="plainlabel">M?? ??H</TD>
								<TD class="plainlabel"><input type="text" name="MaDH"
									style="width: 200px" onchange="submitform()"
									value="<%=obj.getMaDH()%>"></TD>
							</tr>
							<tr>
								<TD class="plainlabel">Tr???ng th??i ??H</TD>
								<TD class="plainlabel"><select name="trangthai"
									onchange="submitform()" style="width: 200px">
										<% if(obj.getTrangthai().equals("")) {%>
										<option value="" selected="selected"></option>
										<option value="0">Ch??a ch???t</option>
										<option value="1">???? ch???t</option>
										<option value="2">???? x??a</option>
										<%} else if(obj.getTrangthai().equals("0")) {%>
										<option value="0" selected="selected">Ch??a ch???t</option>
										<option value="1">???? ch???t</option>
										<option value="2">???? x??a</option>
										<%}else if(obj.getTrangthai().equals("1")) { %>
										<option value="0">Ch??a ch???t</option>
										<option value="1" selected="selected">???? ch???t</option>
										<option value="2">???? x??a</option>
										<%}else  if(obj.getTrangthai().equals("2"))  { %>
										<option value="0">Ch??a ch???t</option>
										<option value="1">???? ch???t</option>
										<option value="2" selected="selected">???? x??a</option>
										<%}%>


								</select></TD>
							</tr>
							<tr>
								<TD class="plainlabel">Kh??ch h??ng</TD>
								<td class="plainlabel"><select name="Khachhang"
									onchange="submitform()" style="width: 200px">
										<option value=""></option>

										<%  
								  		  // thuong thi lam them cai ?? null
								  		  if(getListKH!=null)
								  		  while(getListKH.next()){
								  			  //cai n??y em l???y c??i resultset so sanh voi string :sai r??i
				                        	if(obj.getKhachhang().equals(getListKH.getString("Khachhang"))){
												%>
										<option selected="selected"
											value="<%=getListKH.getString("Khachhang")%>">
											<%=getListKH.getString("TEN") %>
										</option>
										<%
												}else{
												%>
										<option value="<%=getListKH.getString("Khachhang")%>">
											<%=getListKH.getString("TEN")%>
										</option>
										<%
				                        	   }
				                        	   
				                           }
				                    	%>
								</select></td>
						</TABLE>
						<TABLE width="100%" border="1" cellspacing="1" cellpadding="4">
							<TR class="tbheader">
								<!-- <TH align="center" width="4%">S??? ????? ngh??? mua h??ng</TH> -->
								<TH align="center" width="3%">STT</TH>
								<TH align="center" width="5%">M?? ??H</TH>
								<TH align="center" width="8%">Ng??y ch???ng t???</TH>
								<TH align="center" width="10%">Kh??ch h??ng</TH>
								<TH align="center" width="10%">Tr???ng th??i</TH>
								<TH align="center" width="10%">T???ng ti???n</TH>
								<TH align="center" width="8%">Ng??y t???o</TH>
								<TH align="center" width="5%">Ng?????i t???o</TH>
								<TH align="center" width="10%">T??c v???</TH>
							</TR>
							<%  
				                int count=1;
				                if(dataList != null)
				                while(dataList.next()) {  
				                		if((count % 2 ) == 0) { %>
							<TR class='tbdarkrow'>
								<%}else{ %>
							
							<TR class='tblightrow'>
								<%} %>
								<th><%=count %></th>
								<th><%=dataList.getString("MaDH") %></th>
								<th><%=dataList.getString("Ngaychungtu") %></th>
								<th><%=dataList.getString("Ten") %></th>
								<%String tt = dataList.getString("Trangthai");
				                   		 if( tt.equals("0")){ %>
								<th>Ch??a ch???t</th>
								<%}else if( tt.equals("1")){  %>
								<th>???? ch???t</th>
								<%}else if( tt.equals("2")){  %>
								<th>???? x??a</th>
								<%} %>
								<th><%=dataList.getString("Tongtien") %></th>
								<th><%=dataList.getString("Ngaytao") %></th>
								<th><%=dataList.getString("Nguoitao") %></th>

								<th>
									<%if( !tt.equals("1")){ %> <A
									href="../../DonhangNewSvl_thai?userId=<%=userId%>&update=<%= dataList.getString("MaDH")%>">
										<IMG src="../images/edit32.png" width="20" height="20"
										alt="Cap nhat" title="C???p nh???t" border=0>
								</A>&nbsp; <A
									href="../../DonhangListSvl_thai?userId=<%=userId%>&delete=<%= dataList.getString("MaDH")%>">
										<img src="../images/DeleteRed_32.png" width="20" height="20"
										border=0 alt="X??a" title="X??a"
										onclick="if(!confirm('B???n mu???n x??a ????n h??ng n??y?')) return false;">
								</A>&nbsp; <A
									href="../../DonhangListSvl_thai?userId=<%=userId%>&delete=<%= dataList.getString("MaDH") %>">
										<img src="../images/Chot.png" width="20" height="20" border=0
										alt="Ch???t" title="Ch???t" returnfalse;">
								</A>&nbsp; <A
									href="../../DonhangListSvl_thai?userId=<%=userId%>&delete=<%= dataList.getString("MaDH") %>">
										<img src="../images/Display.png" width="20" height="20"
										border=0 alt="Hi???n th???" title="Hi???n th???" returnfalse;">
								</A>&nbsp; <%}else if( !tt.equals("0")){ %> <A
									href="../../DonhangListSvl_thai?userId=<%=userId%>&delete=<%= dataList.getString("MaDH") %>">
										<img src="../images/Display.png" width="20" height="20"
										border=0 alt="Hi???n th???" title="Hi???n th???" returnfalse;">
								</A>&nbsp; <%} %>
								</th>
							</tr>
							<% count++;
				                } %>
						</TABLE>
					</fieldset>
				</div>
			</div>
		</div>
	</form>
</body>
</html>

<% obj.DBclose();%>