package cn.my.trend.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.my.trend.pojo.Index;
import cn.my.trend.service.IndexService;

@RestController
public class IndexController {
	@Autowired IndexService indexService;


//	http://127.0.0.1:8001/freshCodes
//	http://127.0.0.1:8001/getCodes
//	http://127.0.0.1:8001/removeCodes

	@GetMapping("/freshCodes")
	public String fresh() throws Exception {
		indexService.fresh();
		return "fresh codes successfully";
	}
	@GetMapping("/getCodes")
	public List<Index> get() throws Exception {
		return indexService.get();
	}
	@GetMapping("/removeCodes")
	public String remove() throws Exception {
		indexService.remove();
		return "remove codes successfully";
	}
}