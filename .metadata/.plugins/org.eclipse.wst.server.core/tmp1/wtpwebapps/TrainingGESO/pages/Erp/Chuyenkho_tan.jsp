<%@page import="geso.erp.beans.chuyenkho_tan.IChuyenkho_tan"%>
<%@page import="geso.dms.center.util.Utility"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="geso.erp.beans.chuyenkho_tan.*"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.text.DecimalFormat"%>
<%@ page import="java.text.NumberFormat"%>
<%
	String userId = (String) session.getAttribute("userId");  
	String userTen = (String) session.getAttribute("userTen");
	Utility util = (Utility) session.getAttribute("util");
%>
<% IChuyenkho_tan obj = (IChuyenkho_tan)session.getAttribute("obj"); %>

<% 
	ResultSet dataList = (ResultSet)obj.getRsList();
	ResultSet rsListKhochuyen = (ResultSet)obj.getRsKhochuyen();
	ResultSet rsListKhonhan = (ResultSet)obj.getRsKhonhan();
	
	NumberFormat formatter = new DecimalFormat("#,###,###");
	NumberFormat formatter1 = new DecimalFormat("#,###,###.##"); 
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
		 document.forms["erpDmhForm"].action.value = "timkiem";
	    document.forms["erpDmhForm"].submit();
	 }
	 function taomoi()
	 {   
		document.forms["erpDmhForm"].action.value = "taomoi";
	    document.forms["erpDmhForm"].submit();
	 }
	 function print_excel()
	 {   
		document.forms["erpDmhForm"].action.value = "excel";
	    document.forms["erpDmhForm"].submit();
	 }
	 function print_pdf()
	 {   
		document.forms["erpDmhForm"].action.value = "print";
	    document.forms["erpDmhForm"].submit();
	 }
	 function clearform()
	 {   
		 View('erpDmhForm', 1, 'refresh');
	   
	    document.forms["erpDmhForm"].trangthai.value = "";
	    document.forms["erpDmhForm"].ma.value = "";

	    document.forms["erpDmhForm"].submit();
	 }
	 function thongbao()
	 {
		 var tt = document.forms["erpDmhForm"].msg.value;
	 	 if(tt.length>0)
	     	alert(document.forms["erpDmhForm"].msg.value);
	 }
	 

	 function processing(id,chuoi)
	 {
	 
 	    document.getElementById(id).innerHTML = "<a href='#'><img src='../images/waiting.gif' width = '20' height = '20' title='cho thuc hien..' border='0' longdesc='cho thuc hien..' style='border-style:outset'> Proc...</a>"; 		  
 	 	document.getElementById(id).href=chuoi;
 	 }
	 
	 function processing_hoantat(id,id_lydo)
	 {
		var lydo=document.getElementById(id_lydo).value;
		document.forms["erpDmhForm"].action.value="hoantatphieu";
		
		document.forms["erpDmhForm"].lydohoantat_.value =lydo;
		document.forms["erpDmhForm"].idhoantat_.value =id;
	    document.forms["erpDmhForm"].submit();
 	 }
	 
	</SCRIPT>
</head>
<body>
	<form name="erpDmhForm" method="post" action="../../ChuyenkhoSvl_tan">
		<input type="hidden" name="userId" value="<%=userId %>"> <input
			type="hidden" name="action" value="1"> <input type="hidden"
			name="crrApprSplitting" value="<%= obj.getCrrApprSplitting() %>">
		<input type="hidden" name="nxtApprSplitting"
			value="<%= obj.getNxtApprSplitting() %>"> <input
			type="hidden" name="lydohoantat_" value=""> <input
			type="hidden" name="idhoantat_" value=""> <input
			type="hidden" name="msg" value='<%= obj.getMsg() %>'>
		<script language="javascript" type="text/javascript">
    thongbao();
