package springsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("Inside home function");
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("queryBox") String q) {
		String url  = "https://www.google.com/search?q="+q;
		RedirectView rv = new RedirectView();
		rv.setUrl(url);

		return rv;
	}
}
