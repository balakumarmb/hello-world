/**
 * 
 */
package kathir.exmaple.ui.demojsp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Kathirvel S Date : Nov 30, 2018
 */
@Controller
public class WebController {

	@Value("${first.name}")
	private String firstName;

	@Value("${last.name}")
	private String lastName;

	@RequestMapping(value = "apijsp", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> getName() {
		return new ResponseEntity<>(firstName + " " + lastName, HttpStatus.OK);
	}

	@RequestMapping(value = "ui", method = RequestMethod.GET)
	public String getdata(ModelMap model) {
		List<String> list = getList();
		model.put("lists", list);
		return "welcome";
	}
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "test");
		return "index";
	}

	private List<String> getList() {
		List<String> list = new ArrayList<>();
		list.add("List A");
		list.add("List B");
		list.add("List C");
		list.add("List D");
		list.add("List 1");
		list.add("List 2");
		list.add("List 3");
		return list;

	}
}
