package startek.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import startek.entity.Person;
import startek.service.Db;

@Controller
public class IndexController {
	
	@Autowired
	Db db;

	@RequestMapping(value="/index",method = RequestMethod.GET)
	public String  index() {
		db.setDb();
		return "index";
	}

}
