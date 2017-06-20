<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="head_top">
	<div class="head_top_box">
		<div class="head_top_box_left link_lan">
		<c:if test="${empty sessionScope.user and empty sessionScope.admin and empty sessionScope.company}">
			<span id="top_loginform"> 欢迎来到人才系统!&nbsp;&nbsp;&nbsp;&nbsp; <a
				href="users/login.jsp">[登录]</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
				href="users/register.jsp">[免费注册]</a>
			</span>
		</c:if>
		<c:if test="${not empty sessionScope.user }">
			<span id="top_loginform">欢迎&nbsp;&nbsp;<a href="personal/index.jsp" style="color:#339900">${sessionScope.user.username }</a> 登录！&nbsp;&nbsp;
<a href="personal/personal_user.jsp" style="padding:1px 4px; background-color:#FF6600; color:#FFFFFF;text-decoration:none" title="短消息">消息 1</a>
 &nbsp;&nbsp;&nbsp;&nbsp;<a href="personal/index.jsp">[会员中心]</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/mavenJob/logout.do">[退出]</a></span>
		</div>
		</c:if>
		<c:if test="${not empty sessionScope.admin }">
			<span id="top_loginform">欢迎&nbsp;&nbsp;<a href="personal/index.jsp" style="color:#339900">${sessionScope.admin.username }</a> 登录！&nbsp;&nbsp;
<a href="personal/personal_user.jsp" style="padding:1px 4px; background-color:#FF6600; color:#FFFFFF;text-decoration:none" title="短消息">消息 1</a>
 &nbsp;&nbsp;&nbsp;&nbsp;<a href="personal/index.jsp">[会员中心]</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/mavenJob/logout.do">[退出]</a></span>
		</div>
		</c:if>
		<c:if test="${not empty sessionScope.company }">
			<span id="top_loginform">欢迎&nbsp;&nbsp;<a href="personal/index.jsp" style="color:#339900">${sessionScope.company.username }</a> 登录！&nbsp;&nbsp;
<a href="personal/personal_user.jsp" style="padding:1px 4px; background-color:#FF6600; color:#FFFFFF;text-decoration:none" title="短消息">消息 1</a>
 &nbsp;&nbsp;&nbsp;&nbsp;<a href="personal/index.jsp">[会员中心]</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/mavenJob/logout.do">[退出]</a></span>
		</div>
		</c:if>
		</div>
		<div class="head_top_box_right link_bk">
			<div class="lia t_so" id="t_so">
				搜索
				<div class="op_search" id="op_search">
					<div class="stit">
						<div>搜索</div>
					</div>
					<div class="sform">
						<form action="" method="get" name="topsearch">
							<input name="key" type="text" id="top-search-key" class="key" />
							<div class="sutleft">
								<input type="button" value="搜职位" class="but70 top-search-button"
									id="QS_jobslist" />
							</div>
							<div class="sutright">
								<input type="button" value="搜简历" class="but70 top-search-button"
									id="QS_resumelist" />
							</div>
							<div class="clear"></div>
						</form>
					</div>
				</div>
			</div>
			<a href="javascript:void(0)" class="lia t_m">手机频道</a> <a
				href="javascript:void(0)" class="lia">帮助</a> <a href="" class="lia">网站首页</a>
		</div>
		<div class="clear"></div>
	</div>
</div>
<div class="head">
	<div class="head_logo">
		<a href=""><img src="images/logo.jpg" alt="人才系统" border="0"
			align="absmiddle" /> </a>
	</div>
	<div class="head_logo_right">
		<div class="city"></div>
	</div>
	<div class="clear"></div>
</div>
