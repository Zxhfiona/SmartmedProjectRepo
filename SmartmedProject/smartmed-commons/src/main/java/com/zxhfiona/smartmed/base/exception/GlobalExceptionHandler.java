package com.zxhfiona.smartmed.base.exception;

import com.zxhfiona.smartmed.base.pojo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

/**
 * <b>基础信息功能 - 系统统一异常信息处理类</b>
 *
 * @author Fiona
 * @date 2021/12/30
 * @version 1.0.0
 * @since 1.0.0
 */
public class GlobalExceptionHandler {
	// 获得 Logger 对象，用于记录日志
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	/**
	 * <b>全局异常信息处理</b>
	 * @param exception
	 * @return
	 */
	@ExceptionHandler
	public ResponseVO globalExceptionHandle(Exception exception) {
		// 记录日志信息
		logger.error(exception.getMessage() + " : " + new Date(), exception);
		// 返回错误异常信息
		return ResponseVO.exceptionResponseVO(exception);
	}
}
