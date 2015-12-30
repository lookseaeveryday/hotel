package com.hotel.common;

import com.web.annotation.ControllerBind;
import com.web.mvc.Controller;

public class BaseController<T> extends Controller {

	protected ControllerBind controll;

	public BaseController() {
		controll = this.getClass().getAnnotation(ControllerBind.class);
	}

}
