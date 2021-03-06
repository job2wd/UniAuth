package com.dianrong.common.techops.exp;

import com.dianrong.common.uniauth.common.exp.UniauthCommonException;

/**
 * 批处理的异常类型.
 */
public class BatchProcessException extends UniauthCommonException {

  private static final long serialVersionUID = 725349568285975577L;
  
  public BatchProcessException() {
    super();
  }

  public BatchProcessException(String msg) {
    super(msg);
  }

  public BatchProcessException(String msg, Throwable t) {
    super(msg, t);
  }
}
