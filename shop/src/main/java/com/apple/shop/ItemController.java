package com.apple.shop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class ItemController {
	
	private final ItemRepository itemRepository;


	@GetMapping("/list")
	String list(Model model) {
		List<Item> result = itemRepository.findAll();
		model.addAttribute("items", result);
		return "list.html";
	}
	
	@GetMapping("/write")
	String wirte() {
		return "write.html";
	}
	
	@PostMapping("/add")
	String addPost(@RequestParam(name="title") String title, 
				   @RequestParam(name="price") String price) {

		return "redirect:/list";
	}

}
