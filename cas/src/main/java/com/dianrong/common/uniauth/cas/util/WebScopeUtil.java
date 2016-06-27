package com.dianrong.common.uniauth.cas.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dianrong.common.uniauth.cas.model.CasLoginCaptchaInfoModel;
import com.dianrong.common.uniauth.common.cons.AppConstants;

/**.
 * request，response，session等的一些统一操作的工具方法
 * @author wanglin
 */
public final class WebScopeUtil {
	  /** Logger instance. */
    private static final Logger logger = LoggerFactory.getLogger(WebScopeUtil.class);
	/**
	 * . set captcha to session
	 * @param session
	 * @param val
	 * @return
	 */
	public static boolean putCaptchaToSession(HttpSession session, String captcha) {
		return putValToSession(session, AppConstants.CAS_CAPTCHA_SESSION_KEY, captcha);
	}
	
	/**
	 * . get captcha from session
	 * @param session
	 * @param val
	 * @return
	 */
	public static String getCaptchaFromSession(HttpSession session) {
		return getValFromSession(session, AppConstants.CAS_CAPTCHA_SESSION_KEY,  String.class);
	}
	
	/**
	 * . set captchaInfo to session
	 * @param session
	 * @param val
	 * @return
	 */
	public static boolean putCaptchaInfoToSession(HttpSession session, CasLoginCaptchaInfoModel captchaInfo) {
		return putValToSession(session, AppConstants.CAS_USER_LOGIN_CAPTCHA_VALIDATION_SESSION_KEY, captchaInfo);
	}
	
	/**
	 * . get captchaInfo from session
	 * @param session
	 * @param val
	 * @return
	 */
	public static CasLoginCaptchaInfoModel getCaptchaInfoFromSession(HttpSession session) {
		return getValFromSession(session, AppConstants.CAS_USER_LOGIN_CAPTCHA_VALIDATION_SESSION_KEY,  CasLoginCaptchaInfoModel.class);
	}
	
	/**
	 * . set object to session
	 * @param session
	 * @param key
	 * @param val
	 * @return
	 */
	public static boolean putValToSession(HttpSession session, String key, Object val) {
		if (session == null) {
			return false;
		}
		session.setAttribute(key, val);
		return true;
	}
	
	/**
	 * . get object from session
	 * 
	 * @param session
	 *            HttpSession
	 * @param key
	 *            key
	 * @param clsT
	 *            classType
	 * @return Object
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getValFromSession(HttpSession session, String key, Class<T> classT) {
		if (session == null) {
			return null;
		}
		return (T)session.getAttribute(key);
	}
	
	/**.
	 * 判断两个url是否相等
	 * @param url1 url1
	 * @param url2 url2
	 * @return 
	 */
	public static boolean judgeTwoUrlIsEqual(String url1, String url2) {
		if(url1 == null || url2 == null) {
			return false;
		}
		try {
			String turl1 = URLDecoder.decode(url1.trim(), "utf-8");
			String turl2 = URLDecoder.decode(url2.trim(), "utf-8");

			// 去掉末尾的/
			while(turl1.length() > 0 && turl1.charAt(turl1.length() - 1) == '/') {
				turl1 = turl1.substring(0, turl1.length() - 1);
			}
			// 去掉末尾的/
			while(turl2.length() > 0 && turl2.charAt(turl2.length() - 1) == '/') {
				turl2 = turl2.substring(0, turl2.length() - 1);
			}
			return turl1.equalsIgnoreCase(turl2);
		} catch (UnsupportedEncodingException e) {
			logger.warn("UnsupportedEncodingException", e);
			return false;
		}
	}
	
	public static void main(String[] args) {
		String url1 = "https%3A%2F%2Ftechops-dev.dianrong.com%2Flogin%2Fcas";
		String url2 = "https://techops-dev.dianrong.com/login/cas";
		System.out.println(judgeTwoUrlIsEqual(url1, url2));
	}
}
