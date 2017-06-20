package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import pojo.User;

public class LoginInterceptor implements HandlerInterceptor{
	private static String[] url = {"/usercenter.action","/personaladdresume.action"};
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler)
			throws Exception {
		String title = req.getRequestURI().toString();
		User user  = (User)req.getSession().getAttribute("user");
		for (String str : url) {
			if(title.contains(str)){
				if(user==null){
					resp.sendRedirect(req.getContextPath()+"/users/login.jsp");
					return false;
				}else{
					return true;
				}
			}
		}
		return true;
		
		
	}

}
