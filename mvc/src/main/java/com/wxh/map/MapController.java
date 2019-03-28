package com.wxh.map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapController {

	@RequestMapping("/getMap")
	public String getMap()  {
		return "map/map";
	}
}