</script>

		<div id="main" style="width: 100%; padding-left: 2px">
			<div align="left" id="header" style="width: 100%; float: none">
				<div style="width: 70%; padding: 5px; float: left"
					class="tbnavigation">D??? li???u n???n>C?? b???n>Chuy???n kho</div>
				<div align="right" style="padding: 5px" class="tbnavigation">
					Ch??o m???ng B???n
					<%= userTen %>
					&nbsp;
				</div>
			</div>
			<TABLE border="0" cellpadding="0" cellspacing="0">
				<TR>
					<TD width="50px" align="left"><A
						href="javascript:print_excel()"> <IMG
							src="../images/Excel2013.png" title="Xu???t file Excel"
							alt="Xu???t file Excel" border="1px" style="border-style: outset">
					</A></TD>
				</TR>
			</TABLE>
			<div id="cotent" style="width: 100%; float: none; height: auto">
				<div align="left"
					style="width: 100%; height: auto; float: none; clear: left; font-size: 0.7em">
					<fieldset>
						<legend>
							<span class="legendtitle"> Ti??u ch?? t??m ki???m </span>&nbsp;&nbsp;
						</legend>
						<TABLE width="100%" cellpadding="6" cellspacing="0">
							<tr>
								<TD class="plainlabel">M??</TD>
								<TD class="plainlabel"><input type="text" name="txtMaCK"
									style="width: 200px" onchange="submitform()"
									value="<%=obj.get_pk_chuyenkho()%>"></TD>
							</tr>
							<tr>
								<TD class="plainlabel">Kho chuy???n</TD>
								<td class="plainlabel"><select name="cbKhochuyen"
									onchange="submitform()" style="width: 200px">
										<option value=""></option>
										<%
							while(rsListKhochuyen.next()){
				            	if(obj.getKhochuyen().trim().equals(rsListKhochuyen.getString("MAKHO"))){
							%>
										<option selected="selected"
											value="<%=rsListKhochuyen.getString("MAKHO")%>">
											<%=rsListKhochuyen.getString("TENKHO") %>
										</option>
										<%
								}else{
							%>
										<option value="<%=rsListKhochuyen.getString("MAKHO")%>">
											<%=rsListKhochuyen.getString("TENKHO")%>
										</option>
										<%
				            	}
				            }
				            %>
								</select></td>
							</tr>
							<tr>
								<TD class="plainlabel">Kho nh???n</TD>
								<td class="plainlabel"><select name="cbKhonhan"
									onchange="submitform()" style="width: 200px">
										<option value=""></option>
										<%
							while(rsListKhonhan.next()){
				            	if(obj.getKhonhan().trim().equals(rsListKhonhan.getString("MAKHO"))){
							%>
										<option selected="selected"
											value="<%=rsListKhonhan.getString("MAKHO")%>">
											<%=rsListKhonhan.getString("TENKHO") %>
										</option>
										<%
								}else{
							%>
										<option value="<%=rsListKhonhan.getString("MAKHO")%>">
											<%=rsListKhonhan.getString("TENKHO")%>
										</option>
										<%
				            	}
				            }
				            %>
								</select></td>
							</tr>
							<tr>
								<TD class="plainlabel">Tr???ng th??i</TD>
								<td class="plainlabel">
									<%
						String mang[] =new String[]{"0","1", "2"};
						String mangten[] =new String[]{"Ch??a ch???t","???? ch???t", "???? x??a"};
				        %> <select name="cbTrangthai" onchange="submitform()"
									style="width: 200px">
										<option value=""></option>
										<%
				        	for(int j=0;j<mang.length;j++){
								if(obj.getTrangthai().trim().equals(mang[j])){
						%>
										<option selected="selected" value="<%=mang[j]%>">
											<%=mangten[j] %>
										</option>
										<%
								}else{
						%>
										<option value="<%=mang[j]%>">
											<%=mangten[j] %>
										</option>
										<% 
								}
							}
						%>
								</select>
								</td>
							</tr>
							<tr>
								<td colspan="2" class="plainlabel"><a class="button"
									href="javascript:clearform();"> <img style="top: -4px;"
										src="../images/button.png" alt=""> Nh???p l???i
								</a></td>
							</tr>
						</TABLE>
					</fieldset>
				</div>

				<div align="left"
					style="width: 100%; height: auto; float: none; clear: left; padding-top: 10px;">
					<fieldset>
						<legend>
							<span class="legendtitle"> Chuy???n kho&nbsp;&nbsp;&nbsp;</span> <a
								class="button" href="javascript:taomoi();"> <img
								style="top: -4px;" src="../images/New30.png" alt=""> <b>T???o
									m???i&nbsp; </b></a>
						</legend>
						<TABLE width="100%" border="1" cellspacing="1" cellpadding="4">
							<TR class="tbheader">
								<TH align="center" width="5%">M??</TH>
								<TH align="center" width="10%">L?? do chuy???n</TH>
								<TH align="center" width="8%">Tr???ng th??i</TH>
								<TH align="center" width="8%">Ng?????i t???o</TH>
								<TH align="center" width="8%">Ng??y t???o</TH>
								<TH align="center" width="8%">Ng?????i s???a</TH>
								<TH align="center" width="8%">Ng??y s???a</TH>
								<TH align="center" width="10%">T??c v???</TH>
							</TR>
							<%
					int m = 0;
                   	if(dataList != null){
                   		while(dataList.next()){  		
                   			String style="";
                   			if((m % 2 ) == 0) { %>
							<TR class='tbdarkrow'>
								<%
		           			}else{
		           %>
							
							<TR class='tblightrow'>
								<%
		           			}
		           %>
								<TD align="center"><%= dataList.getString("PK_CHUYENKHO") %></TD>
								<TD align="center"><%= dataList.getString("LYDO") %></TD>
								<%String tt = dataList.getString("TRANGTHAI");
				            if(tt.equals("1")){ %>
								<TD align="center" style="color: blue; font-weight: bold">
									<%} else if(tt.equals("2")){ %>
								
								<TD align="center" style="color: red">
									<%}else{%>
								
								<TD align="center">
									<%}
				            	String Trangthai="";
					            if(tt.equals("0")){
					            	Trangthai = "Ch??a ch???t";
					            }else if(tt.equals("1"))
					             	Trangthai = "???? ch???t";
					            else if(tt.equals("2")){
		                    		Trangthai = "???? x??a";
		                    	}
		                    %> <%= Trangthai %>
								</TD>
								<TD align="center"><%= dataList.getString("TENNGUOITAO") %></TD>
								<TD align="center"><%= dataList.getString("NGAYTAO") %></TD>
								<TD align="center"><%= dataList.getString("TENNGUOISUA") %></TD>
								<TD align="center"><%= dataList.getString("NGAYSUA") %></TD>
								<TD align="center"><A
									href="../../ChuyenkhoNewSvl_tan?userId=<%=userId%>&display=<%= dataList.getString("PK_CHUYENKHO")%>">
										<IMG src="../images/Display20.png" alt="Hi???n th???"
										title="Hi???n th???" border=0>
								</A>&nbsp; <% if(!tt.equals("2")){
				            			if(!tt.equals("1")){ %> <A
									href="../../ChuyenkhoNewSvl_tan?userId=<%=userId%>&update=<%= dataList.getString("PK_CHUYENKHO")%>">
										<IMG src="../images/Edit20.png" width="20" height="20"
										alt="Cap nhat" title="C???p nh???t" border=0>
								</A>&nbsp; <A id='chotphieu<%=dataList.getString("PK_CHUYENKHO")%>'
									href=""> <img src="../images/Chot.png" alt="Ch???t"
										width="20" height="20" title="Ch???t" border="0"
										onclick="if(!confirm('B???n c?? mu???n ch???t ????n h??ng n??y?')){ 
                                						return false;
                                					}else{ 
                                						processing('<%="chotphieu"+dataList.getString("PK_CHUYENKHO")%>', 
                                						'../../ChuyenkhoSvl_tan?userId=<%=userId%>&chot=<%= dataList.getString("PK_CHUYENKHO")%>');
                                					}">
								</A> <%		} %> <A
									href="../../ChuyenkhoSvl_tan?userId=<%=userId%>&delete=<%= dataList.getString("PK_CHUYENKHO") %>">
										<img src="../images/Delete20.png" width="20" height="20"
										border=0 alt="X??a" title="X??a"
										onclick="if(!confirm('B???n mu???n x??a ????n h??ng n??y?')) return false;">
								</A>&nbsp; <%}%></TD>
							</TR>
							<% m++; }
                   			dataList.close(); 
                   		} %>

							<tr class="tbfooter">
								<TD align="center" valign="middle" colspan="13" class="tbfooter">
									<%if(obj.getNxtApprSplitting() >1) {%> <img alt="Trang Dau"
									src="../images/first.gif" style="cursor: pointer;"
									onclick="View('erpDmhForm', 1, 'view')"> &nbsp; <%}else {%>
									<img alt="Trang Dau" src="../images/first.gif"> &nbsp; <%} %>
									<% if(obj.getNxtApprSplitting() > 1){ %> <img alt="Trang Truoc"
									src="../images/prev.gif" style="cursor: pointer;"
									onclick="Prev('erpDmhForm', 'prev')"> &nbsp; <%}else{ %> <img
									alt="Trang Truoc" src="../images/prev_d.gif"> &nbsp; <%} %>

									<%
								int[] listPage = obj.getNextSplittings();
							 if(listPage!=null){
								for(int i = 0; i < listPage.length; i++){
							%> <% 							
							
							if(listPage[i] == obj.getNxtApprSplitting()){ %> <a
									style="color: white;"><%= listPage[i] %>/ <%=obj.getTheLastSplitting() %></a>
									<%}else{ %> <a
									href="javascript:View('erpDmhForm', <%= listPage[i] %>, 'view')"><%= listPage[i] %></a>
									<%} %> <input type="hidden" name="list"
									value="<%= listPage[i] %>" /> &nbsp; <%}
								}%> <% if(obj.getNxtApprSplitting() < obj.getTheLastSplitting()){ %>
									&nbsp; <img alt="Trang Tiep" src="../images/next.gif"
									style="cursor: pointer;" onclick="Next('erpDmhForm', 'next')">
									&nbsp; <%}else{ %> &nbsp; <img alt="Trang Tiep"
									src="../images/next_d.gif"> &nbsp; <%} %> <%if(obj.getNxtApprSplitting() == obj.getTheLastSplitting()) {%>
									<img alt="Trang Cuoi" src="../images/last.gif"> &nbsp; <%}else{ %>
									<img alt="Trang Cuoi" src="../images/last.gif"
									style="cursor: pointer;"
									onclick="View('erpDmhForm', -1, 'view')"> &nbsp; <%} %>
								</TD>
							</tr>
						</TABLE>
					</fieldset>
				</div>
			</div>
		</div>
	</form>
</body>
</html>


<%
   obj.DBclose(); 
	 
%>