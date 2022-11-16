package no.hvl.Obligatorisk4.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import no.hvl.Obligatorisk4.util.LoginUtil;
import no.hvl.Obligatorisk4.deltakerliste.DeltakerRepo;


@Controller
@RequestMapping("/deltakerliste")
public class ListController {
	
	@Autowired
	private DeltakerRepo deltakerRepo;
	
	
	@GetMapping
	public String visListe(HttpSession session, RedirectAttributes ra, Model model) {
		
		// Sjekker om brukeren er logget inn gjennom session data
		if(!LoginUtil.erBrukerInnlogget(session)) {
			ra.addFlashAttribute("redirectMessage", "Du er ikke innlogget");
			return "redirect:login";
		}
		
		model.addAttribute("deltakere", deltakerRepo.findAllByOrderByFornavnAsc());
		
		return "deltakerliste";
	}
	
	@PostMapping
	public String loggerut()  {
		return "redirect:logout";
	}
}