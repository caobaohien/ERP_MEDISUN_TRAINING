<%@page import="geso.erp.beans.THONTINHOCSINH.IHoSoUpdate"%>
<%@page import="geso.erp.beans.THONTINHOCSINH.IHoSoTuVanUpdate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="geso.erp.beans.baocao.*"%>
<%@ page import="java.sql.ResultSet"%>
<% String userId = (String) session.getAttribute("userId");  %>
<% String userTen = (String) session.getAttribute("userTen");  %>
<%
	IHoSoTuVanUpdate obj =(IHoSoTuVanUpdate)session.getAttribute("obj"); 
	IHoSoUpdate hs =(IHoSoUpdate)session.getAttribute("objhsnew"); 
	ResultSet rsqg=obj.getDataLisQuocgiat();
	ResultSet rsqghs=hs.getDataLisQuocgiat();
%>

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
<link href="../css/select2.css" rel="stylesheet" />
<script src="../scripts/select2.js"></script>
<script type="text/javascript">
		$(document).ready(function() {		
				$( ".days" ).datepicker({			    
						changeMonth: true,
						changeYear: true				
				});            
	        }); 		
		$(document).ready(function()
				{
				 $("#khId").select2();
				 $("#nccId").select2();
				 $("#ddkdId").select2();
				 $("#spId").select2();  
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
   	function getvaluetiemnang(tiemnang)
   	{
   		var oRadio= document.forms["erpDmhForm"].elements["tiemnang"];
	   	 for(var i = 0; i < oRadio.length; i++)
	     {
	        if(oRadio[i].checked==true)
	        {
	           return oRadio[i];
	        }
	     }
   
     return '';
   	}
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
	 function savequocgia()
	 { 
		 document.forms["erpDmhForm"].action.value = "savequocgia";
	     document.forms["erpDmhForm"].submit();
	 }
	 function loadquocgia()
	 { 
		 document.forms["erpDmhForm"].action.value = "loadqg";
	     document.forms["erpDmhForm"].submit();
	 }
	 function saveform()
	 { 
		 document.forms["erpDmhForm"].action.value = "save";
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
	<form name="erpDmhForm" method="post" action="../../HoSoTuVanUpdateSvl">
		<input type="hidden" name="userId" value="<%= userId %>"> <input
			type="hidden" name="action" value="1"> <input type="hidden"
			name="idmahoso" value="<%=obj.getMahoso() %>"> <input
			type="hidden" name="id" value="<%=obj.getId() %>">

		<div align="left" id="header" style="width: 100%; float: none">
			<div style="width: 60%; padding: 5px; float: left"
				class="tbnavigation">Qu???n l?? cung ???ng</div>
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


					<TD width="30px" align="left"><A href="javascript:saveform()">
							<IMG src="../images/1455966997_save.png" title="Save" alt="Save"
							border="1px" style="border-style: outset">
					</A></TD>
					<TD width="30px" align="left"><span id="btnUndo"> <A
							href="../../HoSoTuVanListSvl?userId=<%=userId%>"> <IMG
								src="../images/Back_undo.png" title="Undo" alt="Undo"
								border="1px" style="border-style: outset"></A>
					</span>
				</TR>
			</TABLE>

		</div>
		<div class="plainlabel">
			<fieldset style="margin-top: 5px">
				<TABLE width="100%" cellpadding="6px" cellspacing="0px">
					<tr>
						<td class="plainlabel"><label class="plainlabel">Nga??y
								Ta??o H???? S??:</label> <input class="plainlabel" readonly type="text"
							maxlength="10" name="ngaytaohoso"
							value="<%=hs.getNgaytaohoso()%>" /></td>
						<td class="plainlabel"><label class="plainlabel">Nga??y
								T?? v????n:</label> <input class="days" type="text" maxlength="10"
							name="ngaytuvan" value="<%=obj.getNgaytuvan() %>" /></td>
					</tr>

				</TABLE>
		</div>
		<div id="cotent" style="width: 100%; float: none">
			<div align="left"
				style="width: 100%; float: none; clear: left; font-size: 0.7em">
				<fieldset style="margin-top: 5px">

					<legend>
						<span style="color: red" class="legendtitle">Th??ng tin ho??c
							sinh</span>&nbsp;&nbsp;
					</legend>
					<TABLE width="100%" cellpadding="6px" cellspacing="0px"
						style="margin-top: 5px">

						<TR>
							<TD class="plainlabel" width="15%">Ho?? T??n</TD>
							<TD class="plainlabel"><input type="text" readonly
								name="hotenhs" value="<%=hs.getHoten() %>" /></TD>
							<TD class="plainlabel" width="15%">Nga??y sinh</TD>
							<TD class="plainlabel"><input type="text" maxlength="10"
								readonly name="ngaysinhhs" value="<%=hs.getNgaysinh() %>" /></TD>
						</TR>
						<TR>
							<TD class="plainlabel" width="15%">Tri??nh ?????? ho??c v????n</TD>
							<TD class="plainlabel">
								<%	String arraytdhvnum[]={"0","1","2","3","4","5","6"};
                            	String arraytdhv[]={"THCS","THPT","Cao ??????ng-??a??i Ho??c n??m nh????t","Cao ??????ng-??a??i Ho??c n??m 2","Cao ??????ng-??a??i Ho??c n??m 3","Cao ??????ng-??a??i Ho??c n??m 4","Cao ??????ng-??a??i Ho??c n??m cu????i"};
                            	%> <select name="tdhocvan"
								onchange="submitform()" disabled>
									<option value=""></option>
									<%
				         		 		for(int i=0;i<arraytdhvnum.length;i++)
				         		 		{
				         		 			if(hs.getTrinhdohocvan().equals(arraytdhvnum[i]))
				         		 			{
				         		 			%>
									<option selected="selected" value="<%=arraytdhvnum[i]%>"><%=arraytdhv[i]%></option>
									<%} 
				         		 			else
				         		 			{
				         		 			%>
									<option value="<%=arraytdhvnum[i]%>"><%=arraytdhv[i]%></option>
									<%} %>
									<%} %>
							</select>
							</TD>
							<TD class="plainlabel" width="15%">Kha?? n??ng ti????ng anh</TD>
							<TD class="plainlabel">
								<%		String arraykntanum[]={"0","1","2","3","4"};
                            	String arrayknta[]={"ILTS","TOEFL","Trung Bi??nh","Kha??","Gio??i"};
                            	%> <select name="kntienganh"
								onchange="submitform()" disabled>
									<option value=""></option>
									<%
				         		 		for(int i=0;i<arraykntanum.length;i++)
				         		 		{
				         		 			if(hs.getKhanangtienganh().equals(arraykntanum[i]))
				         		 			{
				         		 			%>
									<option selected="selected" value="<%=arraykntanum[i]%>"><%=arrayknta[i]%></option>
									<%} 
				         		 			else
				         		 			{
				         		 			%>
									<option value="<%=arraykntanum[i]%>"><%=arrayknta[i]%></option>
									<%} %>
									<%} %>

							</select>
							</TD>
						<TR>
							<TD class="plainlabel" width="15%">Nguy????n vo??ng ??i ho??c</TD>
							<TD class="plainlabel">
								<%		String arraynv1[]={"0","1","2","3"};
                            	String arraynv[]={"???? v????i ng??????i th??n","T???? do","Ho??c b????ng","kha??c"};
                            	%> <select name="nguyenvong"
								onchange="submitform()" disabled>

									<option value=""></option>
									<%
				         		 		for(int i=0;i<arraynv1.length;i++)
				         		 		{
				         		 			if(hs.getNguyenvong().equals(arraynv1[i]))
				         		 			{
				         		 			%>
									<option selected="selected" value="<%=arraynv1[i]%>"><%=arraynv[i]%></option>

									<%} else 
				         		 		{
				         		 		%>
									<option value="<%=arraynv1[i]%>"><%=arraynv[i]%></option>

									<%} %>
									<%} %>

							</select> <%
                    		if(hs.getNguyenvong().equals("3"))
                    		{
                    	%> <input type="text" readonly
								name="nguyenvongkhac" value="" maxlength="10" /> <%} %>
							</TD>
							<TD class="plainlabel" width="15%">Qu????c gia ho??c</TD>
							<TD class="plainlabel"><select class="select2"
								name="litsquocgia" id="spId" style="width: 200px;"
								multiple='multiple' disabled onchange="submitform()">
									<option value=""></option>
									<%
						         
						          if (rsqghs != null)
						          {
							           while (rsqghs.next()) 
							           {	
							        	   String maqgtemp=rsqghs.getString("PK_SEQ");
							        	   boolean check = false;
							        	   for(int i=0;i<hs.get_pk_seqquocgiahoc().size();i++)
							        	   {
							        		   
									            if (maqgtemp.equals(hs.get_pk_seqquocgiahoc().get(i)))
									            {
										            %>
									<option value="<%=rsqghs.getString("PK_SEQ")%>" selected><%=rsqghs.getString("TEN")%></option>
									<% check = true; 
										           	  break; 
									           }}
							        	   if(check == false){ %>
									<option value="<%=rsqghs.getString("PK_SEQ")%>"><%=rsqghs.getString("TEN")%></option>
									<%}
									     }
						          } %>

							</select></TD>
						</TR>

						<TR>
							<TD class="plainlabel" width="15%">??i??a chi??</TD>
							<TD class="plainlabel"><input type="text" readonly
								name="diachihs" maxlength="10" value="<%=hs.getDiachi() %>" />
							</TD>
							<TD class="plainlabel" width="15%">??i????n thoa??i</TD>
							<TD class="plainlabel"><input type="text" readonly
								maxlength="10" name="dienthoaihs"
								value="<%=hs.getDienthoai() %>" /></TD>
						</TR>
						<tr>
							<td colspan="4" style="background-color: #C5E8CD"><a href=""
								id="noidungGhiChu" rel="ndGhiChu">&nbsp; <img
									alt="Th??m Qu????c Gia" src="../images/vitriluu.png">Chi
									Ti????t Ho??c Sinh
							</a>
								<DIV id="ndGhiChu"
									style="position: absolute; visibility: hidden; border: 9px solid #80CB9B; background-color: white; width: 1000px; min-height: 150px; overflow: auto; padding: 2px;">
									<TABLE width="100%" cellpadding="6px" cellspacing="0px"
										style="margin-top: 5px">
										<TR>
											<TD style="color: red" align="center" class="plainlabel"
												width="15%" colspan="4">TH??NG TIN CHI TI????T</TD>
										</TR>
										<TR>
											<TD class="plainlabel" width="15%">Email Ho??c Sinh</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="emailhs" value="<%=hs.getEmail() %>" />
											</TD>
											<TD class="plainlabel" width="15%">FaceBook</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="facebookhs"
												value="<%=hs.getfacebook()%>" /></TD>
										</TR>
										<tr>
											<TD class="plainlabel" width="15%">Kha?? n??ng ho??c v????n</TD>
											<TD class="plainlabel">
												<%		String arrayknhvnum[]={"0","1","2","3"};
                            	String arrayknhv[]={"y????u","Trung Bi??nh","Kha??","Gio??i"};
                            	%> <select name="knhocvan"
												onchange="submitform()" disabled>

													<option value=""></option>
													<%
				         		 		for(int i=0;i<arrayknhvnum.length;i++)
				         		 		{
				         		 			if(hs.getKhananghocvan().equals(arrayknhvnum[i]))
				         		 			{
				         		 			%>
													<option selected="selected" value="<%=arrayknhvnum[i]%>"><%=arrayknhv[i]%></option>
													<%} 
				         		 			else
				         		 			{
				         		 			%>
													<option value="<%=arrayknhvnum[i]%>"><%=arrayknhv[i]%></option>
													<%} %>
													<%} %>

											</select>
											</TD>
											<TD class="plainlabel" width="15%">Ngu????n</TD>
											<TD class="plainlabel">
												<%		
                            	String arraynguon[]={"Truy????n mi????ng","Ba??o chi??","Website","Fanface","Kha??c"};
                            	%> <select name="nguon" disabled>

													<option value=""></option>
													<%
				         		 		for(int i=0;i<arraynguon.length;i++)
				         		 		{
				         		 			%>
													<option value=""><%=arraynguon[i]%></option>
													<%} %>

											</select>
											</TD>
										</tr>
										<TR>
											<TD class="plainlabel" width="15%">Ho?? T??n cha</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="hotencha"
												value="<%=hs.getHoten_cha()%>" /></TD>
											<TD class="plainlabel" width="15%">Ho?? T??n me??</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="hotenme" value="<%=hs.getHoten_me() %>" />
											</TD>
										</TR>
										<TR>
											<TD class="plainlabel" width="15%">Sinh Nga??y</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="ngaysinhcha"
												value="<%=hs.getNgaysinh_cha() %>" /></TD>
											<TD class="plainlabel" width="15%">Sinh Nga??y</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="ngaysinhme"
												value="<%=hs.getNgaysinh_me() %>" /></TD>
										</TR>
										<TR>
											<TD class="plainlabel" width="15%">??i??a chi?? (N????u
												kha??c ???? tr??n)</TD>
											<TD class="plainlabel"><input type="text" readonly
												name="diachicha" maxlength="10"
												value="<%=hs.getDiachi_cha() %>" /></TD>
											<TD class="plainlabel" width="15%">??i??a chi?? (N????u
												kha??c ???? tr??n)</TD>
											<TD class="plainlabel"><input type="text" readonly
												name="diachime" maxlength="10"
												value="<%=hs.getDiachi_me() %>" /></TD>
										</TR>
										<TR>
											<TD class="plainlabel" width="15%">S???? ??i????n thoa??i</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="dienthoaicha"
												value="<%=hs.getDienthoai_cha()%>" /></TD>
											<TD class="plainlabel" width="15%">S???? ??i????n thoa??i</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="dienthoaime"
												value="<%=hs.getDienthoai_me()%>" /></TD>
										</TR>

										<TR>
											<TD class="plainlabel" width="15%">Ngh???? Nghi????p</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="nghenghiepcha"
												value="<%=hs.getNghenghiep_cha() %>" /></TD>
											<TD class="plainlabel" width="15%">Ngh???? Nghi????p</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="nghenghiepme"
												value="<%=hs.getNghenghiep_me()%>" /></TD>
										</TR>
										<TR>
											<TD class="plainlabel" width="25%">Thu nh????p ha??ng
												tha??ng cu??a gia ??i??nh</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="thunhap"
												value="<%=hs.getThunhap_GD()%>" /></TD>
											<TD class="plainlabel" width="25%">Email Kha??c(N????u
												co??)</TD>
											<TD class="plainlabel"><input type="text" readonly
												maxlength="10" name="emailkhac"
												value="<%=hs.getEmail_khac() %>" /></TD>
										</TR>
									</TABLE>
								</div></td>
						</tr>

					</TABLE>
			</div>
			<div align="left"
				style="width: 100%; float: none; clear: left; font-size: 0.7em">
				<fieldset style="margin-top: 5px">
					<legend>
						<span style="color: red" class="legendtitle">Th??ng tin t??
							v????n</span>&nbsp;&nbsp;
					</legend>
					<TABLE width="100%" cellpadding="6px" cellspacing="0px"
						style="margin-top: 5px; color: #369">

						<TR>
							<TD class="plainlabel" width="15%">Qu????c gia theo ho??c</TD>
							<TD class="plainlabel"><select name="litsquocgia"
								onchange="submitform()" style="width: 200px">
									<option value=""></option>
									<%
                       boolean checkKhac = false;
                        if(rsqg!= null)
                        {
                        
                        	 
                         while(rsqg.next())
                         {
                        	 if (obj.getQuocgia_fk().equals("0")){
			        			   checkKhac = true; 	
					           }
	                          if(rsqg.getString("PK_SEQ").equals(obj.getQuocgia_fk()))
	                          {
	                         %>
									<option selected="selected"
										value="<%= rsqg.getString("PK_SEQ") %>"><%= rsqg.getString("TEN") %></option>
									<%} else%>
									<%{ %>
									<option value="<%= rsqg.getString("PK_SEQ") %>"><%= rsqg.getString("TEN") %></option>
									<%} %>
									<%} %>
									<% }%>
									<% if(checkKhac == true){ %>
									<option selected value="0">Kha??c</option>
									<% } else { %>
									<option value="0">Kha??c</option>
									<%} %>
							</select> <%

                      if(checkKhac==true)
                      {%> <a href="" id="themqg" rel="themquocgia">
									&nbsp; <img alt="Th??m Qu???c Gia" src="../images/vitriluu.png">Th??m
									Qu???c Gia
							</a>
								<DIV id="themquocgia"
									style="position: absolute; visibility: hidden; border: 9px solid #80CB9B; background-color: white; width: 500px; min-height: 150px; overflow: auto; padding: 4px;">
									<table width="100%" align="center">
										<tr>
											<th colspan="2" width="500px"
												style="font-size: 14px; font-weight: bold;">TH??M QU???C
												GIA</th>

										</tr>

										<tr>
											<td width="20%">M?? qu???c gia</td>
											<td width="80%"><input style="width: 100%"
												name="maquocgia" type="text"
												value="<%=obj.getQuocgia_fk()%>"></td>
										</tr>

										<tr>
											<td width="300px">T??n quoc gia</td>
											<td width="300px"><input style="width: 100%"
												name="tenquocgia" type="text"
												value="<%=obj.getTenquocgia()%>"></td>
										</tr>

										<tr>
											<td></td>
											<td width="300px"><A href="javascript:savequocgia()">
													<IMG src="../images/1455966997_save.png" title="Save"
													alt="Save" border="1px" style="border-style: outset">
													L??u Qu???c Gia
											</A> <a href="javascript:dropdowncontent.hidediv('ndGhiChu')">
													<IMG src="../images/exit_1.png" title="Close" alt="Close"
													border="1px" style="border-style: outset"> ????ng tab
											</a></td>
										</tr>

									</table>

								</DIV> <%} %></TD>
						</TR>
						<TR>
							<TD class="plainlabel" width="15%">Di????n gia??i</TD>
							<TD class="plainlabel"><textarea style="width: 400px"
									rows="4" cols="10" name="diengiai"><%=obj.getDiengiai() %></textarea>
							</TD>
						</TR>
						<TR>
							<TD class="plainlabel" width="15%">Nh????n xe??t</TD>
							<TD class="plainlabel"><textarea style="width: 400px"
									rows="4" cols="5" name="nhanxet"> <%= obj.getNhanxet() %></textarea>
							</TD>
						</TR>
						<TR>
							<TD class="plainlabel" width="5%">Ti????m n??ng</TD>
							<TD class="plainlabel">
								<%if(obj.getTiemnang().equals("0")) 
                        {%> <input type="radio" checked="checked"
								maxlength="10" id="check1" name="tiemnang" value="0" />Co?? <input
								type="radio" maxlength="10" name="tiemnang" id="check2"
								value="1" />Kh??ng <%}else if(obj.getTiemnang().equals("1")){ %> <input
								type="radio" maxlength="10" id="check1" name="tiemnang"
								value="0" />Co?? <input type="radio" checked="checked"
								maxlength="10" name="tiemnang" id="check2" value="1" />Kh??ng <%} else{%>
								<input type="radio" checked="checked" maxlength="10" id="check1"
								name="tiemnang" value="0" />Co?? <input type="radio"
								maxlength="10" name="tiemnang" id="check2" value="1" />Kh??ng <%} %>
							</TD>
						</TR>

					</TABLE>
			</div>
	</form>
</body>
<script type="text/javascript">
	dropdowncontent.init("noidungGhiChu", "right-botom", 500, "click");
	dropdowncontent.init("themqg", "right-botom", 500, "click");
</script>
</html>


